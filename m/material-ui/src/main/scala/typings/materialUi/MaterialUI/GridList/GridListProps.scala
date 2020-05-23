package typings.materialUi.MaterialUI.GridList

import typings.materialUi.materialUiStrings.auto
import typings.react.mod.CSSProperties
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
    cols: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null
  ): GridListProps = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridListProps]
  }
}

