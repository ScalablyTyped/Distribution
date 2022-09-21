package typings.googleapis.displayvideoV1Mod.displayvideoV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/displayvideo/v1", "displayvideo_v1.Resource$Advertisers$Manualtriggers")
@js.native
open class ResourceAdvertisersManualtriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaManualTrigger] = js.native
  def activate(callback: BodyResponseCallback[SchemaManualTrigger]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def activate(params: ParamsResourceAdvertisersManualtriggersActivate): GaxiosPromise[SchemaManualTrigger] = js.native
  def activate(
    params: ParamsResourceAdvertisersManualtriggersActivate,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  def activate(
    params: ParamsResourceAdvertisersManualtriggersActivate,
    options: BodyResponseCallback[Readable | SchemaManualTrigger],
    callback: BodyResponseCallback[Readable | SchemaManualTrigger]
  ): Unit = js.native
  def activate(params: ParamsResourceAdvertisersManualtriggersActivate, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def activate(
    params: ParamsResourceAdvertisersManualtriggersActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  /**
    * Activates a manual trigger. Each activation of the manual trigger must be at least 5 minutes apart, otherwise an error will be returned.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.activate({
    *     // Required. The ID of the advertiser that the manual trigger belongs.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the manual trigger to activate.
    *     triggerId: '[^/]+',
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
    *   //   "activationDurationMinutes": "my_activationDurationMinutes",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "latestActivationTime": "my_latestActivationTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "triggerId": "my_triggerId"
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
  def activate(params: ParamsResourceAdvertisersManualtriggersActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceAdvertisersManualtriggersActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaManualTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaManualTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def create(params: ParamsResourceAdvertisersManualtriggersCreate): GaxiosPromise[SchemaManualTrigger] = js.native
  def create(
    params: ParamsResourceAdvertisersManualtriggersCreate,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  def create(
    params: ParamsResourceAdvertisersManualtriggersCreate,
    options: BodyResponseCallback[Readable | SchemaManualTrigger],
    callback: BodyResponseCallback[Readable | SchemaManualTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceAdvertisersManualtriggersCreate, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def create(
    params: ParamsResourceAdvertisersManualtriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  /**
    * Creates a new manual trigger. Returns the newly created manual trigger if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.create({
    *     // Required. Immutable. The unique ID of the advertiser that the manual trigger belongs to.
    *     advertiserId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activationDurationMinutes": "my_activationDurationMinutes",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "latestActivationTime": "my_latestActivationTime",
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "triggerId": "my_triggerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationDurationMinutes": "my_activationDurationMinutes",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "latestActivationTime": "my_latestActivationTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "triggerId": "my_triggerId"
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
  def create(params: ParamsResourceAdvertisersManualtriggersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAdvertisersManualtriggersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deactivate(): GaxiosPromise[SchemaManualTrigger] = js.native
  def deactivate(callback: BodyResponseCallback[SchemaManualTrigger]): Unit = js.native
  def deactivate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def deactivate(params: ParamsResourceAdvertisersManualtriggersDeactivate): GaxiosPromise[SchemaManualTrigger] = js.native
  def deactivate(
    params: ParamsResourceAdvertisersManualtriggersDeactivate,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  def deactivate(
    params: ParamsResourceAdvertisersManualtriggersDeactivate,
    options: BodyResponseCallback[Readable | SchemaManualTrigger],
    callback: BodyResponseCallback[Readable | SchemaManualTrigger]
  ): Unit = js.native
  def deactivate(params: ParamsResourceAdvertisersManualtriggersDeactivate, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def deactivate(
    params: ParamsResourceAdvertisersManualtriggersDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  /**
    * Deactivates a manual trigger.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.deactivate({
    *     // Required. The ID of the advertiser that the manual trigger belongs.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the manual trigger to deactivate.
    *     triggerId: '[^/]+',
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
    *   //   "activationDurationMinutes": "my_activationDurationMinutes",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "latestActivationTime": "my_latestActivationTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "triggerId": "my_triggerId"
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
  def deactivate(params: ParamsResourceAdvertisersManualtriggersDeactivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deactivate(
    params: ParamsResourceAdvertisersManualtriggersDeactivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaManualTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaManualTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def get(params: ParamsResourceAdvertisersManualtriggersGet): GaxiosPromise[SchemaManualTrigger] = js.native
  def get(
    params: ParamsResourceAdvertisersManualtriggersGet,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  def get(
    params: ParamsResourceAdvertisersManualtriggersGet,
    options: BodyResponseCallback[Readable | SchemaManualTrigger],
    callback: BodyResponseCallback[Readable | SchemaManualTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceAdvertisersManualtriggersGet, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def get(
    params: ParamsResourceAdvertisersManualtriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  /**
    * Gets a manual trigger.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.get({
    *     // Required. The ID of the advertiser this manual trigger belongs to.
    *     advertiserId: '[^/]+',
    *     // Required. The ID of the manual trigger to fetch.
    *     triggerId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationDurationMinutes": "my_activationDurationMinutes",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "latestActivationTime": "my_latestActivationTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "triggerId": "my_triggerId"
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
  def get(params: ParamsResourceAdvertisersManualtriggersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAdvertisersManualtriggersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListManualTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListManualTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListManualTriggersResponse] = js.native
  def list(params: ParamsResourceAdvertisersManualtriggersList): GaxiosPromise[SchemaListManualTriggersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersManualtriggersList,
    callback: BodyResponseCallback[SchemaListManualTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAdvertisersManualtriggersList,
    options: BodyResponseCallback[Readable | SchemaListManualTriggersResponse],
    callback: BodyResponseCallback[Readable | SchemaListManualTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAdvertisersManualtriggersList, options: MethodOptions): GaxiosPromise[SchemaListManualTriggersResponse] = js.native
  def list(
    params: ParamsResourceAdvertisersManualtriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListManualTriggersResponse]
  ): Unit = js.native
  /**
    * Lists manual triggers that are accessible to the current user for a given advertiser ID. The order is defined by the order_by parameter. A single advertiser_id is required.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.list({
    *     // Required. The ID of the advertiser that the fetched manual triggers belong to.
    *     advertiserId: '[^/]+',
    *     // Allows filtering by manual trigger properties. Supported syntax: * Filter expressions are made up of one or more restrictions. * Restrictions can be combined by `AND` or `OR` logical operators. A sequence of restrictions implicitly uses `AND`. * A restriction has the form of `{field\} {operator\} {value\}`. * The operator must be `EQUALS (=)`. * Supported fields: - `displayName` - `state` Examples: * All active manual triggers under an advertiser: `state="ACTIVE"` The length of this field should be no more than 500 characters.
    *     filter: 'placeholder-value',
    *     // Field by which to sort the list. Acceptable values are: * `displayName` (default) * `state` The default sorting order is ascending. To specify descending order for a field, a suffix "desc" should be added to the field name. For example, `displayName desc`.
    *     orderBy: 'placeholder-value',
    *     // Requested page size. Must be between `1` and `100`. If unspecified will default to `100`.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of next_page_token returned from the previous call to `ListManualTriggers` method. If not specified, the first page of results will be returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "manualTriggers": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceAdvertisersManualtriggersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAdvertisersManualtriggersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaManualTrigger] = js.native
  def patch(callback: BodyResponseCallback[SchemaManualTrigger]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def patch(params: ParamsResourceAdvertisersManualtriggersPatch): GaxiosPromise[SchemaManualTrigger] = js.native
  def patch(
    params: ParamsResourceAdvertisersManualtriggersPatch,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAdvertisersManualtriggersPatch,
    options: BodyResponseCallback[Readable | SchemaManualTrigger],
    callback: BodyResponseCallback[Readable | SchemaManualTrigger]
  ): Unit = js.native
  def patch(params: ParamsResourceAdvertisersManualtriggersPatch, options: MethodOptions): GaxiosPromise[SchemaManualTrigger] = js.native
  def patch(
    params: ParamsResourceAdvertisersManualtriggersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManualTrigger]
  ): Unit = js.native
  /**
    * Updates a manual trigger. Returns the updated manual trigger if successful.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/displayvideo.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const displayvideo = google.displayvideo('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/display-video'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await displayvideo.advertisers.manualTriggers.patch({
    *     // Required. Immutable. The unique ID of the advertiser that the manual trigger belongs to.
    *     advertiserId: '[^/]+',
    *     // Output only. The unique ID of the manual trigger.
    *     triggerId: '[^/]+',
    *     // Required. The mask to control which fields to update.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "activationDurationMinutes": "my_activationDurationMinutes",
    *       //   "advertiserId": "my_advertiserId",
    *       //   "displayName": "my_displayName",
    *       //   "latestActivationTime": "my_latestActivationTime",
    *       //   "name": "my_name",
    *       //   "state": "my_state",
    *       //   "triggerId": "my_triggerId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "activationDurationMinutes": "my_activationDurationMinutes",
    *   //   "advertiserId": "my_advertiserId",
    *   //   "displayName": "my_displayName",
    *   //   "latestActivationTime": "my_latestActivationTime",
    *   //   "name": "my_name",
    *   //   "state": "my_state",
    *   //   "triggerId": "my_triggerId"
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
  def patch(params: ParamsResourceAdvertisersManualtriggersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAdvertisersManualtriggersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
