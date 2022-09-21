package typings.googleapis.mlV1Mod.mlV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def explain(): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def explain(callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def explain(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def explain(params: ParamsResourceProjectsExplain): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def explain(params: ParamsResourceProjectsExplain, callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def explain(
    params: ParamsResourceProjectsExplain,
    options: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody],
    callback: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def explain(params: ParamsResourceProjectsExplain, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def explain(
    params: ParamsResourceProjectsExplain,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  /**
    * Performs explanation on the data in the request. {% dynamic include "/ai-platform/includes/___explain-request" %\}
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await ml.projects.explain({
    *     // Required. The resource name of a model or a version. Authorization: requires the `predict` permission on the specified resource.
    *     name: 'projects/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "httpBody": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def explain(params: ParamsResourceProjectsExplain, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def explain(
    params: ParamsResourceProjectsExplain,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getConfig(): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]): Unit = js.native
  def getConfig(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1GetConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  def getConfig(params: ParamsResourceProjectsGetconfig, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1GetConfigResponse] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1GetConfigResponse]
  ): Unit = js.native
  /**
    * Get the service account information associated with your project. You need this information in order to grant the service account permissions for the Google Cloud Storage location where you put your model training code for training the model with Google Cloud Machine Learning.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await ml.projects.getConfig({
    *     // Required. The project name.
    *     name: 'projects/my-project',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "config": {},
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "serviceAccountProject": "my_serviceAccountProject"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getConfig(params: ParamsResourceProjectsGetconfig, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getConfig(
    params: ParamsResourceProjectsGetconfig,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var jobs: ResourceProjectsJobs = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var models: ResourceProjectsModels = js.native
  
  var operations: ResourceProjectsOperations = js.native
  
  def predict(): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def predict(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(params: ParamsResourceProjectsPredict): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(params: ParamsResourceProjectsPredict, callback: BodyResponseCallback[SchemaGoogleApiHttpBody]): Unit = js.native
  def predict(
    params: ParamsResourceProjectsPredict,
    options: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody],
    callback: BodyResponseCallback[Readable | SchemaGoogleApiHttpBody]
  ): Unit = js.native
  def predict(params: ParamsResourceProjectsPredict, options: MethodOptions): GaxiosPromise[SchemaGoogleApiHttpBody] = js.native
  def predict(
    params: ParamsResourceProjectsPredict,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleApiHttpBody]
  ): Unit = js.native
  /**
    * Performs online prediction on the data in the request. {% dynamic include "/ai-platform/includes/___predict-request" %\}
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ml.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ml = google.ml('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await ml.projects.predict({
    *     // Required. The resource name of a model or a version. Authorization: requires the `predict` permission on the specified resource.
    *     name: 'projects/.*',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "httpBody": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def predict(params: ParamsResourceProjectsPredict, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def predict(
    params: ParamsResourceProjectsPredict,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
