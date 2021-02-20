package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Reports$Saved")
@js.native
class ResourceReportsSaved protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * adsense.reports.saved.generate
    * @desc Generate an AdSense report based on the saved report ID sent in the
    * query parameters.
    * @alias adsense.reports.saved.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
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
  def generate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(params: ParamsResourceReportsSavedGenerate): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceReportsSavedGenerate,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceReportsSavedGenerate,
    options: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceReportsSavedGenerate, options: MethodOptions): GaxiosPromise[SchemaAdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsResourceReportsSavedGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAdsenseReportsGenerateResponse]
  ): Unit = js.native
  
  /**
    * adsense.reports.saved.list
    * @desc List all saved reports in this AdSense account.
    * @alias adsense.reports.saved.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of saved reports to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaSavedReports] = js.native
  def list(callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSavedReports] = js.native
  def list(params: ParamsResourceReportsSavedList): GaxiosPromise[SchemaSavedReports] = js.native
  def list(params: ParamsResourceReportsSavedList, callback: BodyResponseCallback[SchemaSavedReports]): Unit = js.native
  def list(
    params: ParamsResourceReportsSavedList,
    options: BodyResponseCallback[SchemaSavedReports],
    callback: BodyResponseCallback[SchemaSavedReports]
  ): Unit = js.native
  def list(params: ParamsResourceReportsSavedList, options: MethodOptions): GaxiosPromise[SchemaSavedReports] = js.native
  def list(
    params: ParamsResourceReportsSavedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSavedReports]
  ): Unit = js.native
}
