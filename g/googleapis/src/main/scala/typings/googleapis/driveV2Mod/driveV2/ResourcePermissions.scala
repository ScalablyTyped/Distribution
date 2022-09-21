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

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Permissions")
@js.native
open class ResourcePermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePermissionsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a permission from a file or shared drive.
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
    *   const res = await drive.permissions.delete({
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID for the permission.
    *     permissionId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
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
  def delete(params: ParamsResourcePermissionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePermissionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def get(params: ParamsResourcePermissionsGet): GaxiosPromise[SchemaPermission] = js.native
  def get(params: ParamsResourcePermissionsGet, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: BodyResponseCallback[Readable | SchemaPermission],
    callback: BodyResponseCallback[Readable | SchemaPermission]
  ): Unit = js.native
  def get(params: ParamsResourcePermissionsGet, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  /**
    * Gets a permission by ID.
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
    *   const res = await drive.permissions.get({
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID for the permission.
    *     permissionId: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalRoles": [],
    *   //   "authKey": "my_authKey",
    *   //   "deleted": false,
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "etag": "my_etag",
    *   //   "expirationDate": "my_expirationDate",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "value": "my_value",
    *   //   "view": "my_view",
    *   //   "withLink": false
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
  def get(params: ParamsResourcePermissionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIdForEmail(): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(callback: BodyResponseCallback[SchemaPermissionId]): Unit = js.native
  def getIdForEmail(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail, callback: BodyResponseCallback[SchemaPermissionId]): Unit = js.native
  def getIdForEmail(
    params: ParamsResourcePermissionsGetidforemail,
    options: BodyResponseCallback[Readable | SchemaPermissionId],
    callback: BodyResponseCallback[Readable | SchemaPermissionId]
  ): Unit = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail, options: MethodOptions): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(
    params: ParamsResourcePermissionsGetidforemail,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermissionId]
  ): Unit = js.native
  /**
    * Returns the permission ID for an email address.
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
    *   const res = await drive.permissions.getIdForEmail({
    *     // The email address for which to return a permission ID
    *     email: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "kind": "my_kind"
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
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIdForEmail(
    params: ParamsResourcePermissionsGetidforemail,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPermission] = js.native
  def insert(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def insert(params: ParamsResourcePermissionsInsert): GaxiosPromise[SchemaPermission] = js.native
  def insert(params: ParamsResourcePermissionsInsert, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def insert(
    params: ParamsResourcePermissionsInsert,
    options: BodyResponseCallback[Readable | SchemaPermission],
    callback: BodyResponseCallback[Readable | SchemaPermission]
  ): Unit = js.native
  def insert(params: ParamsResourcePermissionsInsert, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def insert(
    params: ParamsResourcePermissionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  /**
    * Inserts a permission for a file or shared drive.
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
    *   const res = await drive.permissions.insert({
    *     // A plain text custom message to include in notification emails.
    *     emailMessage: 'placeholder-value',
    *     // Deprecated. See moveToNewOwnersRoot for details.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // This parameter will only take effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. If set to true, the item will be moved to the new owner's My Drive root folder and all prior parents removed. If set to false, parents are not changed.
    *     moveToNewOwnersRoot: 'placeholder-value',
    *     // Whether to send notification emails when sharing to users or groups. This parameter is ignored and an email is sent if the role is owner.
    *     sendNotificationEmails: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalRoles": [],
    *       //   "authKey": "my_authKey",
    *       //   "deleted": false,
    *       //   "domain": "my_domain",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "etag": "my_etag",
    *       //   "expirationDate": "my_expirationDate",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "pendingOwner": false,
    *       //   "permissionDetails": [],
    *       //   "photoLink": "my_photoLink",
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink",
    *       //   "teamDrivePermissionDetails": [],
    *       //   "type": "my_type",
    *       //   "value": "my_value",
    *       //   "view": "my_view",
    *       //   "withLink": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalRoles": [],
    *   //   "authKey": "my_authKey",
    *   //   "deleted": false,
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "etag": "my_etag",
    *   //   "expirationDate": "my_expirationDate",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "value": "my_value",
    *   //   "view": "my_view",
    *   //   "withLink": false
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
  def insert(params: ParamsResourcePermissionsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePermissionsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPermissionList] = js.native
  def list(callback: BodyResponseCallback[SchemaPermissionList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermissionList] = js.native
  def list(params: ParamsResourcePermissionsList): GaxiosPromise[SchemaPermissionList] = js.native
  def list(params: ParamsResourcePermissionsList, callback: BodyResponseCallback[SchemaPermissionList]): Unit = js.native
  def list(
    params: ParamsResourcePermissionsList,
    options: BodyResponseCallback[Readable | SchemaPermissionList],
    callback: BodyResponseCallback[Readable | SchemaPermissionList]
  ): Unit = js.native
  def list(params: ParamsResourcePermissionsList, options: MethodOptions): GaxiosPromise[SchemaPermissionList] = js.native
  def list(
    params: ParamsResourcePermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermissionList]
  ): Unit = js.native
  /**
    * Lists a file's or shared drive's permissions.
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
    *   const res = await drive.permissions.list({
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // The maximum number of permissions to return per page. When not set for files in a shared drive, at most 100 results will be returned. When not set for files that are not in a shared drive, the entire list will be returned.
    *     maxResults: 'placeholder-value',
    *     // The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    *     pageToken: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourcePermissionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePermissionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPermission] = js.native
  def patch(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def patch(params: ParamsResourcePermissionsPatch): GaxiosPromise[SchemaPermission] = js.native
  def patch(params: ParamsResourcePermissionsPatch, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def patch(
    params: ParamsResourcePermissionsPatch,
    options: BodyResponseCallback[Readable | SchemaPermission],
    callback: BodyResponseCallback[Readable | SchemaPermission]
  ): Unit = js.native
  def patch(params: ParamsResourcePermissionsPatch, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def patch(
    params: ParamsResourcePermissionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  /**
    * Updates a permission using patch semantics.
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
    *   const res = await drive.permissions.patch({
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID for the permission.
    *     permissionId: 'placeholder-value',
    *     // Whether to remove the expiration date.
    *     removeExpiration: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Whether changing a role to 'owner' downgrades the current owners to writers. Does nothing if the specified role is not 'owner'.
    *     transferOwnership: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalRoles": [],
    *       //   "authKey": "my_authKey",
    *       //   "deleted": false,
    *       //   "domain": "my_domain",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "etag": "my_etag",
    *       //   "expirationDate": "my_expirationDate",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "pendingOwner": false,
    *       //   "permissionDetails": [],
    *       //   "photoLink": "my_photoLink",
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink",
    *       //   "teamDrivePermissionDetails": [],
    *       //   "type": "my_type",
    *       //   "value": "my_value",
    *       //   "view": "my_view",
    *       //   "withLink": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalRoles": [],
    *   //   "authKey": "my_authKey",
    *   //   "deleted": false,
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "etag": "my_etag",
    *   //   "expirationDate": "my_expirationDate",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "value": "my_value",
    *   //   "view": "my_view",
    *   //   "withLink": false
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
  def patch(params: ParamsResourcePermissionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePermissionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPermission] = js.native
  def update(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def update(params: ParamsResourcePermissionsUpdate): GaxiosPromise[SchemaPermission] = js.native
  def update(params: ParamsResourcePermissionsUpdate, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def update(
    params: ParamsResourcePermissionsUpdate,
    options: BodyResponseCallback[Readable | SchemaPermission],
    callback: BodyResponseCallback[Readable | SchemaPermission]
  ): Unit = js.native
  def update(params: ParamsResourcePermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def update(
    params: ParamsResourcePermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  /**
    * Updates a permission.
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
    *   const res = await drive.permissions.update({
    *     // The ID for the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID for the permission.
    *     permissionId: 'placeholder-value',
    *     // Whether to remove the expiration date.
    *     removeExpiration: 'placeholder-value',
    *     // Whether the requesting application supports both My Drives and shared drives.
    *     supportsAllDrives: 'placeholder-value',
    *     // Deprecated use supportsAllDrives instead.
    *     supportsTeamDrives: 'placeholder-value',
    *     // Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect. File owners can only transfer ownership of files existing on My Drive. Files existing in a shared drive are owned by the organization that owns that shared drive. Ownership transfers are not supported for files and folders in shared drives. Organizers of a shared drive can move items from that shared drive into their My Drive which transfers the ownership to them.
    *     transferOwnership: 'placeholder-value',
    *     // Issue the request as a domain administrator; if set to true, then the requester will be granted access if the file ID parameter refers to a shared drive and the requester is an administrator of the domain to which the shared drive belongs.
    *     useDomainAdminAccess: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "additionalRoles": [],
    *       //   "authKey": "my_authKey",
    *       //   "deleted": false,
    *       //   "domain": "my_domain",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "etag": "my_etag",
    *       //   "expirationDate": "my_expirationDate",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "name": "my_name",
    *       //   "pendingOwner": false,
    *       //   "permissionDetails": [],
    *       //   "photoLink": "my_photoLink",
    *       //   "role": "my_role",
    *       //   "selfLink": "my_selfLink",
    *       //   "teamDrivePermissionDetails": [],
    *       //   "type": "my_type",
    *       //   "value": "my_value",
    *       //   "view": "my_view",
    *       //   "withLink": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "additionalRoles": [],
    *   //   "authKey": "my_authKey",
    *   //   "deleted": false,
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "etag": "my_etag",
    *   //   "expirationDate": "my_expirationDate",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "name": "my_name",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "selfLink": "my_selfLink",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "value": "my_value",
    *   //   "view": "my_view",
    *   //   "withLink": false
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
  def update(params: ParamsResourcePermissionsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePermissionsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
