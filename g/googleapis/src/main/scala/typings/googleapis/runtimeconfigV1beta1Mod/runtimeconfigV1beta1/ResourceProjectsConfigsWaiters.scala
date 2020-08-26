package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/runtimeconfig/v1beta1", "runtimeconfig_v1beta1.Resource$Projects$Configs$Waiters")
@js.native
class ResourceProjectsConfigsWaiters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * runtimeconfig.projects.configs.waiters.create
    * @desc Creates a Waiter resource. This operation returns a long-running
    * Operation resource which can be polled for completion. However, a waiter
    * with the given name will exist (and can be retrieved) prior to the
    * operation completing. If the operation fails, the failed Waiter resource
    * will still exist and must be deleted prior to subsequent creation
    * attempts.
    * @alias runtimeconfig.projects.configs.waiters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The path to the configuration that will own the waiter. The configuration must exist beforehand; the path must be in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`.
    * @param {string=} params.requestId An optional but recommended unique `request_id`. If the server receives two `create()` requests  with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored.  It is responsibility of the client to ensure uniqueness of the `request_id` strings.  `request_id` strings are limited to 64 characters.
    * @param {().Waiter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsConfigsWaitersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsConfigsWaitersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsConfigsWaitersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsConfigsWaitersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsConfigsWaitersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.waiters.delete
    * @desc Deletes the waiter with the specified name.
    * @alias runtimeconfig.projects.configs.waiters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The Waiter resource to delete, in the format:   `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsWaitersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsWaitersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsConfigsWaitersDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsConfigsWaitersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsConfigsWaitersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.waiters.get
    * @desc Gets information about a single waiter.
    * @alias runtimeconfig.projects.configs.waiters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The fully-qualified name of the Waiter resource object to retrieve, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWaiter] = js.native
  def get(callback: BodyResponseCallback[SchemaWaiter]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaWaiter] = js.native
  def get(params: ParamsResourceProjectsConfigsWaitersGet): GaxiosPromise[SchemaWaiter] = js.native
  def get(params: ParamsResourceProjectsConfigsWaitersGet, callback: BodyResponseCallback[SchemaWaiter]): Unit = js.native
  def get(
    params: ParamsResourceProjectsConfigsWaitersGet,
    options: BodyResponseCallback[SchemaWaiter],
    callback: BodyResponseCallback[SchemaWaiter]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConfigsWaitersGet, options: MethodOptions): GaxiosPromise[SchemaWaiter] = js.native
  def get(
    params: ParamsResourceProjectsConfigsWaitersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWaiter]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.waiters.list
    * @desc List waiters within the given configuration.
    * @alias runtimeconfig.projects.configs.waiters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent The path to the configuration for which you want to get a list of waiters. The configuration must exist beforehand; the path must be in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListWaitersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWaitersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListWaitersResponse] = js.native
  def list(params: ParamsResourceProjectsConfigsWaitersList): GaxiosPromise[SchemaListWaitersResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsWaitersList,
    callback: BodyResponseCallback[SchemaListWaitersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConfigsWaitersList,
    options: BodyResponseCallback[SchemaListWaitersResponse],
    callback: BodyResponseCallback[SchemaListWaitersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConfigsWaitersList, options: MethodOptions): GaxiosPromise[SchemaListWaitersResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsWaitersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWaitersResponse]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.waiters.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias runtimeconfig.projects.configs.waiters.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsConfigsWaitersTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsWaitersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsWaitersTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsConfigsWaitersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsWaitersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}

