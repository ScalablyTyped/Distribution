package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions[T] extends js.Object {
  var afterRender: js.UndefOr[js.Function2[/* elements */ js.Array[Node], /* dataItem */ T, Unit]] = js.native
  var templateEngine: js.UndefOr[typings.knockout.mod.templateEngine] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply[T](): TemplateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions[T]]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions[_], T] (val x: Self with TemplateOptions[T]) extends AnyVal {
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
    def setAfterRender(value: (/* elements */ js.Array[Node], /* dataItem */ T) => Unit): Self = this.set("afterRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    @scala.inline
    def setTemplateEngine(value: templateEngine): Self = this.set("templateEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateEngine: Self = this.set("templateEngine", js.undefined)
  }
  
}

