package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Goals")
@js.native
class ResourceManagementGoals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.goals.get
    * @desc Gets a goal to which the user has access.
    * @alias analytics.management.goals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the goal for.
    * @param {string} params.goalId Goal ID to retrieve the goal for.
    * @param {string} params.profileId View (Profile) ID to retrieve the goal for.
    * @param {string} params.webPropertyId Web property ID to retrieve the goal for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaGoal] = js.native
  def get(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def get(params: ParamsResourceManagementGoalsGet): GaxiosPromise[SchemaGoal] = js.native
  def get(params: ParamsResourceManagementGoalsGet, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def get(
    params: ParamsResourceManagementGoalsGet,
    options: BodyResponseCallback[SchemaGoal],
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  def get(params: ParamsResourceManagementGoalsGet, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def get(
    params: ParamsResourceManagementGoalsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * analytics.management.goals.insert
    * @desc Create a new goal.
    * @alias analytics.management.goals.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the goal for.
    * @param {string} params.profileId View (Profile) ID to create the goal for.
    * @param {string} params.webPropertyId Web property ID to create the goal for.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaGoal] = js.native
  def insert(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def insert(params: ParamsResourceManagementGoalsInsert): GaxiosPromise[SchemaGoal] = js.native
  def insert(params: ParamsResourceManagementGoalsInsert, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def insert(
    params: ParamsResourceManagementGoalsInsert,
    options: BodyResponseCallback[SchemaGoal],
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementGoalsInsert, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def insert(
    params: ParamsResourceManagementGoalsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
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
  def list(): GaxiosPromise[SchemaGoals] = js.native
  def list(callback: BodyResponseCallback[SchemaGoals]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoals] = js.native
  def list(params: ParamsResourceManagementGoalsList): GaxiosPromise[SchemaGoals] = js.native
  def list(params: ParamsResourceManagementGoalsList, callback: BodyResponseCallback[SchemaGoals]): Unit = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: BodyResponseCallback[SchemaGoals],
    callback: BodyResponseCallback[SchemaGoals]
  ): Unit = js.native
  def list(params: ParamsResourceManagementGoalsList, options: MethodOptions): GaxiosPromise[SchemaGoals] = js.native
  def list(
    params: ParamsResourceManagementGoalsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoals]
  ): Unit = js.native
  /**
    * analytics.management.goals.patch
    * @desc Updates an existing goal. This method supports patch semantics.
    * @alias analytics.management.goals.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the goal.
    * @param {string} params.goalId Index of the goal to be updated.
    * @param {string} params.profileId View (Profile) ID to update the goal.
    * @param {string} params.webPropertyId Web property ID to update the goal.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaGoal] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def patch(params: ParamsResourceManagementGoalsPatch): GaxiosPromise[SchemaGoal] = js.native
  def patch(params: ParamsResourceManagementGoalsPatch, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def patch(
    params: ParamsResourceManagementGoalsPatch,
    options: BodyResponseCallback[SchemaGoal],
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementGoalsPatch, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def patch(
    params: ParamsResourceManagementGoalsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  /**
    * analytics.management.goals.update
    * @desc Updates an existing goal.
    * @alias analytics.management.goals.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the goal.
    * @param {string} params.goalId Index of the goal to be updated.
    * @param {string} params.profileId View (Profile) ID to update the goal.
    * @param {string} params.webPropertyId Web property ID to update the goal.
    * @param {().Goal} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaGoal] = js.native
  def update(callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def update(params: ParamsResourceManagementGoalsUpdate): GaxiosPromise[SchemaGoal] = js.native
  def update(params: ParamsResourceManagementGoalsUpdate, callback: BodyResponseCallback[SchemaGoal]): Unit = js.native
  def update(
    params: ParamsResourceManagementGoalsUpdate,
    options: BodyResponseCallback[SchemaGoal],
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
  def update(params: ParamsResourceManagementGoalsUpdate, options: MethodOptions): GaxiosPromise[SchemaGoal] = js.native
  def update(
    params: ParamsResourceManagementGoalsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoal]
  ): Unit = js.native
}

