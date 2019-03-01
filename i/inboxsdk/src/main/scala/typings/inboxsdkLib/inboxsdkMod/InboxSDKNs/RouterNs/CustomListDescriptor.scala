package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomListDescriptor extends js.Object {
  var hasMore: js.UndefOr[scala.Boolean] = js.undefined
  var threads: js.Array[ThreadDescriptor | java.lang.String]
  var total: js.UndefOr[scala.Double] = js.undefined
}

object CustomListDescriptor {
  @scala.inline
  def apply(
    threads: js.Array[ThreadDescriptor | java.lang.String],
    hasMore: js.UndefOr[scala.Boolean] = js.undefined,
    total: scala.Int | scala.Double = null
  ): CustomListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("threads")(threads)
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomListDescriptor]
  }
}

