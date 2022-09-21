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

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Pubprofiles")
@js.native
open class ResourcePubprofiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(params: ParamsResourcePubprofilesList): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    options: BodyResponseCallback[Readable | SchemaGetPublisherProfilesByAccountIdResponse],
    callback: BodyResponseCallback[Readable | SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePubprofilesList, options: MethodOptions): GaxiosPromise[SchemaGetPublisherProfilesByAccountIdResponse] = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetPublisherProfilesByAccountIdResponse]
  ): Unit = js.native
  /**
    * Gets the requested publisher profile(s) by publisher accountId.
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
    *   const res = await adexchangebuyer.pubprofiles.list({
    *     // The accountId of the publisher to get profiles for.
    *     accountId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "profiles": []
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
  def list(params: ParamsResourcePubprofilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePubprofilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
