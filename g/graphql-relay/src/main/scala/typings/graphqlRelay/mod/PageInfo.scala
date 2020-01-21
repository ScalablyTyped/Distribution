package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var endCursor: js.UndefOr[ConnectionCursor | Null] = js.undefined
  var hasNextPage: js.UndefOr[Boolean | Null] = js.undefined
  var hasPreviousPage: js.UndefOr[Boolean | Null] = js.undefined
  var startCursor: js.UndefOr[ConnectionCursor | Null] = js.undefined
}

object PageInfo {
  @scala.inline
  def apply(
    endCursor: ConnectionCursor = null,
    hasNextPage: js.UndefOr[Boolean] = js.undefined,
    hasPreviousPage: js.UndefOr[Boolean] = js.undefined,
    startCursor: ConnectionCursor = null
  ): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (endCursor != null) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNextPage)) __obj.updateDynamic("hasNextPage")(hasNextPage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPreviousPage)) __obj.updateDynamic("hasPreviousPage")(hasPreviousPage.asInstanceOf[js.Any])
    if (startCursor != null) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

