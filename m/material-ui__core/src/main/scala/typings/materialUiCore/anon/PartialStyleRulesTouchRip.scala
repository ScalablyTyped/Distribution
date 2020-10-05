package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ButtonBase/TouchRipple.TouchRippleClassKey>> */
@js.native
trait PartialStyleRulesTouchRip extends js.Object {
  var child: js.UndefOr[CSSProperties] = js.native
  var childLeaving: js.UndefOr[CSSProperties] = js.native
  var childPulsate: js.UndefOr[CSSProperties] = js.native
  var ripple: js.UndefOr[CSSProperties] = js.native
  var ripplePulsate: js.UndefOr[CSSProperties] = js.native
  var rippleVisible: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTouchRip {
  @scala.inline
  def apply(): PartialStyleRulesTouchRip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesTouchRip]
  }
  @scala.inline
  implicit class PartialStyleRulesTouchRipOps[Self <: PartialStyleRulesTouchRip] (val x: Self) extends AnyVal {
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
    def setChild(value: CSSProperties): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setChildLeaving(value: CSSProperties): Self = this.set("childLeaving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildLeaving: Self = this.set("childLeaving", js.undefined)
    @scala.inline
    def setChildPulsate(value: CSSProperties): Self = this.set("childPulsate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildPulsate: Self = this.set("childPulsate", js.undefined)
    @scala.inline
    def setRipple(value: CSSProperties): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setRipplePulsate(value: CSSProperties): Self = this.set("ripplePulsate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipplePulsate: Self = this.set("ripplePulsate", js.undefined)
    @scala.inline
    def setRippleVisible(value: CSSProperties): Self = this.set("rippleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleVisible: Self = this.set("rippleVisible", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

