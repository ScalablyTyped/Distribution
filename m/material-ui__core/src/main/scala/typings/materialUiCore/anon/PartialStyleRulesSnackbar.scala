package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Snackbar.SnackbarClassKey>> */
@js.native
trait PartialStyleRulesSnackbar extends js.Object {
  var anchorOriginBottomCenter: js.UndefOr[CSSProperties] = js.native
  var anchorOriginBottomLeft: js.UndefOr[CSSProperties] = js.native
  var anchorOriginBottomRight: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopCenter: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopLeft: js.UndefOr[CSSProperties] = js.native
  var anchorOriginTopRight: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesSnackbar {
  @scala.inline
  def apply(): PartialStyleRulesSnackbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesSnackbar]
  }
  @scala.inline
  implicit class PartialStyleRulesSnackbarOps[Self <: PartialStyleRulesSnackbar] (val x: Self) extends AnyVal {
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
    def setAnchorOriginBottomCenter(value: CSSProperties): Self = this.set("anchorOriginBottomCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginBottomCenter: Self = this.set("anchorOriginBottomCenter", js.undefined)
    @scala.inline
    def setAnchorOriginBottomLeft(value: CSSProperties): Self = this.set("anchorOriginBottomLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginBottomLeft: Self = this.set("anchorOriginBottomLeft", js.undefined)
    @scala.inline
    def setAnchorOriginBottomRight(value: CSSProperties): Self = this.set("anchorOriginBottomRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginBottomRight: Self = this.set("anchorOriginBottomRight", js.undefined)
    @scala.inline
    def setAnchorOriginTopCenter(value: CSSProperties): Self = this.set("anchorOriginTopCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginTopCenter: Self = this.set("anchorOriginTopCenter", js.undefined)
    @scala.inline
    def setAnchorOriginTopLeft(value: CSSProperties): Self = this.set("anchorOriginTopLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginTopLeft: Self = this.set("anchorOriginTopLeft", js.undefined)
    @scala.inline
    def setAnchorOriginTopRight(value: CSSProperties): Self = this.set("anchorOriginTopRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchorOriginTopRight: Self = this.set("anchorOriginTopRight", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

