package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to update availability.
  */
@js.native
trait SchemaUpdateAvailabilityRequest extends js.Object {
  /**
    * The availabilities being requested.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}

object SchemaUpdateAvailabilityRequest {
  @scala.inline
  def apply(availabilities: js.Array[SchemaAvailability] = null): SchemaUpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateAvailabilityRequest]
  }
}

