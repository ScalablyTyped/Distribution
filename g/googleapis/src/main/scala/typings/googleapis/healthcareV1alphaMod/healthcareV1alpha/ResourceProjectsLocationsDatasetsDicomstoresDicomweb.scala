package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomweb protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebDelete
    * @desc Handles DELETE requests equivalent to the GET requests specified in
    * the WADO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/1.2`,
    * then `/studies/1.2` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the WADO-RS standard.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebDelete(): GaxiosPromise[SchemaEmpty] = js.native
  def dicomWebDelete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dicomWebDelete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dicomWebDelete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebdelete): GaxiosPromise[SchemaEmpty] = js.native
  def dicomWebDelete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebdelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dicomWebDelete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebdelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def dicomWebDelete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebdelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def dicomWebDelete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebGet
    * @desc Handles the GET requests specified in the STOW-RS, WADO-RS, or
    * QIDO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/{study_id}/series?PatientName={patient_name}`,
    * then `studies/{study_id}/series` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., studies/{study_id}/series`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebGet(): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebGet(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def dicomWebGet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebGet(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebget): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebGet(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebget,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def dicomWebGet(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebget,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def dicomWebGet(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebget,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebGet(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebget,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebPost
    * @desc Handles the POST requests specified in the STOW-RS, WADO-RS, or
    * QIDO-RS standard. Since this implements an industry standard API, the
    * dicom_web_path is interpreted directly by the serving binary. For
    * example, if the request is for
    * `/v1alpha/projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}/dicomWeb/studies/{study_id}`,
    * then `/studies/{study_id}` is passed to the serving binary as the
    * dicom_web_path.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.dicomWebPost
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dicomWebPost(): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebPost(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def dicomWebPost(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebPost(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebpost): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebPost(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebpost,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def dicomWebPost(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebpost,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def dicomWebPost(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebpost,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def dicomWebPost(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebDicomwebpost,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}
