package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepricingRulesResponse extends js.Object {
  
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
  implicit class ListRepricingRulesResponseOps[Self <: ListRepricingRulesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRepricingRulesVarargs(value: RepricingRule*): Self = this.set("repricingRules", js.Array(value :_*))
    
    @scala.inline
    def setRepricingRules(value: js.Array[RepricingRule]): Self = this.set("repricingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepricingRules: Self = this.set("repricingRules", js.undefined)
  }
}
