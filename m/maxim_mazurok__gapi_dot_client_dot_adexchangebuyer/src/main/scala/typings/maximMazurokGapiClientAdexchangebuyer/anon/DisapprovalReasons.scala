package typings.maximMazurokGapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisapprovalReasons extends js.Object {
  
  /** All known contexts/restrictions. */
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.native
  
  /**
    * The reasons for disapproval within this restriction, if any. Note that not all disapproval reasons may be categorized, so it is possible for the creative to have a status of
    * DISAPPROVED or CONDITIONALLY_APPROVED with an empty list for disapproval_reasons. In this case, please reach out to your TAM to help debug the issue.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.native
  
  /** Why the creative is ineligible to serve in this context (e.g., it has been explicitly disapproved or is pending review). */
  var reason: js.UndefOr[String] = js.native
}
object DisapprovalReasons {
  
  @scala.inline
  def apply(): DisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisapprovalReasons]
  }
  
  @scala.inline
  implicit class DisapprovalReasonsOps[Self <: DisapprovalReasons] (val x: Self) extends AnyVal {
    
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
    def setContextsVarargs(value: AuctionType*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[AuctionType]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Details*): Self = this.set("disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Details]): Self = this.set("disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapprovalReasons: Self = this.set("disapprovalReasons", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
