package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Searchanalytics")
@js.native
class ResourceSearchanalytics protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * webmasters.searchanalytics.query
    * @desc Query your data with filters and parameters that you define.
    * Returns zero or more rows grouped by the row keys that you define. You
    * must define a date range of one or more days.  When date is one of the
    * group by values, any days without data are omitted from the result list.
    * If you need to know which days have data, issue a broad date range query
    * grouped by date for any metric, and see which day rows are returned.
    * @alias webmasters.searchanalytics.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {().SearchAnalyticsQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(params: ParamsResourceSearchanalyticsQuery): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    options: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse],
    callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceSearchanalyticsQuery, options: MethodOptions): GaxiosPromise[SchemaSearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsResourceSearchanalyticsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchAnalyticsQueryResponse]
  ): Unit = js.native
}
