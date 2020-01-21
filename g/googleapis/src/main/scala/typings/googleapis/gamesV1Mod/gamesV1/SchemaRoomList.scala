package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of rooms.
  */
@js.native
trait SchemaRoomList extends js.Object {
  /**
    * The rooms.
    */
  var items: js.UndefOr[js.Array[SchemaRoom]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaRoomList {
  @scala.inline
  def apply(items: js.Array[SchemaRoom] = null, kind: String = null, nextPageToken: String = null): SchemaRoomList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRoomList]
  }
}

