package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets")
@js.native
class ResourceProjectsLocationsDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.create
    * @desc Creates a new health dataset. Results are returned through the
    * Operation interface which returns either an `Operation.response` which
    * contains a Dataset or `Operation.error`. The metadata field type is
    * OperationMetadata.
    * @alias healthcare.projects.locations.datasets.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.datasetId The ID of the dataset that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the project in which the dataset should be created (e.g., `projects/{project_id}/locations/{location_id}`).
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.deidentify
    * @desc Creates a new dataset containing de-identified data from the source
    * dataset. The metadata field type is OperationMetadata. If the request is
    * successful, the response field type is DeidentifySummary. If errors
    * occur, details field type is DeidentifyErrorDetails.
    * @alias healthcare.projects.locations.datasets.deidentify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sourceDataset Source dataset resource name. (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {().DeidentifyDatasetRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deidentify(): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deidentify(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(params: ParamsResourceProjectsLocationsDatasetsDeidentify): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDeidentify,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDeidentify,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deidentify(params: ParamsResourceProjectsLocationsDatasetsDeidentify, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deidentify(
    params: ParamsResourceProjectsLocationsDatasetsDeidentify,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.delete
    * @desc Deletes the specified health dataset and all data contained in the
    * dataset. Deleting a dataset does not affect the sources from which the
    * dataset was imported (if any).
    * @alias healthcare.projects.locations.datasets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the dataset to delete (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  var dicomStores: ResourceProjectsLocationsDatasetsDicomstores = js.native
  
  var fhirStores: ResourceProjectsLocationsDatasetsFhirstores = js.native
  
  /**
    * healthcare.projects.locations.datasets.get
    * @desc Gets any metadata associated with a dataset.
    * @alias healthcare.projects.locations.datasets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the dataset to read (e.g., `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsGet): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsGet, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsGet,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.getIamPolicy
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
  def getIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  var hl7V2Stores: ResourceProjectsLocationsDatasetsHl7v2stores = js.native
  
  /**
    * healthcare.projects.locations.datasets.list
    * @desc Lists the health datasets in the current project.
    * @alias healthcare.projects.locations.datasets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of items to return. Capped to 100 if not specified. May not be larger than 1000.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The name of the project whose datasets should be listed (e.g., `projects/{project_id}/locations/{location_id}`).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDatasetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDatasetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDatasetsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsList): GaxiosPromise[SchemaListDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsList,
    callback: BodyResponseCallback[SchemaListDatasetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsList,
    options: BodyResponseCallback[SchemaListDatasetsResponse],
    callback: BodyResponseCallback[SchemaListDatasetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsList, options: MethodOptions): GaxiosPromise[SchemaListDatasetsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDatasetsResponse]
  ): Unit = js.native
  
  var operations: ResourceProjectsLocationsDatasetsOperations = js.native
  
  /**
    * healthcare.projects.locations.datasets.patch
    * @desc Updates dataset metadata.
    * @alias healthcare.projects.locations.datasets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the dataset, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDataset] = js.native
  def patch(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsPatch): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsPatch,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsPatch,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsPatch, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.setIamPolicy
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
  def setIamPolicy(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias healthcare.projects.locations.datasets.testIamPermissions
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
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
