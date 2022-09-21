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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Drives")
@js.native
open class ResourceDrives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDrivesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDrivesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDrivesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDrivesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDrivesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.delete({
    *     // Whether any items inside the shared drive should also be deleted. This option is only supported when useDomainAdminAccess is also set to true.
    *     allowItemDeletion: 'placeholder-value',
    *     // The ID of the shared drive.
    *     driveId: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
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
  def delete(params: ParamsResourceDrivesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDrivesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDrive] = js.native
  def get(callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def get(params: ParamsResourceDrivesGet): GaxiosPromise[SchemaDrive] = js.native
  def get(params: ParamsResourceDrivesGet, callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def get(
    params: ParamsResourceDrivesGet,
    options: BodyResponseCallback[Readable | SchemaDrive],
    callback: BodyResponseCallback[Readable | SchemaDrive]
  ): Unit = js.native
  def get(params: ParamsResourceDrivesGet, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def get(
    params: ParamsResourceDrivesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDrive]
  ): Unit = js.native
  /**
    * Gets a shared drive's metadata by ID.
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
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.get({
    *     // The ID of the shared drive.
    *     driveId: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backgroundImageFile": {},
    *   //   "backgroundImageLink": "my_backgroundImageLink",
    *   //   "capabilities": {},
    *   //   "colorRgb": "my_colorRgb",
    *   //   "createdDate": "my_createdDate",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "restrictions": {},
    *   //   "themeId": "my_themeId"
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
  def get(params: ParamsResourceDrivesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDrivesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def hide(): GaxiosPromise[SchemaDrive] = js.native
  def hide(callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def hide(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def hide(params: ParamsResourceDrivesHide): GaxiosPromise[SchemaDrive] = js.native
  def hide(params: ParamsResourceDrivesHide, callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def hide(
    params: ParamsResourceDrivesHide,
    options: BodyResponseCallback[Readable | SchemaDrive],
    callback: BodyResponseCallback[Readable | SchemaDrive]
  ): Unit = js.native
  def hide(params: ParamsResourceDrivesHide, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def hide(
    params: ParamsResourceDrivesHide,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDrive]
  ): Unit = js.native
  /**
    * Hides a shared drive from the default view.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.hide({
    *     // The ID of the shared drive.
    *     driveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backgroundImageFile": {},
    *   //   "backgroundImageLink": "my_backgroundImageLink",
    *   //   "capabilities": {},
    *   //   "colorRgb": "my_colorRgb",
    *   //   "createdDate": "my_createdDate",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "restrictions": {},
    *   //   "themeId": "my_themeId"
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
  def hide(params: ParamsResourceDrivesHide, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def hide(
    params: ParamsResourceDrivesHide,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaDrive] = js.native
  def insert(callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def insert(params: ParamsResourceDrivesInsert): GaxiosPromise[SchemaDrive] = js.native
  def insert(params: ParamsResourceDrivesInsert, callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def insert(
    params: ParamsResourceDrivesInsert,
    options: BodyResponseCallback[Readable | SchemaDrive],
    callback: BodyResponseCallback[Readable | SchemaDrive]
  ): Unit = js.native
  def insert(params: ParamsResourceDrivesInsert, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def insert(
    params: ParamsResourceDrivesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDrive]
  ): Unit = js.native
  /**
    * Creates a new shared drive.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.insert({
    *     // An ID, such as a random UUID, which uniquely identifies this user's request for idempotent creation of a shared drive. A repeated request by the same user and with the same request ID will avoid creating duplicates by attempting to create the same shared drive. If the shared drive already exists a 409 error will be returned.
    *     requestId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "backgroundImageFile": {},
    *       //   "backgroundImageLink": "my_backgroundImageLink",
    *       //   "capabilities": {},
    *       //   "colorRgb": "my_colorRgb",
    *       //   "createdDate": "my_createdDate",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "restrictions": {},
    *       //   "themeId": "my_themeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backgroundImageFile": {},
    *   //   "backgroundImageLink": "my_backgroundImageLink",
    *   //   "capabilities": {},
    *   //   "colorRgb": "my_colorRgb",
    *   //   "createdDate": "my_createdDate",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "restrictions": {},
    *   //   "themeId": "my_themeId"
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
  def insert(params: ParamsResourceDrivesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceDrivesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaDriveList] = js.native
  def list(callback: BodyResponseCallback[SchemaDriveList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDriveList] = js.native
  def list(params: ParamsResourceDrivesList): GaxiosPromise[SchemaDriveList] = js.native
  def list(params: ParamsResourceDrivesList, callback: BodyResponseCallback[SchemaDriveList]): Unit = js.native
  def list(
    params: ParamsResourceDrivesList,
    options: BodyResponseCallback[Readable | SchemaDriveList],
    callback: BodyResponseCallback[Readable | SchemaDriveList]
  ): Unit = js.native
  def list(params: ParamsResourceDrivesList, options: MethodOptions): GaxiosPromise[SchemaDriveList] = js.native
  def list(
    params: ParamsResourceDrivesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDriveList]
  ): Unit = js.native
  /**
    * Lists the user's shared drives.
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
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.list({
    *     // Maximum number of shared drives to return per page.
    *     maxResults: 'placeholder-value',
    *     // Page token for shared drives.
    *     pageToken: 'placeholder-value',
    *     // Query string for searching shared drives.
    *     q: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then all shared drives of the domain in which the requester is an administrator are returned.
    *     useDomainAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceDrivesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDrivesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unhide(): GaxiosPromise[SchemaDrive] = js.native
  def unhide(callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def unhide(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def unhide(params: ParamsResourceDrivesUnhide): GaxiosPromise[SchemaDrive] = js.native
  def unhide(params: ParamsResourceDrivesUnhide, callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def unhide(
    params: ParamsResourceDrivesUnhide,
    options: BodyResponseCallback[Readable | SchemaDrive],
    callback: BodyResponseCallback[Readable | SchemaDrive]
  ): Unit = js.native
  def unhide(params: ParamsResourceDrivesUnhide, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def unhide(
    params: ParamsResourceDrivesUnhide,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDrive]
  ): Unit = js.native
  /**
    * Restores a shared drive to the default view.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.unhide({
    *     // The ID of the shared drive.
    *     driveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backgroundImageFile": {},
    *   //   "backgroundImageLink": "my_backgroundImageLink",
    *   //   "capabilities": {},
    *   //   "colorRgb": "my_colorRgb",
    *   //   "createdDate": "my_createdDate",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "restrictions": {},
    *   //   "themeId": "my_themeId"
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
  def unhide(params: ParamsResourceDrivesUnhide, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unhide(
    params: ParamsResourceDrivesUnhide,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaDrive] = js.native
  def update(callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def update(params: ParamsResourceDrivesUpdate): GaxiosPromise[SchemaDrive] = js.native
  def update(params: ParamsResourceDrivesUpdate, callback: BodyResponseCallback[SchemaDrive]): Unit = js.native
  def update(
    params: ParamsResourceDrivesUpdate,
    options: BodyResponseCallback[Readable | SchemaDrive],
    callback: BodyResponseCallback[Readable | SchemaDrive]
  ): Unit = js.native
  def update(params: ParamsResourceDrivesUpdate, options: MethodOptions): GaxiosPromise[SchemaDrive] = js.native
  def update(
    params: ParamsResourceDrivesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDrive]
  ): Unit = js.native
  /**
    * Updates the metadata for a shared drive.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.drives.update({
    *     // The ID of the shared drive.
    *     driveId: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "backgroundImageFile": {},
    *       //   "backgroundImageLink": "my_backgroundImageLink",
    *       //   "capabilities": {},
    *       //   "colorRgb": "my_colorRgb",
    *       //   "createdDate": "my_createdDate",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "orgUnitId": "my_orgUnitId",
    *       //   "restrictions": {},
    *       //   "themeId": "my_themeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "backgroundImageFile": {},
    *   //   "backgroundImageLink": "my_backgroundImageLink",
    *   //   "capabilities": {},
    *   //   "colorRgb": "my_colorRgb",
    *   //   "createdDate": "my_createdDate",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "orgUnitId": "my_orgUnitId",
    *   //   "restrictions": {},
    *   //   "themeId": "my_themeId"
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
  def update(params: ParamsResourceDrivesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceDrivesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
