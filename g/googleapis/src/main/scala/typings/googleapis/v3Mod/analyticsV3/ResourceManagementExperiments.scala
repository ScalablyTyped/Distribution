package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Experiments")
@js.native
open class ResourceManagementExperiments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementExperimentsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementExperimentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Delete an experiment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.delete({
    *     // Account ID to which the experiment belongs
    *     accountId: 'placeholder-value',
    *     // ID of the experiment to delete
    *     experimentId: 'placeholder-value',
    *     // View (Profile) ID to which the experiment belongs
    *     profileId: 'placeholder-value',
    *     // Web property ID to which the experiment belongs
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceManagementExperimentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementExperimentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaExperiment] = js.native
  def get(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def get(params: ParamsResourceManagementExperimentsGet): GaxiosPromise[SchemaExperiment] = js.native
  def get(params: ParamsResourceManagementExperimentsGet, callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def get(
    params: ParamsResourceManagementExperimentsGet,
    options: BodyResponseCallback[Readable | SchemaExperiment],
    callback: BodyResponseCallback[Readable | SchemaExperiment]
  ): Unit = js.native
  def get(params: ParamsResourceManagementExperimentsGet, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def get(
    params: ParamsResourceManagementExperimentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  /**
    * Returns an experiment to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.get({
    *     // Account ID to retrieve the experiment for.
    *     accountId: 'placeholder-value',
    *     // Experiment ID to retrieve the experiment for.
    *     experimentId: 'placeholder-value',
    *     // View (Profile) ID to retrieve the experiment for.
    *     profileId: 'placeholder-value',
    *     // Web property ID to retrieve the experiment for.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "editableInGaUi": false,
    *   //   "endTime": "my_endTime",
    *   //   "equalWeighting": false,
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "minimumExperimentLengthInDays": 0,
    *   //   "name": "my_name",
    *   //   "objectiveMetric": "my_objectiveMetric",
    *   //   "optimizationType": "my_optimizationType",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *   //   "rewriteVariationUrlsAsOriginal": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "servingFramework": "my_servingFramework",
    *   //   "snippet": "my_snippet",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "trafficCoverage": {},
    *   //   "updated": "my_updated",
    *   //   "variations": [],
    *   //   "webPropertyId": "my_webPropertyId",
    *   //   "winnerConfidenceLevel": {},
    *   //   "winnerFound": false
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
  def get(params: ParamsResourceManagementExperimentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementExperimentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaExperiment] = js.native
  def insert(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def insert(params: ParamsResourceManagementExperimentsInsert): GaxiosPromise[SchemaExperiment] = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    options: BodyResponseCallback[Readable | SchemaExperiment],
    callback: BodyResponseCallback[Readable | SchemaExperiment]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementExperimentsInsert, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  /**
    * Create a new experiment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.insert({
    *     // Account ID to create the experiment for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to create the experiment for.
    *     profileId: 'placeholder-value',
    *     // Web property ID to create the experiment for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "editableInGaUi": false,
    *       //   "endTime": "my_endTime",
    *       //   "equalWeighting": false,
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "minimumExperimentLengthInDays": 0,
    *       //   "name": "my_name",
    *       //   "objectiveMetric": "my_objectiveMetric",
    *       //   "optimizationType": "my_optimizationType",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *       //   "rewriteVariationUrlsAsOriginal": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "servingFramework": "my_servingFramework",
    *       //   "snippet": "my_snippet",
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status",
    *       //   "trafficCoverage": {},
    *       //   "updated": "my_updated",
    *       //   "variations": [],
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "winnerConfidenceLevel": {},
    *       //   "winnerFound": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "editableInGaUi": false,
    *   //   "endTime": "my_endTime",
    *   //   "equalWeighting": false,
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "minimumExperimentLengthInDays": 0,
    *   //   "name": "my_name",
    *   //   "objectiveMetric": "my_objectiveMetric",
    *   //   "optimizationType": "my_optimizationType",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *   //   "rewriteVariationUrlsAsOriginal": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "servingFramework": "my_servingFramework",
    *   //   "snippet": "my_snippet",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "trafficCoverage": {},
    *   //   "updated": "my_updated",
    *   //   "variations": [],
    *   //   "webPropertyId": "my_webPropertyId",
    *   //   "winnerConfidenceLevel": {},
    *   //   "winnerFound": false
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
  def insert(params: ParamsResourceManagementExperimentsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaExperiments] = js.native
  def list(callback: BodyResponseCallback[SchemaExperiments]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExperiments] = js.native
  def list(params: ParamsResourceManagementExperimentsList): GaxiosPromise[SchemaExperiments] = js.native
  def list(params: ParamsResourceManagementExperimentsList, callback: BodyResponseCallback[SchemaExperiments]): Unit = js.native
  def list(
    params: ParamsResourceManagementExperimentsList,
    options: BodyResponseCallback[Readable | SchemaExperiments],
    callback: BodyResponseCallback[Readable | SchemaExperiments]
  ): Unit = js.native
  def list(params: ParamsResourceManagementExperimentsList, options: MethodOptions): GaxiosPromise[SchemaExperiments] = js.native
  def list(
    params: ParamsResourceManagementExperimentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiments]
  ): Unit = js.native
  /**
    * Lists experiments to which the user has access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *       'https://www.googleapis.com/auth/analytics.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.list({
    *     // Account ID to retrieve experiments for.
    *     accountId: 'd+',
    *     // The maximum number of experiments to include in this response.
    *     'max-results': 'placeholder-value',
    *     // View (Profile) ID to retrieve experiments for.
    *     profileId: 'd+',
    *     // An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID to retrieve experiments for.
    *     webPropertyId: 'UA-(d+)-(d+)',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "itemsPerPage": 0,
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "previousLink": "my_previousLink",
    *   //   "startIndex": 0,
    *   //   "totalResults": 0,
    *   //   "username": "my_username"
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
  def list(params: ParamsResourceManagementExperimentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementExperimentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaExperiment] = js.native
  def patch(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch): GaxiosPromise[SchemaExperiment] = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch, callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def patch(
    params: ParamsResourceManagementExperimentsPatch,
    options: BodyResponseCallback[Readable | SchemaExperiment],
    callback: BodyResponseCallback[Readable | SchemaExperiment]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def patch(
    params: ParamsResourceManagementExperimentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  /**
    * Update an existing experiment. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.patch({
    *     // Account ID of the experiment to update.
    *     accountId: 'placeholder-value',
    *     // Experiment ID of the experiment to update.
    *     experimentId: 'placeholder-value',
    *     // View (Profile) ID of the experiment to update.
    *     profileId: 'placeholder-value',
    *     // Web property ID of the experiment to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "editableInGaUi": false,
    *       //   "endTime": "my_endTime",
    *       //   "equalWeighting": false,
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "minimumExperimentLengthInDays": 0,
    *       //   "name": "my_name",
    *       //   "objectiveMetric": "my_objectiveMetric",
    *       //   "optimizationType": "my_optimizationType",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *       //   "rewriteVariationUrlsAsOriginal": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "servingFramework": "my_servingFramework",
    *       //   "snippet": "my_snippet",
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status",
    *       //   "trafficCoverage": {},
    *       //   "updated": "my_updated",
    *       //   "variations": [],
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "winnerConfidenceLevel": {},
    *       //   "winnerFound": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "editableInGaUi": false,
    *   //   "endTime": "my_endTime",
    *   //   "equalWeighting": false,
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "minimumExperimentLengthInDays": 0,
    *   //   "name": "my_name",
    *   //   "objectiveMetric": "my_objectiveMetric",
    *   //   "optimizationType": "my_optimizationType",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *   //   "rewriteVariationUrlsAsOriginal": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "servingFramework": "my_servingFramework",
    *   //   "snippet": "my_snippet",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "trafficCoverage": {},
    *   //   "updated": "my_updated",
    *   //   "variations": [],
    *   //   "webPropertyId": "my_webPropertyId",
    *   //   "winnerConfidenceLevel": {},
    *   //   "winnerFound": false
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
  def patch(params: ParamsResourceManagementExperimentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementExperimentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaExperiment] = js.native
  def update(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def update(params: ParamsResourceManagementExperimentsUpdate): GaxiosPromise[SchemaExperiment] = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    options: BodyResponseCallback[Readable | SchemaExperiment],
    callback: BodyResponseCallback[Readable | SchemaExperiment]
  ): Unit = js.native
  def update(params: ParamsResourceManagementExperimentsUpdate, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  /**
    * Update an existing experiment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/analytics',
    *       'https://www.googleapis.com/auth/analytics.edit',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.experiments.update({
    *     // Account ID of the experiment to update.
    *     accountId: 'placeholder-value',
    *     // Experiment ID of the experiment to update.
    *     experimentId: 'placeholder-value',
    *     // View (Profile) ID of the experiment to update.
    *     profileId: 'placeholder-value',
    *     // Web property ID of the experiment to update.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "created": "my_created",
    *       //   "description": "my_description",
    *       //   "editableInGaUi": false,
    *       //   "endTime": "my_endTime",
    *       //   "equalWeighting": false,
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "minimumExperimentLengthInDays": 0,
    *       //   "name": "my_name",
    *       //   "objectiveMetric": "my_objectiveMetric",
    *       //   "optimizationType": "my_optimizationType",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *       //   "rewriteVariationUrlsAsOriginal": false,
    *       //   "selfLink": "my_selfLink",
    *       //   "servingFramework": "my_servingFramework",
    *       //   "snippet": "my_snippet",
    *       //   "startTime": "my_startTime",
    *       //   "status": "my_status",
    *       //   "trafficCoverage": {},
    *       //   "updated": "my_updated",
    *       //   "variations": [],
    *       //   "webPropertyId": "my_webPropertyId",
    *       //   "winnerConfidenceLevel": {},
    *       //   "winnerFound": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "editableInGaUi": false,
    *   //   "endTime": "my_endTime",
    *   //   "equalWeighting": false,
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "minimumExperimentLengthInDays": 0,
    *   //   "name": "my_name",
    *   //   "objectiveMetric": "my_objectiveMetric",
    *   //   "optimizationType": "my_optimizationType",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "reasonExperimentEnded": "my_reasonExperimentEnded",
    *   //   "rewriteVariationUrlsAsOriginal": false,
    *   //   "selfLink": "my_selfLink",
    *   //   "servingFramework": "my_servingFramework",
    *   //   "snippet": "my_snippet",
    *   //   "startTime": "my_startTime",
    *   //   "status": "my_status",
    *   //   "trafficCoverage": {},
    *   //   "updated": "my_updated",
    *   //   "variations": [],
    *   //   "webPropertyId": "my_webPropertyId",
    *   //   "winnerConfidenceLevel": {},
    *   //   "winnerFound": false
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
  def update(params: ParamsResourceManagementExperimentsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
