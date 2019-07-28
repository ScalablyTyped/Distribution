package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsControlsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdDataConverted
}

object KnockstrapCarouselDefaultsControlsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name, templateEngine = templateEngine)
  
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
}

