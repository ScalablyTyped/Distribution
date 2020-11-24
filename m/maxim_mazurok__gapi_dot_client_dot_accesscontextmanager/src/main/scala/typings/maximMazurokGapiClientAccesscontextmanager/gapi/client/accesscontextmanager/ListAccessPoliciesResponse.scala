package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAccessPoliciesResponse extends js.Object {
  
  /** List of the AccessPolicy instances. */
  var accessPolicies: js.UndefOr[js.Array[AccessPolicy]] = js.native
  
  /** The pagination token to retrieve the next page of results. If the value is empty, no further results remain. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAccessPoliciesResponse {
  
  @scala.inline
  def apply(): ListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListAccessPoliciesResponseOps[Self <: ListAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessPoliciesVarargs(value: AccessPolicy*): Self = this.set("accessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAccessPolicies(value: js.Array[AccessPolicy]): Self = this.set("accessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicies: Self = this.set("accessPolicies", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
