package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseHashtagsReach extends js.Object {
  
  var follow_status: InsightsServiceAccountResponseFollowStatus = js.native
  
  var name: String = js.native
}
object InsightsServiceAccountResponseHashtagsReach {
  
  @scala.inline
  def apply(follow_status: InsightsServiceAccountResponseFollowStatus, name: String): InsightsServiceAccountResponseHashtagsReach = {
    val __obj = js.Dynamic.literal(follow_status = follow_status.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseHashtagsReach]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseHashtagsReachOps[Self <: InsightsServiceAccountResponseHashtagsReach] (val x: Self) extends AnyVal {
    
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
    def setFollow_status(value: InsightsServiceAccountResponseFollowStatus): Self = this.set("follow_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
