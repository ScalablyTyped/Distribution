package typings.googleapis.driveV2Mod.driveV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Channels")
@js.native
class ResourceChannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.channels.stop
    * @desc Stop watching resources through this channel
    * @alias drive.channels.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Unit] = js.native
  def stop(callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop, callback: BodyResponseCallback[Unit]): Unit = js.native
  def stop(
    params: ParamsResourceChannelsStop,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def stop(params: ParamsResourceChannelsStop, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def stop(params: ParamsResourceChannelsStop, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
}

