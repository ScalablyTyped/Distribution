package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Toolbar/Toolbar.ToolbarClassKey>> */
@js.native
trait PartialClassNameMapToolba extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var gutters: js.UndefOr[String] = js.native
  var regular: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapToolba {
  @scala.inline
  def apply(): PartialClassNameMapToolba = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToolba]
  }
  @scala.inline
  implicit class PartialClassNameMapToolbaOps[Self <: PartialClassNameMapToolba] (val x: Self) extends AnyVal {
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
    def setDense(value: String): Self = this.set("dense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    @scala.inline
    def setGutters(value: String): Self = this.set("gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    @scala.inline
    def setRegular(value: String): Self = this.set("regular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegular: Self = this.set("regular", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

