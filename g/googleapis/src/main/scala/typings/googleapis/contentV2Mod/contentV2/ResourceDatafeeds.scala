package typings.googleapis.contentV2Mod.contentV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Datafeeds")
@js.native
open class ResourceDatafeeds protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def custombatch(): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]): Unit = js.native
  def custombatch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(params: ParamsResourceDatafeedsCustombatch): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    options: BodyResponseCallback[Readable | SchemaDatafeedsCustomBatchResponse],
    callback: BodyResponseCallback[Readable | SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsResourceDatafeedsCustombatch, options: MethodOptions): GaxiosPromise[SchemaDatafeedsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsCustomBatchResponse]
  ): Unit = js.native
  /**
    * Deletes, fetches, gets, inserts and updates multiple datafeeds in a single request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.custombatch({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entries": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entries": [],
    *   //   "kind": "my_kind"
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
  def custombatch(params: ParamsResourceDatafeedsCustombatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def custombatch(
    params: ParamsResourceDatafeedsCustombatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatafeedsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatafeedsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDatafeedsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDatafeedsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceDatafeedsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a datafeed configuration from your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.delete({
    *     // The ID of the datafeed.
    *     datafeedId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
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
  def delete(params: ParamsResourceDatafeedsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDatafeedsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def fetchnow(): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]): Unit = js.native
  def fetchnow(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(params: ParamsResourceDatafeedsFetchnow): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    options: BodyResponseCallback[Readable | SchemaDatafeedsFetchNowResponse],
    callback: BodyResponseCallback[Readable | SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  def fetchnow(params: ParamsResourceDatafeedsFetchnow, options: MethodOptions): GaxiosPromise[SchemaDatafeedsFetchNowResponse] = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsFetchNowResponse]
  ): Unit = js.native
  /**
    * Invokes a fetch for the datafeed in your Merchant Center account. If you need to call this method more than once per day, we recommend you use the Products service to update your product data.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.fetchnow({
    *     // The ID of the datafeed to be fetched.
    *     datafeedId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind"
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
  def fetchnow(params: ParamsResourceDatafeedsFetchnow, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def fetchnow(
    params: ParamsResourceDatafeedsFetchnow,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDatafeed] = js.native
  def get(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def get(params: ParamsResourceDatafeedsGet): GaxiosPromise[SchemaDatafeed] = js.native
  def get(params: ParamsResourceDatafeedsGet, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def get(
    params: ParamsResourceDatafeedsGet,
    options: BodyResponseCallback[Readable | SchemaDatafeed],
    callback: BodyResponseCallback[Readable | SchemaDatafeed]
  ): Unit = js.native
  def get(params: ParamsResourceDatafeedsGet, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def get(
    params: ParamsResourceDatafeedsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  /**
    * Retrieves a datafeed configuration from your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.get({
    *     // The ID of the datafeed.
    *     datafeedId: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeLanguage": "my_attributeLanguage",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "fetchSchedule": {},
    *   //   "fileName": "my_fileName",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "intendedDestinations": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "targetCountry": "my_targetCountry",
    *   //   "targets": []
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
  def get(params: ParamsResourceDatafeedsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDatafeedsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(params: ParamsResourceDatafeedsInsert): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(params: ParamsResourceDatafeedsInsert, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def insert(
    params: ParamsResourceDatafeedsInsert,
    options: BodyResponseCallback[Readable | SchemaDatafeed],
    callback: BodyResponseCallback[Readable | SchemaDatafeed]
  ): Unit = js.native
  def insert(params: ParamsResourceDatafeedsInsert, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def insert(
    params: ParamsResourceDatafeedsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  /**
    * Registers a datafeed configuration with your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.insert({
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributeLanguage": "my_attributeLanguage",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "fetchSchedule": {},
    *       //   "fileName": "my_fileName",
    *       //   "format": {},
    *       //   "id": "my_id",
    *       //   "intendedDestinations": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "targetCountry": "my_targetCountry",
    *       //   "targets": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeLanguage": "my_attributeLanguage",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "fetchSchedule": {},
    *   //   "fileName": "my_fileName",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "intendedDestinations": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "targetCountry": "my_targetCountry",
    *   //   "targets": []
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
  def insert(params: ParamsResourceDatafeedsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDatafeedsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDatafeedsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(params: ParamsResourceDatafeedsList): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(params: ParamsResourceDatafeedsList, callback: BodyResponseCallback[SchemaDatafeedsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDatafeedsList,
    options: BodyResponseCallback[Readable | SchemaDatafeedsListResponse],
    callback: BodyResponseCallback[Readable | SchemaDatafeedsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDatafeedsList, options: MethodOptions): GaxiosPromise[SchemaDatafeedsListResponse] = js.native
  def list(
    params: ParamsResourceDatafeedsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeedsListResponse]
  ): Unit = js.native
  /**
    * Lists the configurations for datafeeds in your Merchant Center account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.list({
    *     // The maximum number of products to return in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The ID of the account that manages the datafeeds. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *     // The token returned by the previous request.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resources": []
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
  def list(params: ParamsResourceDatafeedsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDatafeedsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDatafeed] = js.native
  def update(callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def update(params: ParamsResourceDatafeedsUpdate): GaxiosPromise[SchemaDatafeed] = js.native
  def update(params: ParamsResourceDatafeedsUpdate, callback: BodyResponseCallback[SchemaDatafeed]): Unit = js.native
  def update(
    params: ParamsResourceDatafeedsUpdate,
    options: BodyResponseCallback[Readable | SchemaDatafeed],
    callback: BodyResponseCallback[Readable | SchemaDatafeed]
  ): Unit = js.native
  def update(params: ParamsResourceDatafeedsUpdate, options: MethodOptions): GaxiosPromise[SchemaDatafeed] = js.native
  def update(
    params: ParamsResourceDatafeedsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatafeed]
  ): Unit = js.native
  /**
    * Updates a datafeed configuration of your Merchant Center account. Any fields that are not provided are deleted from the resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/content.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const content = google.content('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/content'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await content.datafeeds.update({
    *     // The ID of the datafeed.
    *     datafeedId: 'placeholder-value',
    *     // Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    *     dryRun: 'placeholder-value',
    *     // The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    *     merchantId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "attributeLanguage": "my_attributeLanguage",
    *       //   "contentLanguage": "my_contentLanguage",
    *       //   "contentType": "my_contentType",
    *       //   "fetchSchedule": {},
    *       //   "fileName": "my_fileName",
    *       //   "format": {},
    *       //   "id": "my_id",
    *       //   "intendedDestinations": [],
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "targetCountry": "my_targetCountry",
    *       //   "targets": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attributeLanguage": "my_attributeLanguage",
    *   //   "contentLanguage": "my_contentLanguage",
    *   //   "contentType": "my_contentType",
    *   //   "fetchSchedule": {},
    *   //   "fileName": "my_fileName",
    *   //   "format": {},
    *   //   "id": "my_id",
    *   //   "intendedDestinations": [],
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "targetCountry": "my_targetCountry",
    *   //   "targets": []
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
  def update(params: ParamsResourceDatafeedsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceDatafeedsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
