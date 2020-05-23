package typings.graphqlRelay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionArguments extends js.Object {
  var after: js.UndefOr[ConnectionCursor | Null] = js.undefined
  var before: js.UndefOr[ConnectionCursor | Null] = js.undefined
  var first: js.UndefOr[Double | Null] = js.undefined
  var last: js.UndefOr[Double | Null] = js.undefined
}

object ConnectionArguments {
  @scala.inline
  def apply(
    after: js.UndefOr[Null | ConnectionCursor] = js.undefined,
    before: js.UndefOr[Null | ConnectionCursor] = js.undefined,
    first: js.UndefOr[Null | Double] = js.undefined,
    last: js.UndefOr[Null | Double] = js.undefined
  ): ConnectionArguments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(after)) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArguments]
  }
}

