package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/identitytoolkit/v2", "identitytoolkit_v2.Resource$Defaultsupportedidps")
@js.native
open class ResourceDefaultsupportedidps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse] = js.native
  def list(
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse]
  ): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse] = js.native
  def list(params: ParamsResourceDefaultsupportedidpsList): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse] = js.native
  def list(
    params: ParamsResourceDefaultsupportedidpsList,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDefaultsupportedidpsList,
    options: BodyResponseCallback[
      Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse
    ],
    callback: BodyResponseCallback[
      Readable | SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse
    ]
  ): Unit = js.native
  def list(params: ParamsResourceDefaultsupportedidpsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse] = js.native
  def list(
    params: ParamsResourceDefaultsupportedidpsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudIdentitytoolkitAdminV2ListDefaultSupportedIdpsResponse]
  ): Unit = js.native
  /**
    * List all default supported Idps.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/identitytoolkit.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const identitytoolkit = google.identitytoolkit('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/firebase',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await identitytoolkit.defaultSupportedIdps.list({
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "defaultSupportedIdps": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceDefaultsupportedidpsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDefaultsupportedidpsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
