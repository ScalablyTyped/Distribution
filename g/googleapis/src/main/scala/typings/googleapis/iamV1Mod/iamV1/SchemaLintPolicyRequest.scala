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
  def apply(
    binding: SchemaBinding = null,
    condition: SchemaExpr = null,
    context: StringDictionary[js.Any] = null,
    fullResourceName: String = null,
    policy: SchemaPolicy = null
  ): SchemaLintPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (fullResourceName != null) __obj.updateDynamic("fullResourceName")(fullResourceName.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLintPolicyRequest]
  }
}

