package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/tpu/v1alpha1", "tpu_v1alpha1.Resource$Projects$Locations$Tensorflowversions")
@js.native
open class ResourceProjectsLocationsTensorflowversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaTensorFlowVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsTensorflowversionsGet): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    callback: BodyResponseCallback[SchemaTensorFlowVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    options: BodyResponseCallback[Readable | SchemaTensorFlowVersion],
    callback: BodyResponseCallback[Readable | SchemaTensorFlowVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTensorflowversionsGet, options: MethodOptions): GaxiosPromise[SchemaTensorFlowVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTensorFlowVersion]
  ): Unit = js.native
  /**
    * Gets TensorFlow Version.
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
    * const tpu = google.tpu('v1alpha1');
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
    *   const res = await tpu.projects.locations.tensorflowVersions.get({
    *     // Required. The resource name.
    *     name: 'projects/my-project/locations/my-location/tensorflowVersions/my-tensorflowVersion',
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
  def get(params: ParamsResourceProjectsLocationsTensorflowversionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTensorflowversionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTensorflowversionsList): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    options: BodyResponseCallback[Readable | SchemaListTensorFlowVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTensorflowversionsList, options: MethodOptions): GaxiosPromise[SchemaListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTensorFlowVersionsResponse]
  ): Unit = js.native
  /**
    * Lists TensorFlow versions supported by this API.
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
    * const tpu = google.tpu('v1alpha1');
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
    *   const res = await tpu.projects.locations.tensorflowVersions.list({
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
    *   //   "tensorflowVersions": [],
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
  def list(params: ParamsResourceProjectsLocationsTensorflowversionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTensorflowversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
