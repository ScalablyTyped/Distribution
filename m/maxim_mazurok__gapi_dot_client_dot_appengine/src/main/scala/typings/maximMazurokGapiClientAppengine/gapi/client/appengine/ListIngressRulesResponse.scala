package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIngressRulesResponse extends js.Object {
  
  /** The ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.native
  
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListIngressRulesResponse {
  
  @scala.inline
  def apply(): ListIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIngressRulesResponse]
  }
  
  @scala.inline
  implicit class ListIngressRulesResponseOps[Self <: ListIngressRulesResponse] (val x: Self) extends AnyVal {
    
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
    def setIngressRulesVarargs(value: FirewallRule*): Self = this.set("ingressRules", js.Array(value :_*))
    
    @scala.inline
    def setIngressRules(value: js.Array[FirewallRule]): Self = this.set("ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressRules: Self = this.set("ingressRules", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
