package typings.maximMazurokGapiClientAdexchangebuyer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisapprovalReasons extends StObject {
  
  /** All known contexts/restrictions. */
  var contexts: js.UndefOr[js.Array[AuctionType]] = js.undefined
  
  /**
    * The reasons for disapproval within this restriction, if any. Note that not all disapproval reasons may be categorized, so it is possible for the creative to have a status of
    * DISAPPROVED or CONDITIONALLY_APPROVED with an empty list for disapproval_reasons. In this case, please reach out to your TAM to help debug the issue.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.undefined
  
  /** Why the creative is ineligible to serve in this context (e.g., it has been explicitly disapproved or is pending review). */
  var reason: js.UndefOr[String] = js.undefined
}
object DisapprovalReasons {
  
  @scala.inline
  def apply(): DisapprovalReasons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisapprovalReasons]
  }
  
  @scala.inline
  implicit class DisapprovalReasonsMutableBuilder[Self <: DisapprovalReasons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[AuctionType]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: AuctionType*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Details]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Details*): Self = StObject.set(x, "disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
