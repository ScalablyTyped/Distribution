package typings.googleapis.v24Mod.analyticsV24

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Goals")
@js.native
class ResourceManagementGoals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.goals.list
    * @desc Lists goals to which the user has access.
    * @alias analytics.management.goals.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve goals for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    * @param {integer=} params.max-results The maximum number of goals to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve goals for. Can either be a specific view (profile) ID or '~all', which refers to all the views (profiles) that user has access to.
    * @param {integer=} params.start-index An index of the first goal to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve goals for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Unit] = js.native
  def list(callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementGoalsList): GaxiosPromise[Unit] = js.native
  def list(params: ParamsResourceManagementGoalsList, callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def list(params: ParamsResourceManagementGoalsList, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

