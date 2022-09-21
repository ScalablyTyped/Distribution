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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Goals")
@js.native
open class ResourceManagementGoals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGoal] = js.native
  def get(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def get(params: ParamsResourceManagementGoalsGet): GaxiosPromise[SchemaGoal] = js.native
  def get(params: ParamsResourceManagementGoalsGet, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def get(
    params: ParamsResourceManagementGoalsGet,
    options: BodyResponseCallback[Readable | SchemaGoal],
    callback: BodyResponseCallback[Readable | SchemaGoal]
  ): Unit = js.native
  def get(params: ParamsResourceManagementGoalsGet, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def get(
    params: ParamsResourceManagementGoalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * Gets a goal to which the user has access.
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
    *   const res = await analytics.management.goals.get({
    *     // Account ID to retrieve the goal for.
    *     accountId: 'placeholder-value',
    *     // Goal ID to retrieve the goal for.
    *     goalId: 'placeholder-value',
    *     // View (Profile) ID to retrieve the goal for.
    *     profileId: 'placeholder-value',
    *     // Web property ID to retrieve the goal for.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "eventDetails": {},
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "urlDestinationDetails": {},
    *   //   "value": {},
    *   //   "visitNumPagesDetails": {},
    *   //   "visitTimeOnSiteDetails": {},
    *   //   "webPropertyId": "my_webPropertyId"
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
  def get(params: ParamsResourceManagementGoalsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementGoalsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaGoal] = js.native
  def insert(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def insert(params: ParamsResourceManagementGoalsInsert): GaxiosPromise[SchemaGoal] = js.native
  def insert(params: ParamsResourceManagementGoalsInsert, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def insert(
    params: ParamsResourceManagementGoalsInsert,
    options: BodyResponseCallback[Readable | SchemaGoal],
    callback: BodyResponseCallback[Readable | SchemaGoal]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementGoalsInsert, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def insert(
    params: ParamsResourceManagementGoalsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * Create a new goal.
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.goals.insert({
    *     // Account ID to create the goal for.
    *     accountId: 'placeholder-value',
    *     // View (Profile) ID to create the goal for.
    *     profileId: 'placeholder-value',
    *     // Web property ID to create the goal for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "eventDetails": {},
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "urlDestinationDetails": {},
    *       //   "value": {},
    *       //   "visitNumPagesDetails": {},
    *       //   "visitTimeOnSiteDetails": {},
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "eventDetails": {},
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "urlDestinationDetails": {},
    *   //   "value": {},
    *   //   "visitNumPagesDetails": {},
    *   //   "visitTimeOnSiteDetails": {},
    *   //   "webPropertyId": "my_webPropertyId"
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
  def insert(params: ParamsResourceManagementGoalsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementGoalsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoals] = js.native
  def list(callback: BodyResponseCallback[SchemaGoals]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoals] = js.native
  def list(params: ParamsResourceManagementGoalsList): GaxiosPromise[SchemaGoals] = js.native
  def list(params: ParamsResourceManagementGoalsList, callback: BodyResponseCallback[SchemaGoals]): Unit = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: BodyResponseCallback[Readable | SchemaGoals],
    callback: BodyResponseCallback[Readable | SchemaGoals]
  ): Unit = js.native
  def list(params: ParamsResourceManagementGoalsList, options: MethodOptions): GaxiosPromise[SchemaGoals] = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoals]
  ): Unit = js.native
  /**
    * Lists goals to which the user has access.
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
    *   const res = await analytics.management.goals.list({
    *     // Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    *     accountId: 'placeholder-value',
    *     // The maximum number of goals to include in this response.
    *     'max-results': 'placeholder-value',
    *     // View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
    *     profileId: 'placeholder-value',
    *     // An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    *     webPropertyId: 'placeholder-value',
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
  def list(params: ParamsResourceManagementGoalsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoal] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def patch(params: ParamsResourceManagementGoalsPatch): GaxiosPromise[SchemaGoal] = js.native
  def patch(params: ParamsResourceManagementGoalsPatch, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def patch(
    params: ParamsResourceManagementGoalsPatch,
    options: BodyResponseCallback[Readable | SchemaGoal],
    callback: BodyResponseCallback[Readable | SchemaGoal]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementGoalsPatch, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def patch(
    params: ParamsResourceManagementGoalsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * Updates an existing goal. This method supports patch semantics.
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.goals.patch({
    *     // Account ID to update the goal.
    *     accountId: 'placeholder-value',
    *     // Index of the goal to be updated.
    *     goalId: 'placeholder-value',
    *     // View (Profile) ID to update the goal.
    *     profileId: 'placeholder-value',
    *     // Web property ID to update the goal.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "eventDetails": {},
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "urlDestinationDetails": {},
    *       //   "value": {},
    *       //   "visitNumPagesDetails": {},
    *       //   "visitTimeOnSiteDetails": {},
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "eventDetails": {},
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "urlDestinationDetails": {},
    *   //   "value": {},
    *   //   "visitNumPagesDetails": {},
    *   //   "visitTimeOnSiteDetails": {},
    *   //   "webPropertyId": "my_webPropertyId"
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
  def patch(params: ParamsResourceManagementGoalsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementGoalsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaGoal] = js.native
  def update(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def update(params: ParamsResourceManagementGoalsUpdate): GaxiosPromise[SchemaGoal] = js.native
  def update(params: ParamsResourceManagementGoalsUpdate, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def update(
    params: ParamsResourceManagementGoalsUpdate,
    options: BodyResponseCallback[Readable | SchemaGoal],
    callback: BodyResponseCallback[Readable | SchemaGoal]
  ): Unit = js.native
  def update(params: ParamsResourceManagementGoalsUpdate, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def update(
    params: ParamsResourceManagementGoalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * Updates an existing goal.
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
    *     scopes: ['https://www.googleapis.com/auth/analytics.edit'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.management.goals.update({
    *     // Account ID to update the goal.
    *     accountId: 'placeholder-value',
    *     // Index of the goal to be updated.
    *     goalId: 'placeholder-value',
    *     // View (Profile) ID to update the goal.
    *     profileId: 'placeholder-value',
    *     // Web property ID to update the goal.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountId": "my_accountId",
    *       //   "active": false,
    *       //   "created": "my_created",
    *       //   "eventDetails": {},
    *       //   "id": "my_id",
    *       //   "internalWebPropertyId": "my_internalWebPropertyId",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "parentLink": {},
    *       //   "profileId": "my_profileId",
    *       //   "selfLink": "my_selfLink",
    *       //   "type": "my_type",
    *       //   "updated": "my_updated",
    *       //   "urlDestinationDetails": {},
    *       //   "value": {},
    *       //   "visitNumPagesDetails": {},
    *       //   "visitTimeOnSiteDetails": {},
    *       //   "webPropertyId": "my_webPropertyId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "active": false,
    *   //   "created": "my_created",
    *   //   "eventDetails": {},
    *   //   "id": "my_id",
    *   //   "internalWebPropertyId": "my_internalWebPropertyId",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "parentLink": {},
    *   //   "profileId": "my_profileId",
    *   //   "selfLink": "my_selfLink",
    *   //   "type": "my_type",
    *   //   "updated": "my_updated",
    *   //   "urlDestinationDetails": {},
    *   //   "value": {},
    *   //   "visitNumPagesDetails": {},
    *   //   "visitTimeOnSiteDetails": {},
    *   //   "webPropertyId": "my_webPropertyId"
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
  def update(params: ParamsResourceManagementGoalsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementGoalsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
