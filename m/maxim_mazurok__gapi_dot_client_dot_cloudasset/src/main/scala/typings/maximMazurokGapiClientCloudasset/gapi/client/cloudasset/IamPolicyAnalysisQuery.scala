package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicyAnalysisQuery extends StObject {
  
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
  implicit class IamPolicyAnalysisQueryMutableBuilder[Self <: IamPolicyAnalysisQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessSelector(value: AccessSelector): Self = StObject.set(x, "accessSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessSelectorUndefined: Self = StObject.set(x, "accessSelector", js.undefined)
    
    @scala.inline
    def setIdentitySelector(value: IdentitySelector): Self = StObject.set(x, "identitySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySelectorUndefined: Self = StObject.set(x, "identitySelector", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceSelector(value: ResourceSelector): Self = StObject.set(x, "resourceSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSelectorUndefined: Self = StObject.set(x, "resourceSelector", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
