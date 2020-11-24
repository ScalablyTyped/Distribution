package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseThumbnailImage extends js.Object {
  
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
  implicit class TopicalExploreFeedResponseThumbnailImageOps[Self <: TopicalExploreFeedResponseThumbnailImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
  }
}
