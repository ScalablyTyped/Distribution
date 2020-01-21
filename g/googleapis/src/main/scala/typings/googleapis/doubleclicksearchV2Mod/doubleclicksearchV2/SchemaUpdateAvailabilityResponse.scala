package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a update availability request.
  */
@js.native
trait SchemaUpdateAvailabilityResponse extends js.Object {
  /**
    * The availabilities being returned.
    */
  var availabilities: js.UndefOr[js.Array[SchemaAvailability]] = js.native
}

object SchemaUpdateAvailabilityResponse {
  @scala.inline
  def apply(availabilities: js.Array[SchemaAvailability] = null): SchemaUpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateAvailabilityResponse]
  }
}

