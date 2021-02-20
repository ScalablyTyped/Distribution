package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTvGuide extends StObject {
  
  var channels: js.Array[TopicalExploreFeedResponseChannelsItem] = js.native
}
object TopicalExploreFeedResponseTvGuide {
  
  @scala.inline
  def apply(channels: js.Array[TopicalExploreFeedResponseChannelsItem]): TopicalExploreFeedResponseTvGuide = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseTvGuide]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseTvGuideMutableBuilder[Self <: TopicalExploreFeedResponseTvGuide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: js.Array[TopicalExploreFeedResponseChannelsItem]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: TopicalExploreFeedResponseChannelsItem*): Self = StObject.set(x, "channels", js.Array(value :_*))
  }
}
