package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapCarouselDefaultsItemTemplate extends KnockstrapDefaultsTemplateBase {
  def converter(value: js.Any): js.Any = js.native
}

object KnockstrapCarouselDefaultsItemTemplate {
  @scala.inline
  def apply(converter: js.Any => js.Any, name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapCarouselDefaultsItemTemplate = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsItemTemplate]
  }
  @scala.inline
  implicit class KnockstrapCarouselDefaultsItemTemplateOps[Self <: KnockstrapCarouselDefaultsItemTemplate] (val x: Self) extends AnyVal {
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
    def setConverter(value: js.Any => js.Any): Self = this.set("converter", js.Any.fromFunction1(value))
  }
  
}

