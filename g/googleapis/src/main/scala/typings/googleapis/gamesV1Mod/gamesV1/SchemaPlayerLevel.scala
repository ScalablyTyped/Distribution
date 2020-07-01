package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
@js.native
trait SchemaPlayerLevel extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLevel.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double] = js.native
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String] = js.native
}

object SchemaPlayerLevel {
  @scala.inline
  def apply(
    kind: String = null,
    level: js.UndefOr[Double] = js.undefined,
    maxExperiencePoints: String = null,
    minExperiencePoints: String = null
  ): SchemaPlayerLevel = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints.asInstanceOf[js.Any])
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerLevel]
  }
}

