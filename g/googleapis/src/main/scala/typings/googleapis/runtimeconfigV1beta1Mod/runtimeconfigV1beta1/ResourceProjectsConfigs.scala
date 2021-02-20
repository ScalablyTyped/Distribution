package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/runtimeconfig/v1beta1", "runtimeconfig_v1beta1.Resource$Projects$Configs")
@js.native
class ResourceProjectsConfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * runtimeconfig.projects.configs.create
    * @desc Creates a new RuntimeConfig resource. The configuration name must
    * be unique within project.
    * @alias runtimeconfig.projects.configs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The [project ID](https://support.google.com/cloud/answer/6158840?hl=en&ref_topic=6158848) for this request, in the format `projects/[PROJECT_ID]`.
    * @param {string=} params.requestId An optional but recommended unique `request_id`. If the server receives two `create()` requests  with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored.  It is responsibility of the client to ensure uniqueness of the `request_id` strings.  `request_id` strings are limited to 64 characters.
    * @param {().RuntimeConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def create(params: ParamsResourceProjectsConfigsCreate): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def create(params: ParamsResourceProjectsConfigsCreate, callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def create(
    params: ParamsResourceProjectsConfigsCreate,
    options: BodyResponseCallback[SchemaRuntimeConfig],
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsConfigsCreate, options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def create(
    params: ParamsResourceProjectsConfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.delete
    * @desc Deletes a RuntimeConfig resource.
    * @alias runtimeconfig.projects.configs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The RuntimeConfig resource to delete, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsConfigsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsConfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsConfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.get
    * @desc Gets information about a RuntimeConfig resource.
    * @alias runtimeconfig.projects.configs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the RuntimeConfig resource to retrieve, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def get(params: ParamsResourceProjectsConfigsGet): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def get(params: ParamsResourceProjectsConfigsGet, callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def get(
    params: ParamsResourceProjectsConfigsGet,
    options: BodyResponseCallback[SchemaRuntimeConfig],
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConfigsGet, options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def get(
    params: ParamsResourceProjectsConfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias runtimeconfig.projects.configs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsConfigsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsConfigsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsConfigsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsConfigsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsConfigsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.list
    * @desc Lists all the RuntimeConfig resources within project.
    * @alias runtimeconfig.projects.configs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent The [project ID](https://support.google.com/cloud/answer/6158840?hl=en&ref_topic=6158848) for this request, in the format `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListConfigsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsConfigsList): GaxiosPromise[SchemaListConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsList,
    callback: BodyResponseCallback[SchemaListConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConfigsList,
    options: BodyResponseCallback[SchemaListConfigsResponse],
    callback: BodyResponseCallback[SchemaListConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConfigsList, options: MethodOptions): GaxiosPromise[SchemaListConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListConfigsResponse]
  ): Unit = js.native
  
  var operations: ResourceProjectsConfigsOperations = js.native
  
  /**
    * runtimeconfig.projects.configs.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias runtimeconfig.projects.configs.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsConfigsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsConfigsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsConfigsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsConfigsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsConfigsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias runtimeconfig.projects.configs.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsConfigsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsConfigsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.update
    * @desc Updates a RuntimeConfig resource. The configuration must exist
    * beforehand.
    * @alias runtimeconfig.projects.configs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the RuntimeConfig resource to update, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {().RuntimeConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def update(callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def update(params: ParamsResourceProjectsConfigsUpdate): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def update(params: ParamsResourceProjectsConfigsUpdate, callback: BodyResponseCallback[SchemaRuntimeConfig]): Unit = js.native
  def update(
    params: ParamsResourceProjectsConfigsUpdate,
    options: BodyResponseCallback[SchemaRuntimeConfig],
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsConfigsUpdate, options: MethodOptions): GaxiosPromise[SchemaRuntimeConfig] = js.native
  def update(
    params: ParamsResourceProjectsConfigsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuntimeConfig]
  ): Unit = js.native
  
  var variables: ResourceProjectsConfigsVariables = js.native
  
  var waiters: ResourceProjectsConfigsWaiters = js.native
}
