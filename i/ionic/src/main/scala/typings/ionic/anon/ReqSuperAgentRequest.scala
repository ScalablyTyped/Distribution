package typings.ionic.anon

import typings.ionic.httpMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReqSuperAgentRequest extends js.Object {
  
  var req: SuperAgentRequest = js.native
}
object ReqSuperAgentRequest {
  
  @scala.inline
  def apply(req: SuperAgentRequest): ReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqSuperAgentRequest]
  }
  
  @scala.inline
  implicit class ReqSuperAgentRequestOps[Self <: ReqSuperAgentRequest] (val x: Self) extends AnyVal {
    
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
    def setReq(value: SuperAgentRequest): Self = this.set("req", value.asInstanceOf[js.Any])
  }
}
