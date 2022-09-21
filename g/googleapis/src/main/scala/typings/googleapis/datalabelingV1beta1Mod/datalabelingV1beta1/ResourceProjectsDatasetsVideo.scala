package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Video")
@js.native
open class ResourceProjectsDatasetsVideo protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def label(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def label(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def label(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def label(params: ParamsResourceProjectsDatasetsVideoLabel): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def label(
    params: ParamsResourceProjectsDatasetsVideoLabel,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def label(
    params: ParamsResourceProjectsDatasetsVideoLabel,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def label(params: ParamsResourceProjectsDatasetsVideoLabel, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def label(
    params: ParamsResourceProjectsDatasetsVideoLabel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Starts a labeling task for video. The type of video labeling task is configured by feature in the request.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/datalabeling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const datalabeling = google.datalabeling('v1beta1');
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
    *   const res = await datalabeling.projects.datasets.video.label({
    *     // Required. Name of the dataset to request labeling task, format: projects/{project_id\}/datasets/{dataset_id\}
    *     parent: 'projects/my-project/datasets/my-dataset',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "basicConfig": {},
    *       //   "eventConfig": {},
    *       //   "feature": "my_feature",
    *       //   "objectDetectionConfig": {},
    *       //   "objectTrackingConfig": {},
    *       //   "videoClassificationConfig": {}
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
  def label(params: ParamsResourceProjectsDatasetsVideoLabel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def label(
    params: ParamsResourceProjectsDatasetsVideoLabel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
