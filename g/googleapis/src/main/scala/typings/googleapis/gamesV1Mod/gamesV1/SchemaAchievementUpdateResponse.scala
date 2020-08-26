package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement update response.
  */
@js.native
trait SchemaAchievementUpdateResponse extends js.Object {
  /**
    * The achievement this update is was applied to.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * The current state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The current steps recorded for this achievement if it is incremental.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requested updates actually affected the achievement.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}

object SchemaAchievementUpdateResponse {
  @scala.inline
  def apply(): SchemaAchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementUpdateResponse]
  }
  @scala.inline
  implicit class SchemaAchievementUpdateResponseOps[Self <: SchemaAchievementUpdateResponse] (val x: Self) extends AnyVal {
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
    def setAchievementId(value: String): Self = this.set("achievementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievementId: Self = this.set("achievementId", js.undefined)
    @scala.inline
    def setCurrentState(value: String): Self = this.set("currentState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentState: Self = this.set("currentState", js.undefined)
    @scala.inline
    def setCurrentSteps(value: Double): Self = this.set("currentSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSteps: Self = this.set("currentSteps", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewlyUnlocked(value: Boolean): Self = this.set("newlyUnlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewlyUnlocked: Self = this.set("newlyUnlocked", js.undefined)
    @scala.inline
    def setUpdateOccurred(value: Boolean): Self = this.set("updateOccurred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOccurred: Self = this.set("updateOccurred", js.undefined)
  }
  
}

