package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement unlock response.
  */
@js.native
trait SchemaAchievementUpdateMultipleResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The updated state of the achievements.
    */
  var updatedAchievements: js.UndefOr[js.Array[SchemaAchievementUpdateResponse]] = js.native
}

object SchemaAchievementUpdateMultipleResponse {
  @scala.inline
  def apply(kind: String = null, updatedAchievements: js.Array[SchemaAchievementUpdateResponse] = null): SchemaAchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updatedAchievements != null) __obj.updateDynamic("updatedAchievements")(updatedAchievements.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementUpdateMultipleResponse]
  }
}

