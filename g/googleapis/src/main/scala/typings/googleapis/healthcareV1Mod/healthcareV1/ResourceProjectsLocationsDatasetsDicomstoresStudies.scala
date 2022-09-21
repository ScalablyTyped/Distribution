package typings.googleapis.healthcareV1Mod.healthcareV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1", "healthcare_v1.Resource$Projects$Locations$Datasets$Dicomstores$Studies")
@js.native
open class ResourceProjectsLocationsDatasetsDicomstoresStudies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * DeleteStudy deletes all instances within the given study. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. The method returns an Operation which will be marked successful when the deletion is complete. Warning: Instances cannot be inserted into a study that is being deleted by an operation until the operation completes. For samples that show how to call DeleteStudy, see [Deleting a study, series, or instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#deleting_a_study_series_or_instance).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.delete({
    *       // The path of the DeleteStudy request. For example, `studies/{study_uid\}`.
    *       dicomWebPath: 'studies/my-studie',
    *
    *       parent:
    *         'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
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
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveMetadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveMetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveStudyMetadata returns instance associated with the given study presented as metadata with the bulk data removed. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveStudyMetadata, see [Metadata resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveStudyMetadata, see [Retrieving metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_metadata).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.retrieveMetadata(
    *       {
    *         // The path of the RetrieveStudyMetadata DICOMweb request. For example, `studies/{study_uid\}/metadata`.
    *         dicomWebPath: 'studies/my-studie/metadata',
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
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveStudy(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveStudy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveStudy returns all instances within the given study. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveStudy, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveStudy, see [Retrieving DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_dicom_data).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.retrieveStudy(
    *       {
    *         // The path of the RetrieveStudy DICOMweb request. For example, `studies/{study_uid\}`.
    *         dicomWebPath: 'studies/my-studie',
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
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForInstances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * SearchForInstances returns a list of matching instances. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForInstances, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForInstances, see [Searching for studies, series, instances, and frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.searchForInstances(
    *       {
    *         // The path of the SearchForInstancesRequest DICOMweb request. For example, `instances`, `series/{series_uid\}/instances`, or `studies/{study_uid\}/instances`.
    *         dicomWebPath: 'studies/my-studie/instances',
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
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def searchForSeries(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForSeries(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * SearchForSeries returns a list of matching series. See [Search Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.6). For details on the implementation of SearchForSeries, see [Search transaction](https://cloud.google.com/healthcare/docs/dicom#search_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call SearchForSeries, see [Searching for studies, series, instances, and frames](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#searching_for_studies_series_instances_and_frames).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.searchForSeries(
    *       {
    *         // The path of the SearchForSeries DICOMweb request. For example, `series` or `studies/{study_uid\}/series`.
    *         dicomWebPath: 'studies/my-studie/series',
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
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var series: ResourceProjectsLocationsDatasetsDicomstoresStudiesSeries = js.native
  
  def storeInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def storeInstances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * StoreInstances stores DICOM instances associated with study instance unique identifiers (SUID). See [Store Transaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.5). For details on the implementation of StoreInstances, see [Store transaction](https://cloud.google.com/healthcare/docs/dicom#store_transaction) in the Cloud Healthcare API conformance statement. For samples that show how to call StoreInstances, see [Storing DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#storing_dicom_data).
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
    * const healthcare = google.healthcare('v1');
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.storeInstances(
    *       {
    *         // The path of the StoreInstances DICOMweb request. For example, `studies/[{study_uid\}]`. Note that the `study_uid` is optional.
    *         dicomWebPath: 'studies/my-studie',
    *         // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "contentType": "my_contentType",
    *           //   "data": "my_data",
    *           //   "extensions": []
    *           // }
    *         },
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
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
