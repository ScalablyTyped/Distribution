package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentOptions extends js.Object {
  var date: js.UndefOr[String] = js.native
  var flag: js.UndefOr[CommentOptionsFlag] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var richText: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
}

object CommentOptions {
  @scala.inline
  def apply(): CommentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentOptions]
  }
  @scala.inline
  implicit class CommentOptionsOps[Self <: CommentOptions] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFlag(value: CommentOptionsFlag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setRichText(value: Boolean): Self = this.set("richText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRichText: Self = this.set("richText", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

