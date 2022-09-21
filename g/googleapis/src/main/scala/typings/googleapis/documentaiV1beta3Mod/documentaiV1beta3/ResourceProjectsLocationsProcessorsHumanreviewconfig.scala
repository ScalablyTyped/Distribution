package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/documentai/v1beta3", "documentai_v1beta3.Resource$Projects$Locations$Processors$Humanreviewconfig")
@js.native
open class ResourceProjectsLocationsProcessorsHumanreviewconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def reviewDocument(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reviewDocument(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def reviewDocument(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reviewDocument(params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Send a document for Human Review. The input document should be processed by the specified processor.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/documentai.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const documentai = google.documentai('v1beta3');
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
    *     await documentai.projects.locations.processors.humanReviewConfig.reviewDocument(
    *       {
    *         // Required. The resource name of the HumanReviewConfig that the document will be reviewed with.
    *         humanReviewConfig:
    *           'projects/my-project/locations/my-location/processors/my-processor/humanReviewConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "document": {},
    *           //   "documentSchema": {},
    *           //   "enableSchemaValidation": false,
    *           //   "inlineDocument": {},
    *           //   "priority": "my_priority"
    *           // }
    *         },
    *       }
    *     );
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
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def reviewDocument(
    params: ParamsResourceProjectsLocationsProcessorsHumanreviewconfigReviewdocument,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
