package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the payload to request to increment an
  * achievement.
  */
@js.native
trait SchemaGamesAchievementSetStepsAtLeast extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#GamesAchievementSetStepsAtLeast.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The minimum number of steps for the achievement to be set to.
    */
  var steps: js.UndefOr[Double] = js.native
}

object SchemaGamesAchievementSetStepsAtLeast {
  @scala.inline
  def apply(kind: String = null, steps: Int | Double = null): SchemaGamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGamesAchievementSetStepsAtLeast]
  }
}

