package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/healthcare/v1alpha", "healthcare_v1alpha.Resource$Projects$Locations$Datasets$Annotationstores")
@js.native
class ResourceProjectsLocationsDatasetsAnnotationstores protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var annotations: ResourceProjectsLocationsDatasetsAnnotationstoresAnnotations = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.create
    * @desc Creates a new Annotation store within the parent dataset.
    * @alias healthcare.projects.locations.datasets.annotationStores.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.annotationStoreId The ID of the Annotation store that is being created. The string must match the following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    * @param {string} params.parent The name of the dataset this Annotation store belongs to.
    * @param {().AnnotationStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaAnnotationStore] = js.native
  def create(callback: BodyResponseCallback[SchemaAnnotationStore]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate): GaxiosPromise[SchemaAnnotationStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate,
    options: BodyResponseCallback[SchemaAnnotationStore],
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate, options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def create(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.delete
    * @desc Deletes the specified Annotation store and removes all annotations
    * that are contained within it.
    * @alias healthcare.projects.locations.datasets.annotationStores.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation store to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.get
    * @desc Gets the specified Annotation store or returns NOT_FOUND if it does
    * not exist.
    * @alias healthcare.projects.locations.datasets.annotationStores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the Annotation store to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAnnotationStore] = js.native
  def get(callback: BodyResponseCallback[SchemaAnnotationStore]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGet): GaxiosPromise[SchemaAnnotationStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGet,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGet,
    options: BodyResponseCallback[SchemaAnnotationStore],
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGet, options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns NOT_FOUND
    * error if the resource does not exist. Returns an empty policy if the
    * resource exists but does not have a policy set.  Authorization requires
    * the Google IAM permission `healthcare.AnnotationStores.getIamPolicy` on
    * the specified resource
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.list
    * @desc Lists the Annotation stores in the given dataset for a source
    * store.
    * @alias healthcare.projects.locations.datasets.annotationStores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Restricts stores returned to those matching a filter. Syntax: https://cloud.google.com/appengine/docs/standard/python/search/query_strings Only filtering on labels is supported, for example `labels.key=value`.
    * @param {integer=} params.pageSize Limit on the number of Annotation stores to return in a single response. If zero the default page size of 100 is used.
    * @param {string=} params.pageToken The next_page_token value returned from the previous List request, if any.
    * @param {string} params.parent Name of the dataset.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListAnnotationStoresResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAnnotationStoresResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListAnnotationStoresResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresList): GaxiosPromise[SchemaListAnnotationStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresList,
    callback: BodyResponseCallback[SchemaListAnnotationStoresResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresList,
    options: BodyResponseCallback[SchemaListAnnotationStoresResponse],
    callback: BodyResponseCallback[SchemaListAnnotationStoresResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresList, options: MethodOptions): GaxiosPromise[SchemaListAnnotationStoresResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAnnotationStoresResponse]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.patch
    * @desc Updates the specified Annotation store.
    * @alias healthcare.projects.locations.datasets.annotationStores.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the Annotation store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/annotationStores/{annotation_store_id}`.
    * @param {string=} params.updateMask The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * @param {().AnnotationStore} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaAnnotationStore] = js.native
  def patch(callback: BodyResponseCallback[SchemaAnnotationStore]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresPatch): GaxiosPromise[SchemaAnnotationStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresPatch,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresPatch,
    options: BodyResponseCallback[SchemaAnnotationStore],
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresPatch, options: MethodOptions): GaxiosPromise[SchemaAnnotationStore] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationStore]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.setIamPolicy
    * @desc POLICIES Sets the access control policy for a resource. Replaces
    * any existing policy.  Authorization requires the Google IAM permission
    * 'healthcare.annotationStores.setIamPolicy' on the specified resource
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.setIamPolicy
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
  def setIamPolicy(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresSetiampolicy,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * healthcare.projects.locations.datasets.annotationStores.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  There is no permission required to
    * make this API call.
    * @alias
    * healthcare.projects.locations.datasets.annotationStores.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresTestiampermissions): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresTestiampermissions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresTestiampermissions,
    options: BodyResponseCallback[SchemaTestIamPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[SchemaTestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceProjectsLocationsDatasetsAnnotationstoresTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestIamPermissionsResponse]
  ): Unit = js.native
}
