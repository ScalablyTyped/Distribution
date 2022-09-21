package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Services$Nlp")
@js.native
open class ResourceProjectsLocationsServicesNlp protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def analyzeEntities(): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]): Unit = js.native
  def analyzeEntities(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(
    params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities,
    options: BodyResponseCallback[Readable | SchemaAnalyzeEntitiesResponse],
    callback: BodyResponseCallback[Readable | SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities, options: MethodOptions): GaxiosPromise[SchemaAnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnalyzeEntitiesResponse]
  ): Unit = js.native
  /**
    * Analyze heathcare entity in a document. Its response includes the recognized entity mentions and the relationships between them. AnalyzeEntities uses context aware models to detect entities. This method can only analyze documents written in English.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/healthcare.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const healthcare = google.healthcare('v1beta1');
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
    *   const res = await healthcare.projects.locations.services.nlp.analyzeEntities({
    *     // The resource name of the service of the form: "projects/{project_id\}/locations/{location_id\}/services/nlp".
    *     nlpService: 'projects/my-project/locations/my-location/services/nlp',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "documentContent": "my_documentContent",
    *       //   "licensedVocabularies": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entities": [],
    *   //   "entityMentions": [],
    *   //   "relationships": []
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
  def analyzeEntities(params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def analyzeEntities(
    params: ParamsResourceProjectsLocationsServicesNlpAnalyzeentities,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
