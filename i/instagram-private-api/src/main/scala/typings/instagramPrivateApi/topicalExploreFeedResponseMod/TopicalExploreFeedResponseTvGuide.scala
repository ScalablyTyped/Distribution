package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTvGuide extends js.Object {
  
  var channels: js.Array[TopicalExploreFeedResponseChannelsItem] = js.native
}
object TopicalExploreFeedResponseTvGuide {
  
  @scala.inline
  def apply(channels: js.Array[TopicalExploreFeedResponseChannelsItem]): TopicalExploreFeedResponseTvGuide = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseTvGuide]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseTvGuideOps[Self <: TopicalExploreFeedResponseTvGuide] (val x: Self) extends AnyVal {
    
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
    def setChannelsVarargs(value: TopicalExploreFeedResponseChannelsItem*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[TopicalExploreFeedResponseChannelsItem]): Self = this.set("channels", value.asInstanceOf[js.Any])
  }
}
