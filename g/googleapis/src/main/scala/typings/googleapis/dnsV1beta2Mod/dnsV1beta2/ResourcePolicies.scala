package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Policies")
@js.native
class ResourcePolicies protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.policies.create
    * @alias dns.policies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaPolicy] = js.native
  def create(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def create(params: ParamsResourcePoliciesCreate): GaxiosPromise[SchemaPolicy] = js.native
  def create(params: ParamsResourcePoliciesCreate, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def create(
    params: ParamsResourcePoliciesCreate,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def create(params: ParamsResourcePoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def create(
    params: ParamsResourcePoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * dns.policies.delete
    * @alias dns.policies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePoliciesDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePoliciesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePoliciesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * dns.policies.get
    * @alias dns.policies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourcePoliciesGet, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def get(params: ParamsResourcePoliciesGet, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(
    params: ParamsResourcePoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  
  /**
    * dns.policies.list
    * @alias dns.policies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaPoliciesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(params: ParamsResourcePoliciesList): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(params: ParamsResourcePoliciesList, callback: BodyResponseCallback[SchemaPoliciesListResponse]): Unit = js.native
  def list(
    params: ParamsResourcePoliciesList,
    options: BodyResponseCallback[SchemaPoliciesListResponse],
    callback: BodyResponseCallback[SchemaPoliciesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePoliciesList, options: MethodOptions): GaxiosPromise[SchemaPoliciesListResponse] = js.native
  def list(
    params: ParamsResourcePoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesListResponse]
  ): Unit = js.native
  
  /**
    * dns.policies.patch
    * @alias dns.policies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(callback: BodyResponseCallback[SchemaPoliciesPatchResponse]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(params: ParamsResourcePoliciesPatch): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(params: ParamsResourcePoliciesPatch, callback: BodyResponseCallback[SchemaPoliciesPatchResponse]): Unit = js.native
  def patch(
    params: ParamsResourcePoliciesPatch,
    options: BodyResponseCallback[SchemaPoliciesPatchResponse],
    callback: BodyResponseCallback[SchemaPoliciesPatchResponse]
  ): Unit = js.native
  def patch(params: ParamsResourcePoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaPoliciesPatchResponse] = js.native
  def patch(
    params: ParamsResourcePoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesPatchResponse]
  ): Unit = js.native
  
  /**
    * dns.policies.update
    * @alias dns.policies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.policy
    * @param {string} params.project
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(params: ParamsResourcePoliciesUpdate): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(params: ParamsResourcePoliciesUpdate, callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]): Unit = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: BodyResponseCallback[SchemaPoliciesUpdateResponse],
    callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]
  ): Unit = js.native
  def update(params: ParamsResourcePoliciesUpdate, options: MethodOptions): GaxiosPromise[SchemaPoliciesUpdateResponse] = js.native
  def update(
    params: ParamsResourcePoliciesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPoliciesUpdateResponse]
  ): Unit = js.native
}
