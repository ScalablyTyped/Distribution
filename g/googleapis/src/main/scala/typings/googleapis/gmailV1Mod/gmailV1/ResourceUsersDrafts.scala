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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Drafts")
@js.native
open class ResourceUsersDrafts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDraft] = js.native
  def create(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def create(params: ParamsResourceUsersDraftsCreate): GaxiosPromise[SchemaDraft] = js.native
  def create(params: ParamsResourceUsersDraftsCreate, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def create(
    params: ParamsResourceUsersDraftsCreate,
    options: BodyResponseCallback[Readable | SchemaDraft],
    callback: BodyResponseCallback[Readable | SchemaDraft]
  ): Unit = js.native
  def create(params: ParamsResourceUsersDraftsCreate, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def create(
    params: ParamsResourceUsersDraftsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  /**
    * Creates a new draft with the `DRAFT` label.
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
    *       'https://www.googleapis.com/auth/gmail.addons.current.action.compose',
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.create({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "message": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "message": {}
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
  def create(params: ParamsResourceUsersDraftsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersDraftsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDraftsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDraftsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDraftsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDraftsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersDraftsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Immediately and permanently deletes the specified draft. Does not simply trash it.
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
    *       'https://www.googleapis.com/auth/gmail.addons.current.action.compose',
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.delete({
    *     // The ID of the draft to delete.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
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
  def delete(params: ParamsResourceUsersDraftsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersDraftsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDraft] = js.native
  def get(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def get(params: ParamsResourceUsersDraftsGet): GaxiosPromise[SchemaDraft] = js.native
  def get(params: ParamsResourceUsersDraftsGet, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def get(
    params: ParamsResourceUsersDraftsGet,
    options: BodyResponseCallback[Readable | SchemaDraft],
    callback: BodyResponseCallback[Readable | SchemaDraft]
  ): Unit = js.native
  def get(params: ParamsResourceUsersDraftsGet, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def get(
    params: ParamsResourceUsersDraftsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  /**
    * Gets the specified draft.
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
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.get({
    *     // The format to return the draft in.
    *     format: 'placeholder-value',
    *     // The ID of the draft to retrieve.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "message": {}
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
  def get(params: ParamsResourceUsersDraftsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersDraftsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDraftsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(params: ParamsResourceUsersDraftsList): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(params: ParamsResourceUsersDraftsList, callback: BodyResponseCallback[SchemaListDraftsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersDraftsList,
    options: BodyResponseCallback[Readable | SchemaListDraftsResponse],
    callback: BodyResponseCallback[Readable | SchemaListDraftsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersDraftsList, options: MethodOptions): GaxiosPromise[SchemaListDraftsResponse] = js.native
  def list(
    params: ParamsResourceUsersDraftsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDraftsResponse]
  ): Unit = js.native
  /**
    * Lists the drafts in the user's mailbox.
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
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *       'https://www.googleapis.com/auth/gmail.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.list({
    *     // Include drafts from `SPAM` and `TRASH` in the results.
    *     includeSpamTrash: 'placeholder-value',
    *     // Maximum number of drafts to return. This field defaults to 100. The maximum allowed value for this field is 500.
    *     maxResults: 'placeholder-value',
    *     // Page token to retrieve a specific page of results in the list.
    *     pageToken: 'placeholder-value',
    *     // Only return draft messages matching the specified query. Supports the same query format as the Gmail search box. For example, `"from:someuser@example.com rfc822msgid: is:unread"`.
    *     q: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "drafts": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resultSizeEstimate": 0
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
  def list(params: ParamsResourceUsersDraftsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersDraftsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def send(): GaxiosPromise[SchemaMessage] = js.native
  def send(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersDraftsSend): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersDraftsSend, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(
    params: ParamsResourceUsersDraftsSend,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def send(params: ParamsResourceUsersDraftsSend, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(
    params: ParamsResourceUsersDraftsSend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Sends the specified, existing draft to the recipients in the `To`, `Cc`, and `Bcc` headers.
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
    *       'https://www.googleapis.com/auth/gmail.addons.current.action.compose',
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.send({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "message": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "historyId": "my_historyId",
    *   //   "id": "my_id",
    *   //   "internalDate": "my_internalDate",
    *   //   "labelIds": [],
    *   //   "payload": {},
    *   //   "raw": "my_raw",
    *   //   "sizeEstimate": 0,
    *   //   "snippet": "my_snippet",
    *   //   "threadId": "my_threadId"
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
  def send(params: ParamsResourceUsersDraftsSend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def send(
    params: ParamsResourceUsersDraftsSend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDraft] = js.native
  def update(callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def update(params: ParamsResourceUsersDraftsUpdate): GaxiosPromise[SchemaDraft] = js.native
  def update(params: ParamsResourceUsersDraftsUpdate, callback: BodyResponseCallback[SchemaDraft]): Unit = js.native
  def update(
    params: ParamsResourceUsersDraftsUpdate,
    options: BodyResponseCallback[Readable | SchemaDraft],
    callback: BodyResponseCallback[Readable | SchemaDraft]
  ): Unit = js.native
  def update(params: ParamsResourceUsersDraftsUpdate, options: MethodOptions): GaxiosPromise[SchemaDraft] = js.native
  def update(
    params: ParamsResourceUsersDraftsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDraft]
  ): Unit = js.native
  /**
    * Replaces a draft's content.
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
    *       'https://www.googleapis.com/auth/gmail.addons.current.action.compose',
    *       'https://www.googleapis.com/auth/gmail.compose',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.drafts.update({
    *     // The ID of the draft to update.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "message": {}
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "message": {}
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
  def update(params: ParamsResourceUsersDraftsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersDraftsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
