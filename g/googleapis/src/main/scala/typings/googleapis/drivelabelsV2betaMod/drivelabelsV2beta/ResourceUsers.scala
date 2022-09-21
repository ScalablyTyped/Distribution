package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/drivelabels/v2beta", "drivelabels_v2beta.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getCapabilities(): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities] = js.native
  def getCapabilities(callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities]): Unit = js.native
  def getCapabilities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities] = js.native
  def getCapabilities(params: ParamsResourceUsersGetcapabilities): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceUsersGetcapabilities,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities]
  ): Unit = js.native
  def getCapabilities(
    params: ParamsResourceUsersGetcapabilities,
    options: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaUserCapabilities],
    callback: BodyResponseCallback[Readable | SchemaGoogleAppsDriveLabelsV2betaUserCapabilities]
  ): Unit = js.native
  def getCapabilities(params: ParamsResourceUsersGetcapabilities, options: MethodOptions): GaxiosPromise[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities] = js.native
  def getCapabilities(
    params: ParamsResourceUsersGetcapabilities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleAppsDriveLabelsV2betaUserCapabilities]
  ): Unit = js.native
  /**
    * Gets the user capabilities.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/drivelabels.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const drivelabels = google.drivelabels('v2beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await drivelabels.users.getCapabilities({
    *     // Required. The resource name of the user. Only "users/me/capabilities" is supported.
    *     name: 'users/my-user/capabilities',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "canAccessLabelManager": false,
    *   //   "canAdministrateLabels": false,
    *   //   "canCreateAdminLabels": false,
    *   //   "canCreateSharedLabels": false,
    *   //   "name": "my_name"
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
  def getCapabilities(params: ParamsResourceUsersGetcapabilities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getCapabilities(
    params: ParamsResourceUsersGetcapabilities,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
