package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1beta1", "healthcare_v1beta1.Resource$Projects$Locations$Datasets$Hl7v2stores")
@js.native
class ResourceProjectsLocationsDatasetsHl7v2stores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.create
    * @desc Creates a new HL7v2 store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl7V2StoreId The ID of the HL7v2 store that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the dataset this HL7v2 store belongs to.
    * @param {().Hl7V2Store} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaHl7V2Store] = js.native
  def create(callback: BodyResponseCallback[SchemaHl7V2Store]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate): GaxiosPromise[SchemaHl7V2Store] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate,
    options: BodyResponseCallback[SchemaHl7V2Store],
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.delete
    * @desc Deletes the specified HL7v2 store and removes all messages that are
    * contained within it.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.get
    * @desc Gets the specified HL7v2 store.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the HL7v2 store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHl7V2Store] = js.native
  def get(callback: BodyResponseCallback[SchemaHl7V2Store]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGet): GaxiosPromise[SchemaHl7V2Store] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGet,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGet,
    options: BodyResponseCallback[SchemaHl7V2Store],
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGet, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.getIamPolicy
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
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.list
    * @desc Lists the HL7v2 stores in the given dataset.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of HL7v2 stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListHl7V2StoresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHl7V2StoresResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHl7V2StoresResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesList): GaxiosPromise[SchemaListHl7V2StoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesList,
    callback: BodyResponseCallback[SchemaListHl7V2StoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesList,
    options: BodyResponseCallback[SchemaListHl7V2StoresResponse],
    callback: BodyResponseCallback[SchemaListHl7V2StoresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesList, options: MethodOptions): GaxiosPromise[SchemaListHl7V2StoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHl7V2StoresResponse]
  ): Unit = js.native
  
  var messages: ResourceProjectsLocationsDatasetsHl7v2storesMessages = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.patch
    * @desc Updates the HL7v2 store.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().Hl7V2Store} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaHl7V2Store] = js.native
  def patch(callback: BodyResponseCallback[SchemaHl7V2Store]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesPatch): GaxiosPromise[SchemaHl7V2Store] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesPatch,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesPatch,
    options: BodyResponseCallback[SchemaHl7V2Store],
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesPatch, options: MethodOptions): GaxiosPromise[SchemaHl7V2Store] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHl7V2Store]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias healthcare.projects.locations.datasets.hl7V2Stores.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.hl7V2Stores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias
    * healthcare.projects.locations.datasets.hl7V2Stores.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsHl7v2storesTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsHl7v2storesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
