package typings.layuiSrc.layui

import typings.layuiSrc.anon.Experience
import typings.layuiSrc.layuiSrcStrings.center
import typings.layuiSrc.layuiSrcStrings.checkbox
import typings.layuiSrc.layuiSrcStrings.left
import typings.layuiSrc.layuiSrcStrings.normal
import typings.layuiSrc.layuiSrcStrings.numbers
import typings.layuiSrc.layuiSrcStrings.radio
import typings.layuiSrc.layuiSrcStrings.right
import typings.layuiSrc.layuiSrcStrings.space
import typings.layuiSrc.layuiSrcStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumnOption extends js.Object {
  var LAY_CHECKED: js.UndefOr[Boolean] = js.native
  var align: js.UndefOr[left | center | right] = js.native
  var checkbox: js.UndefOr[Boolean] = js.native
  var colspan: js.UndefOr[Double] = js.native
  var edit: js.UndefOr[text | String] = js.native
  var event: js.UndefOr[String] = js.native
  var field: js.UndefOr[String] = js.native
  var fixed: js.UndefOr[left | right] = js.native
  var hide: js.UndefOr[Boolean] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var rowspan: js.UndefOr[Double] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[String] = js.native
  var templet: js.UndefOr[String | (js.Function1[/* d */ js.Any, String])] = js.native
  var title: js.UndefOr[String] = js.native
  var toolbar: js.UndefOr[String] = js.native
  var totalRow: js.UndefOr[Boolean | Experience] = js.native
  var totalRowText: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[normal | checkbox | radio | space | numbers] = js.native
  var unresize: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object TableColumnOption {
  @scala.inline
  def apply(): TableColumnOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnOption]
  }
  @scala.inline
  implicit class TableColumnOptionOps[Self <: TableColumnOption] (val x: Self) extends AnyVal {
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
    def setLAY_CHECKED(value: Boolean): Self = this.set("LAY_CHECKED", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLAY_CHECKED: Self = this.set("LAY_CHECKED", js.undefined)
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setCheckbox(value: Boolean): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckbox: Self = this.set("checkbox", js.undefined)
    @scala.inline
    def setColspan(value: Double): Self = this.set("colspan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColspan: Self = this.set("colspan", js.undefined)
    @scala.inline
    def setEdit(value: text | String): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFixed(value: left | right): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setRowspan(value: Double): Self = this.set("rowspan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowspan: Self = this.set("rowspan", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTempletFunction1(value: /* d */ js.Any => String): Self = this.set("templet", js.Any.fromFunction1(value))
    @scala.inline
    def setTemplet(value: String | (js.Function1[/* d */ js.Any, String])): Self = this.set("templet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplet: Self = this.set("templet", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToolbar(value: String): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setTotalRow(value: Boolean | Experience): Self = this.set("totalRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRow: Self = this.set("totalRow", js.undefined)
    @scala.inline
    def setTotalRowText(value: String): Self = this.set("totalRowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRowText: Self = this.set("totalRowText", js.undefined)
    @scala.inline
    def setType(value: normal | checkbox | radio | space | numbers): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnresize(value: Boolean): Self = this.set("unresize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnresize: Self = this.set("unresize", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

