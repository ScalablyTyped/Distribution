package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Containers$Reauthorize_environments")
@js.native
open class ResourceAccountsContainersReauthorizeEnvironments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def update(): GaxiosPromise[SchemaEnvironment] = js.native
  def update(callback: BodyResponseCallback[SchemaEnvironment]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: BodyResponseCallback[Readable | SchemaEnvironment],
    callback: BodyResponseCallback[Readable | SchemaEnvironment]
  ): Unit = js.native
  def update(params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate, options: MethodOptions): GaxiosPromise[SchemaEnvironment] = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnvironment]
  ): Unit = js.native
  /**
    * Re-generates the authorization code for a GTM Environment.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tagmanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tagmanager = google.tagmanager('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/tagmanager.publish'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await tagmanager.accounts.containers.reauthorize_environments.update({
    *       // The GTM Account ID.
    *       accountId: 'placeholder-value',
    *       // The GTM Container ID.
    *       containerId: 'placeholder-value',
    *       // The GTM Environment ID.
    *       environmentId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "accountId": "my_accountId",
    *         //   "authorizationCode": "my_authorizationCode",
    *         //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *         //   "containerId": "my_containerId",
    *         //   "containerVersionId": "my_containerVersionId",
    *         //   "description": "my_description",
    *         //   "enableDebug": false,
    *         //   "environmentId": "my_environmentId",
    *         //   "fingerprint": "my_fingerprint",
    *         //   "name": "my_name",
    *         //   "type": "my_type",
    *         //   "url": "my_url"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountId": "my_accountId",
    *   //   "authorizationCode": "my_authorizationCode",
    *   //   "authorizationTimestampMs": "my_authorizationTimestampMs",
    *   //   "containerId": "my_containerId",
    *   //   "containerVersionId": "my_containerVersionId",
    *   //   "description": "my_description",
    *   //   "enableDebug": false,
    *   //   "environmentId": "my_environmentId",
    *   //   "fingerprint": "my_fingerprint",
    *   //   "name": "my_name",
    *   //   "type": "my_type",
    *   //   "url": "my_url"
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
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceAccountsContainersReauthorizeEnvironmentsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
