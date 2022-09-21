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

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Revisions")
@js.native
open class ResourceRevisions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRevisionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceRevisionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceRevisionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceRevisionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceRevisionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Permanently deletes a file version. You can only delete revisions for files with binary content in Google Drive, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted.
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
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.revisions.delete({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the revision.
    *     revisionId: 'placeholder-value',
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
  def delete(params: ParamsResourceRevisionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceRevisionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaRevision] = js.native
  def get(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceRevisionsGet): GaxiosPromise[SchemaRevision] = js.native
  def get(params: ParamsResourceRevisionsGet, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def get(
    params: ParamsResourceRevisionsGet,
    options: BodyResponseCallback[Readable | SchemaRevision],
    callback: BodyResponseCallback[Readable | SchemaRevision]
  ): Unit = js.native
  def get(params: ParamsResourceRevisionsGet, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def get(
    params: ParamsResourceRevisionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  /**
    * Gets a revision's metadata or content by ID.
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
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *       'https://www.googleapis.com/auth/drive.metadata.readonly',
    *       'https://www.googleapis.com/auth/drive.photos.readonly',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.revisions.get({
    *     // Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    *     acknowledgeAbuse: 'placeholder-value',
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the revision.
    *     revisionId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "exportLinks": {},
    *   //   "id": "my_id",
    *   //   "keepForever": false,
    *   //   "kind": "my_kind",
    *   //   "lastModifyingUser": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "publishAuto": false,
    *   //   "published": false,
    *   //   "publishedLink": "my_publishedLink",
    *   //   "publishedOutsideDomain": false,
    *   //   "size": "my_size"
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
  def get(params: ParamsResourceRevisionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceRevisionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaRevisionList] = js.native
  def list(callback: BodyResponseCallback[SchemaRevisionList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevisionList] = js.native
  def list(params: ParamsResourceRevisionsList): GaxiosPromise[SchemaRevisionList] = js.native
  def list(params: ParamsResourceRevisionsList, callback: BodyResponseCallback[SchemaRevisionList]): Unit = js.native
  def list(
    params: ParamsResourceRevisionsList,
    options: BodyResponseCallback[Readable | SchemaRevisionList],
    callback: BodyResponseCallback[Readable | SchemaRevisionList]
  ): Unit = js.native
  def list(params: ParamsResourceRevisionsList, options: MethodOptions): GaxiosPromise[SchemaRevisionList] = js.native
  def list(
    params: ParamsResourceRevisionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevisionList]
  ): Unit = js.native
  /**
    * Lists a file's revisions.
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
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *       'https://www.googleapis.com/auth/drive.metadata',
    *       'https://www.googleapis.com/auth/drive.metadata.readonly',
    *       'https://www.googleapis.com/auth/drive.photos.readonly',
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.revisions.list({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The maximum number of revisions to return per page.
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
    *   //   "revisions": []
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
  def list(params: ParamsResourceRevisionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceRevisionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaRevision] = js.native
  def update(callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def update(params: ParamsResourceRevisionsUpdate): GaxiosPromise[SchemaRevision] = js.native
  def update(params: ParamsResourceRevisionsUpdate, callback: BodyResponseCallback[SchemaRevision]): Unit = js.native
  def update(
    params: ParamsResourceRevisionsUpdate,
    options: BodyResponseCallback[Readable | SchemaRevision],
    callback: BodyResponseCallback[Readable | SchemaRevision]
  ): Unit = js.native
  def update(params: ParamsResourceRevisionsUpdate, options: MethodOptions): GaxiosPromise[SchemaRevision] = js.native
  def update(
    params: ParamsResourceRevisionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRevision]
  ): Unit = js.native
  /**
    * Updates a revision with patch semantics.
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
    *       'https://www.googleapis.com/auth/drive.appdata',
    *       'https://www.googleapis.com/auth/drive.file',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.revisions.update({
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the revision.
    *     revisionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "exportLinks": {},
    *       //   "id": "my_id",
    *       //   "keepForever": false,
    *       //   "kind": "my_kind",
    *       //   "lastModifyingUser": {},
    *       //   "md5Checksum": "my_md5Checksum",
    *       //   "mimeType": "my_mimeType",
    *       //   "modifiedTime": "my_modifiedTime",
    *       //   "originalFilename": "my_originalFilename",
    *       //   "publishAuto": false,
    *       //   "published": false,
    *       //   "publishedLink": "my_publishedLink",
    *       //   "publishedOutsideDomain": false,
    *       //   "size": "my_size"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "exportLinks": {},
    *   //   "id": "my_id",
    *   //   "keepForever": false,
    *   //   "kind": "my_kind",
    *   //   "lastModifyingUser": {},
    *   //   "md5Checksum": "my_md5Checksum",
    *   //   "mimeType": "my_mimeType",
    *   //   "modifiedTime": "my_modifiedTime",
    *   //   "originalFilename": "my_originalFilename",
    *   //   "publishAuto": false,
    *   //   "published": false,
    *   //   "publishedLink": "my_publishedLink",
    *   //   "publishedOutsideDomain": false,
    *   //   "size": "my_size"
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
  def update(params: ParamsResourceRevisionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceRevisionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
