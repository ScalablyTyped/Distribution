package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/runtimeconfig/v1beta1", "runtimeconfig_v1beta1.Resource$Projects$Configs$Variables")
@js.native
class ResourceProjectsConfigsVariables protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.create
    * @desc Creates a variable within the given configuration. You cannot
    * create a variable with a name that is a prefix of an existing variable
    * name, or a name that has an existing variable name as a prefix.  To learn
    * more about creating a variable, read the [Setting and Getting
    * Data](/deployment-manager/runtime-configurator/set-and-get-variables)
    * documentation.
    * @alias runtimeconfig.projects.configs.variables.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The path to the RutimeConfig resource that this variable should belong to. The configuration must exist beforehand; the path must be in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {string=} params.requestId An optional but recommended unique `request_id`. If the server receives two `create()` requests  with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored.  It is responsibility of the client to ensure uniqueness of the `request_id` strings.  `request_id` strings are limited to 64 characters.
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaVariable] = js.native
  def create(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(params: ParamsResourceProjectsConfigsVariablesCreate): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceProjectsConfigsVariablesCreate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsConfigsVariablesCreate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsConfigsVariablesCreate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def create(
    params: ParamsResourceProjectsConfigsVariablesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.delete
    * @desc Deletes a variable or multiple variables.  If you specify a
    * variable name, then that variable is deleted. If you specify a prefix and
    * `recursive` is true, then all variables with that prefix are deleted. You
    * must set a `recursive` to true if you delete variables by prefix.
    * @alias runtimeconfig.projects.configs.variables.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the variable to delete, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME]`
    * @param {boolean=} params.recursive Set to `true` to recursively delete multiple variables with the same prefix.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsVariablesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsConfigsVariablesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsConfigsVariablesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsConfigsVariablesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsConfigsVariablesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.get
    * @desc Gets information about a single variable.
    * @alias runtimeconfig.projects.configs.variables.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the variable to return, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIBLE_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVariable] = js.native
  def get(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(params: ParamsResourceProjectsConfigsVariablesGet): GaxiosPromise[SchemaVariable] = js.native
  def get(params: ParamsResourceProjectsConfigsVariablesGet, callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def get(
    params: ParamsResourceProjectsConfigsVariablesGet,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsConfigsVariablesGet, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def get(
    params: ParamsResourceProjectsConfigsVariablesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.list
    * @desc Lists variables within given a configuration, matching any provided
    * filters. This only lists variable names, not the values, unless
    * `return_values` is true, in which case only variables that user has IAM
    * permission to GetVariable will be returned.
    * @alias runtimeconfig.projects.configs.variables.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Filters variables by matching the specified filter. For example:  `projects/example-project/config/[CONFIG_NAME]/variables/example-variable`.
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent The path to the RuntimeConfig resource for which you want to list variables. The configuration must exist beforehand; the path must be in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {boolean=} params.returnValues The flag indicates whether the user wants to return values of variables. If true, then only those variables that user has IAM GetVariable permission will be returned along with their values.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVariablesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(params: ParamsResourceProjectsConfigsVariablesList): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsVariablesList,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsConfigsVariablesList,
    options: BodyResponseCallback[SchemaListVariablesResponse],
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsConfigsVariablesList, options: MethodOptions): GaxiosPromise[SchemaListVariablesResponse] = js.native
  def list(
    params: ParamsResourceProjectsConfigsVariablesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVariablesResponse]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias runtimeconfig.projects.configs.variables.testIamPermissions
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
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsConfigsVariablesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsVariablesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsVariablesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsConfigsVariablesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsConfigsVariablesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.update
    * @desc Updates an existing variable with a new value.
    * @alias runtimeconfig.projects.configs.variables.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the variable to update, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME]`
    * @param {().Variable} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaVariable] = js.native
  def update(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(params: ParamsResourceProjectsConfigsVariablesUpdate): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceProjectsConfigsVariablesUpdate,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(
    params: ParamsResourceProjectsConfigsVariablesUpdate,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsConfigsVariablesUpdate, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def update(
    params: ParamsResourceProjectsConfigsVariablesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  
  /**
    * runtimeconfig.projects.configs.variables.watch
    * @desc Watches a specific variable and waits for a change in the
    * variable's value. When there is a change, this method returns the new
    * value or times out.  If a variable is deleted while being watched, the
    * `variableState` state is set to `DELETED` and the method returns the last
    * known variable `value`.  If you set the deadline for watching to a larger
    * value than internal timeout (60 seconds), the current variable value is
    * returned and the `variableState` will be `VARIABLE_STATE_UNSPECIFIED`. To
    * learn more about creating a watcher, read the [Watching a Variable for
    * Changes](/deployment-manager/runtime-configurator/watching-a-variable)
    * documentation.
    * @alias runtimeconfig.projects.configs.variables.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the variable to watch, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {().WatchVariableRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaVariable] = js.native
  def watch(callback: BodyResponseCallback[SchemaVariable]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def watch(params: ParamsResourceProjectsConfigsVariablesWatch): GaxiosPromise[SchemaVariable] = js.native
  def watch(
    params: ParamsResourceProjectsConfigsVariablesWatch,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def watch(
    params: ParamsResourceProjectsConfigsVariablesWatch,
    options: BodyResponseCallback[SchemaVariable],
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
  def watch(params: ParamsResourceProjectsConfigsVariablesWatch, options: MethodOptions): GaxiosPromise[SchemaVariable] = js.native
  def watch(
    params: ParamsResourceProjectsConfigsVariablesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVariable]
  ): Unit = js.native
}
