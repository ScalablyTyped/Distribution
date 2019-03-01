package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsIndicatorsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted
}

object KnockstrapCarouselDefaultsIndicatorsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Function1[js.Any, KnockstrapCarouselDefaultsIdItemsDataConverted],
    name: java.lang.String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataConverter")(dataConverter)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("templateEngine")(templateEngine)
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
}

