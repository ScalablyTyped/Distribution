package typings.googleapis.testingV1Mod.testingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/testing/v1", "testing_v1.Resource$Testenvironmentcatalog")
@js.native
open class ResourceTestenvironmentcatalog protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(params: ParamsResourceTestenvironmentcatalogGet): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]
  ): Unit = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    options: BodyResponseCallback[Readable | SchemaTestEnvironmentCatalog],
    callback: BodyResponseCallback[Readable | SchemaTestEnvironmentCatalog]
  ): Unit = js.native
  def get(params: ParamsResourceTestenvironmentcatalogGet, options: MethodOptions): GaxiosPromise[SchemaTestEnvironmentCatalog] = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestEnvironmentCatalog]
  ): Unit = js.native
  /**
    * Gets the catalog of supported test environments. May return any of the following canonical error codes: - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the environment type does not exist - INTERNAL - if an internal error occurred
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/testing.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const testing = google.testing('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await testing.testEnvironmentCatalog.get({
    *     // Required. The type of environment that should be listed.
    *     environmentType: 'placeholder-value',
    *     // For authorization, the cloud project requesting the TestEnvironmentCatalog.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "androidDeviceCatalog": {},
    *   //   "deviceIpBlockCatalog": {},
    *   //   "iosDeviceCatalog": {},
    *   //   "networkConfigurationCatalog": {},
    *   //   "softwareCatalog": {}
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
  def get(params: ParamsResourceTestenvironmentcatalogGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceTestenvironmentcatalogGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
