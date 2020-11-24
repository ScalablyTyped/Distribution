package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Experiments")
@js.native
class ResourceManagementExperiments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * analytics.management.experiments.delete
    * @desc Delete an experiment.
    * @alias analytics.management.experiments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the experiment belongs
    * @param {string} params.experimentId ID of the experiment to delete
    * @param {string} params.profileId View (Profile) ID to which the experiment belongs
    * @param {string} params.webPropertyId Web property ID to which the experiment belongs
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagementExperimentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagementExperimentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagementExperimentsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * analytics.management.experiments.get
    * @desc Returns an experiment to which the user has access.
    * @alias analytics.management.experiments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the experiment for.
    * @param {string} params.experimentId Experiment ID to retrieve the experiment for.
    * @param {string} params.profileId View (Profile) ID to retrieve the experiment for.
    * @param {string} params.webPropertyId Web property ID to retrieve the experiment for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaExperiment] = js.native
  def get(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def get(params: ParamsResourceManagementExperimentsGet): GaxiosPromise[SchemaExperiment] = js.native
  def get(params: ParamsResourceManagementExperimentsGet, callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def get(
    params: ParamsResourceManagementExperimentsGet,
    options: BodyResponseCallback[SchemaExperiment],
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def get(params: ParamsResourceManagementExperimentsGet, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def get(
    params: ParamsResourceManagementExperimentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  
  /**
    * analytics.management.experiments.insert
    * @desc Create a new experiment.
    * @alias analytics.management.experiments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the experiment for.
    * @param {string} params.profileId View (Profile) ID to create the experiment for.
    * @param {string} params.webPropertyId Web property ID to create the experiment for.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaExperiment] = js.native
  def insert(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def insert(params: ParamsResourceManagementExperimentsInsert): GaxiosPromise[SchemaExperiment] = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    options: BodyResponseCallback[SchemaExperiment],
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def insert(params: ParamsResourceManagementExperimentsInsert, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def insert(
    params: ParamsResourceManagementExperimentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  
  /**
    * analytics.management.experiments.list
    * @desc Lists experiments to which the user has access.
    * @alias analytics.management.experiments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve experiments for.
    * @param {integer=} params.max-results The maximum number of experiments to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve experiments for.
    * @param {integer=} params.start-index An index of the first experiment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve experiments for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaExperiments] = js.native
  def list(callback: BodyResponseCallback[SchemaExperiments]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExperiments] = js.native
  def list(params: ParamsResourceManagementExperimentsList): GaxiosPromise[SchemaExperiments] = js.native
  def list(params: ParamsResourceManagementExperimentsList, callback: BodyResponseCallback[SchemaExperiments]): Unit = js.native
  def list(
    params: ParamsResourceManagementExperimentsList,
    options: BodyResponseCallback[SchemaExperiments],
    callback: BodyResponseCallback[SchemaExperiments]
  ): Unit = js.native
  def list(params: ParamsResourceManagementExperimentsList, options: MethodOptions): GaxiosPromise[SchemaExperiments] = js.native
  def list(
    params: ParamsResourceManagementExperimentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiments]
  ): Unit = js.native
  
  /**
    * analytics.management.experiments.patch
    * @desc Update an existing experiment. This method supports patch
    * semantics.
    * @alias analytics.management.experiments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the experiment to update.
    * @param {string} params.experimentId Experiment ID of the experiment to update.
    * @param {string} params.profileId View (Profile) ID of the experiment to update.
    * @param {string} params.webPropertyId Web property ID of the experiment to update.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaExperiment] = js.native
  def patch(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch): GaxiosPromise[SchemaExperiment] = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch, callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def patch(
    params: ParamsResourceManagementExperimentsPatch,
    options: BodyResponseCallback[SchemaExperiment],
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def patch(params: ParamsResourceManagementExperimentsPatch, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def patch(
    params: ParamsResourceManagementExperimentsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  
  /**
    * analytics.management.experiments.update
    * @desc Update an existing experiment.
    * @alias analytics.management.experiments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the experiment to update.
    * @param {string} params.experimentId Experiment ID of the experiment to update.
    * @param {string} params.profileId View (Profile) ID of the experiment to update.
    * @param {string} params.webPropertyId Web property ID of the experiment to update.
    * @param {().Experiment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaExperiment] = js.native
  def update(callback: BodyResponseCallback[SchemaExperiment]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def update(params: ParamsResourceManagementExperimentsUpdate): GaxiosPromise[SchemaExperiment] = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    options: BodyResponseCallback[SchemaExperiment],
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
  def update(params: ParamsResourceManagementExperimentsUpdate, options: MethodOptions): GaxiosPromise[SchemaExperiment] = js.native
  def update(
    params: ParamsResourceManagementExperimentsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExperiment]
  ): Unit = js.native
}
