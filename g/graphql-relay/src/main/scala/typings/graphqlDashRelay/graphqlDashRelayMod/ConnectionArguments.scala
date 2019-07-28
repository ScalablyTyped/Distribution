package typings.graphqlDashRelay.graphqlDashRelayMod

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
    after: ConnectionCursor = null,
    before: ConnectionCursor = null,
    first: Int | Double = null,
    last: Int | Double = null
  ): ConnectionArguments = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArguments]
  }
}

