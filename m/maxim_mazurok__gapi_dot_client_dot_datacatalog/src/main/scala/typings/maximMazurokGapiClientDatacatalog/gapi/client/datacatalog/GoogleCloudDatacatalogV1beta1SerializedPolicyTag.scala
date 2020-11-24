package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SerializedPolicyTag extends js.Object {
  
  /** Children of the policy tag if any. */
  var childPolicyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]] = js.native
  
  /** Description of the serialized policy tag. The length of the description is limited to 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Resource name of the policy tag. This field will be ignored when calling ImportTaxonomies. */
  var policyTag: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1SerializedPolicyTag {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SerializedPolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SerializedPolicyTagOps[Self <: GoogleCloudDatacatalogV1beta1SerializedPolicyTag] (val x: Self) extends AnyVal {
    
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
    def setChildPolicyTagsVarargs(value: GoogleCloudDatacatalogV1beta1SerializedPolicyTag*): Self = this.set("childPolicyTags", js.Array(value :_*))
    
    @scala.inline
    def setChildPolicyTags(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]): Self = this.set("childPolicyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildPolicyTags: Self = this.set("childPolicyTags", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setPolicyTag(value: String): Self = this.set("policyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTag: Self = this.set("policyTag", js.undefined)
  }
}
