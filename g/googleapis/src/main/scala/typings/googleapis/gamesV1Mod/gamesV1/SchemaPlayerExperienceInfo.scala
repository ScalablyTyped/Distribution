package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for 1P/3P metadata about the player&#39;s
  * experience.
  */
@js.native
trait SchemaPlayerExperienceInfo extends js.Object {
  /**
    * The current number of experience points for the player.
    */
  var currentExperiencePoints: js.UndefOr[String] = js.native
  /**
    * The current level of the player.
    */
  var currentLevel: js.UndefOr[SchemaPlayerLevel] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerExperienceInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp when the player was leveled up, in millis since Unix epoch
    * UTC.
    */
  var lastLevelUpTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The next level of the player. If the current level is the maximum level,
    * this should be same as the current level.
    */
  var nextLevel: js.UndefOr[SchemaPlayerLevel] = js.native
}

object SchemaPlayerExperienceInfo {
  @scala.inline
  def apply(): SchemaPlayerExperienceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerExperienceInfo]
  }
  @scala.inline
  implicit class SchemaPlayerExperienceInfoOps[Self <: SchemaPlayerExperienceInfo] (val x: Self) extends AnyVal {
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
    def setCurrentExperiencePoints(value: String): Self = this.set("currentExperiencePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentExperiencePoints: Self = this.set("currentExperiencePoints", js.undefined)
    @scala.inline
    def setCurrentLevel(value: SchemaPlayerLevel): Self = this.set("currentLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentLevel: Self = this.set("currentLevel", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastLevelUpTimestampMillis(value: String): Self = this.set("lastLevelUpTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastLevelUpTimestampMillis: Self = this.set("lastLevelUpTimestampMillis", js.undefined)
    @scala.inline
    def setNextLevel(value: SchemaPlayerLevel): Self = this.set("nextLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextLevel: Self = this.set("nextLevel", js.undefined)
  }
  
}

