package typings
package graphqlDashRelayLib.graphqlDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionArguments extends js.Object {
  var after: js.UndefOr[ConnectionCursor | scala.Null] = js.undefined
  var before: js.UndefOr[ConnectionCursor | scala.Null] = js.undefined
  var first: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var last: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object ConnectionArguments {
  @scala.inline
  def apply(
    after: ConnectionCursor = null,
    before: ConnectionCursor = null,
    first: scala.Int | scala.Double = null,
    last: scala.Int | scala.Double = null
  ): ConnectionArguments = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    if (first != null) __obj.updateDynamic("first")(first.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArguments]
  }
}

