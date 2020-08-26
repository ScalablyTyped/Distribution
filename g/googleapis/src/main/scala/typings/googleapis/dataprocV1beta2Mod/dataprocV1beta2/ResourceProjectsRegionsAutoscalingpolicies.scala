package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Autoscalingpolicies")
@js.native
class ResourceProjectsRegionsAutoscalingpolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.create
    * @desc Creates new autoscaling policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}.
    * @param {().AutoscalingPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(params: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate,
    options: BodyResponseCallback[SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def create(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.delete
    * @desc Deletes an autoscaling policy. It is an error to delete an
    * autoscaling policy that is in use by one or more clusters.
    * @alias dataproc.projects.regions.autoscalingPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsRegionsAutoscalingpoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsRegionsAutoscalingpoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.get
    * @desc Retrieves autoscaling policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(params: ParamsResourceProjectsRegionsAutoscalingpoliciesGet): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGet,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGet,
    options: BodyResponseCallback[SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsRegionsAutoscalingpoliciesGet, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def get(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.autoscalingPolicies.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsAutoscalingpoliciesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsRegionsAutoscalingpoliciesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.list
    * @desc Lists autoscaling policies in the project.
    * @alias dataproc.projects.regions.autoscalingPolicies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(params: ParamsResourceProjectsRegionsAutoscalingpoliciesList): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesList,
    callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesList,
    options: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse],
    callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsRegionsAutoscalingpoliciesList, options: MethodOptions): GaxiosPromise[SchemaListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAutoscalingPoliciesResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsAutoscalingpoliciesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsRegionsAutoscalingpoliciesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.autoscalingPolicies.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsAutoscalingpoliciesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsRegionsAutoscalingpoliciesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.update
    * @desc Updates (replaces) autoscaling policy.Disabled check for
    * update_mask, because all updates will be full replacements.
    * @alias dataproc.projects.regions.autoscalingPolicies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The "resource name" of the policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {().AutoscalingPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(callback: BodyResponseCallback[SchemaAutoscalingPolicy]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(params: ParamsResourceProjectsRegionsAutoscalingpoliciesUpdate): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesUpdate,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesUpdate,
    options: BodyResponseCallback[SchemaAutoscalingPolicy],
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsRegionsAutoscalingpoliciesUpdate, options: MethodOptions): GaxiosPromise[SchemaAutoscalingPolicy] = js.native
  def update(
    params: ParamsResourceProjectsRegionsAutoscalingpoliciesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalingPolicy]
  ): Unit = js.native
}

