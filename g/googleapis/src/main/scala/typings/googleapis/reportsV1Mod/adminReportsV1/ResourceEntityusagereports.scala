package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Entityusagereports")
@js.native
class ResourceEntityusagereports protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * reports.entityUsageReports.get
    * @desc Retrieves a report which is a collection of properties / statistics
    * for a set of objects.
    * @alias reports.entityUsageReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string} params.date Represents the date in yyyy-mm-dd format for which the data is to be fetched.
    * @param {string} params.entityKey Represents the key of object for which the data should be filtered.
    * @param {string} params.entityType Type of object. Should be one of - gplus_communities.
    * @param {string=} params.filters Represents the set of filters including parameter operator value.
    * @param {integer=} params.maxResults Maximum number of results to return. Maximum allowed is 1000
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.parameters Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUsageReports] = js.native
  def get(callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceEntityusagereportsGet): GaxiosPromise[SchemaUsageReports] = js.native
  def get(params: ParamsResourceEntityusagereportsGet, callback: BodyResponseCallback[SchemaUsageReports]): Unit = js.native
  def get(
    params: ParamsResourceEntityusagereportsGet,
    options: BodyResponseCallback[SchemaUsageReports],
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
  def get(params: ParamsResourceEntityusagereportsGet, options: MethodOptions): GaxiosPromise[SchemaUsageReports] = js.native
  def get(
    params: ParamsResourceEntityusagereportsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsageReports]
  ): Unit = js.native
}
