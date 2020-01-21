package typings.googleapis.scriptV1Mod.scriptV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/script/v1", "script_v1.Resource$Projects$Deployments")
@js.native
class ResourceProjectsDeployments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * script.projects.deployments.create
    * @desc Creates a deployment of an Apps Script project.
    * @alias script.projects.deployments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().DeploymentConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDeployment] = js.native
  def create(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate): GaxiosPromise[SchemaDeployment] = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def create(
    params: ParamsResourceProjectsDeploymentsCreate,
    options: BodyResponseCallback[SchemaDeployment],
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsDeploymentsCreate, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def create(
    params: ParamsResourceProjectsDeploymentsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  /**
    * script.projects.deployments.delete
    * @desc Deletes a deployment of an Apps Script project.
    * @alias script.projects.deployments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID to be undeployed.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsDeploymentsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsDeploymentsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsDeploymentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * script.projects.deployments.get
    * @desc Gets a deployment of an Apps Script project.
    * @alias script.projects.deployments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDeployment] = js.native
  def get(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet): GaxiosPromise[SchemaDeployment] = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def get(
    params: ParamsResourceProjectsDeploymentsGet,
    options: BodyResponseCallback[SchemaDeployment],
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDeploymentsGet, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def get(
    params: ParamsResourceProjectsDeploymentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  /**
    * script.projects.deployments.list
    * @desc Lists the deployments of an Apps Script project.
    * @alias script.projects.deployments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of deployments on each returned page. Defaults to 50.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of `nextPageToken` from a previous response.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDeploymentsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsDeploymentsList): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    callback: BodyResponseCallback[SchemaListDeploymentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    options: BodyResponseCallback[SchemaListDeploymentsResponse],
    callback: BodyResponseCallback[SchemaListDeploymentsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDeploymentsList, options: MethodOptions): GaxiosPromise[SchemaListDeploymentsResponse] = js.native
  def list(
    params: ParamsResourceProjectsDeploymentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDeploymentsResponse]
  ): Unit = js.native
  /**
    * script.projects.deployments.update
    * @desc Updates a deployment of an Apps Script project.
    * @alias script.projects.deployments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.deploymentId The deployment ID for this deployment.
    * @param {string} params.scriptId The script project's Drive ID.
    * @param {().UpdateDeploymentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaDeployment] = js.native
  def update(callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate): GaxiosPromise[SchemaDeployment] = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate, callback: BodyResponseCallback[SchemaDeployment]): Unit = js.native
  def update(
    params: ParamsResourceProjectsDeploymentsUpdate,
    options: BodyResponseCallback[SchemaDeployment],
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
  def update(params: ParamsResourceProjectsDeploymentsUpdate, options: MethodOptions): GaxiosPromise[SchemaDeployment] = js.native
  def update(
    params: ParamsResourceProjectsDeploymentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDeployment]
  ): Unit = js.native
}

