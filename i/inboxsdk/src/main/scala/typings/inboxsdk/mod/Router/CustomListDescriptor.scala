package typings.inboxsdk.mod.Router

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomListDescriptor extends js.Object {
  var hasMore: js.UndefOr[Boolean] = js.undefined
  var threads: js.Array[ThreadDescriptor | String]
  var total: js.UndefOr[Double] = js.undefined
}

object CustomListDescriptor {
  @scala.inline
  def apply(
    threads: js.Array[ThreadDescriptor | String],
    hasMore: js.UndefOr[Boolean] = js.undefined,
    total: Int | Double = null
  ): CustomListDescriptor = {
    val __obj = js.Dynamic.literal(threads = threads.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomListDescriptor]
  }
}

