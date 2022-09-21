package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1p1beta1", "vision_v1p1beta1.Resource$Projects$Images")
@js.native
open class ResourceProjectsImages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def annotate(): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]): Unit = js.native
  def annotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(params: ParamsResourceProjectsImagesAnnotate): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceProjectsImagesAnnotate,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceProjectsImagesAnnotate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  def annotate(params: ParamsResourceProjectsImagesAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse] = js.native
  def annotate(
    params: ParamsResourceProjectsImagesAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  ): Unit = js.native
  /**
    * Run image detection and annotation for a batch of images.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1p1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.images.annotate({
    *     // Optional. Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no parent is specified, a region will be chosen automatically. Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "parent": "my_parent",
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "responses": []
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
  def annotate(params: ParamsResourceProjectsImagesAnnotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def annotate(
    params: ParamsResourceProjectsImagesAnnotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def asyncBatchAnnotate(): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def asyncBatchAnnotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(params: ParamsResourceProjectsImagesAsyncbatchannotate): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceProjectsImagesAsyncbatchannotate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceProjectsImagesAsyncbatchannotate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def asyncBatchAnnotate(params: ParamsResourceProjectsImagesAsyncbatchannotate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceProjectsImagesAsyncbatchannotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Run asynchronous image detection and annotation for a list of images. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateImagesResponse` (results). This service will write image annotation outputs to json files in customer GCS bucket, each json file containing BatchAnnotateImagesResponse proto.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/vision.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const vision = google.vision('v1p1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-vision',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await vision.projects.images.asyncBatchAnnotate({
    *     // Optional. Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no parent is specified, a region will be chosen automatically. Supported location-ids: `us`: USA country only, `asia`: East asia areas, like Japan, Taiwan, `eu`: The European Union. Example: `projects/project-A/locations/eu`.
    *     parent: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "outputConfig": {},
    *       //   "parent": "my_parent",
    *       //   "requests": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def asyncBatchAnnotate(params: ParamsResourceProjectsImagesAsyncbatchannotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceProjectsImagesAsyncbatchannotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
