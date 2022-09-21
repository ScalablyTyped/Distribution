package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1InputConfig extends StObject {
  
  /**
    * The Google Cloud Storage location to read the input from. This must be a single file.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1GcsSource] = js.undefined
  
  /**
    * Required. Mimetype of the input. Current supported mimetypes are application/pdf, image/tiff, and image/gif. In addition, application/json type is supported for requests with ProcessDocumentRequest.automl_params field set. The JSON file needs to be in Document format.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1InputConfig {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1InputConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1InputConfig](x: Self) {
    
    inline def setGcsSource(value: SchemaGoogleCloudDocumentaiV1beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
