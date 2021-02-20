package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores$Studies")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresStudies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.delete
    * @desc DeleteStudy deletes all instances within the given study. Delete
    * requests are equivalent to the GET requests specified in the WADO-RS
    * standard.
    * @alias healthcare.projects.locations.datasets.dicomStores.studies.delete
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveMetadata
    * @desc RetrieveStudyMetadata returns instance associated with the given
    * study presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveMetadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveMetadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievemetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
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
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveStudy
    * @desc RetrieveStudy returns all instances within the given study. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.retrieveStudy
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
  def retrieveStudy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveStudy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesRetrievestudy,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
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
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForInstances
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
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
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
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.searchForSeries
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
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesSearchforseries,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
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
  
  var series: ResourceProjectsLocationsDatasetsDicomstoresStudiesSeries = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.studies.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.studies.storeInstances
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
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesStoreinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
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
}
