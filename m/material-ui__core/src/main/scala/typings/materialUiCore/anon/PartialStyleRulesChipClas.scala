package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Chip.ChipClassKey>> */
@js.native
trait PartialStyleRulesChipClas extends js.Object {
  var avatar: js.UndefOr[CSSProperties] = js.native
  var avatarChildren: js.UndefOr[CSSProperties] = js.native
  var avatarPrimary: js.UndefOr[CSSProperties] = js.native
  var avatarSecondary: js.UndefOr[CSSProperties] = js.native
  var clickable: js.UndefOr[CSSProperties] = js.native
  var clickablePrimary: js.UndefOr[CSSProperties] = js.native
  var clickableSecondary: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var deletable: js.UndefOr[CSSProperties] = js.native
  var deletablePrimary: js.UndefOr[CSSProperties] = js.native
  var deletableSecondary: js.UndefOr[CSSProperties] = js.native
  var deleteIcon: js.UndefOr[CSSProperties] = js.native
  var deleteIconOutlinedColorPrimary: js.UndefOr[CSSProperties] = js.native
  var deleteIconOutlinedColorSecondary: js.UndefOr[CSSProperties] = js.native
  var deleteIconPrimary: js.UndefOr[CSSProperties] = js.native
  var deleteIconSecondary: js.UndefOr[CSSProperties] = js.native
  var label: js.UndefOr[CSSProperties] = js.native
  var outlined: js.UndefOr[CSSProperties] = js.native
  var outlinedPrimary: js.UndefOr[CSSProperties] = js.native
  var outlinedSecondary: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesChipClas {
  @scala.inline
  def apply(): PartialStyleRulesChipClas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesChipClas]
  }
  @scala.inline
  implicit class PartialStyleRulesChipClasOps[Self <: PartialStyleRulesChipClas] (val x: Self) extends AnyVal {
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
    def setAvatar(value: CSSProperties): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setAvatarChildren(value: CSSProperties): Self = this.set("avatarChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarChildren: Self = this.set("avatarChildren", js.undefined)
    @scala.inline
    def setAvatarPrimary(value: CSSProperties): Self = this.set("avatarPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarPrimary: Self = this.set("avatarPrimary", js.undefined)
    @scala.inline
    def setAvatarSecondary(value: CSSProperties): Self = this.set("avatarSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarSecondary: Self = this.set("avatarSecondary", js.undefined)
    @scala.inline
    def setClickable(value: CSSProperties): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setClickablePrimary(value: CSSProperties): Self = this.set("clickablePrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickablePrimary: Self = this.set("clickablePrimary", js.undefined)
    @scala.inline
    def setClickableSecondary(value: CSSProperties): Self = this.set("clickableSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickableSecondary: Self = this.set("clickableSecondary", js.undefined)
    @scala.inline
    def setColorPrimary(value: CSSProperties): Self = this.set("colorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPrimary: Self = this.set("colorPrimary", js.undefined)
    @scala.inline
    def setColorSecondary(value: CSSProperties): Self = this.set("colorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSecondary: Self = this.set("colorSecondary", js.undefined)
    @scala.inline
    def setDeletable(value: CSSProperties): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
    @scala.inline
    def setDeletablePrimary(value: CSSProperties): Self = this.set("deletablePrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletablePrimary: Self = this.set("deletablePrimary", js.undefined)
    @scala.inline
    def setDeletableSecondary(value: CSSProperties): Self = this.set("deletableSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletableSecondary: Self = this.set("deletableSecondary", js.undefined)
    @scala.inline
    def setDeleteIcon(value: CSSProperties): Self = this.set("deleteIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIcon: Self = this.set("deleteIcon", js.undefined)
    @scala.inline
    def setDeleteIconOutlinedColorPrimary(value: CSSProperties): Self = this.set("deleteIconOutlinedColorPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconOutlinedColorPrimary: Self = this.set("deleteIconOutlinedColorPrimary", js.undefined)
    @scala.inline
    def setDeleteIconOutlinedColorSecondary(value: CSSProperties): Self = this.set("deleteIconOutlinedColorSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconOutlinedColorSecondary: Self = this.set("deleteIconOutlinedColorSecondary", js.undefined)
    @scala.inline
    def setDeleteIconPrimary(value: CSSProperties): Self = this.set("deleteIconPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconPrimary: Self = this.set("deleteIconPrimary", js.undefined)
    @scala.inline
    def setDeleteIconSecondary(value: CSSProperties): Self = this.set("deleteIconSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteIconSecondary: Self = this.set("deleteIconSecondary", js.undefined)
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOutlined(value: CSSProperties): Self = this.set("outlined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    @scala.inline
    def setOutlinedPrimary(value: CSSProperties): Self = this.set("outlinedPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinedPrimary: Self = this.set("outlinedPrimary", js.undefined)
    @scala.inline
    def setOutlinedSecondary(value: CSSProperties): Self = this.set("outlinedSecondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlinedSecondary: Self = this.set("outlinedSecondary", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

