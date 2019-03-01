package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLeft extends js.Object {
  var bottom: js.UndefOr[grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom] = js.undefined
  var left: js.UndefOr[grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right] = js.undefined
  var right: js.UndefOr[grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right] = js.undefined
  var top: js.UndefOr[grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom] = js.undefined
}

object Anon_BottomLeft {
  @scala.inline
  def apply(
    bottom: grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom = null,
    left: grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right = null,
    right: grommetLib.grommetLibStrings.left | grommetLib.grommetLibStrings.right = null,
    top: grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.bottom = null
  ): Anon_BottomLeft = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomLeft]
  }
}

