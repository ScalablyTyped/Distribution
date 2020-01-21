package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a request to update an achievement.
  */
@js.native
trait SchemaAchievementUpdateRequest extends js.Object {
  /**
    * The achievement this update is being applied to.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * The payload if an update of type INCREMENT was requested for the
    * achievement.
    */
  var incrementPayload: js.UndefOr[SchemaGamesAchievementIncrement] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The payload if an update of type SET_STEPS_AT_LEAST was requested for the
    * achievement.
    */
  var setStepsAtLeastPayload: js.UndefOr[SchemaGamesAchievementSetStepsAtLeast] = js.native
  /**
    * The type of update being applied. Possible values are:   -
    * &quot;REVEAL&quot; - Achievement is revealed.  - &quot;UNLOCK&quot; -
    * Achievement is unlocked.  - &quot;INCREMENT&quot; - Achievement is
    * incremented.  - &quot;SET_STEPS_AT_LEAST&quot; - Achievement progress is
    * set to at least the passed value.
    */
  var updateType: js.UndefOr[String] = js.native
}

object SchemaAchievementUpdateRequest {
  @scala.inline
  def apply(
    achievementId: String = null,
    incrementPayload: SchemaGamesAchievementIncrement = null,
    kind: String = null,
    setStepsAtLeastPayload: SchemaGamesAchievementSetStepsAtLeast = null,
    updateType: String = null
  ): SchemaAchievementUpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (achievementId != null) __obj.updateDynamic("achievementId")(achievementId.asInstanceOf[js.Any])
    if (incrementPayload != null) __obj.updateDynamic("incrementPayload")(incrementPayload.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (setStepsAtLeastPayload != null) __obj.updateDynamic("setStepsAtLeastPayload")(setStepsAtLeastPayload.asInstanceOf[js.Any])
    if (updateType != null) __obj.updateDynamic("updateType")(updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementUpdateRequest]
  }
}

