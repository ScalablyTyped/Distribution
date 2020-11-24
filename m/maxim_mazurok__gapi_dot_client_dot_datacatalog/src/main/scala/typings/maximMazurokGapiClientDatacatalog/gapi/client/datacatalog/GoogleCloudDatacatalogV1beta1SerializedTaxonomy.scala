package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SerializedTaxonomy extends js.Object {
  
  /** A list of policy types that are activated for a taxonomy. */
  var activatedPolicyTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Description of the serialized taxonomy. The length of the description is limited to 2000 bytes when encoded in UTF-8. If not set, defaults to an empty description. */
  var description: js.UndefOr[String] = js.native
  
  /** Required. Display name of the taxonomy. Max 200 bytes when encoded in UTF-8. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Top level policy tags associated with the taxonomy if any. */
  var policyTags: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]] = js.native
}
object GoogleCloudDatacatalogV1beta1SerializedTaxonomy {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SerializedTaxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SerializedTaxonomy]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SerializedTaxonomyOps[Self <: GoogleCloudDatacatalogV1beta1SerializedTaxonomy] (val x: Self) extends AnyVal {
    
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
    def setActivatedPolicyTypesVarargs(value: String*): Self = this.set("activatedPolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setActivatedPolicyTypes(value: js.Array[String]): Self = this.set("activatedPolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivatedPolicyTypes: Self = this.set("activatedPolicyTypes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setPolicyTagsVarargs(value: GoogleCloudDatacatalogV1beta1SerializedPolicyTag*): Self = this.set("policyTags", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTags(value: js.Array[GoogleCloudDatacatalogV1beta1SerializedPolicyTag]): Self = this.set("policyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTags: Self = this.set("policyTags", js.undefined)
  }
}
