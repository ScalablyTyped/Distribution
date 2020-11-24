package typings.googleapis.v41Mod.adsensehostV41

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Accounts$Reports")
@js.native
class ResourceAccountsReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsensehost.accounts.reports.generate
    * @desc Generate an AdSense report based on the report request sent in the
    * query parameters. Returns the result as JSON; to retrieve output in CSV
    * format specify "alt=csv" as a query parameter.
    * @alias adsensehost.accounts.reports.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Hosted account upon which to report.
    * @param {string=} params.dimension Dimensions to base the report on.
    * @param {string} params.endDate End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    * @param {string=} params.filter Filters to be run on the report.
    * @param {string=} params.locale Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    * @param {integer=} params.maxResults The maximum number of rows of report data to return.
    * @param {string=} params.metric Numeric columns to include in the report.
    * @param {string=} params.sort The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no prefix is specified, the column is sorted ascending.
    * @param {string} params.startDate Start of the date range to report on in "YYYY-MM-DD" format, inclusive.
    * @param {integer=} params.startIndex Index of the first row of report data to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[SchemaReport] = js.native
  def generate(callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate): GaxiosPromise[SchemaReport] = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate, callback: BodyResponseCallback[SchemaReport]): Unit = js.native
  def generate(
    params: ParamsResourceAccountsReportsGenerate,
    options: BodyResponseCallback[SchemaReport],
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsGenerate, options: MethodOptions): GaxiosPromise[SchemaReport] = js.native
  def generate(
    params: ParamsResourceAccountsReportsGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReport]
  ): Unit = js.native
}
