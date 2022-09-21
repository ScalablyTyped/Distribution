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

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webpropertyadwordslinks")
@js.native
open class ResourceManagementWebpropertyadwordslinks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementWebpropertyadwordslinksDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementWebpropertyadwordslinksDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a web property-Google Ads link.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.delete({
    *     // ID of the account which the given web property belongs to.
    *     accountId: 'placeholder-value',
    *     // Web property Google Ads link ID.
    *     webPropertyAdWordsLinkId: 'placeholder-value',
    *     // Web property ID to delete the Google Ads link for.
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
  def delete(params: ParamsResourceManagementWebpropertyadwordslinksDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagementWebpropertyadwordslinksDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(params: ParamsResourceManagementWebpropertyadwordslinksGet): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    options: BodyResponseCallback[Readable | SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[Readable | SchemaEntityAdWordsLink]
  ): Unit = js.native
  def get(params: ParamsResourceManagementWebpropertyadwordslinksGet, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  /**
    * Returns a web property-Google Ads link to which the user has access.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.get({
    *     // ID of the account which the given web property belongs to.
    *     accountId: 'placeholder-value',
    *     // Web property-Google Ads link ID.
    *     webPropertyAdWordsLinkId: 'placeholder-value',
    *     // Web property ID to retrieve the Google Ads link for.
    *     webPropertyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsAccounts": [],
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "profileIds": [],
    *   //   "selfLink": "my_selfLink"
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
  def get(params: ParamsResourceManagementWebpropertyadwordslinksGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagementWebpropertyadwordslinksGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(params: ParamsResourceManagementWebpropertyadwordslinksInsert): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    options: BodyResponseCallback[Readable | SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[Readable | SchemaEntityAdWordsLink]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementWebpropertyadwordslinksInsert, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  /**
    * Creates a webProperty-Google Ads link.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.insert({
    *     // ID of the Google Analytics account to create the link for.
    *     accountId: 'placeholder-value',
    *     // Web property ID to create the link for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adWordsAccounts": [],
    *       //   "entity": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "profileIds": [],
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsAccounts": [],
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "profileIds": [],
    *   //   "selfLink": "my_selfLink"
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
  def insert(params: ParamsResourceManagementWebpropertyadwordslinksInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceManagementWebpropertyadwordslinksInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(callback: BodyResponseCallback[SchemaEntityAdWordsLinks]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(params: ParamsResourceManagementWebpropertyadwordslinksList): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    callback: BodyResponseCallback[SchemaEntityAdWordsLinks]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    options: BodyResponseCallback[Readable | SchemaEntityAdWordsLinks],
    callback: BodyResponseCallback[Readable | SchemaEntityAdWordsLinks]
  ): Unit = js.native
  def list(params: ParamsResourceManagementWebpropertyadwordslinksList, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLinks] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLinks]
  ): Unit = js.native
  /**
    * Lists webProperty-Google Ads links for a given web property.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.list({
    *     // ID of the account which the given web property belongs to.
    *     accountId: 'd+',
    *     // The maximum number of webProperty-Google Ads links to include in this response.
    *     'max-results': 'placeholder-value',
    *     // An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    *     'start-index': 'placeholder-value',
    *     // Web property ID to retrieve the Google Ads links for.
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
    *   //   "totalResults": 0
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
  def list(params: ParamsResourceManagementWebpropertyadwordslinksList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagementWebpropertyadwordslinksList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(params: ParamsResourceManagementWebpropertyadwordslinksPatch): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    options: BodyResponseCallback[Readable | SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[Readable | SchemaEntityAdWordsLink]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementWebpropertyadwordslinksPatch, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  /**
    * Updates an existing webProperty-Google Ads link. This method supports patch semantics.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.patch({
    *     // ID of the account which the given web property belongs to.
    *     accountId: 'placeholder-value',
    *     // Web property-Google Ads link ID.
    *     webPropertyAdWordsLinkId: 'placeholder-value',
    *     // Web property ID to retrieve the Google Ads link for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adWordsAccounts": [],
    *       //   "entity": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "profileIds": [],
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsAccounts": [],
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "profileIds": [],
    *   //   "selfLink": "my_selfLink"
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
  def patch(params: ParamsResourceManagementWebpropertyadwordslinksPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceManagementWebpropertyadwordslinksPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(callback: BodyResponseCallback[SchemaEntityAdWordsLink]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(params: ParamsResourceManagementWebpropertyadwordslinksUpdate): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    options: BodyResponseCallback[Readable | SchemaEntityAdWordsLink],
    callback: BodyResponseCallback[Readable | SchemaEntityAdWordsLink]
  ): Unit = js.native
  def update(params: ParamsResourceManagementWebpropertyadwordslinksUpdate, options: MethodOptions): GaxiosPromise[SchemaEntityAdWordsLink] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEntityAdWordsLink]
  ): Unit = js.native
  /**
    * Updates an existing webProperty-Google Ads link.
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
    *   const res = await analytics.management.webPropertyAdWordsLinks.update({
    *     // ID of the account which the given web property belongs to.
    *     accountId: 'placeholder-value',
    *     // Web property-Google Ads link ID.
    *     webPropertyAdWordsLinkId: 'placeholder-value',
    *     // Web property ID to retrieve the Google Ads link for.
    *     webPropertyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "adWordsAccounts": [],
    *       //   "entity": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "profileIds": [],
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adWordsAccounts": [],
    *   //   "entity": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "profileIds": [],
    *   //   "selfLink": "my_selfLink"
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
  def update(params: ParamsResourceManagementWebpropertyadwordslinksUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagementWebpropertyadwordslinksUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
