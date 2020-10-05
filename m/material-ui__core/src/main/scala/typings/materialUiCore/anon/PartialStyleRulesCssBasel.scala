package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CssBaseline.CssBaselineClassKey>> */
@js.native
trait PartialStyleRulesCssBasel extends js.Object {
  var `@global`: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCssBasel {
  @scala.inline
  def apply(): PartialStyleRulesCssBasel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCssBasel]
  }
  @scala.inline
  implicit class PartialStyleRulesCssBaselOps[Self <: PartialStyleRulesCssBasel] (val x: Self) extends AnyVal {
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
    def `set@global`(value: CSSProperties): Self = this.set("@global", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete@global`: Self = this.set("@global", js.undefined)
  }
  
}

