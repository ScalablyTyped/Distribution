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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Threads")
@js.native
open class ResourceUsersThreads protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersThreadsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersThreadsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersThreadsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersThreadsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersThreadsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Immediately and permanently deletes the specified thread. Any messages that belong to the thread are also deleted. This operation cannot be undone. Prefer `threads.trash` instead.
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
    *     scopes: ['https://mail.google.com/'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.threads.delete({
    *     // ID of the Thread to delete.
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
  def delete(params: ParamsResourceUsersThreadsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersThreadsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaThread] = js.native
  def get(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def get(params: ParamsResourceUsersThreadsGet): GaxiosPromise[SchemaThread] = js.native
  def get(params: ParamsResourceUsersThreadsGet, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def get(
    params: ParamsResourceUsersThreadsGet,
    options: BodyResponseCallback[Readable | SchemaThread],
    callback: BodyResponseCallback[Readable | SchemaThread]
  ): Unit = js.native
  def get(params: ParamsResourceUsersThreadsGet, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def get(
    params: ParamsResourceUsersThreadsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  /**
    * Gets the specified thread.
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
    *       'https://www.googleapis.com/auth/gmail.addons.current.message.action',
    *       'https://www.googleapis.com/auth/gmail.addons.current.message.metadata',
    *       'https://www.googleapis.com/auth/gmail.addons.current.message.readonly',
    *       'https://www.googleapis.com/auth/gmail.metadata',
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
    *   const res = await gmail.users.threads.get({
    *     // The format to return the messages in.
    *     format: 'placeholder-value',
    *     // The ID of the thread to retrieve.
    *     id: 'placeholder-value',
    *     // When given and format is METADATA, only include headers specified.
    *     metadataHeaders: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "historyId": "my_historyId",
    *   //   "id": "my_id",
    *   //   "messages": [],
    *   //   "snippet": "my_snippet"
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
  def get(params: ParamsResourceUsersThreadsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersThreadsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListThreadsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(params: ParamsResourceUsersThreadsList): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(params: ParamsResourceUsersThreadsList, callback: BodyResponseCallback[SchemaListThreadsResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersThreadsList,
    options: BodyResponseCallback[Readable | SchemaListThreadsResponse],
    callback: BodyResponseCallback[Readable | SchemaListThreadsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersThreadsList, options: MethodOptions): GaxiosPromise[SchemaListThreadsResponse] = js.native
  def list(
    params: ParamsResourceUsersThreadsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListThreadsResponse]
  ): Unit = js.native
  /**
    * Lists the threads in the user's mailbox.
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
    *       'https://www.googleapis.com/auth/gmail.metadata',
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
    *   const res = await gmail.users.threads.list({
    *     // Include threads from `SPAM` and `TRASH` in the results.
    *     includeSpamTrash: 'placeholder-value',
    *     // Only return threads with labels that match all of the specified label IDs.
    *     labelIds: 'placeholder-value',
    *     // Maximum number of threads to return. This field defaults to 100. The maximum allowed value for this field is 500.
    *     maxResults: 'placeholder-value',
    *     // Page token to retrieve a specific page of results in the list.
    *     pageToken: 'placeholder-value',
    *     // Only return threads matching the specified query. Supports the same query format as the Gmail search box. For example, `"from:someuser@example.com rfc822msgid: is:unread"`. Parameter cannot be used when accessing the api using the gmail.metadata scope.
    *     q: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "resultSizeEstimate": 0,
    *   //   "threads": []
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
  def list(params: ParamsResourceUsersThreadsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersThreadsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modify(): GaxiosPromise[SchemaThread] = js.native
  def modify(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def modify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def modify(params: ParamsResourceUsersThreadsModify): GaxiosPromise[SchemaThread] = js.native
  def modify(params: ParamsResourceUsersThreadsModify, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def modify(
    params: ParamsResourceUsersThreadsModify,
    options: BodyResponseCallback[Readable | SchemaThread],
    callback: BodyResponseCallback[Readable | SchemaThread]
  ): Unit = js.native
  def modify(params: ParamsResourceUsersThreadsModify, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def modify(
    params: ParamsResourceUsersThreadsModify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  /**
    * Modifies the labels applied to the thread. This applies to all messages in the thread.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.threads.modify({
    *     // The ID of the thread to modify.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addLabelIds": [],
    *       //   "removeLabelIds": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "historyId": "my_historyId",
    *   //   "id": "my_id",
    *   //   "messages": [],
    *   //   "snippet": "my_snippet"
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
  def modify(params: ParamsResourceUsersThreadsModify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modify(
    params: ParamsResourceUsersThreadsModify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def trash(): GaxiosPromise[SchemaThread] = js.native
  def trash(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def trash(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def trash(params: ParamsResourceUsersThreadsTrash): GaxiosPromise[SchemaThread] = js.native
  def trash(params: ParamsResourceUsersThreadsTrash, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def trash(
    params: ParamsResourceUsersThreadsTrash,
    options: BodyResponseCallback[Readable | SchemaThread],
    callback: BodyResponseCallback[Readable | SchemaThread]
  ): Unit = js.native
  def trash(params: ParamsResourceUsersThreadsTrash, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def trash(
    params: ParamsResourceUsersThreadsTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  /**
    * Moves the specified thread to the trash. Any messages that belong to the thread are also moved to the trash.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.threads.trash({
    *     // The ID of the thread to Trash.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "historyId": "my_historyId",
    *   //   "id": "my_id",
    *   //   "messages": [],
    *   //   "snippet": "my_snippet"
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
  def trash(params: ParamsResourceUsersThreadsTrash, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def trash(
    params: ParamsResourceUsersThreadsTrash,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def untrash(): GaxiosPromise[SchemaThread] = js.native
  def untrash(callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def untrash(params: Unit, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash): GaxiosPromise[SchemaThread] = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash, callback: BodyResponseCallback[SchemaThread]): Unit = js.native
  def untrash(
    params: ParamsResourceUsersThreadsUntrash,
    options: BodyResponseCallback[Readable | SchemaThread],
    callback: BodyResponseCallback[Readable | SchemaThread]
  ): Unit = js.native
  def untrash(params: ParamsResourceUsersThreadsUntrash, options: MethodOptions): GaxiosPromise[SchemaThread] = js.native
  def untrash(
    params: ParamsResourceUsersThreadsUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaThread]
  ): Unit = js.native
  /**
    * Removes the specified thread from the trash. Any messages that belong to the thread are also removed from the trash.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.threads.untrash({
    *     // The ID of the thread to remove from Trash.
    *     id: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "historyId": "my_historyId",
    *   //   "id": "my_id",
    *   //   "messages": [],
    *   //   "snippet": "my_snippet"
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
  def untrash(params: ParamsResourceUsersThreadsUntrash, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def untrash(
    params: ParamsResourceUsersThreadsUntrash,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
