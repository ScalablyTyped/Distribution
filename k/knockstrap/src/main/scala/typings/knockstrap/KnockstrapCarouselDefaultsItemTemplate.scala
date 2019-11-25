package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsItemTemplate extends KnockstrapDefaultsTemplateBase {
  def converter(value: js.Any): js.Any
}

object KnockstrapCarouselDefaultsItemTemplate {
  @scala.inline
  def apply(converter: js.Any => js.Any, name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapCarouselDefaultsItemTemplate = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockstrapCarouselDefaultsItemTemplate]
  }
}

