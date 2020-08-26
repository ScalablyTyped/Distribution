package typings.materialUi.MaterialUI.GridList

import typings.materialUi.materialUiStrings.auto
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridListProps extends js.Object {
  var cellHeight: js.UndefOr[Double | auto] = js.native
  var cols: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object GridListProps {
  @scala.inline
  def apply(): GridListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridListProps]
  }
  @scala.inline
  implicit class GridListPropsOps[Self <: GridListProps] (val x: Self) extends AnyVal {
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
    def setCellHeight(value: Double | auto): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

