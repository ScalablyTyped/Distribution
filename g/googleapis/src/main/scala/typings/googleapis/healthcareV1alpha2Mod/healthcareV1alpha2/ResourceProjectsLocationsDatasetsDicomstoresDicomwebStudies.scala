package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var series: ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeries = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.delete
    * @desc DeleteStudy deletes all instances within the given study. Delete
    * requests are equivalent to the GET requests specified in the WADO-RS
    * standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.metadata
    * @desc RetrieveStudyMetadata returns instance associated with the given
    * study presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def metadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesMetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesMetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesMetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesMetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.retrieveStudy
    * @desc RetrieveStudy returns all instances within the given study. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.retrieveStudy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveStudy(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveStudy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesRetrievestudy): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesRetrievestudy,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesRetrievestudy,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesRetrievestudy,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesRetrievestudy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForInstances
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
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.searchForSeries
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
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforseries,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforseries,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.storeInstances
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
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesStoreinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesStoreinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}

