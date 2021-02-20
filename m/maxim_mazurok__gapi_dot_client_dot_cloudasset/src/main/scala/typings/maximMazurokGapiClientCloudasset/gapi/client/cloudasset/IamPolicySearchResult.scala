package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IamPolicySearchResult extends StObject {
  
  /** Explanation about the IAM policy search result. It contains additional information to explain why the search result matches the query. */
  var explanation: js.UndefOr[Explanation] = js.native
  
  /**
    * The IAM policy directly set on the given resource. Note that the original IAM policy can contain multiple bindings. This only contains the bindings that match the given query. For
    * queries that don't contain a constrain on policies (e.g., an empty query), this contains all the bindings. To search against the `policy` bindings: * use a field query: - query by
    * the policy contained members. Example: `policy:amy@gmail.com` - query by the policy contained roles. Example: `policy:roles/compute.admin` - query by the policy contained roles'
    * included permissions. Example: `policy.role.permissions:compute.instances.create`
    */
  var policy: js.UndefOr[Policy] = js.native
  
  /**
    * The project that the associated GCP resource belongs to, in the form of projects/{PROJECT_NUMBER}. If an IAM policy is set on a resource (like VM instance, Cloud Storage bucket),
    * the project field will indicate the project that contains the resource. If an IAM policy is set on a folder or orgnization, the project field will be empty. To search against the
    * `project`: * specify the `scope` field as this project in your search request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * The full resource name of the resource associated with this IAM policy. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See [Cloud Asset
    * Inventory Resource Name Format](https://cloud.google.com/asset-inventory/docs/resource-name-format) for more information. To search against the `resource`: * use a field query.
    * Example: `resource:organizations/123`
    */
  var resource: js.UndefOr[String] = js.native
}
object IamPolicySearchResult {
  
  @scala.inline
  def apply(): IamPolicySearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicySearchResult]
  }
  
  @scala.inline
  implicit class IamPolicySearchResultMutableBuilder[Self <: IamPolicySearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanation(value: Explanation): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
