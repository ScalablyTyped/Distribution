package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1RawDocument extends StObject {
  
  /**
    * Inline document content.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An IANA MIME type (RFC6838) indicating the nature and format of the [content].
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1RawDocument {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1RawDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1RawDocument]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1RawDocument](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
