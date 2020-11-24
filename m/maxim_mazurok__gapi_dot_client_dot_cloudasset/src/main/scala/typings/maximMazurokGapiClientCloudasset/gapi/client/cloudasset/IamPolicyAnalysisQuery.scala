package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysisQuery extends js.Object {
  
  /** Optional. Specifies roles or permissions for analysis. This is optional. */
  var accessSelector: js.UndefOr[AccessSelector] = js.native
  
  /** Optional. Specifies an identity for analysis. */
  var identitySelector: js.UndefOr[IdentitySelector] = js.native
  
  /** Optional. The query options. */
  var options: js.UndefOr[Options] = js.native
  
  /** Optional. Specifies a resource for analysis. */
  var resourceSelector: js.UndefOr[ResourceSelector] = js.native
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as
    * "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get
    * organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project
    * id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var scope: js.UndefOr[String] = js.native
}
object IamPolicyAnalysisQuery {
  
  @scala.inline
  def apply(): IamPolicyAnalysisQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisQuery]
  }
  
  @scala.inline
  implicit class IamPolicyAnalysisQueryOps[Self <: IamPolicyAnalysisQuery] (val x: Self) extends AnyVal {
    
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
    def setAccessSelector(value: AccessSelector): Self = this.set("accessSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessSelector: Self = this.set("accessSelector", js.undefined)
    
    @scala.inline
    def setIdentitySelector(value: IdentitySelector): Self = this.set("identitySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySelector: Self = this.set("identitySelector", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setResourceSelector(value: ResourceSelector): Self = this.set("resourceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceSelector: Self = this.set("resourceSelector", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
