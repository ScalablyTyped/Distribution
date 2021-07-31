package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Permissions")
@js.native
class ResourcePermissions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.permissions.delete
    * @desc Deletes a permission from a file or Team Drive.
    * @alias drive.permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePermissionsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePermissionsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePermissionsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePermissionsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourcePermissionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * drive.permissions.get
    * @desc Gets a permission by ID.
    * @alias drive.permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def get(params: ParamsResourcePermissionsGet): GaxiosPromise[SchemaPermission] = js.native
  def get(params: ParamsResourcePermissionsGet, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: BodyResponseCallback[SchemaPermission],
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  def get(params: ParamsResourcePermissionsGet, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  
  /**
    * drive.permissions.getIdForEmail
    * @desc Returns the permission ID for an email address.
    * @alias drive.permissions.getIdForEmail
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.email The email address for which to return a permission ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIdForEmail(): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(callback: BodyResponseCallback[SchemaPermissionId]): Unit = js.native
  def getIdForEmail(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail, callback: BodyResponseCallback[SchemaPermissionId]): Unit = js.native
  def getIdForEmail(
    params: ParamsResourcePermissionsGetidforemail,
    options: BodyResponseCallback[SchemaPermissionId],
    callback: BodyResponseCallback[SchemaPermissionId]
  ): Unit = js.native
  def getIdForEmail(params: ParamsResourcePermissionsGetidforemail, options: MethodOptions): GaxiosPromise[SchemaPermissionId] = js.native
  def getIdForEmail(
    params: ParamsResourcePermissionsGetidforemail,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermissionId]
  ): Unit = js.native
  
  /**
    * drive.permissions.insert
    * @desc Inserts a permission for a file or Team Drive.
    * @alias drive.permissions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.emailMessage A plain text custom message to include in notification emails.
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {boolean=} params.sendNotificationEmails Whether to send notification emails when sharing to users or groups. This parameter is ignored and an email is sent if the role is owner.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPermission] = js.native
  def insert(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def insert(params: ParamsResourcePermissionsInsert): GaxiosPromise[SchemaPermission] = js.native
  def insert(params: ParamsResourcePermissionsInsert, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def insert(
    params: ParamsResourcePermissionsInsert,
    options: BodyResponseCallback[SchemaPermission],
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  def insert(params: ParamsResourcePermissionsInsert, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def insert(
    params: ParamsResourcePermissionsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  
  /**
    * drive.permissions.list
    * @desc Lists a file's or Team Drive's permissions.
    * @alias drive.permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {integer=} params.maxResults The maximum number of permissions to return per page. When not set for files in a Team Drive, at most 100 results will be returned. When not set for files that are not in a Team Drive, the entire list will be returned.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPermissionList] = js.native
  def list(callback: BodyResponseCallback[SchemaPermissionList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermissionList] = js.native
  def list(params: ParamsResourcePermissionsList): GaxiosPromise[SchemaPermissionList] = js.native
  def list(params: ParamsResourcePermissionsList, callback: BodyResponseCallback[SchemaPermissionList]): Unit = js.native
  def list(
    params: ParamsResourcePermissionsList,
    options: BodyResponseCallback[SchemaPermissionList],
    callback: BodyResponseCallback[SchemaPermissionList]
  ): Unit = js.native
  def list(params: ParamsResourcePermissionsList, options: MethodOptions): GaxiosPromise[SchemaPermissionList] = js.native
  def list(
    params: ParamsResourcePermissionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermissionList]
  ): Unit = js.native
  
  /**
    * drive.permissions.patch
    * @desc Updates a permission using patch semantics.
    * @alias drive.permissions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.removeExpiration Whether to remove the expiration date.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether changing a role to 'owner' downgrades the current owners to writers. Does nothing if the specified role is not 'owner'.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPermission] = js.native
  def patch(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def patch(params: ParamsResourcePermissionsPatch): GaxiosPromise[SchemaPermission] = js.native
  def patch(params: ParamsResourcePermissionsPatch, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def patch(
    params: ParamsResourcePermissionsPatch,
    options: BodyResponseCallback[SchemaPermission],
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  def patch(params: ParamsResourcePermissionsPatch, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def patch(
    params: ParamsResourcePermissionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  
  /**
    * drive.permissions.update
    * @desc Updates a permission.
    * @alias drive.permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.removeExpiration Whether to remove the expiration date.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether changing a role to 'owner' downgrades the current owners to writers. Does nothing if the specified role is not 'owner'.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPermission] = js.native
  def update(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def update(params: ParamsResourcePermissionsUpdate): GaxiosPromise[SchemaPermission] = js.native
  def update(params: ParamsResourcePermissionsUpdate, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def update(
    params: ParamsResourcePermissionsUpdate,
    options: BodyResponseCallback[SchemaPermission],
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  def update(params: ParamsResourcePermissionsUpdate, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def update(
    params: ParamsResourcePermissionsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
}
