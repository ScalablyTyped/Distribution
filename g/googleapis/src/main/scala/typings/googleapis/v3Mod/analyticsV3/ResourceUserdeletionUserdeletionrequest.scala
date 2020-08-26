package typings.googleapis.v3Mod.analyticsV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Userdeletion$Userdeletionrequest")
@js.native
class ResourceUserdeletionUserdeletionrequest protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.userDeletion.userDeletionRequest.upsert
    * @desc Insert or update a user deletion requests.
    * @alias analytics.userDeletion.userDeletionRequest.upsert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UserDeletionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upsert(): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(callback: BodyResponseCallback[SchemaUserDeletionRequest]): Unit = js.native
  def upsert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(params: ParamsResourceUserdeletionUserdeletionrequestUpsert): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    options: BodyResponseCallback[SchemaUserDeletionRequest],
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
  def upsert(params: ParamsResourceUserdeletionUserdeletionrequestUpsert, options: MethodOptions): GaxiosPromise[SchemaUserDeletionRequest] = js.native
  def upsert(
    params: ParamsResourceUserdeletionUserdeletionrequestUpsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserDeletionRequest]
  ): Unit = js.native
}

