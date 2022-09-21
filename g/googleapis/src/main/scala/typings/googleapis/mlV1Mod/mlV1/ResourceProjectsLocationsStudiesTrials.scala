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

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Locations$Studies$Trials")
@js.native
open class ResourceProjectsLocationsStudiesTrials protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addMeasurement(): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def addMeasurement(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]): Unit = js.native
  def addMeasurement(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def addMeasurement(params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def addMeasurement(
    params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def addMeasurement(
    params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def addMeasurement(params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def addMeasurement(
    params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  /**
    * Adds a measurement of the objective metrics to a trial. This measurement is assumed to have been taken before the trial is complete.
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
    *   const res = await ml.projects.locations.studies.trials.addMeasurement({
    *     // Required. The trial name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "measurement": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "endTime": "my_endTime",
    *   //   "finalMeasurement": {},
    *   //   "infeasibleReason": "my_infeasibleReason",
    *   //   "measurements": [],
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "trialInfeasible": false
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
  def addMeasurement(params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addMeasurement(
    params: ParamsResourceProjectsLocationsStudiesTrialsAddmeasurement,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def checkEarlyStoppingState(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def checkEarlyStoppingState(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def checkEarlyStoppingState(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def checkEarlyStoppingState(params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Checks whether a trial should stop or not. Returns a long-running operation. When the operation is successful, it will contain a CheckTrialEarlyStoppingStateResponse.
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
    *   const res =
    *     await ml.projects.locations.studies.trials.checkEarlyStoppingState({
    *       // Required. The trial name.
    *       name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def checkEarlyStoppingState(
    params: ParamsResourceProjectsLocationsStudiesTrialsCheckearlystoppingstate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def complete(): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def complete(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]): Unit = js.native
  def complete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def complete(params: ParamsResourceProjectsLocationsStudiesTrialsComplete): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsStudiesTrialsComplete,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def complete(
    params: ParamsResourceProjectsLocationsStudiesTrialsComplete,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def complete(params: ParamsResourceProjectsLocationsStudiesTrialsComplete, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsStudiesTrialsComplete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  /**
    * Marks a trial as complete.
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
    *   const res = await ml.projects.locations.studies.trials.complete({
    *     // Required. The trial name.metat
    *     name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "finalMeasurement": {},
    *       //   "infeasibleReason": "my_infeasibleReason",
    *       //   "trialInfeasible": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "endTime": "my_endTime",
    *   //   "finalMeasurement": {},
    *   //   "infeasibleReason": "my_infeasibleReason",
    *   //   "measurements": [],
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "trialInfeasible": false
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
  def complete(params: ParamsResourceProjectsLocationsStudiesTrialsComplete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def complete(
    params: ParamsResourceProjectsLocationsStudiesTrialsComplete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def create(params: ParamsResourceProjectsLocationsStudiesTrialsCreate): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesTrialsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesTrialsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsStudiesTrialsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesTrialsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  /**
    * Adds a user provided trial to a study.
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
    *   const res = await ml.projects.locations.studies.trials.create({
    *     // Required. The name of the study that the trial belongs to.
    *     parent: 'projects/my-project/locations/my-location/studies/my-studie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientId": "my_clientId",
    *       //   "endTime": "my_endTime",
    *       //   "finalMeasurement": {},
    *       //   "infeasibleReason": "my_infeasibleReason",
    *       //   "measurements": [],
    *       //   "name": "my_name",
    *       //   "parameters": [],
    *       //   "startTime": "my_startTime",
    *       //   "state": "my_state",
    *       //   "trialInfeasible": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "endTime": "my_endTime",
    *   //   "finalMeasurement": {},
    *   //   "infeasibleReason": "my_infeasibleReason",
    *   //   "measurements": [],
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "trialInfeasible": false
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
  def create(params: ParamsResourceProjectsLocationsStudiesTrialsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsStudiesTrialsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsStudiesTrialsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesTrialsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesTrialsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsStudiesTrialsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesTrialsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a trial.
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
    *   const res = await ml.projects.locations.studies.trials.delete({
    *     // Required. The trial name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsStudiesTrialsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsStudiesTrialsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def get(params: ParamsResourceProjectsLocationsStudiesTrialsGet): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesTrialsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesTrialsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsStudiesTrialsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesTrialsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  /**
    * Gets a trial.
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
    *   const res = await ml.projects.locations.studies.trials.get({
    *     // Required. The trial name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "endTime": "my_endTime",
    *   //   "finalMeasurement": {},
    *   //   "infeasibleReason": "my_infeasibleReason",
    *   //   "measurements": [],
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "trialInfeasible": false
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
  def get(params: ParamsResourceProjectsLocationsStudiesTrialsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsStudiesTrialsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudMlV1ListTrialsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListTrialsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListTrialsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsStudiesTrialsList): GaxiosPromise[SchemaGoogleCloudMlV1ListTrialsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesTrialsList,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListTrialsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesTrialsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListTrialsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListTrialsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsStudiesTrialsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListTrialsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesTrialsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListTrialsResponse]
  ): Unit = js.native
  /**
    * Lists the trials associated with a study.
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
    *   const res = await ml.projects.locations.studies.trials.list({
    *     // Required. The name of the study that the trial belongs to.
    *     parent: 'projects/my-project/locations/my-location/studies/my-studie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "trials": []
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
  def list(params: ParamsResourceProjectsLocationsStudiesTrialsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsStudiesTrialsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listOptimalTrials(): GaxiosPromise[SchemaGoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  def listOptimalTrials(callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListOptimalTrialsResponse]): Unit = js.native
  def listOptimalTrials(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  def listOptimalTrials(params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials): GaxiosPromise[SchemaGoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  def listOptimalTrials(
    params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListOptimalTrialsResponse]
  ): Unit = js.native
  def listOptimalTrials(
    params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListOptimalTrialsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1ListOptimalTrialsResponse]
  ): Unit = js.native
  def listOptimalTrials(params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1ListOptimalTrialsResponse] = js.native
  def listOptimalTrials(
    params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1ListOptimalTrialsResponse]
  ): Unit = js.native
  /**
    * Lists the pareto-optimal trials for multi-objective study or the optimal trials for single-objective study. The definition of pareto-optimal can be checked in wiki page. https://en.wikipedia.org/wiki/Pareto_efficiency
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
    *   const res = await ml.projects.locations.studies.trials.listOptimalTrials({
    *     // Required. The name of the study that the pareto-optimal trial belongs to.
    *     parent: 'projects/my-project/locations/my-location/studies/my-studie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "trials": []
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
  def listOptimalTrials(
    params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listOptimalTrials(
    params: ParamsResourceProjectsLocationsStudiesTrialsListoptimaltrials,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def stop(): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def stop(callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]): Unit = js.native
  def stop(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def stop(params: ParamsResourceProjectsLocationsStudiesTrialsStop): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsStudiesTrialsStop,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def stop(
    params: ParamsResourceProjectsLocationsStudiesTrialsStop,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  def stop(params: ParamsResourceProjectsLocationsStudiesTrialsStop, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudMlV1Trial] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsStudiesTrialsStop,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudMlV1Trial]
  ): Unit = js.native
  /**
    * Stops a trial.
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
    *   const res = await ml.projects.locations.studies.trials.stop({
    *     // Required. The trial name.
    *     name: 'projects/my-project/locations/my-location/studies/my-studie/trials/my-trial',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientId": "my_clientId",
    *   //   "endTime": "my_endTime",
    *   //   "finalMeasurement": {},
    *   //   "infeasibleReason": "my_infeasibleReason",
    *   //   "measurements": [],
    *   //   "name": "my_name",
    *   //   "parameters": [],
    *   //   "startTime": "my_startTime",
    *   //   "state": "my_state",
    *   //   "trialInfeasible": false
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
  def stop(params: ParamsResourceProjectsLocationsStudiesTrialsStop, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def stop(
    params: ParamsResourceProjectsLocationsStudiesTrialsStop,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suggest(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suggest(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def suggest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suggest(params: ParamsResourceProjectsLocationsStudiesTrialsSuggest): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suggest(
    params: ParamsResourceProjectsLocationsStudiesTrialsSuggest,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def suggest(
    params: ParamsResourceProjectsLocationsStudiesTrialsSuggest,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def suggest(params: ParamsResourceProjectsLocationsStudiesTrialsSuggest, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suggest(
    params: ParamsResourceProjectsLocationsStudiesTrialsSuggest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Adds one or more trials to a study, with parameter values suggested by AI Platform Vizier. Returns a long-running operation associated with the generation of trial suggestions. When this long-running operation succeeds, it will contain a SuggestTrialsResponse.
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
    *   const res = await ml.projects.locations.studies.trials.suggest({
    *     // Required. The name of the study that the trial belongs to.
    *     parent: 'projects/my-project/locations/my-location/studies/my-studie',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "clientId": "my_clientId",
    *       //   "suggestionCount": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def suggest(params: ParamsResourceProjectsLocationsStudiesTrialsSuggest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def suggest(
    params: ParamsResourceProjectsLocationsStudiesTrialsSuggest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
