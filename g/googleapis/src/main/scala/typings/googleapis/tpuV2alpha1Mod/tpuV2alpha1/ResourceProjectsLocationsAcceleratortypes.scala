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

@JSImport("googleapis/build/src/apis/tpu/v2alpha1", "tpu_v2alpha1.Resource$Projects$Locations$Acceleratortypes")
@js.native
open class ResourceProjectsLocationsAcceleratortypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(callback: BodyResponseCallback[SchemaAcceleratorType]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(params: ParamsResourceProjectsLocationsAcceleratortypesGet): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    callback: BodyResponseCallback[SchemaAcceleratorType]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    options: BodyResponseCallback[Readable | SchemaAcceleratorType],
    callback: BodyResponseCallback[Readable | SchemaAcceleratorType]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsAcceleratortypesGet, options: MethodOptions): GaxiosPromise[SchemaAcceleratorType] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAcceleratorType]
  ): Unit = js.native
  /**
    * Gets AcceleratorType.
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
    *   const res = await tpu.projects.locations.acceleratorTypes.get({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/acceleratorTypes/my-acceleratorType',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceProjectsLocationsAcceleratortypesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsAcceleratortypesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsAcceleratortypesList): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    options: BodyResponseCallback[Readable | SchemaListAcceleratorTypesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsAcceleratortypesList, options: MethodOptions): GaxiosPromise[SchemaListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAcceleratorTypesResponse]
  ): Unit = js.native
  /**
    * Lists accelerator types supported by this API.
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
    *   const res = await tpu.projects.locations.acceleratorTypes.list({
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
    *   //   "acceleratorTypes": [],
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceProjectsLocationsAcceleratortypesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsAcceleratortypesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
