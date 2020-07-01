package typings.grommet.anon

import typings.grommet.listMod.PadSizeType
import typings.grommet.listMod._PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends _PadType {
  var bottom: js.UndefOr[PadSizeType] = js.undefined
  var horizontal: js.UndefOr[PadSizeType] = js.undefined
  var left: js.UndefOr[PadSizeType] = js.undefined
  var right: js.UndefOr[PadSizeType] = js.undefined
  var top: js.UndefOr[PadSizeType] = js.undefined
  var vertical: js.UndefOr[PadSizeType] = js.undefined
}

object Left {
  @scala.inline
  def apply(
    bottom: PadSizeType = null,
    horizontal: PadSizeType = null,
    left: PadSizeType = null,
    right: PadSizeType = null,
    top: PadSizeType = null,
    vertical: PadSizeType = null
  ): Left = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

