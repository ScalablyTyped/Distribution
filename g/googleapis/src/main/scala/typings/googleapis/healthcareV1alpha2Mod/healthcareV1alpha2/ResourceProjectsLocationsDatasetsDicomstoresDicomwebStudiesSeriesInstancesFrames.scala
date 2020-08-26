package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies$Series$Instances$Frames")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFrames protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.frames.rendered
    * @desc RetrieveRenderedFrames returns instances associated with the given
    * study, series, SOP Instance UID and frame numbers in an acceptable
    * Rendered Media Type. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.8.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.frames.rendered
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}/frames/{frame_list}/rendered`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rendered(): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def rendered(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRendered
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRendered,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRendered,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRendered,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def rendered(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRendered,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.frames.retrieveFrames
    * @desc RetrieveFrames returns instances associated with the given study,
    * series, SOP Instance UID and frame numbers. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.4.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.instances.frames.retrieveFrames
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/instance/{instance_id}/frames/{frame_list}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveFrames(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveFrames(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRetrieveframes
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRetrieveframes,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRetrieveframes,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRetrieveframes,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveFrames(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstancesFramesRetrieveframes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

