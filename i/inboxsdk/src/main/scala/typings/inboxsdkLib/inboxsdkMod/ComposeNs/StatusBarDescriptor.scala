package typings
package inboxsdkLib.inboxsdkMod.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarDescriptor extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var orderHint: js.UndefOr[scala.Double] = js.undefined
}

object StatusBarDescriptor {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, orderHint: scala.Int | scala.Double = null): StatusBarDescriptor = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (orderHint != null) __obj.updateDynamic("orderHint")(orderHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarDescriptor]
  }
}

