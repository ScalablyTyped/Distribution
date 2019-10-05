package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropEffect extends js.Object {
  var direction: js.UndefOr[Double] = js.undefined
}

object DropEffect {
  @scala.inline
  def apply(direction: Int | Double = null): DropEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropEffect]
  }
}

