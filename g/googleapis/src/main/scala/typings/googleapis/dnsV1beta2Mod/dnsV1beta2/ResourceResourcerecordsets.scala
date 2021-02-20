package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/dns/v1beta2", "dns_v1beta2.Resource$Resourcerecordsets")
@js.native
class ResourceResourcerecordsets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * dns.resourceRecordSets.list
    * @alias dns.resourceRecordSets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.managedZone
    * @param {integer=} params.maxResults
    * @param {string=} params.name
    * @param {string=} params.pageToken
    * @param {string} params.project
    * @param {string=} params.type
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(params: ParamsResourceResourcerecordsetsList): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: BodyResponseCallback[SchemaResourceRecordSetsListResponse],
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceResourcerecordsetsList, options: MethodOptions): GaxiosPromise[SchemaResourceRecordSetsListResponse] = js.native
  def list(
    params: ParamsResourceResourcerecordsetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaResourceRecordSetsListResponse]
  ): Unit = js.native
}
