package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/gamesConfiguration/v1configuration", "gamesConfiguration_v1configuration.Resource$Imageconfigurations")
@js.native
open class ResourceImageconfigurations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def upload(): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(callback: BodyResponseCallback[SchemaImageConfiguration]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(params: ParamsResourceImageconfigurationsUpload): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    callback: BodyResponseCallback[SchemaImageConfiguration]
  ): Unit = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    options: BodyResponseCallback[Readable | SchemaImageConfiguration],
    callback: BodyResponseCallback[Readable | SchemaImageConfiguration]
  ): Unit = js.native
  def upload(params: ParamsResourceImageconfigurationsUpload, options: MethodOptions): GaxiosPromise[SchemaImageConfiguration] = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaImageConfiguration]
  ): Unit = js.native
  /**
    * Uploads an image for a resource with the given ID and image type.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/gamesConfiguration.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const gamesConfiguration = google.gamesConfiguration('v1configuration');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await gamesConfiguration.imageConfigurations.upload({
    *     // Selects which image in a resource for this method.
    *     imageType: 'placeholder-value',
    *     // The ID of the resource used by this method.
    *     resourceId: 'placeholder-value',
    *
    *     requestBody: {
    *       // request body parameters
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "imageType": "my_imageType",
    *   //   "kind": "my_kind",
    *   //   "resourceId": "my_resourceId",
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
  def upload(params: ParamsResourceImageconfigurationsUpload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceImageconfigurationsUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
