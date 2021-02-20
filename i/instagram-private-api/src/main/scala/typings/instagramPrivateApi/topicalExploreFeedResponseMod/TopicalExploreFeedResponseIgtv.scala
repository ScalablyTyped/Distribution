package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseIgtv extends StObject {
  
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
  implicit class TopicalExploreFeedResponseIgtvMutableBuilder[Self <: TopicalExploreFeedResponseIgtv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_content_metadata(value: Boolean): Self = StObject.set(x, "display_content_metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTv_guide(value: TopicalExploreFeedResponseTvGuide): Self = StObject.set(x, "tv_guide", value.asInstanceOf[js.Any])
  }
}
