package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement increment response
  */
@js.native
trait SchemaAchievementIncrementResponse extends js.Object {
  /**
    * The current steps recorded for this incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementIncrementResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether the current steps for the achievement has reached the number of
    * steps required to unlock.
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementIncrementResponse {
  @scala.inline
  def apply(
    currentSteps: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    newlyUnlocked: js.UndefOr[Boolean] = js.undefined
  ): SchemaAchievementIncrementResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentSteps)) __obj.updateDynamic("currentSteps")(currentSteps.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementIncrementResponse]
  }
}

