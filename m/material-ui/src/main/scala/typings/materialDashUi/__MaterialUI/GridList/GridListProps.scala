package typings.materialDashUi.__MaterialUI.GridList

import typings.materialDashUi.materialDashUiStrings.auto
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridListProps extends js.Object {
  var cellHeight: js.UndefOr[Double | auto] = js.undefined
  var cols: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GridListProps {
  @scala.inline
  def apply(
    cellHeight: Double | auto = null,
    cols: Int | Double = null,
    padding: Int | Double = null,
    style: CSSProperties = null
  ): GridListProps = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridListProps]
  }
}

