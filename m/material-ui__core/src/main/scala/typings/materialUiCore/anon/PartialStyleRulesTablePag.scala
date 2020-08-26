package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TablePagination.TablePaginationClassKey>> */
@js.native
trait PartialStyleRulesTablePag extends js.Object {
  var actions: js.UndefOr[CSSProperties] = js.native
  var caption: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var menuItem: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var select: js.UndefOr[CSSProperties] = js.native
  var selectIcon: js.UndefOr[CSSProperties] = js.native
  var selectRoot: js.UndefOr[CSSProperties] = js.native
  var spacer: js.UndefOr[CSSProperties] = js.native
  var toolbar: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTablePag {
  @scala.inline
  def apply(): PartialStyleRulesTablePag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTablePag]
  }
  @scala.inline
  implicit class PartialStyleRulesTablePagOps[Self <: PartialStyleRulesTablePag] (val x: Self) extends AnyVal {
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
    def setActions(value: CSSProperties): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCaption(value: CSSProperties): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setMenuItem(value: CSSProperties): Self = this.set("menuItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItem: Self = this.set("menuItem", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSelect(value: CSSProperties): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSelectIcon(value: CSSProperties): Self = this.set("selectIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectIcon: Self = this.set("selectIcon", js.undefined)
    @scala.inline
    def setSelectRoot(value: CSSProperties): Self = this.set("selectRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectRoot: Self = this.set("selectRoot", js.undefined)
    @scala.inline
    def setSpacer(value: CSSProperties): Self = this.set("spacer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacer: Self = this.set("spacer", js.undefined)
    @scala.inline
    def setToolbar(value: CSSProperties): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
  
}

