package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/TableSortLabel.TableSortLabelClassKey>> */
@js.native
trait PartialStyleRulesTableSor extends js.Object {
  var active: js.UndefOr[CSSProperties] = js.native
  var icon: js.UndefOr[CSSProperties] = js.native
  var iconDirectionAsc: js.UndefOr[CSSProperties] = js.native
  var iconDirectionDesc: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTableSor {
  @scala.inline
  def apply(): PartialStyleRulesTableSor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTableSor]
  }
  @scala.inline
  implicit class PartialStyleRulesTableSorOps[Self <: PartialStyleRulesTableSor] (val x: Self) extends AnyVal {
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
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setIcon(value: CSSProperties): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconDirectionAsc(value: CSSProperties): Self = this.set("iconDirectionAsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconDirectionAsc: Self = this.set("iconDirectionAsc", js.undefined)
    @scala.inline
    def setIconDirectionDesc(value: CSSProperties): Self = this.set("iconDirectionDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconDirectionDesc: Self = this.set("iconDirectionDesc", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

