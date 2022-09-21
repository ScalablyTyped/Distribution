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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Evaluations$Examplecomparisons")
@js.native
open class ResourceProjectsDatasetsEvaluationsExamplecomparisons protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  def search(
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  ): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  def search(params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  def search(
    params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse] = js.native
  def search(
    params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1SearchExampleComparisonsResponse]
  ): Unit = js.native
  /**
    * Searches example comparisons from an evaluation. The return format is a list of example comparisons that show ground truth and prediction(s) for a single input. Search by providing an evaluation ID.
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
    *   const res =
    *     await datalabeling.projects.datasets.evaluations.exampleComparisons.search({
    *       // Required. Name of the Evaluation resource to search for example comparisons from. Format: "projects/{project_id\}/datasets/{dataset_id\}/evaluations/ {evaluation_id\}"
    *       parent:
    *         'projects/my-project/datasets/my-dataset/evaluations/my-evaluation',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "pageSize": 0,
    *         //   "pageToken": "my_pageToken"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "exampleComparisons": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def search(
    params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceProjectsDatasetsEvaluationsExamplecomparisonsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
