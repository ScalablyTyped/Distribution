package typings.googleapis.ideahubV1alphaMod.ideahubV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/ideahub/v1alpha", "ideahub_v1alpha.Resource$Platforms$Properties$Locales")
@js.native
open class ResourcePlatformsPropertiesLocales protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse] = js.native
  def list(params: ParamsResourcePlatformsPropertiesLocalesList): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse] = js.native
  def list(
    params: ParamsResourcePlatformsPropertiesLocalesList,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePlatformsPropertiesLocalesList,
    options: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePlatformsPropertiesLocalesList, options: MethodOptions): GaxiosPromise[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse] = js.native
  def list(
    params: ParamsResourcePlatformsPropertiesLocalesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleSearchIdeahubV1alphaListAvailableLocalesResponse]
  ): Unit = js.native
  /**
    * Returns which locales ideas are available in for a given Creator.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/ideahub.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const ideahub = google.ideahub('v1alpha');
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
    *   const res = await ideahub.platforms.properties.locales.list({
    *     // The maximum number of locales to return. The service may return fewer than this value. If unspecified, at most 100 locales will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAvailableLocales` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListAvailableLocales` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. The web property to check idea availability for Format: platforms/{platform\}/property/{property\}
    *     parent: 'platforms/my-platform/properties/my-propertie',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "availableLocales": [],
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
  def list(params: ParamsResourcePlatformsPropertiesLocalesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePlatformsPropertiesLocalesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
