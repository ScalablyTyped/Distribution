package typings.grommet.anon

import typings.grommet.utilsMod.EdgeSizeType
import typings.grommet.utilsMod._EdgeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends _EdgeType {
  var bottom: js.UndefOr[EdgeSizeType | String] = js.undefined
  var end: js.UndefOr[EdgeSizeType | String] = js.undefined
  var horizontal: js.UndefOr[EdgeSizeType | String] = js.undefined
  var left: js.UndefOr[EdgeSizeType | String] = js.undefined
  var right: js.UndefOr[EdgeSizeType | String] = js.undefined
  var start: js.UndefOr[EdgeSizeType | String] = js.undefined
  var top: js.UndefOr[EdgeSizeType | String] = js.undefined
  var vertical: js.UndefOr[EdgeSizeType | String] = js.undefined
}

object Start {
  @scala.inline
  def apply(
    bottom: EdgeSizeType | String = null,
    end: EdgeSizeType | String = null,
    horizontal: EdgeSizeType | String = null,
    left: EdgeSizeType | String = null,
    right: EdgeSizeType | String = null,
    start: EdgeSizeType | String = null,
    top: EdgeSizeType | String = null,
    vertical: EdgeSizeType | String = null
  ): Start = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

