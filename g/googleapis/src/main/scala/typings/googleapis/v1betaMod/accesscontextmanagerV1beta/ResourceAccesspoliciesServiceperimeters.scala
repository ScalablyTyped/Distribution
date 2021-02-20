package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1beta", "accesscontextmanager_v1beta.Resource$Accesspolicies$Serviceperimeters")
@js.native
class ResourceAccesspoliciesServiceperimeters protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.create
    * @desc Create an Service Perimeter. The longrunning operation from this
    * RPC will have a successful status once the Service Perimeter has
    * propagated to long-lasting storage. Service Perimeters containing errors
    * will result in an error response for the first error encountered.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. Resource name for the access policy which owns this Service Perimeter.  Format: `accessPolicies/{policy_id}`
    * @param {().ServicePerimeter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAccesspoliciesServiceperimetersCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAccesspoliciesServiceperimetersCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAccesspoliciesServiceperimetersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.delete
    * @desc Delete an Service Perimeter by resource name. The longrunning
    * operation from this RPC will have a successful status once the Service
    * Perimeter has been removed from long-lasting storage.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Service Perimeter.  Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeter_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAccesspoliciesServiceperimetersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAccesspoliciesServiceperimetersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesServiceperimetersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.get
    * @desc Get an Service Perimeter by resource name.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Service Perimeter.  Format: `accessPolicies/{policy_id}/servicePerimeters/{service_perimeters_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(callback: BodyResponseCallback[SchemaServicePerimeter]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(params: ParamsResourceAccesspoliciesServiceperimetersGet): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    callback: BodyResponseCallback[SchemaServicePerimeter]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    options: BodyResponseCallback[SchemaServicePerimeter],
    callback: BodyResponseCallback[SchemaServicePerimeter]
  ): Unit = js.native
  def get(params: ParamsResourceAccesspoliciesServiceperimetersGet, options: MethodOptions): GaxiosPromise[SchemaServicePerimeter] = js.native
  def get(
    params: ParamsResourceAccesspoliciesServiceperimetersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaServicePerimeter]
  ): Unit = js.native
  
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.list
    * @desc List all Service Perimeters for an access policy.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of Service Perimeters to include in the list. Default 100.
    * @param {string=} params.pageToken Next page token for the next batch of Service Perimeter instances. Defaults to the first page of results.
    * @param {string} params.parent Required. Resource name for the access policy to list Service Perimeters from.  Format: `accessPolicies/{policy_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicePerimetersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(params: ParamsResourceAccesspoliciesServiceperimetersList): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    callback: BodyResponseCallback[SchemaListServicePerimetersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    options: BodyResponseCallback[SchemaListServicePerimetersResponse],
    callback: BodyResponseCallback[SchemaListServicePerimetersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccesspoliciesServiceperimetersList, options: MethodOptions): GaxiosPromise[SchemaListServicePerimetersResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesServiceperimetersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicePerimetersResponse]
  ): Unit = js.native
  
  /**
    * accesscontextmanager.accessPolicies.servicePerimeters.patch
    * @desc Update an Service Perimeter. The longrunning operation from this
    * RPC will have a successful status once the changes to the Service
    * Perimeter have propagated to long-lasting storage. Service Perimeter
    * containing errors will result in an error response for the first error
    * encountered.
    * @alias accesscontextmanager.accessPolicies.servicePerimeters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the ServicePerimeter.  The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
    * @param {string=} params.updateMask Required. Mask to control which fields get updated. Must be non-empty.
    * @param {().ServicePerimeter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAccesspoliciesServiceperimetersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAccesspoliciesServiceperimetersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesServiceperimetersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
