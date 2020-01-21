package typings.googleapis.iamV1Mod.iamV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Iampolicies")
@js.native
class ResourceIampolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.iamPolicies.lintPolicy
    * @desc Lints a Cloud IAM policy object or its sub fields. Currently
    * supports google.iam.v1.Policy, google.iam.v1.Binding and
    * google.iam.v1.Binding.condition.  Each lint operation consists of
    * multiple lint validation units. Validation units have the following
    * properties:  - Each unit inspects the input object in regard to a
    * particular   linting aspect and issues a google.iam.admin.v1.LintResult
    * disclosing the result. - Domain of discourse of each unit can be either
    * google.iam.v1.Policy, google.iam.v1.Binding, or
    * google.iam.v1.Binding.condition depending on the purpose of the
    * validation. - A unit may require additional data (like the list of all
    * possible   enumerable values of a particular attribute used in the policy
    * instance)   which shall be provided by the caller. Refer to the comments
    * of   google.iam.admin.v1.LintPolicyRequest.context for more details.  The
    * set of applicable validation units is determined by the Cloud IAM server
    * and is not configurable.  Regardless of any lint issues or their
    * severities, successful calls to `lintPolicy` return an HTTP 200 OK status
    * code.
    * @alias iam.iamPolicies.lintPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().LintPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def lintPolicy(): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(callback: BodyResponseCallback[SchemaLintPolicyResponse]): Unit = js.native
  def lintPolicy(params: ParamsResourceIampoliciesLintpolicy): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    callback: BodyResponseCallback[SchemaLintPolicyResponse]
  ): Unit = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    options: BodyResponseCallback[SchemaLintPolicyResponse],
    callback: BodyResponseCallback[SchemaLintPolicyResponse]
  ): Unit = js.native
  def lintPolicy(params: ParamsResourceIampoliciesLintpolicy, options: MethodOptions): GaxiosPromise[SchemaLintPolicyResponse] = js.native
  def lintPolicy(
    params: ParamsResourceIampoliciesLintpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLintPolicyResponse]
  ): Unit = js.native
  /**
    * iam.iamPolicies.queryAuditableServices
    * @desc Returns a list of services that support service level audit logging
    * configuration for the given resource.
    * @alias iam.iamPolicies.queryAuditableServices
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryAuditableServicesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def queryAuditableServices(): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]): Unit = js.native
  def queryAuditableServices(params: ParamsResourceIampoliciesQueryauditableservices): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    options: BodyResponseCallback[SchemaQueryAuditableServicesResponse],
    callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
  def queryAuditableServices(params: ParamsResourceIampoliciesQueryauditableservices, options: MethodOptions): GaxiosPromise[SchemaQueryAuditableServicesResponse] = js.native
  def queryAuditableServices(
    params: ParamsResourceIampoliciesQueryauditableservices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryAuditableServicesResponse]
  ): Unit = js.native
}

