package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamPolicyAnalysisQuery extends StObject {
  
  /** Optional. Specifies roles or permissions for analysis. This is optional. */
  var accessSelector: js.UndefOr[AccessSelector] = js.undefined
  
  /** Optional. The hypothetical context for IAM conditions evaluation. */
  var conditionContext: js.UndefOr[ConditionContext] = js.undefined
  
  /** Optional. Specifies an identity for analysis. */
  var identitySelector: js.UndefOr[IdentitySelector] = js.undefined
  
  /** Optional. The query options. */
  var options: js.UndefOr[Options] = js.undefined
  
  /** Optional. Specifies a resource for analysis. */
  var resourceSelector: js.UndefOr[ResourceSelector] = js.undefined
  
  /**
    * Required. The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as
    * "organizations/123"), a folder number (such as "folders/123"), a project ID (such as "projects/my-project-id"), or a project number (such as "projects/12345"). To know how to get
    * organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project
    * id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
    */
  var scope: js.UndefOr[String] = js.undefined
}
object IamPolicyAnalysisQuery {
  
  inline def apply(): IamPolicyAnalysisQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisQuery]
  }
  
  extension [Self <: IamPolicyAnalysisQuery](x: Self) {
    
    inline def setAccessSelector(value: AccessSelector): Self = StObject.set(x, "accessSelector", value.asInstanceOf[js.Any])
    
    inline def setAccessSelectorUndefined: Self = StObject.set(x, "accessSelector", js.undefined)
    
    inline def setConditionContext(value: ConditionContext): Self = StObject.set(x, "conditionContext", value.asInstanceOf[js.Any])
    
    inline def setConditionContextUndefined: Self = StObject.set(x, "conditionContext", js.undefined)
    
    inline def setIdentitySelector(value: IdentitySelector): Self = StObject.set(x, "identitySelector", value.asInstanceOf[js.Any])
    
    inline def setIdentitySelectorUndefined: Self = StObject.set(x, "identitySelector", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceSelector(value: ResourceSelector): Self = StObject.set(x, "resourceSelector", value.asInstanceOf[js.Any])
    
    inline def setResourceSelectorUndefined: Self = StObject.set(x, "resourceSelector", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
