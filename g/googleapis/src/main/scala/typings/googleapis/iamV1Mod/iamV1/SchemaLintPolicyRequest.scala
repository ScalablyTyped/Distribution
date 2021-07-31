package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to lint a Cloud IAM policy object. LintPolicy is currently
  * functional only for `lint_object` of type `condition`.
  */
trait SchemaLintPolicyRequest extends StObject {
  
  /**
    * Binding object to be linted. The functionality of linting a binding is
    * not yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var binding: js.UndefOr[SchemaBinding] = js.undefined
  
  /**
    * google.iam.v1.Binding.condition object to be linted.
    */
  var condition: js.UndefOr[SchemaExpr] = js.undefined
  
  /**
    * `context` contains additional *permission-controlled* data that any lint
    * unit may depend on, in form of `{key: value}` pairs. Currently, this
    * field is non-operational and it will not be used during the lint
    * operation.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The full resource name of the policy this lint request is about.  The
    * name follows the Google Cloud Platform (GCP) resource format. For
    * example, a GCP project with ID `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.  The
    * resource name is not used to read the policy instance from the Cloud IAM
    * database. The candidate policy for lint has to be provided in the same
    * request object.
    */
  var fullResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Policy object to be linted. The functionality of linting a policy is not
    * yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
}
object SchemaLintPolicyRequest {
  
  @scala.inline
  def apply(): SchemaLintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaLintPolicyRequestMutableBuilder[Self <: SchemaLintPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: SchemaBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setCondition(value: SchemaExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
