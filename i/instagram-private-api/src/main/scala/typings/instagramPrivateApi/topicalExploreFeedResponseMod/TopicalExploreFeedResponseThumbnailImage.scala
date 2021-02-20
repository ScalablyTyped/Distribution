package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseThumbnailImage extends StObject {
  
  var image_versions2: TopicalExploreFeedResponseImageVersions2 = js.native
  
  var preview: String = js.native
}
object TopicalExploreFeedResponseThumbnailImage {
  
  @scala.inline
  def apply(image_versions2: TopicalExploreFeedResponseImageVersions2, preview: String): TopicalExploreFeedResponseThumbnailImage = {
    val __obj = js.Dynamic.literal(image_versions2 = image_versions2.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseThumbnailImage]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseThumbnailImageMutableBuilder[Self <: TopicalExploreFeedResponseThumbnailImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
  }
}
