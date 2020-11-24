package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseIgtv extends js.Object {
  
  var display_content_metadata: Boolean = js.native
  
  var media: TopicalExploreFeedResponseMedia = js.native
  
  var tv_guide: TopicalExploreFeedResponseTvGuide = js.native
}
object TopicalExploreFeedResponseIgtv {
  
  @scala.inline
  def apply(
    display_content_metadata: Boolean,
    media: TopicalExploreFeedResponseMedia,
    tv_guide: TopicalExploreFeedResponseTvGuide
  ): TopicalExploreFeedResponseIgtv = {
    val __obj = js.Dynamic.literal(display_content_metadata = display_content_metadata.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], tv_guide = tv_guide.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseIgtv]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseIgtvOps[Self <: TopicalExploreFeedResponseIgtv] (val x: Self) extends AnyVal {
    
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
    def setDisplay_content_metadata(value: Boolean): Self = this.set("display_content_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTv_guide(value: TopicalExploreFeedResponseTvGuide): Self = this.set("tv_guide", value.asInstanceOf[js.Any])
  }
}
