package typings.googleapis.v31Mod.dfareportingV31

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Targetableremarketinglists")
@js.native
class ResourceTargetableremarketinglists protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.targetableRemarketingLists.get
    * @desc Gets one remarketing list by ID.
    * @alias dfareporting.targetableRemarketingLists.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Remarketing list ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetableRemarketingList]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(params: ParamsResourceTargetableremarketinglistsGet): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    callback: BodyResponseCallback[SchemaTargetableRemarketingList]
  ): Unit = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    options: BodyResponseCallback[SchemaTargetableRemarketingList],
    callback: BodyResponseCallback[SchemaTargetableRemarketingList]
  ): Unit = js.native
  def get(params: ParamsResourceTargetableremarketinglistsGet, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingList] = js.native
  def get(
    params: ParamsResourceTargetableremarketinglistsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetableRemarketingList]
  ): Unit = js.native
  /**
    * dfareporting.targetableRemarketingLists.list
    * @desc Retrieves a list of targetable remarketing lists, possibly
    * filtered. This method supports paging.
    * @alias dfareporting.targetableRemarketingLists.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active or only inactive targetable remarketing lists.
    * @param {string} params.advertiserId Select only targetable remarketing lists targetable by these advertisers.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.name Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "remarketing list*2015" will return objects with names like "remarketing list June 2015", "remarketing list April 2015", or simply "remarketing list 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "remarketing list" will match objects with name "my remarketing list", "remarketing list 2015", or simply "remarketing list".
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(params: ParamsResourceTargetableremarketinglistsList): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    options: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse],
    callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceTargetableremarketinglistsList, options: MethodOptions): GaxiosPromise[SchemaTargetableRemarketingListsListResponse] = js.native
  def list(
    params: ParamsResourceTargetableremarketinglistsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetableRemarketingListsListResponse]
  ): Unit = js.native
}

