package typings.jointjs.mod.mvc

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewOptions[T /* <: Model[_, ModelSetOptions] */]
  extends typings.backbone.mod.ViewOptions[T] {
  var theme: js.UndefOr[String] = js.native
}

object ViewOptions {
  @scala.inline
  def apply[/* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ T](): ViewOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions[T]]
  }
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions[_], /* <: typings.backbone.mod.Model[_, typings.backbone.mod.ModelSetOptions] */ T] (val x: Self with ViewOptions[T]) extends AnyVal {
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
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

