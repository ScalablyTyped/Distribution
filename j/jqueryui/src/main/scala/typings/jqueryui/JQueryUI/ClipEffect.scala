package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipEffect extends js.Object {
  var direction: js.UndefOr[Double] = js.undefined
}

object ClipEffect {
  @scala.inline
  def apply(direction: Int | Double = null): ClipEffect = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipEffect]
  }
}

