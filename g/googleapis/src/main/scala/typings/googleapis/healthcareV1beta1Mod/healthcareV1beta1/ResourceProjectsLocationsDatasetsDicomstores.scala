package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Dicomstores")
@js.native
class ResourceProjectsLocationsDatasetsDicomstores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var studies: ResourceProjectsLocationsDatasetsDicomstoresStudies = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.create
    * @desc Creates a new DICOM store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.dicomStores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dicomStoreId The ID of the DICOM store that is being created. Any string value up to 256 characters in length.
    * @param {string} params.parent The name of the dataset this DICOM store belongs to.
    * @param {().DicomStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaDicomStore] = js.native
  def create(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate): GaxiosPromise[SchemaDicomStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    options: BodyResponseCallback[SchemaDicomStore],
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.delete
    * @desc Deletes the specified DICOM store and removes all images that are
    * contained within it.
    * @alias healthcare.projects.locations.datasets.dicomStores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the DICOM store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.export
    * @desc Exports data to the specified destination by copying it from the
    * DICOM store. The metadata field type is OperationMetadata.
    * @alias healthcare.projects.locations.datasets.dicomStores.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The DICOM store resource name from which the data should be exported (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().ExportDicomDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[SchemaOperation] = js.native
  def export(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def export(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def export(params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport): GaxiosPromise[SchemaOperation] = js.native
  def export(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def export(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def export(params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def export(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresExport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.get
    * @desc Gets the specified DICOM store.
    * @alias healthcare.projects.locations.datasets.dicomStores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the DICOM store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDicomStore] = js.native
  def get(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet): GaxiosPromise[SchemaDicomStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    options: BodyResponseCallback[SchemaDicomStore],
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.dicomStores.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.import
    * @desc Imports data into the DICOM store by copying it from the specified
    * source. For errors, the Operation will be populated with error details (in
    * the form of ImportDicomDataErrorDetails in error.details), which will hold
    * finer-grained error information. The metadata field type is
    * OperationMetadata.
    * @alias healthcare.projects.locations.datasets.dicomStores.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the DICOM store resource into which the data is imported (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`).
    * @param {().ImportDicomDataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.list
    * @desc Lists the DICOM stores in the given dataset.
    * @alias healthcare.projects.locations.datasets.dicomStores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of DICOM stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDicomStoresResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsDicomstoresList): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    callback: BodyResponseCallback[SchemaListDicomStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    options: BodyResponseCallback[SchemaListDicomStoresResponse],
    callback: BodyResponseCallback[SchemaListDicomStoresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsDicomstoresList, options: MethodOptions): GaxiosPromise[SchemaListDicomStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDicomStoresResponse]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.patch
    * @desc Updates the specified DICOM store.
    * @alias healthcare.projects.locations.datasets.dicomStores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the DICOM store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/dicomStores/{dicom_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().DicomStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(callback: BodyResponseCallback[SchemaDicomStore]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    options: BodyResponseCallback[SchemaDicomStore],
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch, options: MethodOptions): GaxiosPromise[SchemaDicomStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDicomStore]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.searchForInstances
    * @desc SearchForInstances returns a list of matching instances. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.searchForInstances
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
  def searchForInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: MethodOptions
  ): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.searchForSeries
    * @desc SearchForSeries returns a list of matching series. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias healthcare.projects.locations.datasets.dicomStores.searchForSeries
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
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForSeries(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForSeries(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforseries,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.searchForStudies
    * @desc SearchForStudies returns a list of matching studies. See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.7
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.searchForStudies
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
  def searchForStudies(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def searchForStudies(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def searchForStudies(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSearchforstudies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.dicomStores.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.storeInstances
    * @desc StoreInstances stores DICOM instances associated with study
    * instance unique identifiers (SUID). See
    * http://dicom.nema.org/medical/dicom/current/output/html/part18.html#sect_6.6.1.
    * @alias healthcare.projects.locations.datasets.dicomStores.storeInstances
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
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: BodyResponseCallback[SchemaHttpBody],
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def storeInstances(params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def storeInstances(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresStoreinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * healthcare.projects.locations.datasets.dicomStores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias
    * healthcare.projects.locations.datasets.dicomStores.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsDicomstoresTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}

