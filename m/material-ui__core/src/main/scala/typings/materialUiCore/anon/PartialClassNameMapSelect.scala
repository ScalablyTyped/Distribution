package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Select/Select.SelectClassKey>> */
@js.native
trait PartialClassNameMapSelect extends js.Object {
  var disabled: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var outlined: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var select: js.UndefOr[String] = js.native
  var selectMenu: js.UndefOr[String] = js.native
}

object PartialClassNameMapSelect {
  @scala.inline
  def apply(): PartialClassNameMapSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSelect]
  }
  @scala.inline
  implicit class PartialClassNameMapSelectOps[Self <: PartialClassNameMapSelect] (val x: Self) extends AnyVal {
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFilled(value: String): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOutlined(value: String): Self = this.set("outlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectMenu(value: String): Self = this.set("selectMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectMenu: Self = this.set("selectMenu", js.undefined)
  }
  
}

