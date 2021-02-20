package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Teamdrives")
@js.native
class ResourceTeamdrives protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.teamdrives.create
    * @desc Creates a new Team Drive.
    * @alias drive.teamdrives.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.requestId An ID, such as a random UUID, which uniquely identifies this user's request for idempotent creation of a Team Drive. A repeated request by the same user and with the same request ID will avoid creating duplicates by attempting to create the same Team Drive. If the Team Drive already exists a 409 error will be returned.
    * @param {().TeamDrive} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(params: ParamsResourceTeamdrivesCreate): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(params: ParamsResourceTeamdrivesCreate, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def create(
    params: ParamsResourceTeamdrivesCreate,
    options: BodyResponseCallback[SchemaTeamDrive],
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  def create(params: ParamsResourceTeamdrivesCreate, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def create(
    params: ParamsResourceTeamdrivesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  
  /**
    * drive.teamdrives.delete
    * @desc Permanently deletes a Team Drive for which the user is an
    * organizer. The Team Drive cannot contain any untrashed items.
    * @alias drive.teamdrives.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTeamdrivesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTeamdrivesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTeamdrivesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTeamdrivesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceTeamdrivesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * drive.teamdrives.get
    * @desc Gets a Team Drive's metadata by ID.
    * @alias drive.teamdrives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(params: ParamsResourceTeamdrivesGet): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(params: ParamsResourceTeamdrivesGet, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def get(
    params: ParamsResourceTeamdrivesGet,
    options: BodyResponseCallback[SchemaTeamDrive],
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  def get(params: ParamsResourceTeamdrivesGet, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def get(
    params: ParamsResourceTeamdrivesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  
  /**
    * drive.teamdrives.list
    * @desc Lists the user's Team Drives.
    * @alias drive.teamdrives.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of Team Drives to return.
    * @param {string=} params.pageToken Page token for Team Drives.
    * @param {string=} params.q Query string for searching Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then all Team Drives of the domain in which the requester is an administrator are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(callback: BodyResponseCallback[SchemaTeamDriveList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(params: ParamsResourceTeamdrivesList): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(params: ParamsResourceTeamdrivesList, callback: BodyResponseCallback[SchemaTeamDriveList]): Unit = js.native
  def list(
    params: ParamsResourceTeamdrivesList,
    options: BodyResponseCallback[SchemaTeamDriveList],
    callback: BodyResponseCallback[SchemaTeamDriveList]
  ): Unit = js.native
  def list(params: ParamsResourceTeamdrivesList, options: MethodOptions): GaxiosPromise[SchemaTeamDriveList] = js.native
  def list(
    params: ParamsResourceTeamdrivesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDriveList]
  ): Unit = js.native
  
  /**
    * drive.teamdrives.update
    * @desc Updates a Team Drive's metadata
    * @alias drive.teamdrives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
    * @param {().TeamDrive} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(params: ParamsResourceTeamdrivesUpdate): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(params: ParamsResourceTeamdrivesUpdate, callback: BodyResponseCallback[SchemaTeamDrive]): Unit = js.native
  def update(
    params: ParamsResourceTeamdrivesUpdate,
    options: BodyResponseCallback[SchemaTeamDrive],
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
  def update(params: ParamsResourceTeamdrivesUpdate, options: MethodOptions): GaxiosPromise[SchemaTeamDrive] = js.native
  def update(
    params: ParamsResourceTeamdrivesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTeamDrive]
  ): Unit = js.native
}
