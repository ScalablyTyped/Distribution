package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions")
@js.native
class ResourceProjectsHistoriesExecutions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var clusters: ResourceProjectsHistoriesExecutionsClusters = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * toolresults.projects.histories.executions.create
    * @desc Creates an Execution.  The returned Execution will have the id set.
    * May return any of the following canonical error codes:  -
    * PERMISSION_DENIED - if the user is not authorized to write to project -
    * INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing History does not exist
    * @alias toolresults.projects.histories.executions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().Execution} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaExecution] = js.native
  def create(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsCreate): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    options: BodyResponseCallback[SchemaExecution],
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsHistoriesExecutionsCreate, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def create(
    params: ParamsResourceProjectsHistoriesExecutionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  
  /**
    * toolresults.projects.histories.executions.get
    * @desc Gets an Execution.  May return any of the following canonical error
    * codes:  - PERMISSION_DENIED - if the user is not authorized to write to
    * project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if
    * the Execution does not exist
    * @alias toolresults.projects.histories.executions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaExecution] = js.native
  def get(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsGet): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    options: BodyResponseCallback[SchemaExecution],
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsHistoriesExecutionsGet, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def get(
    params: ParamsResourceProjectsHistoriesExecutionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  
  /**
    * toolresults.projects.histories.executions.list
    * @desc Lists Executions for a given History.  The executions are sorted by
    * creation_time in descending order. The execution_id key will be used to
    * order the executions with the same creation_time.  May return any of the
    * following canonical error codes:  - PERMISSION_DENIED - if the user is
    * not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the containing History does not exist
    * @alias toolresults.projects.histories.executions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.historyId A History id.  Required.
    * @param {integer=} params.pageSize The maximum number of Executions to fetch.  Default value: 25. The server will use this default if the field is not set or has a value of 0.  Optional.
    * @param {string=} params.pageToken A continuation token to resume the query at the next item.  Optional.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListExecutionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsList): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    options: BodyResponseCallback[SchemaListExecutionsResponse],
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsHistoriesExecutionsList, options: MethodOptions): GaxiosPromise[SchemaListExecutionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsHistoriesExecutionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListExecutionsResponse]
  ): Unit = js.native
  
  /**
    * toolresults.projects.histories.executions.patch
    * @desc Updates an existing Execution with the supplied partial entity. May
    * return any of the following canonical error codes:  - PERMISSION_DENIED -
    * if the user is not authorized to write to project - INVALID_ARGUMENT - if
    * the request is malformed - FAILED_PRECONDITION - if the requested state
    * transition is illegal - NOT_FOUND - if the containing History does not
    * exist
    * @alias toolresults.projects.histories.executions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId Required.
    * @param {string} params.historyId Required.
    * @param {string} params.projectId A Project id. Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().Execution} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaExecution] = js.native
  def patch(callback: BodyResponseCallback[SchemaExecution]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsPatch): GaxiosPromise[SchemaExecution] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    options: BodyResponseCallback[SchemaExecution],
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsHistoriesExecutionsPatch, options: MethodOptions): GaxiosPromise[SchemaExecution] = js.native
  def patch(
    params: ParamsResourceProjectsHistoriesExecutionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExecution]
  ): Unit = js.native
  
  var steps: ResourceProjectsHistoriesExecutionsSteps = js.native
}
