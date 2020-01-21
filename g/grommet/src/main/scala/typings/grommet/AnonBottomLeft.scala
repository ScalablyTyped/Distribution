package typings.grommet

import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomLeft extends js.Object {
  var bottom: js.UndefOr[top | typings.grommet.grommetStrings.bottom] = js.undefined
  var left: js.UndefOr[typings.grommet.grommetStrings.left | right] = js.undefined
  var right: js.UndefOr[left | typings.grommet.grommetStrings.right] = js.undefined
  var top: js.UndefOr[typings.grommet.grommetStrings.top | bottom] = js.undefined
}

object AnonBottomLeft {
  @scala.inline
  def apply(
    bottom: top | bottom = null,
    left: left | right = null,
    right: left | right = null,
    top: top | bottom = null
  ): AnonBottomLeft = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomLeft]
  }
}

