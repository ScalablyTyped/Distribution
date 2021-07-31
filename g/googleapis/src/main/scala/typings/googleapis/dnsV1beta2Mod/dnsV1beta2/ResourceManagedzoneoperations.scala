package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Managedzoneoperations")
@js.native
class ResourceManagedzoneoperations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.managedZoneOperations.get
    * @alias dns.managedZoneOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.operation
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaOperation] = js.native
  def get(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet): GaxiosPromise[SchemaOperation] = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def get(
    params: ParamsResourceManagedzoneoperationsGet,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def get(params: ParamsResourceManagedzoneoperationsGet, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def get(
    params: ParamsResourceManagedzoneoperationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * dns.managedZoneOperations.list
    * @alias dns.managedZoneOperations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(params: ParamsResourceManagedzoneoperationsList): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    options: BodyResponseCallback[SchemaManagedZoneOperationsListResponse],
    callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedzoneoperationsList, options: MethodOptions): GaxiosPromise[SchemaManagedZoneOperationsListResponse] = js.native
  def list(
    params: ParamsResourceManagedzoneoperationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedZoneOperationsListResponse]
  ): Unit = js.native
}
