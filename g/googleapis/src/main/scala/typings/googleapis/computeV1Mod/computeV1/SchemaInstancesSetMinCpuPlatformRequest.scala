package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMinCpuPlatformRequest extends js.Object {
  /**
    * Minimum cpu/platform this instance should be started at.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object SchemaInstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(minCpuPlatform: String = null): SchemaInstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesSetMinCpuPlatformRequest]
  }
}

