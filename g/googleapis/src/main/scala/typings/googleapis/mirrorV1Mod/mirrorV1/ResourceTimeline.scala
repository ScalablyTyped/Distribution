package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Timeline")
@js.native
class ResourceTimeline protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var attachments: ResourceTimelineAttachments = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * mirror.timeline.delete
    * @desc Deletes a timeline item.
    * @alias mirror.timeline.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTimelineDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTimelineDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceTimelineDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceTimelineDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceTimelineDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * mirror.timeline.get
    * @desc Gets a single timeline item by ID.
    * @alias mirror.timeline.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTimelineItem] = js.native
  def get(callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def get(params: ParamsResourceTimelineGet): GaxiosPromise[SchemaTimelineItem] = js.native
  def get(params: ParamsResourceTimelineGet, callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def get(
    params: ParamsResourceTimelineGet,
    options: BodyResponseCallback[SchemaTimelineItem],
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  def get(params: ParamsResourceTimelineGet, options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def get(
    params: ParamsResourceTimelineGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  
  /**
    * mirror.timeline.insert
    * @desc Inserts a new item into the timeline.
    * @alias mirror.timeline.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaTimelineItem] = js.native
  def insert(callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def insert(params: ParamsResourceTimelineInsert): GaxiosPromise[SchemaTimelineItem] = js.native
  def insert(params: ParamsResourceTimelineInsert, callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def insert(
    params: ParamsResourceTimelineInsert,
    options: BodyResponseCallback[SchemaTimelineItem],
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  def insert(params: ParamsResourceTimelineInsert, options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def insert(
    params: ParamsResourceTimelineInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  
  /**
    * mirror.timeline.list
    * @desc Retrieves a list of timeline items for the authenticated user.
    * @alias mirror.timeline.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.bundleId If provided, only items with the given bundleId will be returned.
    * @param {boolean=} params.includeDeleted If true, tombstone records for deleted items will be returned.
    * @param {integer=} params.maxResults The maximum number of items to include in the response, used for paging.
    * @param {string=} params.orderBy Controls the order in which timeline items are returned.
    * @param {string=} params.pageToken Token for the page of results to return.
    * @param {boolean=} params.pinnedOnly If true, only pinned items will be returned.
    * @param {string=} params.sourceItemId If provided, only items with the given sourceItemId will be returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTimelineListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTimelineListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTimelineListResponse] = js.native
  def list(params: ParamsResourceTimelineList): GaxiosPromise[SchemaTimelineListResponse] = js.native
  def list(params: ParamsResourceTimelineList, callback: BodyResponseCallback[SchemaTimelineListResponse]): Unit = js.native
  def list(
    params: ParamsResourceTimelineList,
    options: BodyResponseCallback[SchemaTimelineListResponse],
    callback: BodyResponseCallback[SchemaTimelineListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTimelineList, options: MethodOptions): GaxiosPromise[SchemaTimelineListResponse] = js.native
  def list(
    params: ParamsResourceTimelineList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTimelineListResponse]
  ): Unit = js.native
  
  /**
    * mirror.timeline.patch
    * @desc Updates a timeline item in place. This method supports patch
    * semantics.
    * @alias mirror.timeline.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param {().TimelineItem} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTimelineItem] = js.native
  def patch(callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def patch(params: ParamsResourceTimelinePatch): GaxiosPromise[SchemaTimelineItem] = js.native
  def patch(params: ParamsResourceTimelinePatch, callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def patch(
    params: ParamsResourceTimelinePatch,
    options: BodyResponseCallback[SchemaTimelineItem],
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  def patch(params: ParamsResourceTimelinePatch, options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def patch(
    params: ParamsResourceTimelinePatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  
  /**
    * mirror.timeline.update
    * @desc Updates a timeline item in place.
    * @alias mirror.timeline.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the timeline item.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaTimelineItem] = js.native
  def update(callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def update(params: ParamsResourceTimelineUpdate): GaxiosPromise[SchemaTimelineItem] = js.native
  def update(params: ParamsResourceTimelineUpdate, callback: BodyResponseCallback[SchemaTimelineItem]): Unit = js.native
  def update(
    params: ParamsResourceTimelineUpdate,
    options: BodyResponseCallback[SchemaTimelineItem],
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
  def update(params: ParamsResourceTimelineUpdate, options: MethodOptions): GaxiosPromise[SchemaTimelineItem] = js.native
  def update(
    params: ParamsResourceTimelineUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTimelineItem]
  ): Unit = js.native
}
