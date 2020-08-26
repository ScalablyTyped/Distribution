package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/CardHeader/CardHeader.CardHeaderClassKey>> */
@js.native
trait PartialClassNameMapCardHe extends js.Object {
  var action: js.UndefOr[String] = js.native
  var avatar: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var subheader: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialClassNameMapCardHe {
  @scala.inline
  def apply(): PartialClassNameMapCardHe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapCardHe]
  }
  @scala.inline
  implicit class PartialClassNameMapCardHeOps[Self <: PartialClassNameMapCardHe] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSubheader(value: String): Self = this.set("subheader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubheader: Self = this.set("subheader", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

