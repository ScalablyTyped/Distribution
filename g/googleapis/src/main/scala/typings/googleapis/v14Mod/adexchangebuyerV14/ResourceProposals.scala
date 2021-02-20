package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Proposals")
@js.native
class ResourceProposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adexchangebuyer.proposals.get
    * @desc Get a proposal given its id
    * @alias adexchangebuyer.proposals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId Id of the proposal to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProposal] = js.native
  def get(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceProposalsGet): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceProposalsGet, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(
    params: ParamsResourceProposalsGet,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def get(params: ParamsResourceProposalsGet, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(
    params: ParamsResourceProposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.proposals.insert
    * @desc Create the given list of proposals
    * @alias adexchangebuyer.proposals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateOrdersRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreateOrdersResponse]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(params: ParamsResourceProposalsInsert): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(params: ParamsResourceProposalsInsert, callback: BodyResponseCallback[SchemaCreateOrdersResponse]): Unit = js.native
  def insert(
    params: ParamsResourceProposalsInsert,
    options: BodyResponseCallback[SchemaCreateOrdersResponse],
    callback: BodyResponseCallback[SchemaCreateOrdersResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceProposalsInsert, options: MethodOptions): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(
    params: ParamsResourceProposalsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateOrdersResponse]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.proposals.patch
    * @desc Update the given proposal. This method supports patch semantics.
    * @alias adexchangebuyer.proposals.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id to update.
    * @param {string} params.revisionNumber The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    * @param {string} params.updateAction The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaProposal] = js.native
  def patch(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceProposalsPatch): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceProposalsPatch, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(
    params: ParamsResourceProposalsPatch,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def patch(params: ParamsResourceProposalsPatch, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(
    params: ParamsResourceProposalsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.proposals.search
    * @desc Search for proposals using pql query
    * @alias adexchangebuyer.proposals.search
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pqlQuery Query string to retrieve specific proposals.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGetOrdersResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(params: ParamsResourceProposalsSearch): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(params: ParamsResourceProposalsSearch, callback: BodyResponseCallback[SchemaGetOrdersResponse]): Unit = js.native
  def search(
    params: ParamsResourceProposalsSearch,
    options: BodyResponseCallback[SchemaGetOrdersResponse],
    callback: BodyResponseCallback[SchemaGetOrdersResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProposalsSearch, options: MethodOptions): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(
    params: ParamsResourceProposalsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrdersResponse]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.proposals.setupcomplete
    * @desc Update the given proposal to indicate that setup has been
    * completed.
    * @alias adexchangebuyer.proposals.setupcomplete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id for which the setup is complete
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setupcomplete(): GaxiosPromise[Unit] = js.native
  def setupcomplete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setupcomplete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete): GaxiosPromise[Unit] = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setupcomplete(
    params: ParamsResourceProposalsSetupcomplete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setupcomplete(
    params: ParamsResourceProposalsSetupcomplete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * adexchangebuyer.proposals.update
    * @desc Update the given proposal
    * @alias adexchangebuyer.proposals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.proposalId The proposal id to update.
    * @param {string} params.revisionNumber The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    * @param {string} params.updateAction The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    * @param {().Proposal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaProposal] = js.native
  def update(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceProposalsUpdate): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceProposalsUpdate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(
    params: ParamsResourceProposalsUpdate,
    options: BodyResponseCallback[SchemaProposal],
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def update(params: ParamsResourceProposalsUpdate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(
    params: ParamsResourceProposalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
}
