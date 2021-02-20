package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Activities")
@js.native
class ResourceActivities protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * youtube.activities.insert
    * @desc Posts a bulletin for a specific channel. (The user submitting the
    * request must be authorized to act on the channel's behalf.)  Note: Even
    * though an activity resource can contain information about actions like a
    * user rating a video or marking a video as a favorite, you need to use
    * other API methods to generate those activity resources. For example, you
    * would use the API's videos.rate() method to rate a video and the
    * playlistItems.insert() method to mark a video as a favorite.
    * @alias youtube.activities.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include.
    * @param {().Activity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaActivity] = js.native
  def insert(callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def insert(params: ParamsResourceActivitiesInsert): GaxiosPromise[SchemaActivity] = js.native
  def insert(params: ParamsResourceActivitiesInsert, callback: BodyResponseCallback[SchemaActivity]): Unit = js.native
  def insert(
    params: ParamsResourceActivitiesInsert,
    options: BodyResponseCallback[SchemaActivity],
    callback: BodyResponseCallback[SchemaActivity]
  ): Unit = js.native
  def insert(params: ParamsResourceActivitiesInsert, options: MethodOptions): GaxiosPromise[SchemaActivity] = js.native
  def insert(
    params: ParamsResourceActivitiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivity]
  ): Unit = js.native
  
  /**
    * youtube.activities.list
    * @desc Returns a list of channel activity events that match the request
    * criteria. For example, you can retrieve events associated with a
    * particular channel, events associated with the user's subscriptions and
    * Google+ friends, or the YouTube home page feed, which is customized for
    * each user.
    * @alias youtube.activities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.channelId The channelId parameter specifies a unique YouTube channel ID. The API will then return a list of that channel's activities.
    * @param {boolean=} params.home Set this parameter's value to true to retrieve the activity feed that displays on the YouTube home page for the currently authenticated user.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {boolean=} params.mine Set this parameter's value to true to retrieve a feed of the authenticated user's activities.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more activity resource properties that the API response will include.  If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in an activity resource, the snippet property contains other properties that identify the type of activity, a display title for the activity, and so forth. If you set part=snippet, the API response will also contain all of those nested properties.
    * @param {string=} params.publishedAfter The publishedAfter parameter specifies the earliest date and time that an activity could have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be included in the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    * @param {string=} params.publishedBefore The publishedBefore parameter specifies the date and time before which an activity must have occurred for that activity to be included in the API response. If the parameter value specifies a day, but not a time, then any activities that occurred that day will be excluded from the result set. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    * @param {string=} params.regionCode The regionCode parameter instructs the API to return results for the specified country. The parameter value is an ISO 3166-1 alpha-2 country code. YouTube uses this value when the authorized user's previous activity on YouTube does not provide enough information to generate the activity feed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaActivityListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaActivityListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaActivityListResponse] = js.native
  def list(params: ParamsResourceActivitiesList): GaxiosPromise[SchemaActivityListResponse] = js.native
  def list(params: ParamsResourceActivitiesList, callback: BodyResponseCallback[SchemaActivityListResponse]): Unit = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: BodyResponseCallback[SchemaActivityListResponse],
    callback: BodyResponseCallback[SchemaActivityListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceActivitiesList, options: MethodOptions): GaxiosPromise[SchemaActivityListResponse] = js.native
  def list(
    params: ParamsResourceActivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaActivityListResponse]
  ): Unit = js.native
}
