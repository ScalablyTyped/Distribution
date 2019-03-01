package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapModalDefaultsFooterTemplate extends KnockstrapDefaultsTemplateBase {
  var data: KnockstrapModalDefaultsFooterData
}

object KnockstrapModalDefaultsFooterTemplate {
  @scala.inline
  def apply(
    data: KnockstrapModalDefaultsFooterData,
    name: java.lang.String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapModalDefaultsFooterTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("templateEngine")(templateEngine)
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterTemplate]
  }
}

