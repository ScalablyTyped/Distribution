package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseThumbnailImage extends StObject {
  
  var image_versions2: SavedFeedResponseImageVersions2
  
  var preview: Null
}
object SavedFeedResponseThumbnailImage {
  
  inline def apply(image_versions2: SavedFeedResponseImageVersions2, preview: Null): SavedFeedResponseThumbnailImage = {
    val __obj = js.Dynamic.literal(image_versions2 = image_versions2.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseThumbnailImage]
  }
  
  extension [Self <: SavedFeedResponseThumbnailImage](x: Self) {
    
    inline def setImage_versions2(value: SavedFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: Null): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
