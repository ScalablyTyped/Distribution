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

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series$Instances")
@js.native
open class ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * DeleteInstance deletes an instance associated with the given study, series, and SOP Instance UID. Delete requests are equivalent to the GET requests specified in the Retrieve transaction. Study and series search results can take a few seconds to be updated after an instance is deleted using DeleteInstance. For samples that show how to call DeleteInstance, see [Deleting a study, series, or instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#deleting_a_study_series_or_instance).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.delete(
    *       {
    *         // The path of the DeleteInstance request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}`.
    *         dicomWebPath: 'studies/my-studie/series/my-serie/instances/my-instance',
    *         // The name of the DICOM store that is being accessed. For example, `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/dicomStores/{dicom_store_id\}`.
    *         parent:
    *           'projects/my-project/locations/my-location/datasets/my-dataset/dicomStores/my-dicomStore',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var frames: ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFrames = js.native
  
  def retrieveInstance(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveInstance(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveInstance returns instance associated with the given study, series, and SOP Instance UID. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveInstance, see [DICOM study/series/instances](https://cloud.google.com/healthcare/docs/dicom#dicom_studyseriesinstances) and [DICOM instances](https://cloud.google.com/healthcare/docs/dicom#dicom_instances) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveInstance, see [Retrieving an instance](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_an_instance).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveInstance(
    *       {
    *         // The path of the RetrieveInstance DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}`.
    *         dicomWebPath: 'studies/my-studie/series/my-serie/instances/my-instance',
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
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieveinstance,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveMetadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveMetadata(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveInstanceMetadata returns instance associated with the given study, series, and SOP Instance UID presented as metadata with the bulk data removed. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveInstanceMetadata, see [Metadata resources](https://cloud.google.com/healthcare/docs/dicom#metadata_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveInstanceMetadata, see [Retrieving metadata](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_metadata).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveMetadata(
    *       {
    *         // The path of the RetrieveInstanceMetadata DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}/metadata`.
    *         dicomWebPath:
    *           'studies/my-studie/series/my-serie/instances/my-instance/metadata',
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
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrievemetadata,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveRendered(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveRendered(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveRenderedInstance returns instance associated with the given study, series, and SOP Instance UID in an acceptable Rendered Media Type. See [RetrieveTransaction](http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveRenderedInstance, see [Rendered resources](https://cloud.google.com/healthcare/docs/dicom#rendered_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveRenderedInstance, see [Retrieving consumer image formats](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_consumer_image_formats).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.retrieveRendered(
    *       {
    *         // The path of the RetrieveRenderedInstance DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}/rendered`.
    *         dicomWebPath:
    *           'studies/my-studie/series/my-serie/instances/my-instance/rendered',
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
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesRetrieverendered,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
