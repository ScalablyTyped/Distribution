package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey>> */
@js.native
trait PartialClassNameMapMenuIt extends js.Object {
  var gutters: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
}

object PartialClassNameMapMenuIt {
  @scala.inline
  def apply(): PartialClassNameMapMenuIt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMenuIt]
  }
  @scala.inline
  implicit class PartialClassNameMapMenuItOps[Self <: PartialClassNameMapMenuIt] (val x: Self) extends AnyVal {
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
    def setGutters(value: String): Self = this.set("gutters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

