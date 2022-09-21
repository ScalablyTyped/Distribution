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

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Marketplaceprivateauction")
@js.native
open class ResourceMarketplaceprivateauction protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def updateproposal(): GaxiosPromise[Unit] = js.native
  def updateproposal(callback: BodyResponseCallback[Unit]): Unit = js.native
  def updateproposal(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updateproposal(params: ParamsResourceMarketplaceprivateauctionUpdateproposal): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def updateproposal(params: ParamsResourceMarketplaceprivateauctionUpdateproposal, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Update a given private auction proposal
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
    *   const res = await adexchangebuyer.marketplaceprivateauction.updateproposal({
    *     // The private auction id to be updated.
    *     privateAuctionId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "externalDealId": "my_externalDealId",
    *       //   "note": {},
    *       //   "proposalRevisionNumber": "my_proposalRevisionNumber",
    *       //   "updateAction": "my_updateAction"
    *       // }
    *     },
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
  def updateproposal(params: ParamsResourceMarketplaceprivateauctionUpdateproposal, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateproposal(
    params: ParamsResourceMarketplaceprivateauctionUpdateproposal,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
