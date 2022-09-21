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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Comments")
@js.native
open class ResourceComments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a comment.
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
    *   const res = await drive.comments.delete({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
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
  def delete(params: ParamsResourceCommentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def get(params: ParamsResourceCommentsGet, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Gets a comment by ID.
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
    *   const res = await drive.comments.get({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // If set, this will succeed when retrieving a deleted comment, and will include any deleted replies.
    *     includeDeleted: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anchor": "my_anchor",
    *   //   "author": {},
    *   //   "commentId": "my_commentId",
    *   //   "content": "my_content",
    *   //   "context": {},
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "fileId": "my_fileId",
    *   //   "fileTitle": "my_fileTitle",
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replies": [],
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status"
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
  def get(params: ParamsResourceCommentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaComment] = js.native
  def insert(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def insert(params: ParamsResourceCommentsInsert): GaxiosPromise[SchemaComment] = js.native
  def insert(params: ParamsResourceCommentsInsert, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def insert(
    params: ParamsResourceCommentsInsert,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def insert(params: ParamsResourceCommentsInsert, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def insert(
    params: ParamsResourceCommentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Creates a new comment on the given file.
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
    *   const res = await drive.comments.insert({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anchor": "my_anchor",
    *       //   "author": {},
    *       //   "commentId": "my_commentId",
    *       //   "content": "my_content",
    *       //   "context": {},
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "fileId": "my_fileId",
    *       //   "fileTitle": "my_fileTitle",
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replies": [],
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anchor": "my_anchor",
    *   //   "author": {},
    *   //   "commentId": "my_commentId",
    *   //   "content": "my_content",
    *   //   "context": {},
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "fileId": "my_fileId",
    *   //   "fileTitle": "my_fileTitle",
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replies": [],
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status"
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
  def insert(params: ParamsResourceCommentsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCommentsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCommentList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[Readable | SchemaCommentList],
    callback: BodyResponseCallback[Readable | SchemaCommentList]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  /**
    * Lists a file's comments.
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
    *   const res = await drive.comments.list({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // If set, all comments and replies, including deleted comments and replies (with content stripped) will be returned.
    *     includeDeleted: 'placeholder-value',
    *     // The maximum number of discussions to include in the response, used for paging.
    *     maxResults: 'placeholder-value',
    *     // The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    *     pageToken: 'placeholder-value',
    *     // Only discussions that were updated after this timestamp will be returned. Formatted as an RFC 3339 timestamp.
    *     updatedMin: 'placeholder-value',
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
  def list(params: ParamsResourceCommentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaComment] = js.native
  def patch(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def patch(params: ParamsResourceCommentsPatch): GaxiosPromise[SchemaComment] = js.native
  def patch(params: ParamsResourceCommentsPatch, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def patch(
    params: ParamsResourceCommentsPatch,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def patch(params: ParamsResourceCommentsPatch, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def patch(
    params: ParamsResourceCommentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Updates an existing comment.
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
    *   const res = await drive.comments.patch({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anchor": "my_anchor",
    *       //   "author": {},
    *       //   "commentId": "my_commentId",
    *       //   "content": "my_content",
    *       //   "context": {},
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "fileId": "my_fileId",
    *       //   "fileTitle": "my_fileTitle",
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replies": [],
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anchor": "my_anchor",
    *   //   "author": {},
    *   //   "commentId": "my_commentId",
    *   //   "content": "my_content",
    *   //   "context": {},
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "fileId": "my_fileId",
    *   //   "fileTitle": "my_fileTitle",
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replies": [],
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status"
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
  def patch(params: ParamsResourceCommentsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCommentsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaComment] = js.native
  def update(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def update(params: ParamsResourceCommentsUpdate): GaxiosPromise[SchemaComment] = js.native
  def update(params: ParamsResourceCommentsUpdate, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def update(
    params: ParamsResourceCommentsUpdate,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def update(params: ParamsResourceCommentsUpdate, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def update(
    params: ParamsResourceCommentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Updates an existing comment.
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
    *   const res = await drive.comments.update({
    *     // The ID of the comment.
    *     commentId: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anchor": "my_anchor",
    *       //   "author": {},
    *       //   "commentId": "my_commentId",
    *       //   "content": "my_content",
    *       //   "context": {},
    *       //   "createdDate": "my_createdDate",
    *       //   "deleted": false,
    *       //   "fileId": "my_fileId",
    *       //   "fileTitle": "my_fileTitle",
    *       //   "htmlContent": "my_htmlContent",
    *       //   "kind": "my_kind",
    *       //   "modifiedDate": "my_modifiedDate",
    *       //   "replies": [],
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anchor": "my_anchor",
    *   //   "author": {},
    *   //   "commentId": "my_commentId",
    *   //   "content": "my_content",
    *   //   "context": {},
    *   //   "createdDate": "my_createdDate",
    *   //   "deleted": false,
    *   //   "fileId": "my_fileId",
    *   //   "fileTitle": "my_fileTitle",
    *   //   "htmlContent": "my_htmlContent",
    *   //   "kind": "my_kind",
    *   //   "modifiedDate": "my_modifiedDate",
    *   //   "replies": [],
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status"
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
  def update(params: ParamsResourceCommentsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCommentsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
