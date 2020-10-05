package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Dialog/Dialog.DialogClassKey>> */
@js.native
trait PartialClassNameMapDialog extends js.Object {
  var container: js.UndefOr[String] = js.native
  var paper: js.UndefOr[String] = js.native
  var paperFullScreen: js.UndefOr[String] = js.native
  var paperFullWidth: js.UndefOr[String] = js.native
  var paperScrollBody: js.UndefOr[String] = js.native
  var paperScrollPaper: js.UndefOr[String] = js.native
  var paperWidthLg: js.UndefOr[String] = js.native
  var paperWidthMd: js.UndefOr[String] = js.native
  var paperWidthSm: js.UndefOr[String] = js.native
  var paperWidthXl: js.UndefOr[String] = js.native
  var paperWidthXs: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var scrollBody: js.UndefOr[String] = js.native
  var scrollPaper: js.UndefOr[String] = js.native
}

object PartialClassNameMapDialog {
  @scala.inline
  def apply(): PartialClassNameMapDialog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapDialog]
  }
  @scala.inline
  implicit class PartialClassNameMapDialogOps[Self <: PartialClassNameMapDialog] (val x: Self) extends AnyVal {
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
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setPaper(value: String): Self = this.set("paper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaper: Self = this.set("paper", js.undefined)
    @scala.inline
    def setPaperFullScreen(value: String): Self = this.set("paperFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperFullScreen: Self = this.set("paperFullScreen", js.undefined)
    @scala.inline
    def setPaperFullWidth(value: String): Self = this.set("paperFullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperFullWidth: Self = this.set("paperFullWidth", js.undefined)
    @scala.inline
    def setPaperScrollBody(value: String): Self = this.set("paperScrollBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperScrollBody: Self = this.set("paperScrollBody", js.undefined)
    @scala.inline
    def setPaperScrollPaper(value: String): Self = this.set("paperScrollPaper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperScrollPaper: Self = this.set("paperScrollPaper", js.undefined)
    @scala.inline
    def setPaperWidthLg(value: String): Self = this.set("paperWidthLg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthLg: Self = this.set("paperWidthLg", js.undefined)
    @scala.inline
    def setPaperWidthMd(value: String): Self = this.set("paperWidthMd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthMd: Self = this.set("paperWidthMd", js.undefined)
    @scala.inline
    def setPaperWidthSm(value: String): Self = this.set("paperWidthSm", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthSm: Self = this.set("paperWidthSm", js.undefined)
    @scala.inline
    def setPaperWidthXl(value: String): Self = this.set("paperWidthXl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthXl: Self = this.set("paperWidthXl", js.undefined)
    @scala.inline
    def setPaperWidthXs(value: String): Self = this.set("paperWidthXs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaperWidthXs: Self = this.set("paperWidthXs", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setScrollBody(value: String): Self = this.set("scrollBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollBody: Self = this.set("scrollBody", js.undefined)
    @scala.inline
    def setScrollPaper(value: String): Self = this.set("scrollPaper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPaper: Self = this.set("scrollPaper", js.undefined)
  }
  
}

