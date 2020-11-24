package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse extends js.Object {
  
  /** Token used to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The policy tags that are in the requested taxonomy. */
  var policyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1PolicyTag]] = js.native
}
object GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListPolicyTagsResponseOps[Self <: GoogleCloudDatacatalogV1beta1ListPolicyTagsResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicyTagsVarargs(value: GoogleCloudDatacatalogV1beta1PolicyTag*): Self = this.set("policyTags", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTags(value: js.Array[GoogleCloudDatacatalogV1beta1PolicyTag]): Self = this.set("policyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTags: Self = this.set("policyTags", js.undefined)
  }
}
