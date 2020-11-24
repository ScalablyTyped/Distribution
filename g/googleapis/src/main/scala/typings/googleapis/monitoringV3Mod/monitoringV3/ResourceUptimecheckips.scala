package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Uptimecheckips")
@js.native
class ResourceUptimecheckips protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * monitoring.uptimeCheckIps.list
    * @desc Returns the list of IPs that checkers run from
    * @alias monitoring.uptimeCheckIps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned. NOTE: this field is not yet implemented
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call. NOTE: this field is not yet implemented
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(params: ParamsResourceUptimecheckipsList): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    options: BodyResponseCallback[SchemaListUptimeCheckIpsResponse],
    callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUptimecheckipsList, options: MethodOptions): GaxiosPromise[SchemaListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsResourceUptimecheckipsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUptimeCheckIpsResponse]
  ): Unit = js.native
}
