package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Divider.DividerClassKey>> */
@js.native
trait PartialStyleRulesDividerC extends js.Object {
  var absolute: js.UndefOr[CSSProperties] = js.native
  var inset: js.UndefOr[CSSProperties] = js.native
  var light: js.UndefOr[CSSProperties] = js.native
  var middle: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDividerC {
  @scala.inline
  def apply(): PartialStyleRulesDividerC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDividerC]
  }
  @scala.inline
  implicit class PartialStyleRulesDividerCOps[Self <: PartialStyleRulesDividerC] (val x: Self) extends AnyVal {
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
    def setAbsolute(value: CSSProperties): Self = this.set("absolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    @scala.inline
    def setInset(value: CSSProperties): Self = this.set("inset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    @scala.inline
    def setLight(value: CSSProperties): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setMiddle(value: CSSProperties): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

