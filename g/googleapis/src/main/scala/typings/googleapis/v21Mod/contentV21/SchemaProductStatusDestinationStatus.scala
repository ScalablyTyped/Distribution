package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductStatusDestinationStatus extends js.Object {
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object SchemaProductStatusDestinationStatus {
  @scala.inline
  def apply(destination: String = null, status: String = null): SchemaProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductStatusDestinationStatus]
  }
}

