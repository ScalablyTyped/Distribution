package typings.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseStatus extends js.Object {
  
  var account_type: String = js.native
}
object InsightsServiceAccountResponseStatus {
  
  @scala.inline
  def apply(account_type: String): InsightsServiceAccountResponseStatus = {
    val __obj = js.Dynamic.literal(account_type = account_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseStatus]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseStatusOps[Self <: InsightsServiceAccountResponseStatus] (val x: Self) extends AnyVal {
    
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
    def setAccount_type(value: String): Self = this.set("account_type", value.asInstanceOf[js.Any])
  }
}
