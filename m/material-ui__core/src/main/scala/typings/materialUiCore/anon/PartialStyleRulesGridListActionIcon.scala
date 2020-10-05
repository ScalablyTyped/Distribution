package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/GridListTileBar.GridListTileBarClassKey>> */
@js.native
trait PartialStyleRulesGridListActionIcon extends js.Object {
  var actionIcon: js.UndefOr[CSSProperties] = js.native
  var actionIconActionPosLeft: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var rootSubtitle: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[CSSProperties] = js.native
  var titlePositionBottom: js.UndefOr[CSSProperties] = js.native
  var titlePositionTop: js.UndefOr[CSSProperties] = js.native
  var titleWrap: js.UndefOr[CSSProperties] = js.native
  var titleWrapActionPosLeft: js.UndefOr[CSSProperties] = js.native
  var titleWrapActionPosRight: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesGridListActionIcon {
  @scala.inline
  def apply(): PartialStyleRulesGridListActionIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesGridListActionIcon]
  }
  @scala.inline
  implicit class PartialStyleRulesGridListActionIconOps[Self <: PartialStyleRulesGridListActionIcon] (val x: Self) extends AnyVal {
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
    def setActionIcon(value: CSSProperties): Self = this.set("actionIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionIcon: Self = this.set("actionIcon", js.undefined)
    @scala.inline
    def setActionIconActionPosLeft(value: CSSProperties): Self = this.set("actionIconActionPosLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionIconActionPosLeft: Self = this.set("actionIconActionPosLeft", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootSubtitle(value: CSSProperties): Self = this.set("rootSubtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootSubtitle: Self = this.set("rootSubtitle", js.undefined)
    @scala.inline
    def setSubtitle(value: CSSProperties): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: CSSProperties): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitlePositionBottom(value: CSSProperties): Self = this.set("titlePositionBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePositionBottom: Self = this.set("titlePositionBottom", js.undefined)
    @scala.inline
    def setTitlePositionTop(value: CSSProperties): Self = this.set("titlePositionTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitlePositionTop: Self = this.set("titlePositionTop", js.undefined)
    @scala.inline
    def setTitleWrap(value: CSSProperties): Self = this.set("titleWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleWrap: Self = this.set("titleWrap", js.undefined)
    @scala.inline
    def setTitleWrapActionPosLeft(value: CSSProperties): Self = this.set("titleWrapActionPosLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleWrapActionPosLeft: Self = this.set("titleWrapActionPosLeft", js.undefined)
    @scala.inline
    def setTitleWrapActionPosRight(value: CSSProperties): Self = this.set("titleWrapActionPosRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleWrapActionPosRight: Self = this.set("titleWrapActionPosRight", js.undefined)
  }
  
}

