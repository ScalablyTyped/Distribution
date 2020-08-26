package typings.materialUi.MaterialUI.Table

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableHeaderProps extends js.Object {
  var adjustForCheckbox: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var displaySelectAll: js.UndefOr[Boolean] = js.native
  var enableSelectAll: js.UndefOr[Boolean] = js.native
  /** @deprecated Instead, use event handler on Table */
  var onSelectAll: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.native
  /** @deprecated Instead, use event handler on Table */
  var selectAllSelected: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TableHeaderProps {
  @scala.inline
  def apply(): TableHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHeaderProps]
  }
  @scala.inline
  implicit class TableHeaderPropsOps[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
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
    def setAdjustForCheckbox(value: Boolean): Self = this.set("adjustForCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustForCheckbox: Self = this.set("adjustForCheckbox", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisplaySelectAll(value: Boolean): Self = this.set("displaySelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplaySelectAll: Self = this.set("displaySelectAll", js.undefined)
    @scala.inline
    def setEnableSelectAll(value: Boolean): Self = this.set("enableSelectAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSelectAll: Self = this.set("enableSelectAll", js.undefined)
    @scala.inline
    def setOnSelectAll(value: /* checked */ Boolean => Unit): Self = this.set("onSelectAll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectAll: Self = this.set("onSelectAll", js.undefined)
    @scala.inline
    def setSelectAllSelected(value: Boolean): Self = this.set("selectAllSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllSelected: Self = this.set("selectAllSelected", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

