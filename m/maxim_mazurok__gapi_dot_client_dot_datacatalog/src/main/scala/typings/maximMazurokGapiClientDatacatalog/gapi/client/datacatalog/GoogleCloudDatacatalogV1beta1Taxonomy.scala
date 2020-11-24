package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Taxonomy extends js.Object {
  
  /** Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list. */
  var activatedPolicyTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in
    * UTF-8. If not set, defaults to an empty description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes
    * long when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this taxonomy, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{id}". */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. Number of policy tags contained in this taxonomy. */
  var policyTagCount: js.UndefOr[Double] = js.native
  
  /** Output only. Timestamps about this taxonomy. Only create_time and update_time are used. */
  var taxonomyTimestamps: js.UndefOr[GoogleCloudDatacatalogV1beta1SystemTimestamps] = js.native
}
object GoogleCloudDatacatalogV1beta1Taxonomy {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Taxonomy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Taxonomy]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TaxonomyOps[Self <: GoogleCloudDatacatalogV1beta1Taxonomy] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicyTagCount(value: Double): Self = this.set("policyTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyTagCount: Self = this.set("policyTagCount", js.undefined)
    
    @scala.inline
    def setTaxonomyTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = this.set("taxonomyTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxonomyTimestamps: Self = this.set("taxonomyTimestamps", js.undefined)
  }
}
