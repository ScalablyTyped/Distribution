package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAllShapesWithImageRequest extends StObject {
  
  /**
    * If set, this request will replace all of the shapes that contain the given text.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.undefined
  
  /**
    * The image replace method. If you specify both a `replace_method` and an `image_replace_method`, the `image_replace_method` takes precedence. If you do not specify a value for `image_replace_method`, but specify a value for `replace_method`, then the specified `replace_method` value is used. If you do not specify either, then CENTER_INSIDE is used.
    */
  var imageReplaceMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The image URL. The image is fetched once at insertion time and a copy is stored for display inside the presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or GIF format. The provided URL can be at most 2 kB in length. The URL itself is saved with the image, and exposed via the Image.source_url field.
    */
  var imageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If non-empty, limits the matches to page elements only on the given pages. Returns a 400 bad request error if given the page object ID of a notes page or a notes master, or if a page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The replace method. *Deprecated*: use `image_replace_method` instead. If you specify both a `replace_method` and an `image_replace_method`, the `image_replace_method` takes precedence.
    */
  var replaceMethod: js.UndefOr[String | Null] = js.undefined
}
object SchemaReplaceAllShapesWithImageRequest {
  
  inline def apply(): SchemaReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageRequest]
  }
  
  extension [Self <: SchemaReplaceAllShapesWithImageRequest](x: Self) {
    
    inline def setContainsText(value: SchemaSubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    inline def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    inline def setImageReplaceMethod(value: String): Self = StObject.set(x, "imageReplaceMethod", value.asInstanceOf[js.Any])
    
    inline def setImageReplaceMethodNull: Self = StObject.set(x, "imageReplaceMethod", null)
    
    inline def setImageReplaceMethodUndefined: Self = StObject.set(x, "imageReplaceMethod", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlNull: Self = StObject.set(x, "imageUrl", null)
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPageObjectIdsNull: Self = StObject.set(x, "pageObjectIds", null)
    
    inline def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
    
    inline def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value*))
    
    inline def setReplaceMethod(value: String): Self = StObject.set(x, "replaceMethod", value.asInstanceOf[js.Any])
    
    inline def setReplaceMethodNull: Self = StObject.set(x, "replaceMethod", null)
    
    inline def setReplaceMethodUndefined: Self = StObject.set(x, "replaceMethod", js.undefined)
  }
}
