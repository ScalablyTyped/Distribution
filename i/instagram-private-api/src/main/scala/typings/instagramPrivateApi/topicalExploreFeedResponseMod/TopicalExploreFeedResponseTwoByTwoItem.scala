package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseTwoByTwoItem extends js.Object {
  
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
  implicit class TopicalExploreFeedResponseTwoByTwoItemOps[Self <: TopicalExploreFeedResponseTwoByTwoItem] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: TopicalExploreFeedResponseChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setIgtv(value: TopicalExploreFeedResponseIgtv): Self = this.set("igtv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgtv: Self = this.set("igtv", js.undefined)
  }
}
