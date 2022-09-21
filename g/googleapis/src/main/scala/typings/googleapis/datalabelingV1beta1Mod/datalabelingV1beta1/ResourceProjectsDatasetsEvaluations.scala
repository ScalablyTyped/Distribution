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

@JSImport("googleapis/build/src/apis/datalabeling/v1beta1", "datalabeling_v1beta1.Resource$Projects$Datasets$Evaluations")
@js.native
open class ResourceProjectsDatasetsEvaluations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var exampleComparisons: ResourceProjectsDatasetsEvaluationsExamplecomparisons = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Evaluation] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Evaluation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Evaluation] = js.native
  def get(params: ParamsResourceProjectsDatasetsEvaluationsGet): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Evaluation] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsEvaluationsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Evaluation]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasetsEvaluationsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Evaluation],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDatalabelingV1beta1Evaluation]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasetsEvaluationsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDatalabelingV1beta1Evaluation] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsEvaluationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDatalabelingV1beta1Evaluation]
  ): Unit = js.native
  /**
    * Gets an evaluation by resource name (to search, use projects.evaluations.search).
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
    *   const res = await datalabeling.projects.datasets.evaluations.get({
    *     // Required. Name of the evaluation. Format: "projects/{project_id\}/datasets/ {dataset_id\}/evaluations/{evaluation_id\}'
    *     name: 'projects/my-project/datasets/my-dataset/evaluations/my-evaluation',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationType": "my_annotationType",
    *   //   "config": {},
    *   //   "createTime": "my_createTime",
    *   //   "evaluatedItemCount": "my_evaluatedItemCount",
    *   //   "evaluationJobRunTime": "my_evaluationJobRunTime",
    *   //   "evaluationMetrics": {},
    *   //   "name": "my_name"
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
  def get(params: ParamsResourceProjectsDatasetsEvaluationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsDatasetsEvaluationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
