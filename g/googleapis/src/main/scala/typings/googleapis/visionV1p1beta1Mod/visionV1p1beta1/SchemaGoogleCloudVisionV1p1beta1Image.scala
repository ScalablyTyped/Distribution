package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1Image extends StObject {
  
  /**
    * Image content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers use a pure binary representation, whereas JSON representations use base64. Currently, this field only works for BatchAnnotateImages requests. It does not work for AsyncBatchAnnotateImages requests.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud Storage image location, or publicly-accessible image URL. If both `content` and `source` are provided for an image, `content` takes precedence and is used to perform the image annotation request.
    */
  var source: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageSource] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1Image {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1Image = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Image]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1Image](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSource(value: SchemaGoogleCloudVisionV1p1beta1ImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
