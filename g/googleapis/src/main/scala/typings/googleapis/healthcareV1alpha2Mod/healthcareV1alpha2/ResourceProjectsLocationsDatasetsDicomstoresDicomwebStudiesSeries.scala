package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1alpha2", "healthcare_v1alpha2.Resource$Projects$Locations$Datasets$Dicomstores$Dicomweb$Studies$Series")
@js.native
class ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.delete
    * @desc DeleteSeries deletes all instances within the given study and
    * series. Delete requests are equivalent to the GET requests specified in
    * the WADO-RS standard.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesDelete,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var instances: ResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesInstances = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.metadata
    * @desc RetrieveSeriesMetadata returns instance associated with the given
    * study and series, presented as metadata with the bulk data removed. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.6.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.metadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}/metadata`.
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def metadata(): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def metadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesMetadata): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesMetadata,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesMetadata,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesMetadata,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def metadata(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesMetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.retrieveSeries
    * @desc RetrieveSeries returns all instances within the given study and
    * series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.5.2.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.retrieveSeries
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dicomWebPath The path of the DICOMweb request, as specified in the STOW-RS, WADO-RS, or QIDO-RS standard (e.g., `studies/{study_id}/series/{series_id}`).
    * @param {string} params.parent The name of the DICOM store that is being accessed (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def retrieveSeries(): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveSeries(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def retrieveSeries(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesRetrieveseries): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesRetrieveseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesRetrieveseries,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def retrieveSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesRetrieveseries,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def retrieveSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesRetrieveseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.dicomWeb.studies.series.searchForInstances
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
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesSearchforinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDicomwebStudiesSeriesSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
}
