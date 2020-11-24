package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServingRestriction extends js.Object {
  
  /** The contexts for the restriction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.native
  
  /** Disapproval bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method. */
  var disapproval: js.UndefOr[Disapproval] = js.native
  
  /**
    * Any disapprovals bound to this restriction. Only present if status=DISAPPROVED. Can be used to filter the response of the creatives.list method. Deprecated; please use disapproval
    * field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Disapproval]] = js.native
  
  /** The status of the creative in this context (for example, it has been explicitly disapproved or is pending review). */
  var status: js.UndefOr[String] = js.native
}
object ServingRestriction {
  
  @scala.inline
  def apply(): ServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingRestriction]
  }
  
  @scala.inline
  implicit class ServingRestrictionOps[Self <: ServingRestriction] (val x: Self) extends AnyVal {
    
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
    def setContextsVarargs(value: ServingContext*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[ServingContext]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setDisapproval(value: Disapproval): Self = this.set("disapproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapproval: Self = this.set("disapproval", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Disapproval*): Self = this.set("disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Disapproval]): Self = this.set("disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapprovalReasons: Self = this.set("disapprovalReasons", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
