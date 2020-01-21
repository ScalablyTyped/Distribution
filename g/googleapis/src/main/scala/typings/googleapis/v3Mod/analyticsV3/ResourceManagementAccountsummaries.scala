package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accountsummaries")
@js.native
class ResourceManagementAccountsummaries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.accountSummaries.list
    * @desc Lists account summaries (lightweight tree comprised of
    * accounts/properties/profiles) to which the user has access.
    * @alias analytics.management.accountSummaries.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of account summaries to include in this response, where the largest acceptable value is 1000.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAccountSummaries] = js.native
  def list(callback: BodyResponseCallback[SchemaAccountSummaries]): Unit = js.native
  def list(params: ParamsResourceManagementAccountsummariesList): GaxiosPromise[SchemaAccountSummaries] = js.native
  def list(
    params: ParamsResourceManagementAccountsummariesList,
    callback: BodyResponseCallback[SchemaAccountSummaries]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagementAccountsummariesList,
    options: BodyResponseCallback[SchemaAccountSummaries],
    callback: BodyResponseCallback[SchemaAccountSummaries]
  ): Unit = js.native
  def list(params: ParamsResourceManagementAccountsummariesList, options: MethodOptions): GaxiosPromise[SchemaAccountSummaries] = js.native
  def list(
    params: ParamsResourceManagementAccountsummariesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccountSummaries]
  ): Unit = js.native
}

