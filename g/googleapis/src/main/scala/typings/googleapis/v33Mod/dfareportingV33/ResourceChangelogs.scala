package typings.googleapis.v33Mod.dfareportingV33

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Changelogs")
@js.native
class ResourceChangelogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.changeLogs.get
    * @desc Gets one change log by ID.
    * @alias dfareporting.changeLogs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Change log ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaChangeLog] = js.native
  def get(callback: BodyResponseCallback[SchemaChangeLog]): Unit = js.native
  def get(params: ParamsResourceChangelogsGet): GaxiosPromise[SchemaChangeLog] = js.native
  def get(params: ParamsResourceChangelogsGet, callback: BodyResponseCallback[SchemaChangeLog]): Unit = js.native
  def get(
    params: ParamsResourceChangelogsGet,
    options: BodyResponseCallback[SchemaChangeLog],
    callback: BodyResponseCallback[SchemaChangeLog]
  ): Unit = js.native
  def get(params: ParamsResourceChangelogsGet, options: MethodOptions): GaxiosPromise[SchemaChangeLog] = js.native
  def get(
    params: ParamsResourceChangelogsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeLog]
  ): Unit = js.native
  /**
    * dfareporting.changeLogs.list
    * @desc Retrieves a list of change logs. This method supports paging.
    * @alias dfareporting.changeLogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.action Select only change logs with the specified action.
    * @param {string=} params.ids Select only change logs with these IDs.
    * @param {string=} params.maxChangeTime Select only change logs whose change time is before the specified maxChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.minChangeTime Select only change logs whose change time is before the specified minChangeTime.The time should be formatted as an RFC3339 date/time string. For example, for 10:54 PM on July 18th, 2015, in the America/New York time zone, the format is "2015-07-18T22:54:00-04:00". In other words, the year, month, day, the letter T, the hour (24-hour clock system), minute, second, and then the time zone offset.
    * @param {string=} params.objectIds Select only change logs with these object IDs.
    * @param {string=} params.objectType Select only change logs with the specified object type.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Select only change logs whose object ID, user name, old or new values match the search string.
    * @param {string=} params.userProfileIds Select only change logs with these user profile IDs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChangeLogsListResponse]): Unit = js.native
  def list(params: ParamsResourceChangelogsList): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(params: ParamsResourceChangelogsList, callback: BodyResponseCallback[SchemaChangeLogsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChangelogsList,
    options: BodyResponseCallback[SchemaChangeLogsListResponse],
    callback: BodyResponseCallback[SchemaChangeLogsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChangelogsList, options: MethodOptions): GaxiosPromise[SchemaChangeLogsListResponse] = js.native
  def list(
    params: ParamsResourceChangelogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangeLogsListResponse]
  ): Unit = js.native
}

