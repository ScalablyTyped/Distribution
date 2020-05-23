package typings.inboxsdk.mod.Compose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarDescriptor extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var orderHint: js.UndefOr[Double] = js.undefined
}

object StatusBarDescriptor {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, orderHint: js.UndefOr[Double] = js.undefined): StatusBarDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(orderHint)) __obj.updateDynamic("orderHint")(orderHint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarDescriptor]
  }
}

