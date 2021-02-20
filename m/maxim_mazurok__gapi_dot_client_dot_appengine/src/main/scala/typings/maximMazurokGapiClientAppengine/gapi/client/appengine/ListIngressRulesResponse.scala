package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIngressRulesResponse extends StObject {
  
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
  implicit class ListIngressRulesResponseMutableBuilder[Self <: ListIngressRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngressRules(value: js.Array[FirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    @scala.inline
    def setIngressRulesVarargs(value: FirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
