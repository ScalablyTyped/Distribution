package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/vision/v1p2beta1", "vision_v1p2beta1.Resource$Files")
@js.native
open class ResourceFiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def annotate(): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse]): Unit = js.native
  def annotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse] = js.native
  def annotate(params: ParamsResourceFilesAnnotate): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse] = js.native
  def annotate(
    params: ParamsResourceFilesAnnotate,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceFilesAnnotate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse]
  ): Unit = js.native
  def annotate(params: ParamsResourceFilesAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse] = js.native
  def annotate(
    params: ParamsResourceFilesAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudVisionV1p2beta1BatchAnnotateFilesResponse]
  ): Unit = js.native
  /**
    * Service that performs image detection and annotation for a batch of files. Now only "application/pdf", "image/tiff" and "image/gif" are supported. This service will extract at most 5 (customers can specify which 5 in AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation for each image extracted.
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
    * const vision = google.vision('v1p2beta1');
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
    *   const res = await vision.files.annotate({
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
  def annotate(params: ParamsResourceFilesAnnotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def annotate(
    params: ParamsResourceFilesAnnotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def asyncBatchAnnotate(): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def asyncBatchAnnotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceFilesAsyncbatchannotate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceFilesAsyncbatchannotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Run asynchronous image detection and annotation for a list of generic files, such as PDF files, which may contain multiple pages and multiple images per page. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse` (results).
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
    * const vision = google.vision('v1p2beta1');
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
    *   const res = await vision.files.asyncBatchAnnotate({
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
  def asyncBatchAnnotate(params: ParamsResourceFilesAsyncbatchannotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def asyncBatchAnnotate(
    params: ParamsResourceFilesAsyncbatchannotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
