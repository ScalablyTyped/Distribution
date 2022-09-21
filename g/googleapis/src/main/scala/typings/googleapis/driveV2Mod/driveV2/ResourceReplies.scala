package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Replies")
@js.native
open class ResourceReplies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    * const drive = google.drive('v2');
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
  
  def get(): GaxiosPromise[SchemaCommentReply] = js.native
  def get(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def get(params: ParamsResourceRepliesGet): GaxiosPromise[SchemaCommentReply] = js.native
  def get(params: ParamsResourceRepliesGet, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: BodyResponseCallback[Readable | SchemaCommentReply],
    callback: BodyResponseCallback[Readable | SchemaCommentReply]
  ): Unit = js.native
  def get(params: ParamsResourceRepliesGet, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def get(
    params: ParamsResourceRepliesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  /**
    * Gets a reply.
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
    * const drive = google.drive('v2');
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
    *     // If set, this will succeed when retrieving a deleted reply.
    *     includeDeleted: 'placeholder-value',
    *     // The ID of the reply.
    *     replyId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replyId": "my_replyId",
    *   //   "verb": "my_verb"
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
  
  def insert(): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(params: ParamsResourceRepliesInsert): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(params: ParamsResourceRepliesInsert, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def insert(
    params: ParamsResourceRepliesInsert,
    options: BodyResponseCallback[Readable | SchemaCommentReply],
    callback: BodyResponseCallback[Readable | SchemaCommentReply]
  ): Unit = js.native
  def insert(params: ParamsResourceRepliesInsert, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def insert(
    params: ParamsResourceRepliesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  /**
    * Creates a new reply to the given comment.
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
    * const drive = google.drive('v2');
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
    *   const res = await drive.replies.insert({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "content": "my_content",
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replyId": "my_replyId",
    *       //   "verb": "my_verb"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replyId": "my_replyId",
    *   //   "verb": "my_verb"
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
  def insert(params: ParamsResourceRepliesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceRepliesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentReplyList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(params: ParamsResourceRepliesList): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(params: ParamsResourceRepliesList, callback: BodyResponseCallback[SchemaCommentReplyList]): Unit = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: BodyResponseCallback[Readable | SchemaCommentReplyList],
    callback: BodyResponseCallback[Readable | SchemaCommentReplyList]
  ): Unit = js.native
  def list(params: ParamsResourceRepliesList, options: MethodOptions): GaxiosPromise[SchemaCommentReplyList] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReplyList]
  ): Unit = js.native
  /**
    * Lists all of the replies to a comment.
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
    * const drive = google.drive('v2');
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
    *     // If set, all replies, including deleted replies (with content stripped) will be returned.
    *     includeDeleted: 'placeholder-value',
    *     // The maximum number of replies to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextLink": "my_nextLink",
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceRepliesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRepliesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(params: ParamsResourceRepliesPatch): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(params: ParamsResourceRepliesPatch, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def patch(
    params: ParamsResourceRepliesPatch,
    options: BodyResponseCallback[Readable | SchemaCommentReply],
    callback: BodyResponseCallback[Readable | SchemaCommentReply]
  ): Unit = js.native
  def patch(params: ParamsResourceRepliesPatch, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def patch(
    params: ParamsResourceRepliesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  /**
    * Updates an existing reply.
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
    * const drive = google.drive('v2');
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
    *   const res = await drive.replies.patch({
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
    *       //   "author": {},
    *       //   "content": "my_content",
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replyId": "my_replyId",
    *       //   "verb": "my_verb"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replyId": "my_replyId",
    *   //   "verb": "my_verb"
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
  def patch(params: ParamsResourceRepliesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceRepliesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCommentReply] = js.native
  def update(callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def update(params: ParamsResourceRepliesUpdate): GaxiosPromise[SchemaCommentReply] = js.native
  def update(params: ParamsResourceRepliesUpdate, callback: BodyResponseCallback[SchemaCommentReply]): Unit = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: BodyResponseCallback[Readable | SchemaCommentReply],
    callback: BodyResponseCallback[Readable | SchemaCommentReply]
  ): Unit = js.native
  def update(params: ParamsResourceRepliesUpdate, options: MethodOptions): GaxiosPromise[SchemaCommentReply] = js.native
  def update(
    params: ParamsResourceRepliesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentReply]
  ): Unit = js.native
  /**
    * Updates an existing reply.
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
    * const drive = google.drive('v2');
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
    *       //   "author": {},
    *       //   "content": "my_content",
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replyId": "my_replyId",
    *       //   "verb": "my_verb"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "content": "my_content",
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replyId": "my_replyId",
    *   //   "verb": "my_verb"
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
