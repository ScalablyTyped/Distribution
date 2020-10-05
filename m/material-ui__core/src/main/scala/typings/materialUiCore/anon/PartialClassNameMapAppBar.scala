package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/AppBar/AppBar.AppBarClassKey>> */
@js.native
trait PartialClassNameMapAppBar extends js.Object {
  var colorDefault: js.UndefOr[String] = js.native
  var colorPrimary: js.UndefOr[String] = js.native
  var colorSecondary: js.UndefOr[String] = js.native
  var positionAbsolute: js.UndefOr[String] = js.native
  var positionFixed: js.UndefOr[String] = js.native
  var positionRelative: js.UndefOr[String] = js.native
  var positionStatic: js.UndefOr[String] = js.native
  var positionSticky: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapAppBar {
  @scala.inline
  def apply(): PartialClassNameMapAppBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAppBar]
  }
  @scala.inline
  implicit class PartialClassNameMapAppBarOps[Self <: PartialClassNameMapAppBar] (val x: Self) extends AnyVal {
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
    def setColorDefault(value: String): Self = this.set("colorDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorDefault: Self = this.set("colorDefault", js.undefined)
    @scala.inline
    def setColorPrimary(value: String): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: String): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setPositionAbsolute(value: String): Self = this.set("positionAbsolute", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionAbsolute: Self = this.set("positionAbsolute", js.undefined)
    @scala.inline
    def setPositionFixed(value: String): Self = this.set("positionFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionFixed: Self = this.set("positionFixed", js.undefined)
    @scala.inline
    def setPositionRelative(value: String): Self = this.set("positionRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionRelative: Self = this.set("positionRelative", js.undefined)
    @scala.inline
    def setPositionStatic(value: String): Self = this.set("positionStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionStatic: Self = this.set("positionStatic", js.undefined)
    @scala.inline
    def setPositionSticky(value: String): Self = this.set("positionSticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionSticky: Self = this.set("positionSticky", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

