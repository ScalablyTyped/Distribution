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

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Permissions")
@js.native
open class ResourcePermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaPermission] = js.native
  def create(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def create(params: ParamsResourcePermissionsCreate): GaxiosPromise[SchemaPermission] = js.native
  def create(params: ParamsResourcePermissionsCreate, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def create(
    params: ParamsResourcePermissionsCreate,
    options: BodyResponseCallback[Readable | SchemaPermission],
    callback: BodyResponseCallback[Readable | SchemaPermission]
  ): Unit = js.native
  def create(params: ParamsResourcePermissionsCreate, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def create(
    params: ParamsResourcePermissionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  /**
    * Creates a permission for a file or shared drive.
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
    *   const res = await drive.permissions.create({
    *     // A plain text custom message to include in the notification email.
    *     emailMessage: 'placeholder-value',
    *     // Deprecated. See moveToNewOwnersRoot for details.
    *     enforceSingleParent: 'placeholder-value',
    *     // The ID of the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // This parameter will only take effect if the item is not in a shared drive and the request is attempting to transfer the ownership of the item. If set to true, the item will be moved to the new owner's My Drive root folder and all prior parents removed. If set to false, parents are not changed.
    *     moveToNewOwnersRoot: 'placeholder-value',
    *     // Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other requests. It must not be disabled for ownership transfers.
    *     sendNotificationEmail: 'placeholder-value',
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
    *       //   "allowFileDiscovery": false,
    *       //   "deleted": false,
    *       //   "displayName": "my_displayName",
    *       //   "domain": "my_domain",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "pendingOwner": false,
    *       //   "permissionDetails": [],
    *       //   "photoLink": "my_photoLink",
    *       //   "role": "my_role",
    *       //   "teamDrivePermissionDetails": [],
    *       //   "type": "my_type",
    *       //   "view": "my_view"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowFileDiscovery": false,
    *   //   "deleted": false,
    *   //   "displayName": "my_displayName",
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "view": "my_view"
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
  def create(params: ParamsResourcePermissionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourcePermissionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Deletes a permission.
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
    *   const res = await drive.permissions.delete({
    *     // The ID of the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID of the permission.
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
    * const drive = google.drive('v3');
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
    *     // The ID of the file.
    *     fileId: 'placeholder-value',
    *     // The ID of the permission.
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
    *   //   "allowFileDiscovery": false,
    *   //   "deleted": false,
    *   //   "displayName": "my_displayName",
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "view": "my_view"
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
    * const drive = google.drive('v3');
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
    *     // The ID of the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // Specifies which additional view's permissions to include in the response. Only 'published' is supported.
    *     includePermissionsForView: 'placeholder-value',
    *     // The maximum number of permissions to return per page. When not set for files in a shared drive, at most 100 results will be returned. When not set for files that are not in a shared drive, the entire list will be returned.
    *     pageSize: 'placeholder-value',
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
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "permissions": []
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
    * Updates a permission with patch semantics.
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
    *   const res = await drive.permissions.update({
    *     // The ID of the file or shared drive.
    *     fileId: 'placeholder-value',
    *     // The ID of the permission.
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
    *       //   "allowFileDiscovery": false,
    *       //   "deleted": false,
    *       //   "displayName": "my_displayName",
    *       //   "domain": "my_domain",
    *       //   "emailAddress": "my_emailAddress",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "pendingOwner": false,
    *       //   "permissionDetails": [],
    *       //   "photoLink": "my_photoLink",
    *       //   "role": "my_role",
    *       //   "teamDrivePermissionDetails": [],
    *       //   "type": "my_type",
    *       //   "view": "my_view"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allowFileDiscovery": false,
    *   //   "deleted": false,
    *   //   "displayName": "my_displayName",
    *   //   "domain": "my_domain",
    *   //   "emailAddress": "my_emailAddress",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "pendingOwner": false,
    *   //   "permissionDetails": [],
    *   //   "photoLink": "my_photoLink",
    *   //   "role": "my_role",
    *   //   "teamDrivePermissionDetails": [],
    *   //   "type": "my_type",
    *   //   "view": "my_view"
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
