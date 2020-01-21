package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the list of events and times they occured for major events in job
  * execution.
  */
@js.native
trait SchemaTimestampEvent extends js.Object {
  /**
    * String indicating the type of event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time this event occured.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaTimestampEvent {
  @scala.inline
  def apply(description: String = null, timestamp: String = null): SchemaTimestampEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimestampEvent]
  }
}

