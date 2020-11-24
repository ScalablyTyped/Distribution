package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseChannel extends js.Object {
  
  var channel_id: String = js.native
  
  var channel_type: String = js.native
  
  var context: String = js.native
  
  var header: String = js.native
  
  var media: TopicalExploreFeedResponseMedia = js.native
  
  var media_count: Double = js.native
  
  var title: String = js.native
}
object TopicalExploreFeedResponseChannel {
  
  @scala.inline
  def apply(
    channel_id: String,
    channel_type: String,
    context: String,
    header: String,
    media: TopicalExploreFeedResponseMedia,
    media_count: Double,
    title: String
  ): TopicalExploreFeedResponseChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], channel_type = channel_type.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseChannel]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseChannelOps[Self <: TopicalExploreFeedResponseChannel] (val x: Self) extends AnyVal {
    
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
    def setChannel_id(value: String): Self = this.set("channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel_type(value: String): Self = this.set("channel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
