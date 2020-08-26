package typings.griddleReact.mod.components

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBodyProps extends js.Object {
  var Row: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var rowIds: js.UndefOr[js.Array[Double]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableBodyProps {
  @scala.inline
  def apply(): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBodyProps]
  }
  @scala.inline
  implicit class TableBodyPropsOps[Self <: TableBodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRow(value: js.Any): Self = this.set("Row", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRow: Self = this.set("Row", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setRowIdsVarargs(value: Double*): Self = this.set("rowIds", js.Array(value :_*))
    @scala.inline
    def setRowIds(value: js.Array[Double]): Self = this.set("rowIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIds: Self = this.set("rowIds", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

