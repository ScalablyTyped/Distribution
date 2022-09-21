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

@JSImport("googleapis/build/src/apis/documentai/v1beta3", "documentai_v1beta3.Resource$Projects$Locations$Processors")
@js.native
open class ResourceProjectsLocationsProcessors protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchProcess(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def batchProcess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(params: ParamsResourceProjectsLocationsProcessorsBatchprocess): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsBatchprocess,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsBatchprocess,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def batchProcess(params: ParamsResourceProjectsLocationsProcessorsBatchprocess, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsBatchprocess,
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
    *   const res = await documentai.projects.locations.processors.batchProcess({
    *     // Required. The resource name of Processor or ProcessorVersion. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`, or `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{processorVersion\}`
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "documentOutputConfig": {},
    *       //   "inputConfigs": [],
    *       //   "inputDocuments": {},
    *       //   "outputConfig": {},
    *       //   "skipHumanReview": false
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
  def batchProcess(params: ParamsResourceProjectsLocationsProcessorsBatchprocess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def batchProcess(
    params: ParamsResourceProjectsLocationsProcessorsBatchprocess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def create(params: ParamsResourceProjectsLocationsProcessorsCreate): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProcessorsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsProcessorsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3Processor],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProcessorsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProcessorsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  /**
    * Creates a processor from the type processor that the user chose. The processor will be at "ENABLED" state by default after its creation.
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
    *   const res = await documentai.projects.locations.processors.create({
    *     // Required. The parent (project and location) under which to create the processor. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "createTime": "my_createTime",
    *       //   "defaultProcessorVersion": "my_defaultProcessorVersion",
    *       //   "displayName": "my_displayName",
    *       //   "kmsKeyName": "my_kmsKeyName",
    *       //   "name": "my_name",
    *       //   "processEndpoint": "my_processEndpoint",
    *       //   "state": "my_state",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "defaultProcessorVersion": "my_defaultProcessorVersion",
    *   //   "displayName": "my_displayName",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "name": "my_name",
    *   //   "processEndpoint": "my_processEndpoint",
    *   //   "state": "my_state",
    *   //   "type": "my_type"
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
  def create(params: ParamsResourceProjectsLocationsProcessorsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProcessorsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsProcessorsDelete): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsDelete,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsProcessorsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Deletes the processor, unloads all deployed model artifacts if it was enabled and then deletes all artifacts associated with this processor.
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
    *   const res = await documentai.projects.locations.processors.delete({
    *     // Required. The processor resource name to be deleted.
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
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
  def delete(params: ParamsResourceProjectsLocationsProcessorsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsProcessorsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def disable(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def disable(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def disable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def disable(params: ParamsResourceProjectsLocationsProcessorsDisable): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsProcessorsDisable,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def disable(
    params: ParamsResourceProjectsLocationsProcessorsDisable,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def disable(params: ParamsResourceProjectsLocationsProcessorsDisable, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsProcessorsDisable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Disables a processor
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
    *   const res = await documentai.projects.locations.processors.disable({
    *     // Required. The processor resource name to be disabled.
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def disable(params: ParamsResourceProjectsLocationsProcessorsDisable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def disable(
    params: ParamsResourceProjectsLocationsProcessorsDisable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def enable(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def enable(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def enable(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def enable(params: ParamsResourceProjectsLocationsProcessorsEnable): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsProcessorsEnable,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def enable(
    params: ParamsResourceProjectsLocationsProcessorsEnable,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def enable(params: ParamsResourceProjectsLocationsProcessorsEnable, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsProcessorsEnable,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Enables a processor
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
    *   const res = await documentai.projects.locations.processors.enable({
    *     // Required. The processor resource name to be enabled.
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
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
  def enable(params: ParamsResourceProjectsLocationsProcessorsEnable, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enable(
    params: ParamsResourceProjectsLocationsProcessorsEnable,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def get(params: ParamsResourceProjectsLocationsProcessorsGet): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3Processor],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProcessorsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3Processor] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3Processor]
  ): Unit = js.native
  /**
    * Gets a processor detail.
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
    *   const res = await documentai.projects.locations.processors.get({
    *     // Required. The processor resource name.
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "defaultProcessorVersion": "my_defaultProcessorVersion",
    *   //   "displayName": "my_displayName",
    *   //   "kmsKeyName": "my_kmsKeyName",
    *   //   "name": "my_name",
    *   //   "processEndpoint": "my_processEndpoint",
    *   //   "state": "my_state",
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceProjectsLocationsProcessorsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProcessorsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var humanReviewConfig: ResourceProjectsLocationsProcessorsHumanreviewconfig = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsProcessorsList): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsList,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsProcessorsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse]
  ): Unit = js.native
  /**
    * Lists all processors which belong to this project.
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
    *   const res = await documentai.projects.locations.processors.list({
    *     // The maximum number of processors to return. If unspecified, at most 50 processors will be returned. The maximum value is 100; values above 100 will be coerced to 100.
    *     pageSize: 'placeholder-value',
    *     // We will return the processors sorted by creation time. The page token will point to the next processor.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent (project and location) which owns this collection of Processors. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "processors": []
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
  def list(params: ParamsResourceProjectsLocationsProcessorsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsProcessorsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def process(): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]): Unit = js.native
  def process(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(params: ParamsResourceProjectsLocationsProcessorsProcess): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcess,
    callback: BodyResponseCallback[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
  ): Unit = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcess,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudDocumentaiV1beta3ProcessResponse]
  ): Unit = js.native
  def process(params: ParamsResourceProjectsLocationsProcessorsProcess, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudDocumentaiV1beta3ProcessResponse] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcess,
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
    *   const res = await documentai.projects.locations.processors.process({
    *     // Required. The resource name of the Processor or ProcessorVersion to use for processing. If a Processor is specified, the server will use its default version. Format: `projects/{project\}/locations/{location\}/processors/{processor\}`, or `projects/{project\}/locations/{location\}/processors/{processor\}/processorVersions/{processorVersion\}`
    *     name: 'projects/my-project/locations/my-location/processors/my-processor',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "document": {},
    *       //   "fieldMask": "my_fieldMask",
    *       //   "inlineDocument": {},
    *       //   "rawDocument": {},
    *       //   "skipHumanReview": false
    *       // }
    *     },
    *   });
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
  def process(params: ParamsResourceProjectsLocationsProcessorsProcess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def process(
    params: ParamsResourceProjectsLocationsProcessorsProcess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var processorVersions: ResourceProjectsLocationsProcessorsProcessorversions = js.native
  
  def setDefaultProcessorVersion(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setDefaultProcessorVersion(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def setDefaultProcessorVersion(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setDefaultProcessorVersion(params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    options: MethodOptions
  ): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Set the default (active) version of a Processor that will be used in ProcessDocument and BatchProcessDocuments.
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
    *     await documentai.projects.locations.processors.setDefaultProcessorVersion({
    *       // Required. The resource name of the Processor to change default version.
    *       processor:
    *         'projects/my-project/locations/my-location/processors/my-processor',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "defaultProcessorVersion": "my_defaultProcessorVersion"
    *         // }
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
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setDefaultProcessorVersion(
    params: ParamsResourceProjectsLocationsProcessorsSetdefaultprocessorversion,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
