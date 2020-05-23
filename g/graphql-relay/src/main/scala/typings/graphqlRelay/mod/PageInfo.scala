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
    endCursor: js.UndefOr[Null | ConnectionCursor] = js.undefined,
    hasNextPage: js.UndefOr[Null | Boolean] = js.undefined,
    hasPreviousPage: js.UndefOr[Null | Boolean] = js.undefined,
    startCursor: js.UndefOr[Null | ConnectionCursor] = js.undefined
  ): PageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endCursor)) __obj.updateDynamic("endCursor")(endCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(hasNextPage)) __obj.updateDynamic("hasNextPage")(hasNextPage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasPreviousPage)) __obj.updateDynamic("hasPreviousPage")(hasPreviousPage.asInstanceOf[js.Any])
    if (!js.isUndefined(startCursor)) __obj.updateDynamic("startCursor")(startCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
}

