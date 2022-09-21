package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Proposals")
@js.native
open class ResourceAccountsProposals protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def accept(): GaxiosPromise[SchemaProposal] = js.native
  def accept(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept): GaxiosPromise[SchemaProposal] = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def accept(
    params: ParamsResourceAccountsProposalsAccept,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def accept(params: ParamsResourceAccountsProposalsAccept, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def accept(
    params: ParamsResourceAccountsProposalsAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Mark the proposal as accepted at the given revision number. If the number does not match the server's revision number an `ABORTED` error message will be returned. This call updates the proposal_state from `PROPOSED` to `BUYER_ACCEPTED`, or from `SELLER_ACCEPTED` to `FINALIZED`. Upon calling this endpoint, the buyer implicitly agrees to the terms and conditions optionally set within the proposal by the publisher.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.accept({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to accept.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "proposalRevision": "my_proposalRevision"
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def accept(params: ParamsResourceAccountsProposalsAccept, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def accept(
    params: ParamsResourceAccountsProposalsAccept,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def addNote(): GaxiosPromise[SchemaNote] = js.native
  def addNote(callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def addNote(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote): GaxiosPromise[SchemaNote] = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote, callback: BodyResponseCallback[SchemaNote]): Unit = js.native
  def addNote(
    params: ParamsResourceAccountsProposalsAddnote,
    options: BodyResponseCallback[Readable | SchemaNote],
    callback: BodyResponseCallback[Readable | SchemaNote]
  ): Unit = js.native
  def addNote(params: ParamsResourceAccountsProposalsAddnote, options: MethodOptions): GaxiosPromise[SchemaNote] = js.native
  def addNote(
    params: ParamsResourceAccountsProposalsAddnote,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNote]
  ): Unit = js.native
  /**
    * Create a new note and attach it to the proposal. The note is assigned a unique ID by the server. The proposal revision number will not increase when associated with a new note.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.addNote({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to attach the note to.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "note": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "creatorRole": "my_creatorRole",
    *   //   "note": "my_note",
    *   //   "noteId": "my_noteId",
    *   //   "proposalRevision": "my_proposalRevision"
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
  def addNote(params: ParamsResourceAccountsProposalsAddnote, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addNote(
    params: ParamsResourceAccountsProposalsAddnote,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancelNegotiation(): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def cancelNegotiation(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(params: ParamsResourceAccountsProposalsCancelnegotiation): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def cancelNegotiation(params: ParamsResourceAccountsProposalsCancelnegotiation, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Cancel an ongoing negotiation on a proposal. This does not cancel or end serving for the deals if the proposal has been finalized, but only cancels a negotiation unilaterally.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.cancelNegotiation({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to cancel negotiation for.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def cancelNegotiation(params: ParamsResourceAccountsProposalsCancelnegotiation, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancelNegotiation(
    params: ParamsResourceAccountsProposalsCancelnegotiation,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def completeSetup(): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def completeSetup(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(params: ParamsResourceAccountsProposalsCompletesetup): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def completeSetup(params: ParamsResourceAccountsProposalsCompletesetup, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * You can opt-in to manually update proposals to indicate that setup is complete. By default, proposal setup is automatically completed after their deals are finalized. Contact your Technical Account Manager to opt in. Buyers can call this method when the proposal has been finalized, and all the required creatives have been uploaded using the Creatives API. This call updates the `is_setup_completed` field on the deals in the proposal, and notifies the seller. The server then advances the revision number of the most recent proposal. To mark an individual deal as ready to serve, call `buyers.finalizedDeals.setReadyToServe` in the Marketplace API.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.completeSetup({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to mark as setup completed.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def completeSetup(params: ParamsResourceAccountsProposalsCompletesetup, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def completeSetup(
    params: ParamsResourceAccountsProposalsCompletesetup,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaProposal] = js.native
  def create(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def create(params: ParamsResourceAccountsProposalsCreate): GaxiosPromise[SchemaProposal] = js.native
  def create(params: ParamsResourceAccountsProposalsCreate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def create(
    params: ParamsResourceAccountsProposalsCreate,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsProposalsCreate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def create(
    params: ParamsResourceAccountsProposalsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Create the given proposal. Each created proposal and any deals it contains are assigned a unique ID by the server.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.create({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": {},
    *       //   "buyer": {},
    *       //   "buyerContacts": [],
    *       //   "buyerPrivateData": {},
    *       //   "deals": [],
    *       //   "displayName": "my_displayName",
    *       //   "isRenegotiating": false,
    *       //   "isSetupComplete": false,
    *       //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *       //   "notes": [],
    *       //   "originatorRole": "my_originatorRole",
    *       //   "privateAuctionId": "my_privateAuctionId",
    *       //   "proposalId": "my_proposalId",
    *       //   "proposalRevision": "my_proposalRevision",
    *       //   "proposalState": "my_proposalState",
    *       //   "seller": {},
    *       //   "sellerContacts": [],
    *       //   "termsAndConditions": "my_termsAndConditions",
    *       //   "updateTime": "my_updateTime"
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def create(params: ParamsResourceAccountsProposalsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsProposalsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProposal] = js.native
  def get(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceAccountsProposalsGet): GaxiosPromise[SchemaProposal] = js.native
  def get(params: ParamsResourceAccountsProposalsGet, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def get(
    params: ParamsResourceAccountsProposalsGet,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsProposalsGet, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def get(
    params: ParamsResourceAccountsProposalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Gets a proposal given its ID. The proposal is returned at its head revision.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.get({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The unique ID of the proposal
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceAccountsProposalsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsProposalsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProposalsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(params: ParamsResourceAccountsProposalsList): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    options: BodyResponseCallback[Readable | SchemaListProposalsResponse],
    callback: BodyResponseCallback[Readable | SchemaListProposalsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsProposalsList, options: MethodOptions): GaxiosPromise[SchemaListProposalsResponse] = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProposalsResponse]
  ): Unit = js.native
  /**
    * List proposals. A filter expression (PQL query) may be specified to filter the results. To retrieve all finalized proposals, regardless if a proposal is being renegotiated, see the FinalizedProposals resource. Note that Bidder/ChildSeat relationships differ from the usual behavior. A Bidder account can only see its child seats' proposals by specifying the ChildSeat's accountId in the request path.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.list({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // An optional PQL filter query used to query for proposals. Nested repeated fields, such as proposal.deals.targetingCriterion, cannot be filtered.
    *     filter: 'placeholder-value',
    *     // Syntax the filter is written in. Current implementation defaults to PQL but in the future it will be LIST_FILTER.
    *     filterSyntax: 'placeholder-value',
    *     // Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    *     pageSize: 'placeholder-value',
    *     // The page token as returned from ListProposalsResponse.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceAccountsProposalsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsProposalsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def pause(): GaxiosPromise[SchemaProposal] = js.native
  def pause(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def pause(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(params: ParamsResourceAccountsProposalsPause): GaxiosPromise[SchemaProposal] = js.native
  def pause(params: ParamsResourceAccountsProposalsPause, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def pause(
    params: ParamsResourceAccountsProposalsPause,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def pause(params: ParamsResourceAccountsProposalsPause, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def pause(
    params: ParamsResourceAccountsProposalsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update the given proposal to pause serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to true for all deals in the proposal. It is a no-op to pause an already-paused proposal. It is an error to call PauseProposal for a proposal that is not finalized or renegotiating.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.pause({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to pause.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "reason": "my_reason"
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def pause(params: ParamsResourceAccountsProposalsPause, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def pause(
    params: ParamsResourceAccountsProposalsPause,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def resume(): GaxiosPromise[SchemaProposal] = js.native
  def resume(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def resume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(params: ParamsResourceAccountsProposalsResume): GaxiosPromise[SchemaProposal] = js.native
  def resume(params: ParamsResourceAccountsProposalsResume, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def resume(
    params: ParamsResourceAccountsProposalsResume,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def resume(params: ParamsResourceAccountsProposalsResume, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def resume(
    params: ParamsResourceAccountsProposalsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update the given proposal to resume serving. This method will set the `DealServingMetadata.DealPauseStatus.has_buyer_paused` bit to false for all deals in the proposal. Note that if the `has_seller_paused` bit is also set, serving will not resume until the seller also resumes. It is a no-op to resume an already-running proposal. It is an error to call ResumeProposal for a proposal that is not finalized or renegotiating.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.resume({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The ID of the proposal to resume.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def resume(params: ParamsResourceAccountsProposalsResume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def resume(
    params: ParamsResourceAccountsProposalsResume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaProposal] = js.native
  def update(callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate): GaxiosPromise[SchemaProposal] = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate, callback: BodyResponseCallback[SchemaProposal]): Unit = js.native
  def update(
    params: ParamsResourceAccountsProposalsUpdate,
    options: BodyResponseCallback[Readable | SchemaProposal],
    callback: BodyResponseCallback[Readable | SchemaProposal]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsProposalsUpdate, options: MethodOptions): GaxiosPromise[SchemaProposal] = js.native
  def update(
    params: ParamsResourceAccountsProposalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProposal]
  ): Unit = js.native
  /**
    * Update the given proposal at the client known revision number. If the server revision has advanced since the passed-in `proposal.proposal_revision`, an `ABORTED` error message will be returned. Only the buyer-modifiable fields of the proposal will be updated. Note that the deals in the proposal will be updated to match the passed-in copy. If a passed-in deal does not have a `deal_id`, the server will assign a new unique ID and create the deal. If passed-in deal has a `deal_id`, it will be updated to match the passed-in copy. Any existing deals not present in the passed-in proposal will be deleted. It is an error to pass in a deal with a `deal_id` not present at head.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adexchangebuyer2.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adexchangebuyer2 = google.adexchangebuyer2('v2beta1');
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
    *   const res = await adexchangebuyer2.accounts.proposals.update({
    *     // Account ID of the buyer.
    *     accountId: 'placeholder-value',
    *     // The unique ID of the proposal.
    *     proposalId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "billedBuyer": {},
    *       //   "buyer": {},
    *       //   "buyerContacts": [],
    *       //   "buyerPrivateData": {},
    *       //   "deals": [],
    *       //   "displayName": "my_displayName",
    *       //   "isRenegotiating": false,
    *       //   "isSetupComplete": false,
    *       //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *       //   "notes": [],
    *       //   "originatorRole": "my_originatorRole",
    *       //   "privateAuctionId": "my_privateAuctionId",
    *       //   "proposalId": "my_proposalId",
    *       //   "proposalRevision": "my_proposalRevision",
    *       //   "proposalState": "my_proposalState",
    *       //   "seller": {},
    *       //   "sellerContacts": [],
    *       //   "termsAndConditions": "my_termsAndConditions",
    *       //   "updateTime": "my_updateTime"
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
    *   //   "deals": [],
    *   //   "displayName": "my_displayName",
    *   //   "isRenegotiating": false,
    *   //   "isSetupComplete": false,
    *   //   "lastUpdaterOrCommentorRole": "my_lastUpdaterOrCommentorRole",
    *   //   "notes": [],
    *   //   "originatorRole": "my_originatorRole",
    *   //   "privateAuctionId": "my_privateAuctionId",
    *   //   "proposalId": "my_proposalId",
    *   //   "proposalRevision": "my_proposalRevision",
    *   //   "proposalState": "my_proposalState",
    *   //   "seller": {},
    *   //   "sellerContacts": [],
    *   //   "termsAndConditions": "my_termsAndConditions",
    *   //   "updateTime": "my_updateTime"
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
  def update(params: ParamsResourceAccountsProposalsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsProposalsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
