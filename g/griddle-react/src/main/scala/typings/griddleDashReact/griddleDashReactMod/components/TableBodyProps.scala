package typings.griddleDashReact.griddleDashReactMod.components

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBodyProps extends js.Object {
  var Row: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var rowIds: js.UndefOr[js.Array[Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableBodyProps {
  @scala.inline
  def apply(
    Row: js.Any = null,
    className: String = null,
    rowIds: js.Array[Double] = null,
    style: CSSProperties = null
  ): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    if (Row != null) __obj.updateDynamic("Row")(Row.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (rowIds != null) __obj.updateDynamic("rowIds")(rowIds.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBodyProps]
  }
}

