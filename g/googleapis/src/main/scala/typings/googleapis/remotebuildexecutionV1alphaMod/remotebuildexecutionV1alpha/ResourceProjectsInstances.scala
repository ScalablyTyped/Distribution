package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1alpha", "remotebuildexecution_v1alpha.Resource$Projects$Instances")
@js.native
class ResourceProjectsInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var workerpools: ResourceProjectsInstancesWorkerpools = js.native
  /**
    * remotebuildexecution.projects.instances.create
    * @desc Creates a new instance in the specified region. Returns a long
    * running operation which contains an instance on completion. While the
    * long running operation is in progress, any call to `GetInstance` returns
    * an instance in state `CREATING`.
    * @alias remotebuildexecution.projects.instances.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
    * @param {().GoogleDevtoolsRemotebuildexecutionAdminV1alphaCreateInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceProjectsInstancesCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsInstancesCreate,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsInstancesCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceProjectsInstancesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.delete
    * @desc Deletes the specified instance. Returns a long running operation
    * which contains a `google.protobuf.Empty` response on completion. Deleting
    * an instance with worker pools in it will delete these worker pools.
    * @alias remotebuildexecution.projects.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the instance to delete. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsInstancesDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDelete,
    options: BodyResponseCallback[SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.get
    * @desc Returns the specified instance.
    * @alias remotebuildexecution.projects.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the instance to retrieve. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(params: ParamsResourceProjectsInstancesGet): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(
    params: ParamsResourceProjectsInstancesGet,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsInstancesGet,
    options: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance],
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = js.native
  def get(
    params: ParamsResourceProjectsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  ): Unit = js.native
  /**
    * remotebuildexecution.projects.instances.list
    * @desc Lists instances in a project.
    * @alias remotebuildexecution.projects.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Resource name of the project. Format: `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesList): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    options: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse],
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesList, options: MethodOptions): GaxiosPromise[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  ): Unit = js.native
}

