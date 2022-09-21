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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Children")
@js.native
open class ResourceChildren protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceChildrenDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceChildrenDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceChildrenDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Removes a child from a folder.
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
    *   const res = await drive.children.delete({
    *     // The ID of the child.
    *     childId: 'placeholder-value',
    *     // Deprecated. If an item is not in a shared drive and its last parent is deleted but the item itself is not, the item will be placed under its owner's root.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the folder.
    *     folderId: 'placeholder-value',
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
  def delete(params: ParamsResourceChildrenDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceChildrenDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaChildReference] = js.native
  def get(callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def get(params: ParamsResourceChildrenGet): GaxiosPromise[SchemaChildReference] = js.native
  def get(params: ParamsResourceChildrenGet, callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def get(
    params: ParamsResourceChildrenGet,
    options: BodyResponseCallback[Readable | SchemaChildReference],
    callback: BodyResponseCallback[Readable | SchemaChildReference]
  ): Unit = js.native
  def get(params: ParamsResourceChildrenGet, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def get(
    params: ParamsResourceChildrenGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  /**
    * Gets a specific child reference.
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
    *   const res = await drive.children.get({
    *     // The ID of the child.
    *     childId: 'placeholder-value',
    *     // The ID of the folder.
    *     folderId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "childLink": "my_childLink",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def get(params: ParamsResourceChildrenGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChildrenGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaChildReference] = js.native
  def insert(callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def insert(params: ParamsResourceChildrenInsert): GaxiosPromise[SchemaChildReference] = js.native
  def insert(params: ParamsResourceChildrenInsert, callback: BodyResponseCallback[SchemaChildReference]): Unit = js.native
  def insert(
    params: ParamsResourceChildrenInsert,
    options: BodyResponseCallback[Readable | SchemaChildReference],
    callback: BodyResponseCallback[Readable | SchemaChildReference]
  ): Unit = js.native
  def insert(params: ParamsResourceChildrenInsert, options: MethodOptions): GaxiosPromise[SchemaChildReference] = js.native
  def insert(
    params: ParamsResourceChildrenInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildReference]
  ): Unit = js.native
  /**
    * Inserts a file into a folder.
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
    *   const res = await drive.children.insert({
    *     // Deprecated. Adding files to multiple folders is no longer supported. Use shortcuts instead.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the folder.
    *     folderId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "childLink": "my_childLink",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "childLink": "my_childLink",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
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
  def insert(params: ParamsResourceChildrenInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceChildrenInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaChildList] = js.native
  def list(callback: BodyResponseCallback[SchemaChildList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChildList] = js.native
  def list(params: ParamsResourceChildrenList): GaxiosPromise[SchemaChildList] = js.native
  def list(params: ParamsResourceChildrenList, callback: BodyResponseCallback[SchemaChildList]): Unit = js.native
  def list(
    params: ParamsResourceChildrenList,
    options: BodyResponseCallback[Readable | SchemaChildList],
    callback: BodyResponseCallback[Readable | SchemaChildList]
  ): Unit = js.native
  def list(params: ParamsResourceChildrenList, options: MethodOptions): GaxiosPromise[SchemaChildList] = js.native
  def list(
    params: ParamsResourceChildrenList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChildList]
  ): Unit = js.native
  /**
    * Lists a folder's children.
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
    *   const res = await drive.children.list({
    *     // The ID of the folder.
    *     folderId: 'placeholder-value',
    *     // Maximum number of children to return.
    *     maxResults: 'placeholder-value',
    *     // A comma-separated list of sort keys. Valid keys are 'createdDate', 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate', 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', and 'title'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    *     orderBy: 'placeholder-value',
    *     // Page token for children.
    *     pageToken: 'placeholder-value',
    *     // Query string for searching children.
    *     q: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
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
  def list(params: ParamsResourceChildrenList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChildrenList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
