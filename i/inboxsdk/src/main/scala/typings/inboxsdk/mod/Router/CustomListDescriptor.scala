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
    total: js.UndefOr[Double] = js.undefined
  ): CustomListDescriptor = {
    val __obj = js.Dynamic.literal(threads = threads.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomListDescriptor]
  }
}

