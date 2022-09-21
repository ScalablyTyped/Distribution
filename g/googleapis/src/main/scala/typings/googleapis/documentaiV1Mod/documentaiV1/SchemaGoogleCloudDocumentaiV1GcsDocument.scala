package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1GcsDocument extends StObject {
  
  /**
    * The Cloud Storage object uri.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An IANA MIME type (RFC6838) of the content.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1GcsDocument {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1GcsDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1GcsDocument]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1GcsDocument](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
