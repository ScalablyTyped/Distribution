package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Proposals")
@js.native
open class ResourceProposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaProposal] = js.native
  def get(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceProposalsGet): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceProposalsGet, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(
    params: ParamsResourceProposalsGet,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def get(params: ParamsResourceProposalsGet, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(
    params: ParamsResourceProposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Get a proposal given its id
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.get({
    *     // Id of the proposal to retrieve.
    *     proposalId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "dbmAdvertiserIds": [],
    *   //   "hasBuyerSignedOff": false,
    *   //   "hasSellerSignedOff": false,
    *   //   "inventorySource": "my_inventorySource",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "negotiationId": "my_negotiationId",
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalState": "my_proposalState",
    *   //   "revisionNumber": "my_revisionNumber",
    *   //   "revisionTimeMs": "my_revisionTimeMs",
    *   //   "seller": {},
    *   //   "sellerContacts": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProposalsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProposalsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(callback: BodyResponseCallback[SchemaCreateOrdersResponse]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(params: ParamsResourceProposalsInsert): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(params: ParamsResourceProposalsInsert, callback: BodyResponseCallback[SchemaCreateOrdersResponse]): Unit = js.native
  def insert(
    params: ParamsResourceProposalsInsert,
    options: BodyResponseCallback[Readable | SchemaCreateOrdersResponse],
    callback: BodyResponseCallback[Readable | SchemaCreateOrdersResponse]
  ): Unit = js.native
  def insert(params: ParamsResourceProposalsInsert, options: MethodOptions): GaxiosPromise[SchemaCreateOrdersResponse] = js.native
  def insert(
    params: ParamsResourceProposalsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCreateOrdersResponse]
  ): Unit = js.native
  /**
    * Create the given list of proposals
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "proposals": [],
    *       //   "webPropertyCode": "my_webPropertyCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "proposals": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def insert(params: ParamsResourceProposalsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceProposalsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProposal] = js.native
  def patch(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceProposalsPatch): GaxiosPromise[SchemaProposal] = js.native
  def patch(params: ParamsResourceProposalsPatch, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def patch(
    params: ParamsResourceProposalsPatch,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def patch(params: ParamsResourceProposalsPatch, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def patch(
    params: ParamsResourceProposalsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update the given proposal. This method supports patch semantics.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.patch({
    *     // The proposal id to update.
    *     proposalId: 'placeholder-value',
    *     // The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    *     revisionNumber: 'placeholder-value',
    *     // The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    *     updateAction: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": {},
    *       //   "buyer": {},
    *       //   "buyerContacts": [],
    *       //   "buyerPrivateData": {},
    *       //   "dbmAdvertiserIds": [],
    *       //   "hasBuyerSignedOff": false,
    *       //   "hasSellerSignedOff": false,
    *       //   "inventorySource": "my_inventorySource",
    *       //   "isRenegotiating": false,
    *       //   "isSetupComplete": false,
    *       //   "kind": "my_kind",
    *       //   "labels": [],
    *       //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *       //   "name": "my_name",
    *       //   "negotiationId": "my_negotiationId",
    *       //   "originatorRole": "my_originatorRole",
    *       //   "privateAuctionId": "my_privateAuctionId",
    *       //   "proposalId": "my_proposalId",
    *       //   "proposalState": "my_proposalState",
    *       //   "revisionNumber": "my_revisionNumber",
    *       //   "revisionTimeMs": "my_revisionTimeMs",
    *       //   "seller": {},
    *       //   "sellerContacts": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "dbmAdvertiserIds": [],
    *   //   "hasBuyerSignedOff": false,
    *   //   "hasSellerSignedOff": false,
    *   //   "inventorySource": "my_inventorySource",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "negotiationId": "my_negotiationId",
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalState": "my_proposalState",
    *   //   "revisionNumber": "my_revisionNumber",
    *   //   "revisionTimeMs": "my_revisionTimeMs",
    *   //   "seller": {},
    *   //   "sellerContacts": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceProposalsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProposalsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGetOrdersResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(params: ParamsResourceProposalsSearch): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(params: ParamsResourceProposalsSearch, callback: BodyResponseCallback[SchemaGetOrdersResponse]): Unit = js.native
  def search(
    params: ParamsResourceProposalsSearch,
    options: BodyResponseCallback[Readable | SchemaGetOrdersResponse],
    callback: BodyResponseCallback[Readable | SchemaGetOrdersResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProposalsSearch, options: MethodOptions): GaxiosPromise[SchemaGetOrdersResponse] = js.native
  def search(
    params: ParamsResourceProposalsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetOrdersResponse]
  ): Unit = js.native
  /**
    * Search for proposals using pql query
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.search({
    *     // Query string to retrieve specific proposals.
    *     pqlQuery: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "proposals": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def search(params: ParamsResourceProposalsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProposalsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setupcomplete(): GaxiosPromise[Unit] = js.native
  def setupcomplete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setupcomplete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete): GaxiosPromise[Unit] = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def setupcomplete(
    params: ParamsResourceProposalsSetupcomplete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def setupcomplete(
    params: ParamsResourceProposalsSetupcomplete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Update the given proposal to indicate that setup has been completed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.setupcomplete({
    *     // The proposal id for which the setup is complete
    *     proposalId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def setupcomplete(params: ParamsResourceProposalsSetupcomplete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setupcomplete(
    params: ParamsResourceProposalsSetupcomplete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProposal] = js.native
  def update(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceProposalsUpdate): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceProposalsUpdate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(
    params: ParamsResourceProposalsUpdate,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def update(params: ParamsResourceProposalsUpdate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(
    params: ParamsResourceProposalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update the given proposal
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer = google.adexchangebuyer('v1.4');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adexchange.buyer'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adexchangebuyer.proposals.update({
    *     // The proposal id to update.
    *     proposalId: 'placeholder-value',
    *     // The last known revision number to update. If the head revision in the marketplace database has since changed, an error will be thrown. The caller should then fetch the latest proposal at head revision and retry the update at that revision.
    *     revisionNumber: 'placeholder-value',
    *     // The proposed action to take on the proposal. This field is required and it must be set when updating a proposal.
    *     updateAction: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": {},
    *       //   "buyer": {},
    *       //   "buyerContacts": [],
    *       //   "buyerPrivateData": {},
    *       //   "dbmAdvertiserIds": [],
    *       //   "hasBuyerSignedOff": false,
    *       //   "hasSellerSignedOff": false,
    *       //   "inventorySource": "my_inventorySource",
    *       //   "isRenegotiating": false,
    *       //   "isSetupComplete": false,
    *       //   "kind": "my_kind",
    *       //   "labels": [],
    *       //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *       //   "name": "my_name",
    *       //   "negotiationId": "my_negotiationId",
    *       //   "originatorRole": "my_originatorRole",
    *       //   "privateAuctionId": "my_privateAuctionId",
    *       //   "proposalId": "my_proposalId",
    *       //   "proposalState": "my_proposalState",
    *       //   "revisionNumber": "my_revisionNumber",
    *       //   "revisionTimeMs": "my_revisionTimeMs",
    *       //   "seller": {},
    *       //   "sellerContacts": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "billedBuyer": {},
    *   //   "buyer": {},
    *   //   "buyerContacts": [],
    *   //   "buyerPrivateData": {},
    *   //   "dbmAdvertiserIds": [],
    *   //   "hasBuyerSignedOff": false,
    *   //   "hasSellerSignedOff": false,
    *   //   "inventorySource": "my_inventorySource",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "name": "my_name",
    *   //   "negotiationId": "my_negotiationId",
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalState": "my_proposalState",
    *   //   "revisionNumber": "my_revisionNumber",
    *   //   "revisionTimeMs": "my_revisionTimeMs",
    *   //   "seller": {},
    *   //   "sellerContacts": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def update(params: ParamsResourceProposalsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceProposalsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
