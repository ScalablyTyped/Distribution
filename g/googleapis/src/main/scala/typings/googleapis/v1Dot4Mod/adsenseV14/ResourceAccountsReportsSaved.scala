package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Reports$Saved")
@js.native
class ResourceAccountsReportsSaved protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.reports.saved.generate
    * @desc Generate an AdSense report based on the saved report ID sent in the
    * query parameters.
    * @alias adsense.accounts.reports.saved.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the saved reports belong.
    * @param {string=} params.locale Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    * @param {integer=} params.maxResults The maximum number of rows of report data to return.
    * @param {string} params.savedReportId The saved report to retrieve.
    * @param {integer=} params.startIndex Index of the first row of report data to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsReportsSavedGenerate, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceAccountsReportsSavedGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  /**
    * adsense.accounts.reports.saved.list
    * @desc List all saved reports in the specified AdSense account.
    * @alias adsense.accounts.reports.saved.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the saved reports belong.
    * @param {integer=} params.maxResults The maximum number of saved reports to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedReports] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(params: ParamsResourceAccountsReportsSavedList): GaxiosPromise[SchemaSavedReports] = js.native
  def list(params: ParamsResourceAccountsReportsSavedList, callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: BodyResponseCallback[SchemaSavedReports],
    callback: BodyResponseCallback[SchemaSavedReports]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsReportsSavedList, options: MethodOptions): GaxiosPromise[SchemaSavedReports] = js.native
  def list(
    params: ParamsResourceAccountsReportsSavedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedReports]
  ): Unit = js.native
}

