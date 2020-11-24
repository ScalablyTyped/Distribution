package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel extends js.Object {
  
  var channel_id: String = js.native
  
  var id: String = js.native
  
  var tips: js.Array[_] = js.native
}
object InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel {
  
  @scala.inline
  def apply(channel_id: String, id: String, tips: js.Array[_]): InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseAymtInstagramAccountInsightsChannelOps[Self <: InsightsServiceAccountResponseAymtInstagramAccountInsightsChannel] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: js.Any*): Self = this.set("tips", js.Array(value :_*))
    
    @scala.inline
    def setTips(value: js.Array[_]): Self = this.set("tips", value.asInstanceOf[js.Any])
  }
}
