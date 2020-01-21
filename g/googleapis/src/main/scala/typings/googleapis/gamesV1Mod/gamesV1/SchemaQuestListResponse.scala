package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of quest objects.
  */
@js.native
trait SchemaQuestListResponse extends js.Object {
  /**
    * The quests.
    */
  var items: js.UndefOr[js.Array[SchemaQuest]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaQuestListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaQuest] = null, kind: String = null, nextPageToken: String = null): SchemaQuestListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuestListResponse]
  }
}

