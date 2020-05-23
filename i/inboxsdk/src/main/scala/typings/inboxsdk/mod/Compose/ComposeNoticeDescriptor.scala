package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeNoticeDescriptor extends js.Object {
  var orderHint: js.UndefOr[Double] = js.undefined
}

object ComposeNoticeDescriptor {
  @scala.inline
  def apply(orderHint: js.UndefOr[Double] = js.undefined): ComposeNoticeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeNoticeDescriptor]
  }
}

