package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapCarouselDefaultsControlsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdDataConverted
}

object KnockstrapCarouselDefaultsControlsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Function1[js.Any, KnockstrapCarouselDefaultsIdDataConverted],
    name: java.lang.String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataConverter")(dataConverter)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("templateEngine")(templateEngine)
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
}

