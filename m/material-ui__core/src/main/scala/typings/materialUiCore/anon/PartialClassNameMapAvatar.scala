package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Avatar/Avatar.AvatarClassKey>> */
@js.native
trait PartialClassNameMapAvatar extends js.Object {
  var colorDefault: js.UndefOr[String] = js.native
  var img: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapAvatar {
  @scala.inline
  def apply(): PartialClassNameMapAvatar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapAvatar]
  }
  @scala.inline
  implicit class PartialClassNameMapAvatarOps[Self <: PartialClassNameMapAvatar] (val x: Self) extends AnyVal {
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
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

