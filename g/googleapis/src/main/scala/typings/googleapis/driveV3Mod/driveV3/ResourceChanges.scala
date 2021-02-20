package typings.googleapis.driveV3Mod.driveV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Changes")
@js.native
class ResourceChanges protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * drive.changes.getStartPageToken
    * @desc Gets the starting pageToken for listing future changes.
    * @alias drive.changes.getStartPageToken
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The ID of the Team Drive for which the starting pageToken for listing future changes from that Team Drive will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStartPageToken(): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(callback: BodyResponseCallback[SchemaStartPageToken]): Unit = js.native
  def getStartPageToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(params: ParamsResourceChangesGetstartpagetoken): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    callback: BodyResponseCallback[SchemaStartPageToken]
  ): Unit = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    options: BodyResponseCallback[SchemaStartPageToken],
    callback: BodyResponseCallback[SchemaStartPageToken]
  ): Unit = js.native
  def getStartPageToken(params: ParamsResourceChangesGetstartpagetoken, options: MethodOptions): GaxiosPromise[SchemaStartPageToken] = js.native
  def getStartPageToken(
    params: ParamsResourceChangesGetstartpagetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStartPageToken]
  ): Unit = js.native
  
  /**
    * drive.changes.list
    * @desc Lists the changes for a user or Team Drive.
    * @alias drive.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeCorpusRemovals Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    * @param {boolean=} params.includeRemoved Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive files or changes should be included in results.
    * @param {integer=} params.pageSize The maximum number of changes to return per page.
    * @param {string} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    * @param {boolean=} params.restrictToMyDrive Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not been added to My Drive.
    * @param {string=} params.spaces A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The Team Drive from which changes will be returned. If specified the change IDs will be reflective of the Team Drive; use the combined Team Drive ID and change ID as an identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChangeList] = js.native
  def list(callback: BodyResponseCallback[SchemaChangeList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChangeList] = js.native
  def list(params: ParamsResourceChangesList): GaxiosPromise[SchemaChangeList] = js.native
  def list(params: ParamsResourceChangesList, callback: BodyResponseCallback[SchemaChangeList]): Unit = js.native
  def list(
    params: ParamsResourceChangesList,
    options: BodyResponseCallback[SchemaChangeList],
    callback: BodyResponseCallback[SchemaChangeList]
  ): Unit = js.native
  def list(params: ParamsResourceChangesList, options: MethodOptions): GaxiosPromise[SchemaChangeList] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeList]
  ): Unit = js.native
  
  /**
    * drive.changes.watch
    * @desc Subscribes to changes for a user.
    * @alias drive.changes.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeCorpusRemovals Whether changes should include the file resource if the file is still accessible by the user at the time of the request, even when a file was removed from the list of changes and there will be no further change entries for this file.
    * @param {boolean=} params.includeRemoved Whether to include changes indicating that items have been removed from the list of changes, for example by deletion or loss of access.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive files or changes should be included in results.
    * @param {integer=} params.pageSize The maximum number of changes to return per page.
    * @param {string} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response or to the response from the getStartPageToken method.
    * @param {boolean=} params.restrictToMyDrive Whether to restrict the results to changes inside the My Drive hierarchy. This omits changes to files such as those in the Application Data folder or shared files which have not been added to My Drive.
    * @param {string=} params.spaces A comma-separated list of spaces to query within the user corpus. Supported values are 'drive', 'appDataFolder' and 'photos'.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId The Team Drive from which changes will be returned. If specified the change IDs will be reflective of the Team Drive; use the combined Team Drive ID and change ID as an identifier.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceChangesWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceChangesWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceChangesWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceChangesWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceChangesWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
