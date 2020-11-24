package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Userusagereport")
@js.native
class ResourceUserusagereport protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * reports.userUsageReport.get
    * @desc Retrieves a report which is a collection of properties / statistics
    * for a set of users.
    * @alias reports.userUsageReport.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string} params.date Represents the date in yyyy-mm-dd format for which the data is to be fetched.
    * @param {string=} params.filters Represents the set of filters including parameter operator value.
    * @param {integer=} params.maxResults Maximum number of results to return. Maximum allowed is 1000
    * @param {string=} params.orgUnitID the organizational unit's ID to filter usage parameters from users belonging to a specific OU or one of its sub-OU(s).
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.parameters Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2.
    * @param {string} params.userKey Represents the profile id or the user email for which the data should be filtered.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUsageReports] = js.native
  def get(callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceUserusagereportGet): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceUserusagereportGet, callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(
    params: ParamsResourceUserusagereportGet,
    options: BodyResponseCallback[SchemaUsageReports],
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
  def get(params: ParamsResourceUserusagereportGet, options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(
    params: ParamsResourceUserusagereportGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
}
