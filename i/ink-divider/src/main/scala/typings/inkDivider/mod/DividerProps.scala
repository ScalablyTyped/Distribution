package typings.inkDivider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DividerProps extends js.Object {
  var dividerChar: js.UndefOr[String] = js.native
  var dividerColor: js.UndefOr[String] = js.native
  var padding: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var titleColor: js.UndefOr[String] = js.native
  var titlePadding: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DividerProps {
  @scala.inline
  def apply(): DividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DividerProps]
  }
  @scala.inline
  implicit class DividerPropsOps[Self <: DividerProps] (val x: Self) extends AnyVal {
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
    def setDividerChar(value: String): Self = this.set("dividerChar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerChar: Self = this.set("dividerChar", js.undefined)
    @scala.inline
    def setDividerColor(value: String): Self = this.set("dividerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDividerColor: Self = this.set("dividerColor", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    @scala.inline
    def setTitlePadding(value: Double): Self = this.set("titlePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePadding: Self = this.set("titlePadding", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

