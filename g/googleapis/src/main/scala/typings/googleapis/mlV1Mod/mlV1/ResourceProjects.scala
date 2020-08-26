package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects")
@js.native
class ResourceProjects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var jobs: ResourceProjectsJobs = js.native
  var locations: ResourceProjectsLocations = js.native
  var models: ResourceProjectsModels = js.native
  var operations: ResourceProjectsOperations = js.native
  /**
    * ml.projects.getConfig
    * @desc Get the service account information associated with your project.
    * You need this information in order to grant the service account
    * permissions for the Google Cloud Storage location where you put your
    * model training code for training the model with Google Cloud Machine
    * Learning.
    * @alias ml.projects.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The project name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]): Unit = js.native
  def getConfig(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  /**
    * ml.projects.predict
    * @desc Performs prediction on the data in the request. Cloud ML Engine
    * implements a custom `predict` verb on top of an HTTP POST method. <p>For
    * details of the request and response format, see the **guide to the
    * [predict request format](/ml-engine/docs/v1/predict-request)**.
    * @alias ml.projects.predict
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of a model or a version.  Authorization: requires the `predict` permission on the specified resource.
    * @param {().GoogleCloudMlV1__PredictRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def predict(): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def predict(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(params: ParamsResourceProjectsPredict): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(params: ParamsResourceProjectsPredict, callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def predict(
    params: ParamsResourceProjectsPredict,
    options: BodyResponseCallback[SchemaGoogleApiHttpBody],
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def predict(params: ParamsResourceProjectsPredict, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(
    params: ParamsResourceProjectsPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
}

