package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Link/Link.LinkClassKey>> */
@js.native
trait PartialClassNameMapLinkCl extends js.Object {
  var button: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var underlineAlways: js.UndefOr[String] = js.native
  var underlineHover: js.UndefOr[String] = js.native
  var underlineNone: js.UndefOr[String] = js.native
}

object PartialClassNameMapLinkCl {
  @scala.inline
  def apply(): PartialClassNameMapLinkCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapLinkCl]
  }
  @scala.inline
  implicit class PartialClassNameMapLinkClOps[Self <: PartialClassNameMapLinkCl] (val x: Self) extends AnyVal {
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
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setUnderlineAlways(value: String): Self = this.set("underlineAlways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineAlways: Self = this.set("underlineAlways", js.undefined)
    @scala.inline
    def setUnderlineHover(value: String): Self = this.set("underlineHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineHover: Self = this.set("underlineHover", js.undefined)
    @scala.inline
    def setUnderlineNone(value: String): Self = this.set("underlineNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineNone: Self = this.set("underlineNone", js.undefined)
  }
  
}

