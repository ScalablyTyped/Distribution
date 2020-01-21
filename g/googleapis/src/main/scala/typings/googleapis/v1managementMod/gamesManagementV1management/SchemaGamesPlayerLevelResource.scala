package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
@js.native
trait SchemaGamesPlayerLevelResource extends js.Object {
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

object SchemaGamesPlayerLevelResource {
  @scala.inline
  def apply(level: Int | Double = null, maxExperiencePoints: String = null, minExperiencePoints: String = null): SchemaGamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints.asInstanceOf[js.Any])
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGamesPlayerLevelResource]
  }
}

