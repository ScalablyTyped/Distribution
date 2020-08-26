package typings.googleapis.jobsV3Mod.jobsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v3", "jobs_v3.Resource$Projects$Clientevents")
@js.native
class ResourceProjectsClientevents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.projects.clientEvents.create
    * @desc Report events issued when end user interacts with customer's
    * application that uses Cloud Talent Solution. You may inspect the created
    * events in [self service
    * tools](https://console.cloud.google.com/talent-solution/overview). [Learn
    * more](https://cloud.google.com/talent-solution/job-search/docs/management-tools)
    * about self service tools.
    * @alias jobs.projects.clientEvents.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Parent project name.
    * @param {().CreateClientEventRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaClientEvent] = js.native
  def create(callback: BodyResponseCallback[SchemaClientEvent]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(params: ParamsResourceProjectsClienteventsCreate): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    options: BodyResponseCallback[SchemaClientEvent],
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsClienteventsCreate, options: MethodOptions): GaxiosPromise[SchemaClientEvent] = js.native
  def create(
    params: ParamsResourceProjectsClienteventsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientEvent]
  ): Unit = js.native
}

