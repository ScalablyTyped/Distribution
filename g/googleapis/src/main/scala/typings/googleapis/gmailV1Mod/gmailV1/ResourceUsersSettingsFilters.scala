package typings.googleapis.gmailV1Mod.gmailV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Filters")
@js.native
open class ResourceUsersSettingsFilters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaFilter] = js.native
  def create(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate): GaxiosPromise[SchemaFilter] = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def create(
    params: ParamsResourceUsersSettingsFiltersCreate,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def create(params: ParamsResourceUsersSettingsFiltersCreate, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def create(
    params: ParamsResourceUsersSettingsFiltersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Creates a filter. Note: you can only create a maximum of 1,000 filters.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.filters.create({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": {},
    *       //   "criteria": {},
    *       //   "id": "my_id"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": {},
    *   //   "criteria": {},
    *   //   "id": "my_id"
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
  def create(params: ParamsResourceUsersSettingsFiltersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersSettingsFiltersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersSettingsFiltersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersSettingsFiltersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersSettingsFiltersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Immediately and permanently deletes the specified filter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/gmail.settings.basic'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.filters.delete({
    *     // The ID of the filter to be deleted.
    *     id: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
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
  def delete(params: ParamsResourceUsersSettingsFiltersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersSettingsFiltersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaFilter] = js.native
  def get(callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet): GaxiosPromise[SchemaFilter] = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet, callback: BodyResponseCallback[SchemaFilter]): Unit = js.native
  def get(
    params: ParamsResourceUsersSettingsFiltersGet,
    options: BodyResponseCallback[Readable | SchemaFilter],
    callback: BodyResponseCallback[Readable | SchemaFilter]
  ): Unit = js.native
  def get(params: ParamsResourceUsersSettingsFiltersGet, options: MethodOptions): GaxiosPromise[SchemaFilter] = js.native
  def get(
    params: ParamsResourceUsersSettingsFiltersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFilter]
  ): Unit = js.native
  /**
    * Gets a filter.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.filters.get({
    *     // The ID of the filter to be fetched.
    *     id: 'placeholder-value',
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": {},
    *   //   "criteria": {},
    *   //   "id": "my_id"
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
  def get(params: ParamsResourceUsersSettingsFiltersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersSettingsFiltersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFiltersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(params: ParamsResourceUsersSettingsFiltersList): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    callback: BodyResponseCallback[SchemaListFiltersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    options: BodyResponseCallback[Readable | SchemaListFiltersResponse],
    callback: BodyResponseCallback[Readable | SchemaListFiltersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersSettingsFiltersList, options: MethodOptions): GaxiosPromise[SchemaListFiltersResponse] = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFiltersResponse]
  ): Unit = js.native
  /**
    * Lists the message filters of a Gmail user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gmail.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gmail = google.gmail('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://mail.google.com/',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *       'https://www.googleapis.com/auth/gmail.settings.basic',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.settings.filters.list({
    *     // User's email address. The special value "me" can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "filter": []
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
  def list(params: ParamsResourceUsersSettingsFiltersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersSettingsFiltersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
