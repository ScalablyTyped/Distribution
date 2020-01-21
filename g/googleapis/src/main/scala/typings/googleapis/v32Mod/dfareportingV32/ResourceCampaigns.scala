package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Campaigns")
@js.native
class ResourceCampaigns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.campaigns.get
    * @desc Gets one campaign by ID.
    * @alias dfareporting.campaigns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Campaign ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCampaign] = js.native
  def get(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(params: ParamsResourceCampaignsGet): GaxiosPromise[SchemaCampaign] = js.native
  def get(params: ParamsResourceCampaignsGet, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def get(
    params: ParamsResourceCampaignsGet,
    options: BodyResponseCallback[SchemaCampaign],
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  def get(params: ParamsResourceCampaignsGet, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def get(
    params: ParamsResourceCampaignsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.insert
    * @desc Inserts a new campaign.
    * @alias dfareporting.campaigns.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCampaign] = js.native
  def insert(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def insert(params: ParamsResourceCampaignsInsert): GaxiosPromise[SchemaCampaign] = js.native
  def insert(params: ParamsResourceCampaignsInsert, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def insert(
    params: ParamsResourceCampaignsInsert,
    options: BodyResponseCallback[SchemaCampaign],
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  def insert(params: ParamsResourceCampaignsInsert, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def insert(
    params: ParamsResourceCampaignsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.list
    * @desc Retrieves a list of campaigns, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.campaigns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.advertiserGroupIds Select only campaigns whose advertisers belong to these advertiser groups.
    * @param {string=} params.advertiserIds Select only campaigns that belong to these advertisers.
    * @param {boolean=} params.archived Select only archived campaigns. Don't set this field to select both archived and non-archived campaigns.
    * @param {boolean=} params.atLeastOneOptimizationActivity Select only campaigns that have at least one optimization activity.
    * @param {string=} params.excludedIds Exclude campaigns with these IDs.
    * @param {string=} params.ids Select only campaigns with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.overriddenEventTagId Select only campaigns that have overridden this event tag ID.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for campaigns by name or ID. Wildcards (*) are allowed. For example, "campaign*2015" will return campaigns with names like "campaign June 2015", "campaign April 2015", or simply "campaign 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "campaign" will match campaigns with name "my campaign", "campaign 2015", or simply "campaign".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only campaigns that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCampaignsListResponse]): Unit = js.native
  def list(params: ParamsResourceCampaignsList): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(params: ParamsResourceCampaignsList, callback: BodyResponseCallback[SchemaCampaignsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceCampaignsList,
    options: BodyResponseCallback[SchemaCampaignsListResponse],
    callback: BodyResponseCallback[SchemaCampaignsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCampaignsList, options: MethodOptions): GaxiosPromise[SchemaCampaignsListResponse] = js.native
  def list(
    params: ParamsResourceCampaignsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.patch
    * @desc Updates an existing campaign. This method supports patch semantics.
    * @alias dfareporting.campaigns.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Campaign ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCampaign] = js.native
  def patch(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(params: ParamsResourceCampaignsPatch): GaxiosPromise[SchemaCampaign] = js.native
  def patch(params: ParamsResourceCampaignsPatch, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def patch(
    params: ParamsResourceCampaignsPatch,
    options: BodyResponseCallback[SchemaCampaign],
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  def patch(params: ParamsResourceCampaignsPatch, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def patch(
    params: ParamsResourceCampaignsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  /**
    * dfareporting.campaigns.update
    * @desc Updates an existing campaign.
    * @alias dfareporting.campaigns.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().Campaign} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCampaign] = js.native
  def update(callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def update(params: ParamsResourceCampaignsUpdate): GaxiosPromise[SchemaCampaign] = js.native
  def update(params: ParamsResourceCampaignsUpdate, callback: BodyResponseCallback[SchemaCampaign]): Unit = js.native
  def update(
    params: ParamsResourceCampaignsUpdate,
    options: BodyResponseCallback[SchemaCampaign],
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
  def update(params: ParamsResourceCampaignsUpdate, options: MethodOptions): GaxiosPromise[SchemaCampaign] = js.native
  def update(
    params: ParamsResourceCampaignsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaign]
  ): Unit = js.native
}

