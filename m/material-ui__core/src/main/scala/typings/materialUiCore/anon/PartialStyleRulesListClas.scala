package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/List.ListClassKey>> */
@js.native
trait PartialStyleRulesListClas extends js.Object {
  var dense: js.UndefOr[CSSProperties] = js.native
  var padding: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var subheader: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesListClas {
  @scala.inline
  def apply(): PartialStyleRulesListClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesListClas]
  }
  @scala.inline
  implicit class PartialStyleRulesListClasOps[Self <: PartialStyleRulesListClas] (val x: Self) extends AnyVal {
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
    def setDense(value: CSSProperties): Self = this.set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    @scala.inline
    def setPadding(value: CSSProperties): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSubheader(value: CSSProperties): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
  }
  
}

