package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Changes")
@js.native
class ResourceChanges protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.changes.create
    * @alias dns.changes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {().Change} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaChange] = js.native
  def create(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate): GaxiosPromise[SchemaChange] = js.native
  def create(params: ParamsResourceChangesCreate, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: BodyResponseCallback[SchemaChange],
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  def create(params: ParamsResourceChangesCreate, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def create(
    params: ParamsResourceChangesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  
  /**
    * dns.changes.get
    * @alias dns.changes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.changeId
    * @param {string=} params.clientOperationId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaChange] = js.native
  def get(callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet): GaxiosPromise[SchemaChange] = js.native
  def get(params: ParamsResourceChangesGet, callback: BodyResponseCallback[SchemaChange]): Unit = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: BodyResponseCallback[SchemaChange],
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  def get(params: ParamsResourceChangesGet, options: MethodOptions): GaxiosPromise[SchemaChange] = js.native
  def get(
    params: ParamsResourceChangesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChange]
  ): Unit = js.native
  
  /**
    * dns.changes.list
    * @alias dns.changes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.sortBy
    * @param {string=} params.sortOrder
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(params: ParamsResourceChangesList, callback: BodyResponseCallback[SchemaChangesListResponse]): Unit = js.native
  def list(
    params: ParamsResourceChangesList,
    options: BodyResponseCallback[SchemaChangesListResponse],
    callback: BodyResponseCallback[SchemaChangesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceChangesList, options: MethodOptions): GaxiosPromise[SchemaChangesListResponse] = js.native
  def list(
    params: ParamsResourceChangesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChangesListResponse]
  ): Unit = js.native
}
