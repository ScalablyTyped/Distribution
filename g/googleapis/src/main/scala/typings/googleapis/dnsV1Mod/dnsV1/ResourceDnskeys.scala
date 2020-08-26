package typings.googleapis.dnsV1Mod.dnsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dns/v1", "dns_v1.Resource$Dnskeys")
@js.native
class ResourceDnskeys protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dns.dnsKeys.get
    * @alias dns.dnsKeys.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientOperationId
    * @param {string=} params.digestType
    * @param {string} params.dnsKeyId
    * @param {string} params.managedZone
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDnsKey] = js.native
  def get(callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDnsKey] = js.native
  def get(params: ParamsResourceDnskeysGet): GaxiosPromise[SchemaDnsKey] = js.native
  def get(params: ParamsResourceDnskeysGet, callback: BodyResponseCallback[SchemaDnsKey]): Unit = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: BodyResponseCallback[SchemaDnsKey],
    callback: BodyResponseCallback[SchemaDnsKey]
  ): Unit = js.native
  def get(params: ParamsResourceDnskeysGet, options: MethodOptions): GaxiosPromise[SchemaDnsKey] = js.native
  def get(
    params: ParamsResourceDnskeysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKey]
  ): Unit = js.native
  /**
    * dns.dnsKeys.list
    * @alias dns.dnsKeys.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.digestType
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(params: ParamsResourceDnskeysList): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(params: ParamsResourceDnskeysList, callback: BodyResponseCallback[SchemaDnsKeysListResponse]): Unit = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: BodyResponseCallback[SchemaDnsKeysListResponse],
    callback: BodyResponseCallback[SchemaDnsKeysListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDnskeysList, options: MethodOptions): GaxiosPromise[SchemaDnsKeysListResponse] = js.native
  def list(
    params: ParamsResourceDnskeysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDnsKeysListResponse]
  ): Unit = js.native
}

