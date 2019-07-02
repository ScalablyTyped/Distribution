package typings
package inboxsdkLib.inboxsdkMod.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeNoticeDescriptor extends js.Object {
  var orderHint: js.UndefOr[scala.Double] = js.undefined
}

object ComposeNoticeDescriptor {
  @scala.inline
  def apply(orderHint: scala.Int | scala.Double = null): ComposeNoticeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeNoticeDescriptor]
  }
}

