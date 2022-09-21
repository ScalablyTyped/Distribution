package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceImageRequest extends StObject {
  
  /**
    * The ID of the existing image that will be replaced. The ID can be retrieved from the response of a get request.
    */
  var imageObjectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The replacement method.
    */
  var imageReplaceMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image URL. The image is fetched once at insertion time and a copy is stored for display inside the presentation. Images must be less than 50MB, cannot exceed 25 megapixels, and must be in PNG, JPEG, or GIF format. The provided URL can't surpass 2 KB in length. The URL is saved with the image, and exposed through the Image.source_url field.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplaceImageRequest {
  
  inline def apply(): SchemaReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceImageRequest]
  }
  
  extension [Self <: SchemaReplaceImageRequest](x: Self) {
    
    inline def setImageObjectId(value: String): Self = StObject.set(x, "imageObjectId", value.asInstanceOf[js.Any])
    
    inline def setImageObjectIdNull: Self = StObject.set(x, "imageObjectId", null)
    
    inline def setImageObjectIdUndefined: Self = StObject.set(x, "imageObjectId", js.undefined)
    
    inline def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
    
    inline def setImageReplaceMethodNull: Self = StObject.set(x, "imageReplaceMethod", null)
    
    inline def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
