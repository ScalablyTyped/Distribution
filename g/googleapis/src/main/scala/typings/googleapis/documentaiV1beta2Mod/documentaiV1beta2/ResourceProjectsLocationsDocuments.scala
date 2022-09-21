package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/documentai/v1beta2", "documentai_v1beta2.Resource$Projects$Locations$Documents")
@js.native
open class ResourceProjectsLocationsDocuments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchProcess(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchProcess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(params: ParamsResourceProjectsLocationsDocumentsBatchprocess): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsDocumentsBatchprocess,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsDocumentsBatchprocess,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(params: ParamsResourceProjectsLocationsDocumentsBatchprocess, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsDocumentsBatchprocess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * LRO endpoint to batch process many documents. The output is written to Cloud Storage as JSON in the [Document] format.
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
    * const documentai = google.documentai('v1beta2');
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
    *   const res = await documentai.projects.locations.documents.batchProcess({
    *     // Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no location is specified, a region will be chosen automatically.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
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
  def batchProcess(params: ParamsResourceProjectsLocationsDocumentsBatchprocess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsDocumentsBatchprocess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def process(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta2Document] = js.native
  def process(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta2Document]): Unit = js.native
  def process(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta2Document] = js.native
  def process(params: ParamsResourceProjectsLocationsDocumentsProcess): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta2Document] = js.native
  def process(
    params: ParamsResourceProjectsLocationsDocumentsProcess,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta2Document]
  ): Unit = js.native
  def process(
    params: ParamsResourceProjectsLocationsDocumentsProcess,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta2Document],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta2Document]
  ): Unit = js.native
  def process(params: ParamsResourceProjectsLocationsDocumentsProcess, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta2Document] = js.native
  def process(
    params: ParamsResourceProjectsLocationsDocumentsProcess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta2Document]
  ): Unit = js.native
  /**
    * Processes a single document.
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
    * const documentai = google.documentai('v1beta2');
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
    *   const res = await documentai.projects.locations.documents.process({
    *     // Target project and location to make a call. Format: `projects/{project-id\}/locations/{location-id\}`. If no location is specified, a region will be chosen automatically. This field is only populated when used in ProcessDocument method.
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "automlParams": {},
    *       //   "documentType": "my_documentType",
    *       //   "entityExtractionParams": {},
    *       //   "formExtractionParams": {},
    *       //   "inputConfig": {},
    *       //   "ocrParams": {},
    *       //   "outputConfig": {},
    *       //   "parent": "my_parent",
    *       //   "tableExtractionParams": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "content": "my_content",
    *   //   "entities": [],
    *   //   "entityRelations": [],
    *   //   "error": {},
    *   //   "labels": [],
    *   //   "mimeType": "my_mimeType",
    *   //   "pages": [],
    *   //   "revisions": [],
    *   //   "shardInfo": {},
    *   //   "text": "my_text",
    *   //   "textChanges": [],
    *   //   "textStyles": [],
    *   //   "uri": "my_uri"
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
  def process(params: ParamsResourceProjectsLocationsDocumentsProcess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def process(
    params: ParamsResourceProjectsLocationsDocumentsProcess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
