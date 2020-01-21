package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of achievement definition objects.
  */
@js.native
trait SchemaAchievementDefinitionsListResponse extends js.Object {
  /**
    * The achievement definitions.
    */
  var items: js.UndefOr[js.Array[SchemaAchievementDefinition]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementDefinitionsListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaAchievementDefinitionsListResponse {
  @scala.inline
  def apply(
    items: js.Array[SchemaAchievementDefinition] = null,
    kind: String = null,
    nextPageToken: String = null
  ): SchemaAchievementDefinitionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAchievementDefinitionsListResponse]
  }
}

