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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Changes")
@js.native
open class ResourceChanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaChange] = js.native
  def get(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: BodyResponseCallback[Readable | SchemaChange],
    callback: BodyResponseCallback[Readable | SchemaChange]
  ): Unit = js.native
  def get(params: ParamsResourceChangesGet, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  /**
    * Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
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
    *       'https://www.googleapis.com/auth/drive.apps.readonly',
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
    *   const res = await drive.changes.get({
    *     // The ID of the change.
    *     changeId: 'placeholder-value',
    *     // The shared drive from which the change is returned.
    *     driveId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Deprecated use driveId instead.
    *     teamDriveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "changeType": "my_changeType",
    *   //   "deleted": false,
    *   //   "drive": {},
    *   //   "driveId": "my_driveId",
    *   //   "file": {},
    *   //   "fileId": "my_fileId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "modificationDate": "my_modificationDate",
    *   //   "selfLink": "my_selfLink",
    *   //   "teamDrive": {},
    *   //   "teamDriveId": "my_teamDriveId",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceChangesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getStartPageToken(): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(callback: BodyResponseCallback[SchemaStartPageToken]): Unit = js.native
  def getStartPageToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(params: ParamsResourceChangesGetstartpagetoken): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    callback: BodyResponseCallback[SchemaStartPageToken]
  ): Unit = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    options: BodyResponseCallback[Readable | SchemaStartPageToken],
    callback: BodyResponseCallback[Readable | SchemaStartPageToken]
  ): Unit = js.native
  def getStartPageToken(params: ParamsResourceChangesGetstartpagetoken, options: MethodOptions): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStartPageToken]
  ): Unit = js.native
  /**
    * Gets the starting pageToken for listing future changes.
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
    *       'https://www.googleapis.com/auth/drive.apps.readonly',
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
    *   const res = await drive.changes.getStartPageToken({
    *     // The ID of the shared drive for which the starting pageToken for listing future changes from that shared drive is returned.
    *     driveId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Deprecated use driveId instead.
    *     teamDriveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "startPageToken": "my_startPageToken"
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
  def getStartPageToken(params: ParamsResourceChangesGetstartpagetoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaChangeList] = js.native
  def list(callback: BodyResponseCallback[SchemaChangeList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChangeList] = js.native
  def list(params: ParamsResourceChangesList): GaxiosPromise[SchemaChangeList] = js.native
  def list(params: ParamsResourceChangesList, callback: BodyResponseCallback[SchemaChangeList]): Unit = js.native
  def list(
    params: ParamsResourceChangesList,
    options: BodyResponseCallback[Readable | SchemaChangeList],
    callback: BodyResponseCallback[Readable | SchemaChangeList]
  ): Unit = js.native
  def list(params: ParamsResourceChangesList, options: MethodOptions): GaxiosPromise[SchemaChangeList] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeList]
  ): Unit = js.native
  /**
    * Lists the changes for a user or shared drive.
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
    *       'https://www.googleapis.com/auth/drive.apps.readonly',
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
    *   const res = await drive.changes.list({
    *     // The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier.
    *     driveId: 'placeholder-value',
    *     // Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    *     includeCorpusRemovals: 'placeholder-value',
    *     // Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    *     includeDeleted: 'placeholder-value',
    *     // Whether both My Drive and shared drive items should be included in results.
    *     includeItemsFromAllDrives: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether to include changes outside the My Drive hierarchy in the result. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive are omitted from the result.
    *     includeSubscribed: 'placeholder-value',
    *     // Deprecated use includeItemsFromAllDrives instead.
    *     includeTeamDriveItems: 'placeholder-value',
    *     // Maximum number of changes to return.
    *     maxResults: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    *     pageToken: 'placeholder-value',
    *     // A comma-separated list of spaces to query. Supported values are 'drive', 'appDataFolder' and 'photos'.
    *     spaces: 'placeholder-value',
    *     // Deprecated - use pageToken instead.
    *     startChangeId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Deprecated use driveId instead.
    *     teamDriveId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "largestChangeId": "my_largestChangeId",
    *   //   "newStartPageToken": "my_newStartPageToken",
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
  def list(params: ParamsResourceChangesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceChangesWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceChangesWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceChangesWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceChangesWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceChangesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Subscribe to changes for a user.
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
    *       'https://www.googleapis.com/auth/drive.apps.readonly',
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
    *   const res = await drive.changes.watch({
    *     // The shared drive from which changes are returned. If specified the change IDs will be reflective of the shared drive; use the combined drive ID and change ID as an identifier.
    *     driveId: 'placeholder-value',
    *     // Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    *     includeCorpusRemovals: 'placeholder-value',
    *     // Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    *     includeDeleted: 'placeholder-value',
    *     // Whether both My Drive and shared drive items should be included in results.
    *     includeItemsFromAllDrives: 'placeholder-value',
    *     // A comma-separated list of IDs of labels to include in the labelInfo part of the response.
    *     includeLabels: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // Whether to include changes outside the My Drive hierarchy in the result. When set to false, changes to files such as those in the Application Data folder or shared files which have not been added to My Drive are omitted from the result.
    *     includeSubscribed: 'placeholder-value',
    *     // Deprecated use includeItemsFromAllDrives instead.
    *     includeTeamDriveItems: 'placeholder-value',
    *     // Maximum number of changes to return.
    *     maxResults: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    *     pageToken: 'placeholder-value',
    *     // A comma-separated list of spaces to query. Supported values are 'drive', 'appDataFolder' and 'photos'.
    *     spaces: 'placeholder-value',
    *     // Deprecated - use pageToken instead.
    *     startChangeId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Deprecated use driveId instead.
    *     teamDriveId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": "my_address",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "params": {},
    *       //   "payload": false,
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceUri": "my_resourceUri",
    *       //   "token": "my_token",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "params": {},
    *   //   "payload": false,
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceUri": "my_resourceUri",
    *   //   "token": "my_token",
    *   //   "type": "my_type"
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
  def watch(params: ParamsResourceChangesWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceChangesWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
