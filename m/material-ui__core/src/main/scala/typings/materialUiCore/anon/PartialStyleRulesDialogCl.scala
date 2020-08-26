package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Dialog.DialogClassKey>> */
@js.native
trait PartialStyleRulesDialogCl extends js.Object {
  var container: js.UndefOr[CSSProperties] = js.native
  var paper: js.UndefOr[CSSProperties] = js.native
  var paperFullScreen: js.UndefOr[CSSProperties] = js.native
  var paperFullWidth: js.UndefOr[CSSProperties] = js.native
  var paperScrollBody: js.UndefOr[CSSProperties] = js.native
  var paperScrollPaper: js.UndefOr[CSSProperties] = js.native
  var paperWidthLg: js.UndefOr[CSSProperties] = js.native
  var paperWidthMd: js.UndefOr[CSSProperties] = js.native
  var paperWidthSm: js.UndefOr[CSSProperties] = js.native
  var paperWidthXl: js.UndefOr[CSSProperties] = js.native
  var paperWidthXs: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var scrollBody: js.UndefOr[CSSProperties] = js.native
  var scrollPaper: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesDialogCl {
  @scala.inline
  def apply(): PartialStyleRulesDialogCl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDialogCl]
  }
  @scala.inline
  implicit class PartialStyleRulesDialogClOps[Self <: PartialStyleRulesDialogCl] (val x: Self) extends AnyVal {
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
    def setContainer(value: CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setPaper(value: CSSProperties): Self = this.set("paper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
    @scala.inline
    def setPaperFullScreen(value: CSSProperties): Self = this.set("paperFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperFullScreen: Self = this.set("paperFullScreen", js.undefined)
    @scala.inline
    def setPaperFullWidth(value: CSSProperties): Self = this.set("paperFullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperFullWidth: Self = this.set("paperFullWidth", js.undefined)
    @scala.inline
    def setPaperScrollBody(value: CSSProperties): Self = this.set("paperScrollBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperScrollBody: Self = this.set("paperScrollBody", js.undefined)
    @scala.inline
    def setPaperScrollPaper(value: CSSProperties): Self = this.set("paperScrollPaper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperScrollPaper: Self = this.set("paperScrollPaper", js.undefined)
    @scala.inline
    def setPaperWidthLg(value: CSSProperties): Self = this.set("paperWidthLg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthLg: Self = this.set("paperWidthLg", js.undefined)
    @scala.inline
    def setPaperWidthMd(value: CSSProperties): Self = this.set("paperWidthMd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthMd: Self = this.set("paperWidthMd", js.undefined)
    @scala.inline
    def setPaperWidthSm(value: CSSProperties): Self = this.set("paperWidthSm", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthSm: Self = this.set("paperWidthSm", js.undefined)
    @scala.inline
    def setPaperWidthXl(value: CSSProperties): Self = this.set("paperWidthXl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthXl: Self = this.set("paperWidthXl", js.undefined)
    @scala.inline
    def setPaperWidthXs(value: CSSProperties): Self = this.set("paperWidthXs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthXs: Self = this.set("paperWidthXs", js.undefined)
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScrollBody(value: CSSProperties): Self = this.set("scrollBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBody: Self = this.set("scrollBody", js.undefined)
    @scala.inline
    def setScrollPaper(value: CSSProperties): Self = this.set("scrollPaper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPaper: Self = this.set("scrollPaper", js.undefined)
  }
  
}

