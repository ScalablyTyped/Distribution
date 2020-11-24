package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1PolicyTag extends js.Object {
  
  /** Output only. Resource names of child policy tags of this policy tag. */
  var childPolicyTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Description of this policy tag. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If
    * not set, defaults to an empty description. If not set, defaults to an empty description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. User defined name of this policy tag. It must: be unique within the parent taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces; not start or
    * end with spaces; and be at most 200 bytes long when encoded in UTF-8.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. Resource name of this policy tag, whose format is: "projects/{project_number}/locations/{location_id}/taxonomies/{taxonomy_id}/policyTags/{id}". */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Resource name of this policy tag's parent policy tag (e.g. for the "LatLong" policy tag in the example above, this field contains the resource name of the "Geolocation" policy tag).
    * If empty, it means this policy tag is a top level policy tag (e.g. this field is empty for the "Geolocation" policy tag in the example above). If not set, defaults to an empty
    * string.
    */
  var parentPolicyTag: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1PolicyTag {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1PolicyTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1PolicyTag]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1PolicyTagOps[Self <: GoogleCloudDatacatalogV1beta1PolicyTag] (val x: Self) extends AnyVal {
    
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
    def setChildPolicyTagsVarargs(value: String*): Self = this.set("childPolicyTags", js.Array(value :_*))
    
    @scala.inline
    def setChildPolicyTags(value: js.Array[String]): Self = this.set("childPolicyTags", value.asInstanceOf[js.Any])
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentPolicyTag(value: String): Self = this.set("parentPolicyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentPolicyTag: Self = this.set("parentPolicyTag", js.undefined)
  }
}
