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

@JSImport("googleapis/build/src/apis/healthcare/v1", "healthcare_v1.Resource$Projects$Locations$Datasets$Dicomstores$Studies$Series$Instances$Frames")
@js.native
open class ResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFrames protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def retrieveFrames(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveFrames(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveFrames returns instances associated with the given study, series, SOP Instance UID and frame numbers. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4\}. For details on the implementation of RetrieveFrames, see [DICOM frames](https://cloud.google.com/healthcare/docs/dicom#dicom_frames) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveFrames, see [Retrieving DICOM data](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_dicom_data).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.frames.retrieveFrames(
    *       {
    *         // The path of the RetrieveFrames DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}/frames/{frame_list\}`.
    *         dicomWebPath:
    *           'studies/my-studie/series/my-serie/instances/my-instance/frames/my-frame',
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
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieveframes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def retrieveRendered(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveRendered(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * RetrieveRenderedFrames returns instances associated with the given study, series, SOP Instance UID and frame numbers in an acceptable Rendered Media Type. See [RetrieveTransaction] (http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_10.4). For details on the implementation of RetrieveRenderedFrames, see [Rendered resources](https://cloud.google.com/healthcare/docs/dicom#rendered_resources) in the Cloud Healthcare API conformance statement. For samples that show how to call RetrieveRenderedFrames, see [Retrieving consumer image formats](https://cloud.google.com/healthcare/docs/how-tos/dicomweb#retrieving_consumer_image_formats).
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
    *     await healthcare.projects.locations.datasets.dicomStores.studies.series.instances.frames.retrieveRendered(
    *       {
    *         // The path of the RetrieveRenderedFrames DICOMweb request. For example, `studies/{study_uid\}/series/{series_uid\}/instances/{instance_uid\}/frames/{frame_list\}/rendered`.
    *         dicomWebPath:
    *           'studies/my-studie/series/my-serie/instances/my-instance/frames/my-frame/rendered',
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
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def retrieveRendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSeriesInstancesFramesRetrieverendered,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
