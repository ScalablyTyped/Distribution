package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTwoByTwoItem extends StObject {
  
  var channel: js.UndefOr[TopicalExploreFeedResponseChannel] = js.native
  
  var igtv: js.UndefOr[TopicalExploreFeedResponseIgtv] = js.native
}
object TopicalExploreFeedResponseTwoByTwoItem {
  
  @scala.inline
  def apply(): TopicalExploreFeedResponseTwoByTwoItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicalExploreFeedResponseTwoByTwoItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseTwoByTwoItemMutableBuilder[Self <: TopicalExploreFeedResponseTwoByTwoItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: TopicalExploreFeedResponseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setIgtv(value: TopicalExploreFeedResponseIgtv): Self = StObject.set(x, "igtv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgtvUndefined: Self = StObject.set(x, "igtv", js.undefined)
  }
}
