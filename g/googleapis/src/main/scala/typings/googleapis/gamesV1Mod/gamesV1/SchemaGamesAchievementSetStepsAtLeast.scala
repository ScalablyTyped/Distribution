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
  def apply(): SchemaGamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesAchievementSetStepsAtLeast]
  }
  @scala.inline
  implicit class SchemaGamesAchievementSetStepsAtLeastOps[Self <: SchemaGamesAchievementSetStepsAtLeast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

