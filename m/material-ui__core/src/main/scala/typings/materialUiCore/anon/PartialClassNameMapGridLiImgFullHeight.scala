package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/GridListTile/GridListTile.GridListTileClassKey>> */
@js.native
trait PartialClassNameMapGridLiImgFullHeight extends js.Object {
  var imgFullHeight: js.UndefOr[String] = js.native
  var imgFullWidth: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var tile: js.UndefOr[String] = js.native
}

object PartialClassNameMapGridLiImgFullHeight {
  @scala.inline
  def apply(): PartialClassNameMapGridLiImgFullHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapGridLiImgFullHeight]
  }
  @scala.inline
  implicit class PartialClassNameMapGridLiImgFullHeightOps[Self <: PartialClassNameMapGridLiImgFullHeight] (val x: Self) extends AnyVal {
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
    def setImgFullHeight(value: String): Self = this.set("imgFullHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgFullHeight: Self = this.set("imgFullHeight", js.undefined)
    @scala.inline
    def setImgFullWidth(value: String): Self = this.set("imgFullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgFullWidth: Self = this.set("imgFullWidth", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setTile(value: String): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
  
}

