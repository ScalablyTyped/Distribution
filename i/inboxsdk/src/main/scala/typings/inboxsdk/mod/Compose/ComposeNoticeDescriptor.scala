package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeNoticeDescriptor extends js.Object {
  var orderHint: js.UndefOr[Double] = js.undefined
}

object ComposeNoticeDescriptor {
  @scala.inline
  def apply(orderHint: Int | Double = null): ComposeNoticeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeNoticeDescriptor]
  }
}

