package typings.googleapis.dlpV2Mod.dlpV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dlp/v2", "dlp_v2.Resource$Infotypes")
@js.native
open class ResourceInfotypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(params: ParamsResourceInfotypesList): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceInfotypesList,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceInfotypesList,
    options: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListInfoTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceInfotypesList, options: MethodOptions): GaxiosPromise[SchemaGooglePrivacyDlpV2ListInfoTypesResponse] = js.native
  def list(
    params: ParamsResourceInfotypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGooglePrivacyDlpV2ListInfoTypesResponse]
  ): Unit = js.native
  /**
    * Returns a list of the sensitive information types that DLP API supports. See https://cloud.google.com/dlp/docs/infotypes-reference to learn more.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/dlp.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const dlp = google.dlp('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await dlp.infoTypes.list({
    *     // filter to only return infoTypes supported by certain parts of the API. Defaults to supported_by=INSPECT.
    *     filter: 'placeholder-value',
    *     // BCP-47 language code for localized infoType friendly names. If omitted, or if localized strings are not available, en-US strings will be returned.
    *     languageCode: 'placeholder-value',
    *     // Deprecated. This field has no effect.
    *     locationId: 'placeholder-value',
    *     // The parent resource name. The format of this value is as follows: locations/ LOCATION_ID
    *     parent: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "infoTypes": []
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
  def list(params: ParamsResourceInfotypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceInfotypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
