package typings.googleapis.v1managementMod.gamesManagementV1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of hidden players.
  */
@js.native
trait SchemaHiddenPlayerList extends js.Object {
  /**
    * The players.
    */
  var items: js.UndefOr[js.Array[SchemaHiddenPlayer]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#hiddenPlayerList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaHiddenPlayerList {
  @scala.inline
  def apply(items: js.Array[SchemaHiddenPlayer] = null, kind: String = null, nextPageToken: String = null): SchemaHiddenPlayerList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHiddenPlayerList]
  }
}

