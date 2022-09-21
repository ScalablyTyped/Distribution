package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Provisioning")
@js.native
open class ResourceProvisioning protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def createAccountTicket(): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(callback: BodyResponseCallback[SchemaAccountTicket]): Unit = js.native
  def createAccountTicket(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(params: ParamsResourceProvisioningCreateaccountticket): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    callback: BodyResponseCallback[SchemaAccountTicket]
  ): Unit = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    options: BodyResponseCallback[Readable | SchemaAccountTicket],
    callback: BodyResponseCallback[Readable | SchemaAccountTicket]
  ): Unit = js.native
  def createAccountTicket(params: ParamsResourceProvisioningCreateaccountticket, options: MethodOptions): GaxiosPromise[SchemaAccountTicket] = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTicket]
  ): Unit = js.native
  /**
    * Creates an account ticket.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.provision'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.provisioning.createAccountTicket({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "account": {},
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "profile": {},
    *       //   "redirectUri": "my_redirectUri",
    *       //   "webproperty": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": {},
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "profile": {},
    *   //   "redirectUri": "my_redirectUri",
    *   //   "webproperty": {}
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
  def createAccountTicket(params: ParamsResourceProvisioningCreateaccountticket, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createAccountTicket(
    params: ParamsResourceProvisioningCreateaccountticket,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def createAccountTree(): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(callback: BodyResponseCallback[SchemaAccountTreeResponse]): Unit = js.native
  def createAccountTree(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(params: ParamsResourceProvisioningCreateaccounttree): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    callback: BodyResponseCallback[SchemaAccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    options: BodyResponseCallback[Readable | SchemaAccountTreeResponse],
    callback: BodyResponseCallback[Readable | SchemaAccountTreeResponse]
  ): Unit = js.native
  def createAccountTree(params: ParamsResourceProvisioningCreateaccounttree, options: MethodOptions): GaxiosPromise[SchemaAccountTreeResponse] = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountTreeResponse]
  ): Unit = js.native
  /**
    * Provision account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/analytics.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const analytics = google.analytics('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/analytics.provision'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await analytics.provisioning.createAccountTree({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountName": "my_accountName",
    *       //   "kind": "my_kind",
    *       //   "profileName": "my_profileName",
    *       //   "timezone": "my_timezone",
    *       //   "webpropertyName": "my_webpropertyName",
    *       //   "websiteUrl": "my_websiteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "account": {},
    *   //   "kind": "my_kind",
    *   //   "profile": {},
    *   //   "webproperty": {}
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
  def createAccountTree(params: ParamsResourceProvisioningCreateaccounttree, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def createAccountTree(
    params: ParamsResourceProvisioningCreateaccounttree,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
