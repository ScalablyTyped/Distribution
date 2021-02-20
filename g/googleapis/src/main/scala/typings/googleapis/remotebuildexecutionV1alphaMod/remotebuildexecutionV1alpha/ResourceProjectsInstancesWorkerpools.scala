package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Resource$Projects$Instances$Workerpools")
@js.native
class ResourceProjectsInstancesWorkerpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * remotebuildexecution.projects.instances.workerpools.create
    * @desc Creates a new worker pool with a specified size and configuration.
    * Returns a long running operation which contains a worker pool on
    * completion. While the long running operation is in progress, any call to
    * `GetWorkerPool` returns a worker pool in state `CREATING`.
    * @alias remotebuildexecution.projects.instances.workerpools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the instance in which to create the new worker pool. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateWorkerPoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsInstancesWorkerpoolsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesWorkerpoolsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesWorkerpoolsCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesWorkerpoolsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesWorkerpoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * remotebuildexecution.projects.instances.workerpools.delete
    * @desc Deletes the specified worker pool. Returns a long running
    * operation, which contains a `google.protobuf.Empty` response on
    * completion. While the long running operation is in progress, any call to
    * `GetWorkerPool` returns a worker pool in state `DELETING`.
    * @alias remotebuildexecution.projects.instances.workerpools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the worker pool to delete. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsInstancesWorkerpoolsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesWorkerpoolsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesWorkerpoolsDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesWorkerpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesWorkerpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  
  /**
    * remotebuildexecution.projects.instances.workerpools.get
    * @desc Returns the specified worker pool.
    * @alias remotebuildexecution.projects.instances.workerpools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the worker pool to retrieve. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsInstancesWorkerpoolsGet): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsInstancesWorkerpoolsGet,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesWorkerpoolsGet,
    options: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool],
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesWorkerpoolsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsInstancesWorkerpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  ): Unit = js.native
  
  /**
    * remotebuildexecution.projects.instances.workerpools.list
    * @desc Lists worker pools in an instance.
    * @alias remotebuildexecution.projects.instances.workerpools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesWorkerpoolsList): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesWorkerpoolsList,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesWorkerpoolsList,
    options: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse],
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesWorkerpoolsList, options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesWorkerpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  ): Unit = js.native
  
  /**
    * remotebuildexecution.projects.instances.workerpools.patch
    * @desc Updates an existing worker pool with a specified size and/or
    * configuration. Returns a long running operation, which contains a worker
    * pool on completion. While the long running operation is in progress, any
    * call to `GetWorkerPool` returns a worker pool in state `UPDATING`.
    * @alias remotebuildexecution.projects.instances.workerpools.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name WorkerPool resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be populated when creating a worker pool since it is provided in the `poolId` field.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(params: ParamsResourceProjectsInstancesWorkerpoolsPatch): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesWorkerpoolsPatch,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsInstancesWorkerpoolsPatch,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsInstancesWorkerpoolsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsResourceProjectsInstancesWorkerpoolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
}
