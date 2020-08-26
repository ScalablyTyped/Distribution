package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomweb protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var studies: ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudies = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `instances`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForSeries
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `series`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForSeries(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForSeries(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforseries,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforseries,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForStudies
    * @desc SearchForStudies returns a list of matching studies. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.searchForStudies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForStudies(): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def searchForStudies(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforstudies): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforstudies,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforstudies,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforstudies,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebSearchforstudies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.storeInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().HttpBody} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def storeInstances(): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def storeInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStoreinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStoreinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

