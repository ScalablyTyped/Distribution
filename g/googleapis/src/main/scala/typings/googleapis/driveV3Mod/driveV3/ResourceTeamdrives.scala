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

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Teamdrives")
@js.native
open class ResourceTeamdrives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(params: ParamsResourceTeamdrivesCreate): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(params: ParamsResourceTeamdrivesCreate, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def create(
    params: ParamsResourceTeamdrivesCreate,
    options: BodyResponseCallback[Readable | SchemaTeamDrive],
    callback: BodyResponseCallback[Readable | SchemaTeamDrive]
  ): Unit = js.native
  def create(params: ParamsResourceTeamdrivesCreate, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(
    params: ParamsResourceTeamdrivesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  /**
    * Deprecated use drives.create instead.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.teamdrives.create({
    *     // An ID, such as a random UUID, which uniquely identifies this user's request for idempotent creation of a Team Drive. A repeated request by the same user and with the same request ID will avoid creating duplicates by attempting to create the same Team Drive. If the Team Drive already exists a 409 error will be returned.
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
    *       //   "createdTime": "my_createdTime",
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
    *   //   "createdTime": "my_createdTime",
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
  def create(params: ParamsResourceTeamdrivesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceTeamdrivesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTeamdrivesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTeamdrivesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTeamdrivesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTeamdrivesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceTeamdrivesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deprecated use drives.delete instead.
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.teamdrives.delete({
    *     // The ID of the Team Drive
    *     teamDriveId: 'placeholder-value',
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
  def delete(params: ParamsResourceTeamdrivesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceTeamdrivesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(params: ParamsResourceTeamdrivesGet): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(params: ParamsResourceTeamdrivesGet, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def get(
    params: ParamsResourceTeamdrivesGet,
    options: BodyResponseCallback[Readable | SchemaTeamDrive],
    callback: BodyResponseCallback[Readable | SchemaTeamDrive]
  ): Unit = js.native
  def get(params: ParamsResourceTeamdrivesGet, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(
    params: ParamsResourceTeamdrivesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  /**
    * Deprecated use drives.get instead.
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
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.teamdrives.get({
    *     // The ID of the Team Drive
    *     teamDriveId: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
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
    *   //   "createdTime": "my_createdTime",
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
  def get(params: ParamsResourceTeamdrivesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTeamdrivesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(callback: BodyResponseCallback[SchemaTeamDriveList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(params: ParamsResourceTeamdrivesList): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(params: ParamsResourceTeamdrivesList, callback: BodyResponseCallback[SchemaTeamDriveList]): Unit = js.native
  def list(
    params: ParamsResourceTeamdrivesList,
    options: BodyResponseCallback[Readable | SchemaTeamDriveList],
    callback: BodyResponseCallback[Readable | SchemaTeamDriveList]
  ): Unit = js.native
  def list(params: ParamsResourceTeamdrivesList, options: MethodOptions): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(
    params: ParamsResourceTeamdrivesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDriveList]
  ): Unit = js.native
  /**
    * Deprecated use drives.list instead.
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
    *       'https://www.googleapis.com/auth/drive.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.teamdrives.list({
    *     // Maximum number of Team Drives to return.
    *     pageSize: 'placeholder-value',
    *     // Page token for Team Drives.
    *     pageToken: 'placeholder-value',
    *     // Query string for searching Team Drives.
    *     q: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then all Team Drives of the domain in which the requester is an administrator are returned.
    *     useDomainAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "teamDrives": []
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
  def list(params: ParamsResourceTeamdrivesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceTeamdrivesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(params: ParamsResourceTeamdrivesUpdate): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(params: ParamsResourceTeamdrivesUpdate, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def update(
    params: ParamsResourceTeamdrivesUpdate,
    options: BodyResponseCallback[Readable | SchemaTeamDrive],
    callback: BodyResponseCallback[Readable | SchemaTeamDrive]
  ): Unit = js.native
  def update(params: ParamsResourceTeamdrivesUpdate, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(
    params: ParamsResourceTeamdrivesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  /**
    * Deprecated use drives.update instead
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
    *     scopes: ['https://www.googleapis.com/auth/drive'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drive.teamdrives.update({
    *     // The ID of the Team Drive
    *     teamDriveId: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
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
    *       //   "createdTime": "my_createdTime",
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
    *   //   "createdTime": "my_createdTime",
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
  def update(params: ParamsResourceTeamdrivesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceTeamdrivesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
