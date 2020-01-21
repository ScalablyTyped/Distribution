package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGoogleCloudMlV1Location extends js.Object {
  /**
    * Capabilities available in the location.
    */
  var capabilities: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Capability]] = js.native
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1Location {
  @scala.inline
  def apply(capabilities: js.Array[SchemaGoogleCloudMlV1Capability] = null, name: String = null): SchemaGoogleCloudMlV1Location = {
    val __obj = js.Dynamic.literal()
    if (capabilities != null) __obj.updateDynamic("capabilities")(capabilities.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1Location]
  }
}

