package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuList/MenuList.MenuListClassKey>> */
@js.native
trait PartialClassNameMapMenuLi extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var padding: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var subheader: js.UndefOr[String] = js.native
}

object PartialClassNameMapMenuLi {
  @scala.inline
  def apply(): PartialClassNameMapMenuLi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapMenuLi]
  }
  @scala.inline
  implicit class PartialClassNameMapMenuLiOps[Self <: PartialClassNameMapMenuLi] (val x: Self) extends AnyVal {
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
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSubheader(value: String): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
  }
  
}

