package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about events that occur during pipeline execution.
  */
@js.native
trait SchemaEvent extends js.Object {
  /**
    * A human-readable description of the event. Note that these strings can
    * change at any time without notice. Any application logic must use the
    * information in the `details` field.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Machine-readable details about the event.
    */
  var details: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The time at which the event occurred.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(description: String = null, details: StringDictionary[js.Any] = null, timestamp: String = null): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEvent]
  }
}

