package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tpu/v2alpha1", "tpu_v2alpha1.Resource$Projects$Locations$Runtimeversions")
@js.native
open class ResourceProjectsLocationsRuntimeversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaRuntimeVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaRuntimeVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRuntimeVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsRuntimeversionsGet): GaxiosPromise[SchemaRuntimeVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimeversionsGet,
    callback: BodyResponseCallback[SchemaRuntimeVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimeversionsGet,
    options: BodyResponseCallback[Readable | SchemaRuntimeVersion],
    callback: BodyResponseCallback[Readable | SchemaRuntimeVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRuntimeversionsGet, options: MethodOptions): GaxiosPromise[SchemaRuntimeVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimeversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRuntimeVersion]
  ): Unit = js.native
  /**
    * Gets a runtime version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.runtimeVersions.get({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/runtimeVersions/my-runtimeVersion',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "version": "my_version"
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
  def get(params: ParamsResourceProjectsLocationsRuntimeversionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRuntimeversionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListRuntimeVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListRuntimeVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListRuntimeVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimeversionsList): GaxiosPromise[SchemaListRuntimeVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimeversionsList,
    callback: BodyResponseCallback[SchemaListRuntimeVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimeversionsList,
    options: BodyResponseCallback[Readable | SchemaListRuntimeVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListRuntimeVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRuntimeversionsList, options: MethodOptions): GaxiosPromise[SchemaListRuntimeVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimeversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListRuntimeVersionsResponse]
  ): Unit = js.native
  /**
    * Lists runtime versions supported by this API.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/tpu.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const tpu = google.tpu('v2alpha1');
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
    *   const res = await tpu.projects.locations.runtimeVersions.list({
    *     // List filter.
    *     filter: 'placeholder-value',
    *     // Sort results.
    *     orderBy: 'placeholder-value',
    *     // The maximum number of items to return.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from a previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent resource name.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "runtimeVersions": [],
    *   //   "unreachable": []
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
  def list(params: ParamsResourceProjectsLocationsRuntimeversionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRuntimeversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
