package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Associationsessions")
@js.native
open class ResourceAssociationsessions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def start(): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(callback: BodyResponseCallback[SchemaAssociationSession]): Unit = js.native
  def start(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(params: ParamsResourceAssociationsessionsStart): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    options: BodyResponseCallback[Readable | SchemaAssociationSession],
    callback: BodyResponseCallback[Readable | SchemaAssociationSession]
  ): Unit = js.native
  def start(params: ParamsResourceAssociationsessionsStart, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  /**
    * Create an association session for initiating an association with an AdSense user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.associationsessions.start({
    *     // The URL to redirect the user to once association is completed. It receives a token parameter that can then be used to retrieve the associated account.
    *     callbackUrl: 'placeholder-value',
    *     // Products to associate with the user.
    *     productCode: 'placeholder-value',
    *     // The preferred locale of the user.
    *     userLocale: 'placeholder-value',
    *     // The locale of the user's hosted website.
    *     websiteLocale: 'placeholder-value',
    *     // The URL of the user's hosted website.
    *     websiteUrl: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "productCodes": [],
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "status": "my_status",
    *   //   "userLocale": "my_userLocale",
    *   //   "websiteLocale": "my_websiteLocale",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def start(params: ParamsResourceAssociationsessionsStart, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def start(
    params: ParamsResourceAssociationsessionsStart,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def verify(): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(callback: BodyResponseCallback[SchemaAssociationSession]): Unit = js.native
  def verify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(params: ParamsResourceAssociationsessionsVerify): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    options: BodyResponseCallback[Readable | SchemaAssociationSession],
    callback: BodyResponseCallback[Readable | SchemaAssociationSession]
  ): Unit = js.native
  def verify(params: ParamsResourceAssociationsessionsVerify, options: MethodOptions): GaxiosPromise[SchemaAssociationSession] = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAssociationSession]
  ): Unit = js.native
  /**
    * Verify an association session after the association callback returns from AdSense signup.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/adsensehost.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const adsensehost = google.adsensehost('v4.1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/adsensehost'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await adsensehost.associationsessions.verify({
    *     // The token returned to the association callback URL.
    *     token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "productCodes": [],
    *   //   "redirectUrl": "my_redirectUrl",
    *   //   "status": "my_status",
    *   //   "userLocale": "my_userLocale",
    *   //   "websiteLocale": "my_websiteLocale",
    *   //   "websiteUrl": "my_websiteUrl"
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
  def verify(params: ParamsResourceAssociationsessionsVerify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def verify(
    params: ParamsResourceAssociationsessionsVerify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
