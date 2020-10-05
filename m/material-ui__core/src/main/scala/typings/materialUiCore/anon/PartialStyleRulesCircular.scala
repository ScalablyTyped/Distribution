package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/CircularProgress.CircularProgressClassKey>> */
@js.native
trait PartialStyleRulesCircular extends js.Object {
  var circle: js.UndefOr[CSSProperties] = js.native
  var circleDisableShrink: js.UndefOr[CSSProperties] = js.native
  var circleIndeterminate: js.UndefOr[CSSProperties] = js.native
  var circleStatic: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var indeterminate: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var static: js.UndefOr[CSSProperties] = js.native
  var svg: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesCircular {
  @scala.inline
  def apply(): PartialStyleRulesCircular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesCircular]
  }
  @scala.inline
  implicit class PartialStyleRulesCircularOps[Self <: PartialStyleRulesCircular] (val x: Self) extends AnyVal {
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
    def setCircle(value: CSSProperties): Self = this.set("circle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircle: Self = this.set("circle", js.undefined)
    @scala.inline
    def setCircleDisableShrink(value: CSSProperties): Self = this.set("circleDisableShrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleDisableShrink: Self = this.set("circleDisableShrink", js.undefined)
    @scala.inline
    def setCircleIndeterminate(value: CSSProperties): Self = this.set("circleIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleIndeterminate: Self = this.set("circleIndeterminate", js.undefined)
    @scala.inline
    def setCircleStatic(value: CSSProperties): Self = this.set("circleStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleStatic: Self = this.set("circleStatic", js.undefined)
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setIndeterminate(value: CSSProperties): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setStatic(value: CSSProperties): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setSvg(value: CSSProperties): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
  }
  
}

