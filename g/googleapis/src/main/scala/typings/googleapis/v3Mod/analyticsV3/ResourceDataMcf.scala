package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Data$Mcf")
@js.native
class ResourceDataMcf protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.data.mcf.get
    * @desc Returns Analytics Multi-Channel Funnels data for a view (profile).
    * @alias analytics.data.mcf.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dimensions A comma-separated list of Multi-Channel Funnels dimensions. E.g., 'mcf:source,mcf:medium'.
    * @param {string} params.end-date End date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    * @param {string=} params.filters A comma-separated list of dimension or metric filters to be applied to the Analytics data.
    * @param {string} params.ids Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    * @param {integer=} params.max-results The maximum number of entries to include in this feed.
    * @param {string} params.metrics A comma-separated list of Multi-Channel Funnels metrics. E.g., 'mcf:totalConversions,mcf:totalConversionValue'. At least one metric must be specified.
    * @param {string=} params.samplingLevel The desired sampling level.
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for the Analytics data.
    * @param {string} params.start-date Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMcfData] = js.native
  def get(callback: BodyResponseCallback[SchemaMcfData]): Unit = js.native
  def get(params: ParamsResourceDataMcfGet): GaxiosPromise[SchemaMcfData] = js.native
  def get(params: ParamsResourceDataMcfGet, callback: BodyResponseCallback[SchemaMcfData]): Unit = js.native
  def get(
    params: ParamsResourceDataMcfGet,
    options: BodyResponseCallback[SchemaMcfData],
    callback: BodyResponseCallback[SchemaMcfData]
  ): Unit = js.native
  def get(params: ParamsResourceDataMcfGet, options: MethodOptions): GaxiosPromise[SchemaMcfData] = js.native
  def get(
    params: ParamsResourceDataMcfGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMcfData]
  ): Unit = js.native
}

