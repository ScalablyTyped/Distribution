package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of achievement update requests.
  */
@js.native
trait SchemaAchievementUpdateMultipleRequest extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateMultipleRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The individual achievement update requests.
    */
  var updates: js.UndefOr[js.Array[SchemaAchievementUpdateRequest]] = js.native
}

object SchemaAchievementUpdateMultipleRequest {
  @scala.inline
  def apply(kind: String = null, updates: js.Array[SchemaAchievementUpdateRequest] = null): SchemaAchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleRequest]
  }
}

