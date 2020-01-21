package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Floodlightactivities")
@js.native
class ResourceFloodlightactivities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.floodlightActivities.delete
    * @desc Deletes an existing floodlight activity.
    * @alias dfareporting.floodlightActivities.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceFloodlightactivitiesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceFloodlightactivitiesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceFloodlightactivitiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.generatetag
    * @desc Generates a tag for a floodlight activity.
    * @alias dfareporting.floodlightActivities.generatetag
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.floodlightActivityId Floodlight activity ID for which we want to generate a tag.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generatetag(): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]): Unit = js.native
  def generatetag(params: ParamsResourceFloodlightactivitiesGeneratetag): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    options: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse],
    callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  def generatetag(params: ParamsResourceFloodlightactivitiesGeneratetag, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesGenerateTagResponse] = js.native
  def generatetag(
    params: ParamsResourceFloodlightactivitiesGeneratetag,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesGenerateTagResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.get
    * @desc Gets one floodlight activity by ID.
    * @alias dfareporting.floodlightActivities.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def get(params: ParamsResourceFloodlightactivitiesGet): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    options: BodyResponseCallback[SchemaFloodlightActivity],
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def get(params: ParamsResourceFloodlightactivitiesGet, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def get(
    params: ParamsResourceFloodlightactivitiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.insert
    * @desc Inserts a new floodlight activity.
    * @alias dfareporting.floodlightActivities.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def insert(params: ParamsResourceFloodlightactivitiesInsert): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    options: BodyResponseCallback[SchemaFloodlightActivity],
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def insert(params: ParamsResourceFloodlightactivitiesInsert, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def insert(
    params: ParamsResourceFloodlightactivitiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.list
    * @desc Retrieves a list of floodlight activities, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.floodlightActivities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserId Select only floodlight activities for the specified advertiser ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.floodlightActivityGroupIds Select only floodlight activities with the specified floodlight activity group IDs.
    * @param {string=} params.floodlightActivityGroupName Select only floodlight activities with the specified floodlight activity group name.
    * @param {string=} params.floodlightActivityGroupTagString Select only floodlight activities with the specified floodlight activity group tag string.
    * @param {string=} params.floodlightActivityGroupType Select only floodlight activities with the specified floodlight activity group type.
    * @param {string=} params.floodlightConfigurationId Select only floodlight activities for the specified floodlight configuration ID. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {string=} params.ids Select only floodlight activities with the specified IDs. Must specify either ids, advertiserId, or floodlightConfigurationId for a non-empty result.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "floodlightactivity*2015" will return objects with names like "floodlightactivity June 2015", "floodlightactivity April 2015", or simply "floodlightactivity 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "floodlightactivity" will match objects with name "my floodlightactivity activity", "floodlightactivity 2015", or simply "floodlightactivity".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.tagString Select only floodlight activities with the specified tag string.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]): Unit = js.native
  def list(params: ParamsResourceFloodlightactivitiesList): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    options: BodyResponseCallback[SchemaFloodlightActivitiesListResponse],
    callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceFloodlightactivitiesList, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivitiesListResponse] = js.native
  def list(
    params: ParamsResourceFloodlightactivitiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivitiesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.patch
    * @desc Updates an existing floodlight activity. This method supports patch
    * semantics.
    * @alias dfareporting.floodlightActivities.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight activity ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def patch(params: ParamsResourceFloodlightactivitiesPatch): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    options: BodyResponseCallback[SchemaFloodlightActivity],
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def patch(params: ParamsResourceFloodlightactivitiesPatch, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def patch(
    params: ParamsResourceFloodlightactivitiesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  /**
    * dfareporting.floodlightActivities.update
    * @desc Updates an existing floodlight activity.
    * @alias dfareporting.floodlightActivities.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightActivity} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(callback: BodyResponseCallback[SchemaFloodlightActivity]): Unit = js.native
  def update(params: ParamsResourceFloodlightactivitiesUpdate): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    options: BodyResponseCallback[SchemaFloodlightActivity],
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
  def update(params: ParamsResourceFloodlightactivitiesUpdate, options: MethodOptions): GaxiosPromise[SchemaFloodlightActivity] = js.native
  def update(
    params: ParamsResourceFloodlightactivitiesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFloodlightActivity]
  ): Unit = js.native
}

