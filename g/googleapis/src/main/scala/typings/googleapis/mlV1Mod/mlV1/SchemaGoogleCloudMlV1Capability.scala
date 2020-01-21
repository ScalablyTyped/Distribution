package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1Capability extends js.Object {
  /**
    * Available accelerators for the capability.
    */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1Capability {
  @scala.inline
  def apply(availableAccelerators: js.Array[String] = null, `type`: String = null): SchemaGoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    if (availableAccelerators != null) __obj.updateDynamic("availableAccelerators")(availableAccelerators.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Capability]
  }
}

