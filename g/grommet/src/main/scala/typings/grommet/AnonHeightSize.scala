package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightSize extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonHeightSize {
  @scala.inline
  def apply(height: Int | Double = null, size: String = null): AnonHeightSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightSize]
  }
}

