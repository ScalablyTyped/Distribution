package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig extends StObject {
  
  /**
    * The Cloud Storage location as the source of the document.
    */
  var gcsSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mimetype of the input. If the input is a raw document, the supported mimetypes are application/pdf, image/tiff, and image/gif. If the input is a [Document] proto, the type should be application/json.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3BatchProcessRequestBatchInputConfig](x: Self) {
    
    inline def setGcsSource(value: String): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceNull: Self = StObject.set(x, "gcsSource", null)
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
