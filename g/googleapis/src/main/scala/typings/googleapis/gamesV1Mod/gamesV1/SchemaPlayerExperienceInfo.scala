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
  def apply(
    currentExperiencePoints: String = null,
    currentLevel: SchemaPlayerLevel = null,
    kind: String = null,
    lastLevelUpTimestampMillis: String = null,
    nextLevel: SchemaPlayerLevel = null
  ): SchemaPlayerExperienceInfo = {
    val __obj = js.Dynamic.literal()
    if (currentExperiencePoints != null) __obj.updateDynamic("currentExperiencePoints")(currentExperiencePoints.asInstanceOf[js.Any])
    if (currentLevel != null) __obj.updateDynamic("currentLevel")(currentLevel.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastLevelUpTimestampMillis != null) __obj.updateDynamic("lastLevelUpTimestampMillis")(lastLevelUpTimestampMillis.asInstanceOf[js.Any])
    if (nextLevel != null) __obj.updateDynamic("nextLevel")(nextLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerExperienceInfo]
  }
}

