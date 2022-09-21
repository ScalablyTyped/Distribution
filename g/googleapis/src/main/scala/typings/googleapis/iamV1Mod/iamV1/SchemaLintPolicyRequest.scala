package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLintPolicyRequest extends StObject {
  
  /**
    * google.iam.v1.Binding.condition object to be linted.
    */
  var condition: js.UndefOr[SchemaExpr] = js.undefined
  
  /**
    * The full resource name of the policy this lint request is about. The name follows the Google Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project` will be named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not used to read the policy instance from the Cloud IAM database. The candidate policy for lint has to be provided in the same request object.
    */
  var fullResourceName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLintPolicyRequest {
  
  inline def apply(): SchemaLintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyRequest]
  }
  
  extension [Self <: SchemaLintPolicyRequest](x: Self) {
    
    inline def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameNull: Self = StObject.set(x, "fullResourceName", null)
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
