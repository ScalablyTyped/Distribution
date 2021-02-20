package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepricingRulesResponse extends StObject {
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The rules from the specified merchant. */
  var repricingRules: js.UndefOr[js.Array[RepricingRule]] = js.native
}
object ListRepricingRulesResponse {
  
  @scala.inline
  def apply(): ListRepricingRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepricingRulesResponse]
  }
  
  @scala.inline
  implicit class ListRepricingRulesResponseMutableBuilder[Self <: ListRepricingRulesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRepricingRules(value: js.Array[RepricingRule]): Self = StObject.set(x, "repricingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepricingRulesUndefined: Self = StObject.set(x, "repricingRules", js.undefined)
    
    @scala.inline
    def setRepricingRulesVarargs(value: RepricingRule*): Self = StObject.set(x, "repricingRules", js.Array(value :_*))
  }
}
