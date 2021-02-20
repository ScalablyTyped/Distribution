package typings.googleapis.v32Mod.dfareportingV32

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Campaigncreativeassociations")
@js.native
class ResourceCampaigncreativeassociations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dfareporting.campaignCreativeAssociations.insert
    * @desc Associates a creative with the specified campaign. This method
    * creates a default ad with dimensions matching the creative in the
    * campaign if such a default ad does not exist already.
    * @alias dfareporting.campaignCreativeAssociations.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.campaignId Campaign ID in this association.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().CampaignCreativeAssociation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(params: ParamsResourceCampaigncreativeassociationsInsert): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    options: BodyResponseCallback[SchemaCampaignCreativeAssociation],
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  def insert(params: ParamsResourceCampaigncreativeassociationsInsert, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociation] = js.native
  def insert(
    params: ParamsResourceCampaigncreativeassociationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociation]
  ): Unit = js.native
  
  /**
    * dfareporting.campaignCreativeAssociations.list
    * @desc Retrieves the list of creative IDs associated with the specified
    * campaign. This method supports paging.
    * @alias dfareporting.campaignCreativeAssociations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.campaignId Campaign ID in this association.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(params: ParamsResourceCampaigncreativeassociationsList): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    options: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse],
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCampaigncreativeassociationsList, options: MethodOptions): GaxiosPromise[SchemaCampaignCreativeAssociationsListResponse] = js.native
  def list(
    params: ParamsResourceCampaigncreativeassociationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCampaignCreativeAssociationsListResponse]
  ): Unit = js.native
}
