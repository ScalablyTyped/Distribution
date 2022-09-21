package typings.googleapis.docsV1Mod.docsV1

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
    * The URI of the new image. The image is fetched once at insertion time and a copy is stored for display inside the document. Images must be less than 50MB, cannot exceed 25 megapixels, and must be in PNG, JPEG, or GIF format. The provided URI can't surpass 2 KB in length. The URI is saved with the image, and exposed through the ImageProperties.source_uri field.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
