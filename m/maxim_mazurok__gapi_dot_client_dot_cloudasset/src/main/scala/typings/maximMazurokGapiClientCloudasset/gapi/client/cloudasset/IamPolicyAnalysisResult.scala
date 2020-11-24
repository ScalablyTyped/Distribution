package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysisResult extends js.Object {
  
  /** The access control lists derived from the iam_binding that match or potentially match resource and access selectors specified in the request. */
  var accessControlLists: js.UndefOr[js.Array[GoogleCloudAssetV1AccessControlList]] = js.native
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of the resource to which the iam_binding policy attaches. */
  var attachedResourceFullName: js.UndefOr[String] = js.native
  
  /** Represents whether all analyses on the iam_binding have successfully finished. */
  var fullyExplored: js.UndefOr[Boolean] = js.native
  
  /** The Cloud IAM policy binding under analysis. */
  var iamBinding: js.UndefOr[Binding] = js.native
  
  /** The identity list derived from members of the iam_binding that match or potentially match identity selector specified in the request. */
  var identityList: js.UndefOr[GoogleCloudAssetV1IdentityList] = js.native
}
object IamPolicyAnalysisResult {
  
  @scala.inline
  def apply(): IamPolicyAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisResult]
  }
  
  @scala.inline
  implicit class IamPolicyAnalysisResultOps[Self <: IamPolicyAnalysisResult] (val x: Self) extends AnyVal {
    
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
    def setAccessControlListsVarargs(value: GoogleCloudAssetV1AccessControlList*): Self = this.set("accessControlLists", js.Array(value :_*))
    
    @scala.inline
    def setAccessControlLists(value: js.Array[GoogleCloudAssetV1AccessControlList]): Self = this.set("accessControlLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlLists: Self = this.set("accessControlLists", js.undefined)
    
    @scala.inline
    def setAttachedResourceFullName(value: String): Self = this.set("attachedResourceFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachedResourceFullName: Self = this.set("attachedResourceFullName", js.undefined)
    
    @scala.inline
    def setFullyExplored(value: Boolean): Self = this.set("fullyExplored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyExplored: Self = this.set("fullyExplored", js.undefined)
    
    @scala.inline
    def setIamBinding(value: Binding): Self = this.set("iamBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamBinding: Self = this.set("iamBinding", js.undefined)
    
    @scala.inline
    def setIdentityList(value: GoogleCloudAssetV1IdentityList): Self = this.set("identityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityList: Self = this.set("identityList", js.undefined)
  }
}
