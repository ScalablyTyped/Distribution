package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Data$Realtime")
@js.native
class ResourceDataRealtime protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.data.realtime.get
    * @desc Returns real time data for a view (profile).
    * @alias analytics.data.realtime.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dimensions A comma-separated list of real time dimensions. E.g., 'rt:medium,rt:city'.
    * @param {string=} params.filters A comma-separated list of dimension or metric filters to be applied to real time data.
    * @param {string} params.ids Unique table ID for retrieving real time data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    * @param {integer=} params.max-results The maximum number of entries to include in this feed.
    * @param {string} params.metrics A comma-separated list of real time metrics. E.g., 'rt:activeUsers'. At least one metric must be specified.
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for real time data.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(callback: BodyResponseCallback[SchemaRealtimeData]): Unit = js.native
  def get(params: ParamsResourceDataRealtimeGet): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(params: ParamsResourceDataRealtimeGet, callback: BodyResponseCallback[SchemaRealtimeData]): Unit = js.native
  def get(
    params: ParamsResourceDataRealtimeGet,
    options: BodyResponseCallback[SchemaRealtimeData],
    callback: BodyResponseCallback[SchemaRealtimeData]
  ): Unit = js.native
  def get(params: ParamsResourceDataRealtimeGet, options: MethodOptions): GaxiosPromise[SchemaRealtimeData] = js.native
  def get(
    params: ParamsResourceDataRealtimeGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRealtimeData]
  ): Unit = js.native
}

