package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of achievement objects.
  */
@js.native
trait SchemaPlayerAchievementListResponse extends js.Object {
  /**
    * The achievements.
    */
  var items: js.UndefOr[js.Array[SchemaPlayerAchievement]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerAchievementListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaPlayerAchievementListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaPlayerAchievement] = null, kind: String = null, nextPageToken: String = null): SchemaPlayerAchievementListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerAchievementListResponse]
  }
}

