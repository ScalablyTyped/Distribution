package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Eventtags")
@js.native
class ResourceEventtags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.eventTags.delete
    * @desc Deletes an existing event tag.
    * @alias dfareporting.eventTags.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Event tag ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventtagsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventtagsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEventtagsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEventtagsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceEventtagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.eventTags.get
    * @desc Gets one event tag by ID.
    * @alias dfareporting.eventTags.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Event tag ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEventTag] = js.native
  def get(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def get(params: ParamsResourceEventtagsGet): GaxiosPromise[SchemaEventTag] = js.native
  def get(params: ParamsResourceEventtagsGet, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def get(
    params: ParamsResourceEventtagsGet,
    options: BodyResponseCallback[SchemaEventTag],
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  def get(params: ParamsResourceEventtagsGet, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def get(
    params: ParamsResourceEventtagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * dfareporting.eventTags.insert
    * @desc Inserts a new event tag.
    * @alias dfareporting.eventTags.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().EventTag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEventTag] = js.native
  def insert(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def insert(params: ParamsResourceEventtagsInsert): GaxiosPromise[SchemaEventTag] = js.native
  def insert(params: ParamsResourceEventtagsInsert, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def insert(
    params: ParamsResourceEventtagsInsert,
    options: BodyResponseCallback[SchemaEventTag],
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  def insert(params: ParamsResourceEventtagsInsert, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def insert(
    params: ParamsResourceEventtagsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * dfareporting.eventTags.list
    * @desc Retrieves a list of event tags, possibly filtered.
    * @alias dfareporting.eventTags.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.adId Select only event tags that belong to this ad.
    * @param {string=} params.advertiserId Select only event tags that belong to this advertiser.
    * @param {string=} params.campaignId Select only event tags that belong to this campaign.
    * @param {boolean=} params.definitionsOnly Examine only the specified campaign or advertiser's event tags for matching selector criteria. When set to false, the parent advertiser and parent campaign of the specified ad or campaign is examined as well. In addition, when set to false, the status field is examined as well, along with the enabledByDefault field. This parameter can not be set to true when adId is specified as ads do not define their own even tags.
    * @param {boolean=} params.enabled Select only enabled event tags. What is considered enabled or disabled depends on the definitionsOnly parameter. When definitionsOnly is set to true, only the specified advertiser or campaign's event tags' enabledByDefault field is examined. When definitionsOnly is set to false, the specified ad or specified campaign's parent advertiser's or parent campaign's event tags' enabledByDefault and status fields are examined as well.
    * @param {string=} params.eventTagTypes Select only event tags with the specified event tag types. Event tag types can be used to specify whether to use a third-party pixel, a third-party JavaScript URL, or a third-party click-through URL for either impression or click tracking.
    * @param {string=} params.ids Select only event tags with these IDs.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "eventtag*2015" will return objects with names like "eventtag June 2015", "eventtag April 2015", or simply "eventtag 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "eventtag" will match objects with name "my eventtag", "eventtag 2015", or simply "eventtag".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaEventTagsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(params: ParamsResourceEventtagsList): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(params: ParamsResourceEventtagsList, callback: BodyResponseCallback[SchemaEventTagsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceEventtagsList,
    options: BodyResponseCallback[SchemaEventTagsListResponse],
    callback: BodyResponseCallback[SchemaEventTagsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEventtagsList, options: MethodOptions): GaxiosPromise[SchemaEventTagsListResponse] = js.native
  def list(
    params: ParamsResourceEventtagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTagsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.eventTags.patch
    * @desc Updates an existing event tag. This method supports patch
    * semantics.
    * @alias dfareporting.eventTags.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Event tag ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().EventTag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaEventTag] = js.native
  def patch(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def patch(params: ParamsResourceEventtagsPatch): GaxiosPromise[SchemaEventTag] = js.native
  def patch(params: ParamsResourceEventtagsPatch, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def patch(
    params: ParamsResourceEventtagsPatch,
    options: BodyResponseCallback[SchemaEventTag],
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  def patch(params: ParamsResourceEventtagsPatch, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def patch(
    params: ParamsResourceEventtagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  /**
    * dfareporting.eventTags.update
    * @desc Updates an existing event tag.
    * @alias dfareporting.eventTags.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().EventTag} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEventTag] = js.native
  def update(callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def update(params: ParamsResourceEventtagsUpdate): GaxiosPromise[SchemaEventTag] = js.native
  def update(params: ParamsResourceEventtagsUpdate, callback: BodyResponseCallback[SchemaEventTag]): Unit = js.native
  def update(
    params: ParamsResourceEventtagsUpdate,
    options: BodyResponseCallback[SchemaEventTag],
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
  def update(params: ParamsResourceEventtagsUpdate, options: MethodOptions): GaxiosPromise[SchemaEventTag] = js.native
  def update(
    params: ParamsResourceEventtagsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEventTag]
  ): Unit = js.native
}

