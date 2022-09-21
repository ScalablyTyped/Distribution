package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/searchconsole/v1", "searchconsole_v1.Resource$Urlinspection$Index")
@js.native
open class ResourceUrlinspectionIndex protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def inspect(): GaxiosPromise[SchemaInspectUrlIndexResponse] = js.native
  def inspect(callback: BodyResponseCallback[SchemaInspectUrlIndexResponse]): Unit = js.native
  def inspect(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInspectUrlIndexResponse] = js.native
  def inspect(params: ParamsResourceUrlinspectionIndexInspect): GaxiosPromise[SchemaInspectUrlIndexResponse] = js.native
  def inspect(
    params: ParamsResourceUrlinspectionIndexInspect,
    callback: BodyResponseCallback[SchemaInspectUrlIndexResponse]
  ): Unit = js.native
  def inspect(
    params: ParamsResourceUrlinspectionIndexInspect,
    options: BodyResponseCallback[Readable | SchemaInspectUrlIndexResponse],
    callback: BodyResponseCallback[Readable | SchemaInspectUrlIndexResponse]
  ): Unit = js.native
  def inspect(params: ParamsResourceUrlinspectionIndexInspect, options: MethodOptions): GaxiosPromise[SchemaInspectUrlIndexResponse] = js.native
  def inspect(
    params: ParamsResourceUrlinspectionIndexInspect,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInspectUrlIndexResponse]
  ): Unit = js.native
  /**
    * Index inspection.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/searchconsole.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const searchconsole = google.searchconsole('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/webmasters',
    *       'https://www.googleapis.com/auth/webmasters.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await searchconsole.urlInspection.index.inspect({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "inspectionUrl": "my_inspectionUrl",
    *       //   "languageCode": "my_languageCode",
    *       //   "siteUrl": "my_siteUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "inspectionResult": {}
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
  def inspect(params: ParamsResourceUrlinspectionIndexInspect, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def inspect(
    params: ParamsResourceUrlinspectionIndexInspect,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
