package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotOptions extends js.Object {
  var flag: js.UndefOr[AnnotOptionsFlag] = js.native
  var height: js.UndefOr[Double] = js.native
  var icon: js.UndefOr[AnnotOptionsIcon] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var richText: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnnotOptions {
  @scala.inline
  def apply(): AnnotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotOptions]
  }
  @scala.inline
  implicit class AnnotOptionsOps[Self <: AnnotOptions] (val x: Self) extends AnyVal {
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
    def setFlag(value: AnnotOptionsFlag): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlag: Self = this.set("flag", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIcon(value: AnnotOptionsIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
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
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

