package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for achievement reset all response.
  */
@js.native
trait SchemaAchievementResetAllResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetAllResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The achievement reset results.
    */
  var results: js.UndefOr[js.Array[SchemaAchievementResetResponse]] = js.native
}

object SchemaAchievementResetAllResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[SchemaAchievementResetResponse] = null): SchemaAchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementResetAllResponse]
  }
}

