package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventUpdateRequest extends js.Object {
  /**
    * The ID of the event being modified in this update.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of times this event occurred in this time period.
    */
  var updateCount: js.UndefOr[String] = js.native
}

object SchemaEventUpdateRequest {
  @scala.inline
  def apply(definitionId: String = null, kind: String = null, updateCount: String = null): SchemaEventUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (definitionId != null) __obj.updateDynamic("definitionId")(definitionId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updateCount != null) __obj.updateDynamic("updateCount")(updateCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEventUpdateRequest]
  }
}

