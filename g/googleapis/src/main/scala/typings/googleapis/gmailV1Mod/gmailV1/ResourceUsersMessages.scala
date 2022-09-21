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

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Messages")
@js.native
open class ResourceUsersMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var attachments: ResourceUsersMessagesAttachments = js.native
  
  def batchDelete(): GaxiosPromise[Unit] = js.native
  def batchDelete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchDelete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchDelete(params: ParamsResourceUsersMessagesBatchdelete): GaxiosPromise[Unit] = js.native
  def batchDelete(params: ParamsResourceUsersMessagesBatchdelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchDelete(
    params: ParamsResourceUsersMessagesBatchdelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def batchDelete(params: ParamsResourceUsersMessagesBatchdelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchDelete(
    params: ParamsResourceUsersMessagesBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes many messages by message ID. Provides no guarantees that messages were not already deleted or even existed at all.
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
    *   const res = await gmail.users.messages.batchDelete({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "ids": []
    *       // }
    *     },
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
  def batchDelete(params: ParamsResourceUsersMessagesBatchdelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchDelete(
    params: ParamsResourceUsersMessagesBatchdelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def batchModify(): GaxiosPromise[Unit] = js.native
  def batchModify(callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchModify(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchModify(params: ParamsResourceUsersMessagesBatchmodify): GaxiosPromise[Unit] = js.native
  def batchModify(params: ParamsResourceUsersMessagesBatchmodify, callback: BodyResponseCallback[Unit]): Unit = js.native
  def batchModify(
    params: ParamsResourceUsersMessagesBatchmodify,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def batchModify(params: ParamsResourceUsersMessagesBatchmodify, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def batchModify(
    params: ParamsResourceUsersMessagesBatchmodify,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Modifies the labels on the specified messages.
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
    *   const res = await gmail.users.messages.batchModify({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "addLabelIds": [],
    *       //   "ids": [],
    *       //   "removeLabelIds": []
    *       // }
    *     },
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
  def batchModify(params: ParamsResourceUsersMessagesBatchmodify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchModify(
    params: ParamsResourceUsersMessagesBatchmodify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersMessagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersMessagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersMessagesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersMessagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceUsersMessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Immediately and permanently deletes the specified message. This operation cannot be undone. Prefer `messages.trash` instead.
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
    *   const res = await gmail.users.messages.delete({
    *     // The ID of the message to delete.
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
  def delete(params: ParamsResourceUsersMessagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersMessagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMessage] = js.native
  def get(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceUsersMessagesGet): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceUsersMessagesGet, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(
    params: ParamsResourceUsersMessagesGet,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def get(params: ParamsResourceUsersMessagesGet, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceUsersMessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Gets the specified message.
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
    *   const res = await gmail.users.messages.get({
    *     // The format to return the message in.
    *     format: 'placeholder-value',
    *     // The ID of the message to retrieve. This ID is usually retrieved using `messages.list`. The ID is also contained in the result when a message is inserted (`messages.insert`) or imported (`messages.import`).
    *     id: 'placeholder-value',
    *     // When given and format is `METADATA`, only include headers specified.
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
  def get(params: ParamsResourceUsersMessagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersMessagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaMessage] = js.native
  def `import`(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def `import`(params: ParamsResourceUsersMessagesImport): GaxiosPromise[SchemaMessage] = js.native
  def `import`(params: ParamsResourceUsersMessagesImport, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def `import`(
    params: ParamsResourceUsersMessagesImport,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def `import`(params: ParamsResourceUsersMessagesImport, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def `import`(
    params: ParamsResourceUsersMessagesImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Imports a message into only this user's mailbox, with standard email delivery scanning and classification similar to receiving via SMTP. This method doesn't perform SPF checks, so it might not work for some spam messages, such as those attempting to perform domain spoofing. This method does not send a message. Note: This function doesn't trigger forwarding rules or filters set up by the user.
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
    *       'https://www.googleapis.com/auth/gmail.insert',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.messages.import({
    *     // Mark the email as permanently deleted (not TRASH) and only visible in Google Vault to a Vault administrator. Only used for G Suite accounts.
    *     deleted: 'placeholder-value',
    *     // Source for Gmail's internal date of the message.
    *     internalDateSource: 'placeholder-value',
    *     // Ignore the Gmail spam classifier decision and never mark this email as SPAM in the mailbox.
    *     neverMarkSpam: 'placeholder-value',
    *     // Process calendar invites in the email and add any extracted meetings to the Google Calendar for this user.
    *     processForCalendar: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "historyId": "my_historyId",
    *       //   "id": "my_id",
    *       //   "internalDate": "my_internalDate",
    *       //   "labelIds": [],
    *       //   "payload": {},
    *       //   "raw": "my_raw",
    *       //   "sizeEstimate": 0,
    *       //   "snippet": "my_snippet",
    *       //   "threadId": "my_threadId"
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
  def `import`(params: ParamsResourceUsersMessagesImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceUsersMessagesImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaMessage] = js.native
  def insert(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def insert(params: ParamsResourceUsersMessagesInsert): GaxiosPromise[SchemaMessage] = js.native
  def insert(params: ParamsResourceUsersMessagesInsert, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def insert(
    params: ParamsResourceUsersMessagesInsert,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersMessagesInsert, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def insert(
    params: ParamsResourceUsersMessagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Directly inserts a message into only this user's mailbox similar to `IMAP APPEND`, bypassing most scanning and classification. Does not send a message.
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
    *       'https://www.googleapis.com/auth/gmail.insert',
    *       'https://www.googleapis.com/auth/gmail.modify',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.messages.insert({
    *     // Mark the email as permanently deleted (not TRASH) and only visible in Google Vault to a Vault administrator. Only used for G Suite accounts.
    *     deleted: 'placeholder-value',
    *     // Source for Gmail's internal date of the message.
    *     internalDateSource: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "historyId": "my_historyId",
    *       //   "id": "my_id",
    *       //   "internalDate": "my_internalDate",
    *       //   "labelIds": [],
    *       //   "payload": {},
    *       //   "raw": "my_raw",
    *       //   "sizeEstimate": 0,
    *       //   "snippet": "my_snippet",
    *       //   "threadId": "my_threadId"
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
  def insert(params: ParamsResourceUsersMessagesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUsersMessagesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMessagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(params: ParamsResourceUsersMessagesList): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(
    params: ParamsResourceUsersMessagesList,
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUsersMessagesList,
    options: BodyResponseCallback[Readable | SchemaListMessagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListMessagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersMessagesList, options: MethodOptions): GaxiosPromise[SchemaListMessagesResponse] = js.native
  def list(
    params: ParamsResourceUsersMessagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMessagesResponse]
  ): Unit = js.native
  /**
    * Lists the messages in the user's mailbox.
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
    *   const res = await gmail.users.messages.list({
    *     // Include messages from `SPAM` and `TRASH` in the results.
    *     includeSpamTrash: 'placeholder-value',
    *     // Only return messages with labels that match all of the specified label IDs.
    *     labelIds: 'placeholder-value',
    *     // Maximum number of messages to return. This field defaults to 100. The maximum allowed value for this field is 500.
    *     maxResults: 'placeholder-value',
    *     // Page token to retrieve a specific page of results in the list.
    *     pageToken: 'placeholder-value',
    *     // Only return messages matching the specified query. Supports the same query format as the Gmail search box. For example, `"from:someuser@example.com rfc822msgid: is:unread"`. Parameter cannot be used when accessing the api using the gmail.metadata scope.
    *     q: 'placeholder-value',
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "messages": [],
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
  def list(params: ParamsResourceUsersMessagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersMessagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def modify(): GaxiosPromise[SchemaMessage] = js.native
  def modify(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def modify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def modify(params: ParamsResourceUsersMessagesModify): GaxiosPromise[SchemaMessage] = js.native
  def modify(params: ParamsResourceUsersMessagesModify, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def modify(
    params: ParamsResourceUsersMessagesModify,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def modify(params: ParamsResourceUsersMessagesModify, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def modify(
    params: ParamsResourceUsersMessagesModify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Modifies the labels on the specified message.
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
    *   const res = await gmail.users.messages.modify({
    *     // The ID of the message to modify.
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
  def modify(params: ParamsResourceUsersMessagesModify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def modify(
    params: ParamsResourceUsersMessagesModify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def send(): GaxiosPromise[SchemaMessage] = js.native
  def send(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersMessagesSend): GaxiosPromise[SchemaMessage] = js.native
  def send(params: ParamsResourceUsersMessagesSend, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def send(
    params: ParamsResourceUsersMessagesSend,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def send(params: ParamsResourceUsersMessagesSend, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def send(
    params: ParamsResourceUsersMessagesSend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Sends the specified message to the recipients in the `To`, `Cc`, and `Bcc` headers.
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
    *       'https://www.googleapis.com/auth/gmail.send',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gmail.users.messages.send({
    *     // The user's email address. The special value `me` can be used to indicate the authenticated user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "historyId": "my_historyId",
    *       //   "id": "my_id",
    *       //   "internalDate": "my_internalDate",
    *       //   "labelIds": [],
    *       //   "payload": {},
    *       //   "raw": "my_raw",
    *       //   "sizeEstimate": 0,
    *       //   "snippet": "my_snippet",
    *       //   "threadId": "my_threadId"
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
  def send(params: ParamsResourceUsersMessagesSend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def send(
    params: ParamsResourceUsersMessagesSend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def trash(): GaxiosPromise[SchemaMessage] = js.native
  def trash(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def trash(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def trash(params: ParamsResourceUsersMessagesTrash): GaxiosPromise[SchemaMessage] = js.native
  def trash(params: ParamsResourceUsersMessagesTrash, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def trash(
    params: ParamsResourceUsersMessagesTrash,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def trash(params: ParamsResourceUsersMessagesTrash, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def trash(
    params: ParamsResourceUsersMessagesTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Moves the specified message to the trash.
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
    *   const res = await gmail.users.messages.trash({
    *     // The ID of the message to Trash.
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
  def trash(params: ParamsResourceUsersMessagesTrash, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def trash(
    params: ParamsResourceUsersMessagesTrash,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def untrash(): GaxiosPromise[SchemaMessage] = js.native
  def untrash(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def untrash(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def untrash(params: ParamsResourceUsersMessagesUntrash): GaxiosPromise[SchemaMessage] = js.native
  def untrash(params: ParamsResourceUsersMessagesUntrash, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def untrash(
    params: ParamsResourceUsersMessagesUntrash,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def untrash(params: ParamsResourceUsersMessagesUntrash, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def untrash(
    params: ParamsResourceUsersMessagesUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Removes the specified message from the trash.
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
    *   const res = await gmail.users.messages.untrash({
    *     // The ID of the message to remove from Trash.
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
  def untrash(params: ParamsResourceUsersMessagesUntrash, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def untrash(
    params: ParamsResourceUsersMessagesUntrash,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
