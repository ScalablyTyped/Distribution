package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsIndicatorsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted
}

object KnockstrapCarouselDefaultsIndicatorsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name, templateEngine = templateEngine)
  
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
}

