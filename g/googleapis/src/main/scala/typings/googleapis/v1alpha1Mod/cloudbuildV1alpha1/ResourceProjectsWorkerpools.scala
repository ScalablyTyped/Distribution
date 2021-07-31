package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1alpha1", "cloudbuild_v1alpha1.Resource$Projects$Workerpools")
@js.native
class ResourceProjectsWorkerpools protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudbuild.projects.workerPools.create
    * @desc Creates a `WorkerPool` to run the builds, and returns the new
    * worker pool.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent ID of the parent project.
    * @param {().WorkerPool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def create(
    params: ParamsResourceProjectsWorkerpoolsCreate,
    options: BodyResponseCallback[SchemaWorkerPool],
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsWorkerpoolsCreate, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def create(
    params: ParamsResourceProjectsWorkerpoolsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.workerPools.delete
    * @desc Deletes a `WorkerPool` by its project ID and WorkerPool name.  This
    * API is experimental.
    * @alias cloudbuild.projects.workerPools.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsWorkerpoolsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsWorkerpoolsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsWorkerpoolsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.workerPools.get
    * @desc Returns information about a `WorkerPool`.  This API is
    * experimental.
    * @alias cloudbuild.projects.workerPools.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def get(
    params: ParamsResourceProjectsWorkerpoolsGet,
    options: BodyResponseCallback[SchemaWorkerPool],
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsWorkerpoolsGet, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def get(
    params: ParamsResourceProjectsWorkerpoolsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.workerPools.list
    * @desc List project's `WorkerPool`s.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent ID of the parent project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(params: ParamsResourceProjectsWorkerpoolsList): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    options: BodyResponseCallback[SchemaListWorkerPoolsResponse],
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsWorkerpoolsList, options: MethodOptions): GaxiosPromise[SchemaListWorkerPoolsResponse] = js.native
  def list(
    params: ParamsResourceProjectsWorkerpoolsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWorkerPoolsResponse]
  ): Unit = js.native
  
  /**
    * cloudbuild.projects.workerPools.patch
    * @desc Update a `WorkerPool`.  This API is experimental.
    * @alias cloudbuild.projects.workerPools.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: "projects/project-1/workerPools/workerpool-name"
    * @param {().WorkerPool} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch, callback: BodyResponseCallback[SchemaWorkerPool]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsWorkerpoolsPatch,
    options: BodyResponseCallback[SchemaWorkerPool],
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsWorkerpoolsPatch, options: MethodOptions): GaxiosPromise[SchemaWorkerPool] = js.native
  def patch(
    params: ParamsResourceProjectsWorkerpoolsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWorkerPool]
  ): Unit = js.native
}
