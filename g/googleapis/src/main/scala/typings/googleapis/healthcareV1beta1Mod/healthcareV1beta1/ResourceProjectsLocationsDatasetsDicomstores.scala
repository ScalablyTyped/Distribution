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

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores")
@js.native
open class ResourceProjectsLocationsDatasetsDicomstores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaDicomStore] = js.native
  def create(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate): GaxiosPromise[SchemaDicomStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    options: BodyResponseCallback[Readable | SchemaDicomStore],
    callback: BodyResponseCallback[Readable | SchemaDicomStore]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * Creates a new DICOM store within the parent dataset.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.create({
    *     // The ID of the DICOM store that is being created. Any string value up to 256 characters in length.
    *     dicomStoreId: 'placeholder-value',
    *     // The name of the dataset this DICOM store belongs to.
    *     parent: 'projects/my-project/locations/my-location/datasets/my-dataset',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "notificationConfig": {},
    *       //   "streamConfigs": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "streamConfigs": []
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
  def create(params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deidentify(): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deidentify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def deidentify(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * De-identifies data from the source store and writes it to the destination store. The metadata field type is OperationMetadata. If the request is successful, the response field type is DeidentifyDicomStoreSummary. The LRO result may still be successful if de-identification fails for some DICOM instances. The output DICOM store will not contain these failed resources. The number of resources processed are tracked in Operation.metadata. Error details are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging).
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.deidentify({
    *       // Source DICOM store resource name. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *       sourceStore:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "config": {},
    *         //   "destinationStore": "my_destinationStore",
    *         //   "filterConfig": {},
    *         //   "gcsConfigUri": "my_gcsConfigUri"
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
  def deidentify(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDeidentify,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the specified DICOM store and removes all images that are contained within it.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.delete({
    *     // The resource name of the DICOM store to delete.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `export`(): GaxiosPromise[SchemaOperation] = js.native
  def `export`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `export`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `export`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Exports data to the specified destination by copying it from the DICOM store. Errors are also logged to Cloud Logging. For more information, see [Viewing errors in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.export({
    *     // The DICOM store resource name from which to export the data. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bigqueryDestination": {},
    *       //   "filterConfig": {},
    *       //   "gcsDestination": {}
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
  def `export`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `export`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaDicomStore] = js.native
  def get(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet): GaxiosPromise[SchemaDicomStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    options: BodyResponseCallback[Readable | SchemaDicomStore],
    callback: BodyResponseCallback[Readable | SchemaDicomStore]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * Gets the specified DICOM store.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.get({
    *     // The resource name of the DICOM store to get.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "streamConfigs": []
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
  def get(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.getIamPolicy({
    *       // Optional. The maximum policy version that will be used to format the policy. Valid values are 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with any conditional role bindings must specify version 3. Policies with no conditional role bindings may specify any valid value or leave the field unset. The policy in the response might use the policy version that you specified, or it might use a lower policy version. For example, if you specify version 3, but the policy has no conditional role bindings, the response uses version 1. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
    *       'options.requestedPolicyVersion': 'placeholder-value',
    *       // REQUIRED: The resource for which the policy is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Imports data into the DICOM store by copying it from the specified source. Errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging). The metadata field type is OperationMetadata.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.import({
    *     // The name of the DICOM store resource into which the data is imported. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "gcsSource": {}
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
  def `import`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDicomStoresResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsDicomstoresList): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    callback: BodyResponseCallback[SchemaListDicomStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    options: BodyResponseCallback[Readable | SchemaListDicomStoresResponse],
    callback: BodyResponseCallback[Readable | SchemaListDicomStoresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsDicomstoresList, options: MethodOptions): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDicomStoresResponse]
  ): Unit = js.native
  /**
    * Lists the DICOM stores in the given dataset.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.list({
    *     // Restricts stores returned to those matching a filter. The following syntax is available: * A string field value can be written as text inside quotation marks, for example `"query text"`. The only valid relational operation for text fields is equality (`=`), where text is searched within the field, rather than having the field be equal to the text. For example, `"Comment = great"` returns messages with `great` in the comment field. * A number field value can be written as an integer, a decimal, or an exponential. The valid relational operators for number fields are the equality operator (`=`), along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * A date field value must be written in `yyyy-mm-dd` form. Fields with date and time use the RFC3339 time format. Leading zeros are required for one-digit months and days. The valid relational operators for date fields are the equality operator (`=`) , along with the less than/greater than operators (`<`, `<=`, `\>`, `\>=`). Note that there is no inequality (`!=`) operator. You can prepend the `NOT` operator to an expression to negate it. * Multiple field query expressions can be combined in one query by adding `AND` or `OR` operators between the expressions. If a boolean operator appears within a quoted string, it is not treated as special, it's just another part of the character string to be matched. You can prepend the `NOT` operator to an expression to negate it. Only filtering on labels is supported. For example, `labels.key=value`.
    *     filter: 'placeholder-value',
    *     // Limit on the number of DICOM stores to return in a single response. If not specified, 100 is used. May not be larger than 1000.
    *     pageSize: 'placeholder-value',
    *     // The next_page_token value returned from the previous List request, if any.
    *     pageToken: 'placeholder-value',
    *     // Name of the dataset.
    *     parent: 'projects/my-project/locations/my-location/datasets/my-dataset',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dicomStores": [],
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
  def list(params: ParamsResourceProjectsLocationsDatasetsDicomstoresList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    options: BodyResponseCallback[Readable | SchemaDicomStore],
    callback: BodyResponseCallback[Readable | SchemaDicomStore]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * Updates the specified DICOM store.
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
    *   const res = await healthcare.projects.locations.datasets.dicomStores.patch({
    *     // Resource name of the DICOM store, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *     name: 'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *     // The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "labels": {},
    *       //   "name": "my_name",
    *       //   "notificationConfig": {},
    *       //   "streamConfigs": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "labels": {},
    *   //   "name": "my_name",
    *   //   "notificationConfig": {},
    *   //   "streamConfigs": []
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
  def patch(params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForInstances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * SearchForInstances returns a list of matching instances. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForInstances, see [Searching for studies, series, instances, and frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.searchForInstances(
    *       {
    *         // The path of the SearchForInstancesRequest DICOMweb request. For example, `instances`, `series/{series_uid\}/instances`, or `studies/{study_uid\}/instances`.
    *         dicomWebPath: 'instances',
    *         // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForSeries(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForSeries(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * SearchForSeries returns a list of matching series. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForSeries, see [Searching for studies, series, instances, and frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.searchForSeries({
    *       // The path of the SearchForSeries DICOMweb request. For example, `series` or `studies/{study_uid\}/series`.
    *       dicomWebPath: 'series',
    *       // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForStudies(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForStudies(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * SearchForStudies returns a list of matching studies. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of SearchForStudies, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForStudies, see [Searching for studies, series, instances, and frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.searchForStudies({
    *       // The path of the SearchForStudies DICOMweb request. For example, `studies`.
    *       dicomWebPath: 'studies',
    *       // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: BodyResponseCallback[Readable | SchemaPolicy],
    callback: BodyResponseCallback[Readable | SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors.
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.setIamPolicy({
    *       // REQUIRED: The resource for which the policy is being specified. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *       resource:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "policy": {},
    *         //   "updateMask": "my_updateMask"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditConfigs": [],
    *   //   "bindings": [],
    *   //   "etag": "my_etag",
    *   //   "version": 0
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
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def storeInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def storeInstances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances, see [Storing DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#storing_dicom_data).
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.storeInstances({
    *       // The path of the StoreInstances DICOMweb request. For example, `studies/[{study_uid\}]`. Note that the `study_uid` is optional.
    *       dicomWebPath: 'studies',
    *       // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "contentType": "my_contentType",
    *         //   "data": "my_data",
    *         //   "extensions": []
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var studies: ResourceProjectsLocationsDatasetsDicomstoresStudies = js.native
  
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[Readable | SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
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
    *   const res =
    *     await healthcare.projects.locations.datasets.dicomStores.testIamPermissions(
    *       {
    *         // REQUIRED: The resource for which the policy detail is being requested. See [Resource names](https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    *         resource:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "permissions": []
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "permissions": []
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
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
