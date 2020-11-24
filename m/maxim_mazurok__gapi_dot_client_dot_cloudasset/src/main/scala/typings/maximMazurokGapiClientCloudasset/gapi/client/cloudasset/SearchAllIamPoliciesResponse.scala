package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchAllIamPoliciesResponse extends js.Object {
  
  /** Set if there are more results than those appearing in this response; to get the next set of results, call this method again, using this value as the `page_token`. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of IamPolicy that match the search query. Related information such as the associated resource is returned along with the policy. */
  var results: js.UndefOr[js.Array[IamPolicySearchResult]] = js.native
}
object SearchAllIamPoliciesResponse {
  
  @scala.inline
  def apply(): SearchAllIamPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAllIamPoliciesResponse]
  }
  
  @scala.inline
  implicit class SearchAllIamPoliciesResponseOps[Self <: SearchAllIamPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: IamPolicySearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[IamPolicySearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
