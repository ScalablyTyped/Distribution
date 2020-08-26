package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to lint a Cloud IAM policy object. LintPolicy is currently
  * functional only for `lint_object` of type `condition`.
  */
@js.native
trait SchemaLintPolicyRequest extends js.Object {
  /**
    * Binding object to be linted. The functionality of linting a binding is
    * not yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var binding: js.UndefOr[SchemaBinding] = js.native
  /**
    * google.iam.v1.Binding.condition object to be linted.
    */
  var condition: js.UndefOr[SchemaExpr] = js.native
  /**
    * `context` contains additional *permission-controlled* data that any lint
    * unit may depend on, in form of `{key: value}` pairs. Currently, this
    * field is non-operational and it will not be used during the lint
    * operation.
    */
  var context: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The full resource name of the policy this lint request is about.  The
    * name follows the Google Cloud Platform (GCP) resource format. For
    * example, a GCP project with ID `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.  The
    * resource name is not used to read the policy instance from the Cloud IAM
    * database. The candidate policy for lint has to be provided in the same
    * request object.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /**
    * Policy object to be linted. The functionality of linting a policy is not
    * yet implemented and if this field is set, it returns NOT_IMPLEMENTED
    * error.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}

object SchemaLintPolicyRequest {
  @scala.inline
  def apply(): SchemaLintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintPolicyRequest]
  }
  @scala.inline
  implicit class SchemaLintPolicyRequestOps[Self <: SchemaLintPolicyRequest] (val x: Self) extends AnyVal {
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
    def setBinding(value: SchemaBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinding: Self = this.set("binding", js.undefined)
    @scala.inline
    def setCondition(value: SchemaExpr): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setContext(value: StringDictionary[js.Any]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFullResourceName(value: String): Self = this.set("fullResourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullResourceName: Self = this.set("fullResourceName", js.undefined)
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

