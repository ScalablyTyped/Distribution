package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies$Series$Instances")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstances protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var frames: ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFrames = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.delete
    * @desc DeleteInstance deletes an instance associated with the given study,
    * series, and SOP Instance UID. Delete requests are equivalent to the GET
    * requests specified in the WADO-RS standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instances/{instance_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.metadata
    * @desc RetrieveInstanceMetadata returns instance associated with the given
    * study, series, and SOP Instance UID presented as metadata with the bulk
    * data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instances/{instance_id}/metadata`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def metadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesMetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesMetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesMetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesMetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.rendered
    * @desc RetrieveRenderedInstance returns instance associated with the given
    * study, series, and SOP Instance UID in an acceptable Rendered Media Type.
    * See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.8.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.rendered
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}/rendered`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rendered(): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def rendered(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRendered): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRendered,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRendered,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRendered,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRendered,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.retrieveInstance
    * @desc RetrieveInstance returns instance associated with the given study,
    * series, and SOP Instance UID. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.3.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.retrieveInstance
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveInstance(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveInstance(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRetrieveinstance
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRetrieveinstance,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRetrieveinstance,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRetrieveinstance,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveInstance(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesRetrieveinstance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

