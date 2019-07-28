package typings.knockstrap

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
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapModalDefaultsFooterTemplate = {
    val __obj = js.Dynamic.literal(data = data, name = name, templateEngine = templateEngine)
  
    __obj.asInstanceOf[KnockstrapModalDefaultsFooterTemplate]
  }
}

