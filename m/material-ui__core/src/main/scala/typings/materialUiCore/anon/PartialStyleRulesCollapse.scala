package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Collapse.CollapseClassKey>> */
@js.native
trait PartialStyleRulesCollapse extends js.Object {
  var container: js.UndefOr[CSSProperties] = js.native
  var entered: js.UndefOr[CSSProperties] = js.native
  var wrapper: js.UndefOr[CSSProperties] = js.native
  var wrapperInner: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCollapse {
  @scala.inline
  def apply(): PartialStyleRulesCollapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCollapse]
  }
  @scala.inline
  implicit class PartialStyleRulesCollapseOps[Self <: PartialStyleRulesCollapse] (val x: Self) extends AnyVal {
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
    def setContainer(value: CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setEntered(value: CSSProperties): Self = this.set("entered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntered: Self = this.set("entered", js.undefined)
    @scala.inline
    def setWrapper(value: CSSProperties): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
    @scala.inline
    def setWrapperInner(value: CSSProperties): Self = this.set("wrapperInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperInner: Self = this.set("wrapperInner", js.undefined)
  }
  
}

