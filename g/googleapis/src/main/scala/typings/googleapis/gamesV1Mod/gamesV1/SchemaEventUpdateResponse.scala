package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventUpdateResponse extends js.Object {
  /**
    * Any batch-wide failures which occurred applying updates.
    */
  var batchFailures: js.UndefOr[js.Array[SchemaEventBatchRecordFailure]] = js.native
  /**
    * Any failures updating a particular event.
    */
  var eventFailures: js.UndefOr[js.Array[SchemaEventRecordFailure]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current status of any updated events
    */
  var playerEvents: js.UndefOr[js.Array[SchemaPlayerEvent]] = js.native
}

object SchemaEventUpdateResponse {
  @scala.inline
  def apply(
    batchFailures: js.Array[SchemaEventBatchRecordFailure] = null,
    eventFailures: js.Array[SchemaEventRecordFailure] = null,
    kind: String = null,
    playerEvents: js.Array[SchemaPlayerEvent] = null
  ): SchemaEventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (batchFailures != null) __obj.updateDynamic("batchFailures")(batchFailures.asInstanceOf[js.Any])
    if (eventFailures != null) __obj.updateDynamic("eventFailures")(eventFailures.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (playerEvents != null) __obj.updateDynamic("playerEvents")(playerEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventUpdateResponse]
  }
}

