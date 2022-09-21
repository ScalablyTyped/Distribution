package typings.googleapis.v2betaMod.cloudfunctionsV2beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudfunctions/v2beta", "cloudfunctions_v2beta.Resource$Projects$Locations$Runtimes")
@js.native
open class ResourceProjectsLocationsRuntimes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRuntimesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimesList): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    callback: BodyResponseCallback[SchemaListRuntimesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: BodyResponseCallback[Readable | SchemaListRuntimesResponse],
    callback: BodyResponseCallback[Readable | SchemaListRuntimesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimesList, options: MethodOptions): GaxiosPromise[SchemaListRuntimesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRuntimesResponse]
  ): Unit = js.native
  /**
    * Returns a list of runtimes that are supported for the requested project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudfunctions.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudfunctions = google.cloudfunctions('v2beta');
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
    *   const res = await cloudfunctions.projects.locations.runtimes.list({
    *     // The filter for Runtimes that match the filter expression, following the syntax outlined in https://google.aip.dev/160.
    *     filter: 'placeholder-value',
    *     // Required. The project and location from which the runtimes should be listed, specified in the format `projects/x/locations/x`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "runtimes": []
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
  def list(params: ParamsResourceProjectsLocationsRuntimesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
