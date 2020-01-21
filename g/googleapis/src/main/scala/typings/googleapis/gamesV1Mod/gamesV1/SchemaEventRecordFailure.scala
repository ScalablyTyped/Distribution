package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event update failure resource.
  */
@js.native
trait SchemaEventRecordFailure extends js.Object {
  /**
    * The ID of the event that was not updated.
    */
  var eventId: js.UndefOr[String] = js.native
  /**
    * The cause for the update failure. Possible values are:   -
    * &quot;NOT_FOUND&quot; - An attempt was made to set an event that was not
    * defined.  - &quot;INVALID_UPDATE_VALUE&quot; - An attempt was made to
    * increment an event by a non-positive value.
    */
  var failureCause: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventRecordFailure.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaEventRecordFailure {
  @scala.inline
  def apply(eventId: String = null, failureCause: String = null, kind: String = null): SchemaEventRecordFailure = {
    val __obj = js.Dynamic.literal()
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (failureCause != null) __obj.updateDynamic("failureCause")(failureCause.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventRecordFailure]
  }
}

