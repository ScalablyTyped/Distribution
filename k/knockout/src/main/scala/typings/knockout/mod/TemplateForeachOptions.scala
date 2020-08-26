package typings.knockout.mod

import typings.knockout.mod.utils.MappingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateForeachOptions[T]
  extends TemplateOptions[js.Array[T]]
     with MappingOptions[T] {
  var as: js.UndefOr[String] = js.native
  var includeDestroyed: js.UndefOr[Boolean] = js.native
}

object TemplateForeachOptions {
  @scala.inline
  def apply[T](): TemplateForeachOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateForeachOptions[T]]
  }
  @scala.inline
  implicit class TemplateForeachOptionsOps[Self <: TemplateForeachOptions[_], T] (val x: Self with TemplateForeachOptions[T]) extends AnyVal {
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setIncludeDestroyed(value: Boolean): Self = this.set("includeDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDestroyed: Self = this.set("includeDestroyed", js.undefined)
  }
  
}

