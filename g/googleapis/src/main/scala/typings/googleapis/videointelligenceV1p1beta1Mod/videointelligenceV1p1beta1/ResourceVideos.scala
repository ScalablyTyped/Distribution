package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/videointelligence/v1p1beta1", "videointelligence_v1p1beta1.Resource$Videos")
@js.native
open class ResourceVideos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def annotate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def annotate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(params: ParamsResourceVideosAnnotate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def annotate(params: ParamsResourceVideosAnnotate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Performs asynchronous video annotation. Progress and results can be retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains `AnnotateVideoProgress` (progress). `Operation.response` contains `AnnotateVideoResponse` (results).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/videointelligence.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const videointelligence = google.videointelligence('v1p1beta1');
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
    *   const res = await videointelligence.videos.annotate({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "features": [],
    *       //   "inputContent": "my_inputContent",
    *       //   "inputUri": "my_inputUri",
    *       //   "locationId": "my_locationId",
    *       //   "outputUri": "my_outputUri",
    *       //   "videoContext": {}
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
  def annotate(params: ParamsResourceVideosAnnotate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def annotate(
    params: ParamsResourceVideosAnnotate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
