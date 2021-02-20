package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Taxonomy extends StObject {
  
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
  implicit class GoogleCloudDatacatalogV1beta1TaxonomyMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1Taxonomy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedPolicyTypes(value: js.Array[String]): Self = StObject.set(x, "activatedPolicyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatedPolicyTypesUndefined: Self = StObject.set(x, "activatedPolicyTypes", js.undefined)
    
    @scala.inline
    def setActivatedPolicyTypesVarargs(value: String*): Self = StObject.set(x, "activatedPolicyTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPolicyTagCount(value: Double): Self = StObject.set(x, "policyTagCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTagCountUndefined: Self = StObject.set(x, "policyTagCount", js.undefined)
    
    @scala.inline
    def setTaxonomyTimestamps(value: GoogleCloudDatacatalogV1beta1SystemTimestamps): Self = StObject.set(x, "taxonomyTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxonomyTimestampsUndefined: Self = StObject.set(x, "taxonomyTimestamps", js.undefined)
  }
}
