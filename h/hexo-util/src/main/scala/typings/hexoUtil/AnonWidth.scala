package typings.hexoUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
}

object AnonWidth {
  @scala.inline
  def apply(width: Int | Double = null): AnonWidth = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

