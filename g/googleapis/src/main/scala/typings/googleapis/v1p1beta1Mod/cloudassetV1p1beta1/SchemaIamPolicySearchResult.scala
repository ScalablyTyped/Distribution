package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIamPolicySearchResult extends StObject {
  
  /**
    * Explanation about the IAM policy search result. It contains additional information that explains why the search result matches the query.
    */
  var explanation: js.UndefOr[SchemaExplanation] = js.undefined
  
  /**
    * The IAM policy attached to the specified resource. Note that the original IAM policy can contain multiple bindings. This only contains the bindings that match the given query. For queries that don't contain a constraint on policies (e.g. an empty query), this contains all the bindings.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
  
  /**
    * The project that the associated Google Cloud resource belongs to, in the form of `projects/{project_number\}`. If an IAM policy is set on a resource -- such as a Compute Engine instance or a Cloud Storage bucket -- the project field will indicate the project that contains the resource. If an IAM policy is set on a folder or orgnization, the project field will be empty.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [full resource name](https://cloud.google.com/apis/design/resource_names#full_resource_name) of the resource associated with this IAM policy.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object SchemaIamPolicySearchResult {
  
  inline def apply(): SchemaIamPolicySearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIamPolicySearchResult]
  }
  
  extension [Self <: SchemaIamPolicySearchResult](x: Self) {
    
    inline def setExplanation(value: SchemaExplanation): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
