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

@JSImport("googleapis/build/src/apis/documentai/v1beta3", "documentai_v1beta3.Resource$Projects$Locations$Processors$Processorversions")
@js.native
open class ResourceProjectsLocationsProcessorsProcessorversions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchProcess(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchProcess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
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
    *     await documentai.projects.locations.processors.processorVersions.batchProcess(
    *       {
    *         // Required. The resource name of Processor or ProcessorVersion. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`, or `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{processorVersion\}`
    *         name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "documentOutputConfig": {},
    *           //   "inputConfigs": [],
    *           //   "inputDocuments": {},
    *           //   "outputConfig": {},
    *           //   "skipHumanReview": false
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
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsBatchprocess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes the processor version, all artifacts under the processor version will be deleted.
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
    *     await documentai.projects.locations.processors.processorVersions.delete({
    *       // Required. The processor version resource name to be deleted.
    *       name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *     });
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
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deploy(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def deploy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def deploy(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deploys the processor version.
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
    *     await documentai.projects.locations.processors.processorVersions.deploy({
    *       // Required. The processor version resource name to be deployed.
    *       name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
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
  def deploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def deploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsDeploy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]
  ): Unit = js.native
  /**
    * Gets a processor version detail.
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
    *     await documentai.projects.locations.processors.processorVersions.get({
    *       // Required. The processor resource name.
    *       name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "deprecationInfo": {},
    *   //   "displayName": "my_displayName",
    *   //   "googleManaged": false,
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "kmsKeyVersionName": "my_kmsKeyVersionName",
    *   //   "name": "my_name",
    *   //   "state": "my_state"
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
  def get(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse]
  ): Unit = js.native
  /**
    * Lists all versions of a processor.
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
    *     await documentai.projects.locations.processors.processorVersions.list({
    *       // The maximum number of processor versions to return. If unspecified, at most 10 processor versions will be returned. The maximum value is 20; values above 20 will be coerced to 20.
    *       pageSize: 'placeholder-value',
    *       // We will return the processor versions sorted by creation time. The page token will point to the next processor version.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent (project, location and processor) to list all versions. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`
    *       parent:
    *         'projects/my-project/locations/my-location/processors/my-processor',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "processorVersions": []
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
  def list(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def process(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]): Unit = js.native
  def process(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
  ): Unit = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
  ): Unit = js.native
  def process(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
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
    *     await documentai.projects.locations.processors.processorVersions.process({
    *       // Required. The resource name of the Processor or ProcessorVersion to use for processing. If a Processor is specified, the server will use its default version. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`, or `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{processorVersion\}`
    *       name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "document": {},
    *         //   "fieldMask": "my_fieldMask",
    *         //   "inlineDocument": {},
    *         //   "rawDocument": {},
    *         //   "skipHumanReview": false
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "document": {},
    *   //   "humanReviewOperation": "my_humanReviewOperation",
    *   //   "humanReviewStatus": {}
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
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsProcess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def undeploy(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def undeploy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def undeploy(params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Undeploys the processor version.
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
    *     await documentai.projects.locations.processors.processorVersions.undeploy({
    *       // Required. The processor version resource name to be undeployed.
    *       name: 'projects/my-project/locations/my-location/processors/my-processor/processorVersions/my-processorVersion',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     });
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
  def undeploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def undeploy(
    params: ParamsResourceProjectsLocationsProcessorsProcessorversionsUndeploy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
