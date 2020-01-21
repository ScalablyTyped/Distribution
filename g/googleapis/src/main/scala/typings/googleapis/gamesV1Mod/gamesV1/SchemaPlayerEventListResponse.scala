package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a ListByPlayer response.
  */
@js.native
trait SchemaPlayerEventListResponse extends js.Object {
  /**
    * The player events.
    */
  var items: js.UndefOr[js.Array[SchemaPlayerEvent]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerEventListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaPlayerEventListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaPlayerEvent] = null, kind: String = null, nextPageToken: String = null): SchemaPlayerEventListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayerEventListResponse]
  }
}

