package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Replies")
@js.native
open class ResourceReplies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaReply] = js.native
  def create(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def create(params: ParamsResourceRepliesCreate): GaxiosPromise[SchemaReply] = js.native
  def create(params: ParamsResourceRepliesCreate, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def create(
    params: ParamsResourceRepliesCreate,
    options: BodyResponseCallback[Readable | SchemaReply],
    callback: BodyResponseCallback[Readable | SchemaReply]
  ): Unit = js.native
  def create(params: ParamsResourceRepliesCreate, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def create(
    params: ParamsResourceRepliesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  /**
    * Creates a new reply to a comment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.replies.create({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "author": {},
    *       //   "content": "my_content",
    *       //   "createdTime": "my_createdTime",
    *       //   "deleted": false,
    *       //   "htmlContent": "my_htmlContent",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "modifiedTime": "my_modifiedTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdTime": "my_createdTime",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "modifiedTime": "my_modifiedTime"
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
  def create(params: ParamsResourceRepliesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceRepliesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRepliesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRepliesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRepliesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a reply.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.replies.delete({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the reply.
    *     replyId: 'placeholder-value',
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
  def delete(params: ParamsResourceRepliesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRepliesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaReply] = js.native
  def get(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def get(params: ParamsResourceRepliesGet): GaxiosPromise[SchemaReply] = js.native
  def get(params: ParamsResourceRepliesGet, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: BodyResponseCallback[Readable | SchemaReply],
    callback: BodyResponseCallback[Readable | SchemaReply]
  ): Unit = js.native
  def get(params: ParamsResourceRepliesGet, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  /**
    * Gets a reply by ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.replies.get({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // Whether to return deleted replies. Deleted replies will not include their original content.
    *     includeDeleted: 'placeholder-value',
    *     // The ID of the reply.
    *     replyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdTime": "my_createdTime",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "modifiedTime": "my_modifiedTime"
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
  def get(params: ParamsResourceRepliesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaReplyList] = js.native
  def list(callback: BodyResponseCallback[SchemaReplyList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReplyList] = js.native
  def list(params: ParamsResourceRepliesList): GaxiosPromise[SchemaReplyList] = js.native
  def list(params: ParamsResourceRepliesList, callback: BodyResponseCallback[SchemaReplyList]): Unit = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: BodyResponseCallback[Readable | SchemaReplyList],
    callback: BodyResponseCallback[Readable | SchemaReplyList]
  ): Unit = js.native
  def list(params: ParamsResourceRepliesList, options: MethodOptions): GaxiosPromise[SchemaReplyList] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReplyList]
  ): Unit = js.native
  /**
    * Lists a comment's replies.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.replies.list({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // Whether to include deleted replies. Deleted replies will not include their original content.
    *     includeDeleted: 'placeholder-value',
    *     // The maximum number of replies to return per page.
    *     pageSize: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "replies": []
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
  def list(params: ParamsResourceRepliesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaReply] = js.native
  def update(callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def update(params: ParamsResourceRepliesUpdate): GaxiosPromise[SchemaReply] = js.native
  def update(params: ParamsResourceRepliesUpdate, callback: BodyResponseCallback[SchemaReply]): Unit = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: BodyResponseCallback[Readable | SchemaReply],
    callback: BodyResponseCallback[Readable | SchemaReply]
  ): Unit = js.native
  def update(params: ParamsResourceRepliesUpdate, options: MethodOptions): GaxiosPromise[SchemaReply] = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReply]
  ): Unit = js.native
  /**
    * Updates a reply with patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drive.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drive = google.drive('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/drive',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.replies.update({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the reply.
    *     replyId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "author": {},
    *       //   "content": "my_content",
    *       //   "createdTime": "my_createdTime",
    *       //   "deleted": false,
    *       //   "htmlContent": "my_htmlContent",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "modifiedTime": "my_modifiedTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "action": "my_action",
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdTime": "my_createdTime",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "modifiedTime": "my_modifiedTime"
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
  def update(params: ParamsResourceRepliesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
