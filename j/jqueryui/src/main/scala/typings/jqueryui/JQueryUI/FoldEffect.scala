package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldEffect extends js.Object {
  var horizFirst: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
}

object FoldEffect {
  @scala.inline
  def apply(horizFirst: js.UndefOr[Boolean] = js.undefined, size: js.Any = null): FoldEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizFirst)) __obj.updateDynamic("horizFirst")(horizFirst.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldEffect]
  }
}

