package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/BottomNavigation.BottomNavigationClassKey>> */
@js.native
trait PartialStyleRulesBottomNaRoot extends js.Object {
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesBottomNaRoot {
  @scala.inline
  def apply(): PartialStyleRulesBottomNaRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesBottomNaRoot]
  }
  @scala.inline
  implicit class PartialStyleRulesBottomNaRootOps[Self <: PartialStyleRulesBottomNaRoot] (val x: Self) extends AnyVal {
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
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

