package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSkippedDetail extends js.Object {
  /**
    * If the App doesn&#39;t support the specific API level.
    */
  var incompatibleAppVersion: js.UndefOr[Boolean] = js.native
  /**
    * If the App doesn&#39;t run on the specific architecture, for example,
    * x86.
    */
  var incompatibleArchitecture: js.UndefOr[Boolean] = js.native
  /**
    * If the requested OS version doesn&#39;t run on the specific device model.
    */
  var incompatibleDevice: js.UndefOr[Boolean] = js.native
}

object SchemaSkippedDetail {
  @scala.inline
  def apply(
    incompatibleAppVersion: js.UndefOr[Boolean] = js.undefined,
    incompatibleArchitecture: js.UndefOr[Boolean] = js.undefined,
    incompatibleDevice: js.UndefOr[Boolean] = js.undefined
  ): SchemaSkippedDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incompatibleAppVersion)) __obj.updateDynamic("incompatibleAppVersion")(incompatibleAppVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incompatibleArchitecture)) __obj.updateDynamic("incompatibleArchitecture")(incompatibleArchitecture.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incompatibleDevice)) __obj.updateDynamic("incompatibleDevice")(incompatibleDevice.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSkippedDetail]
  }
}

