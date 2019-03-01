package typings
package knockstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapModalDefaults extends js.Object {
  var attributes: KnockstrapModalDefaultsAttributes
  var bodyTemplate: KnockstrapDefaultsTemplateBase
  var css: java.lang.String
  var footerTemplate: KnockstrapModalDefaultsFooterTemplate
  var headerTemplate: KnockstrapDefaultsTemplateBase
}

object KnockstrapModalDefaults {
  @scala.inline
  def apply(
    attributes: KnockstrapModalDefaultsAttributes,
    bodyTemplate: KnockstrapDefaultsTemplateBase,
    css: java.lang.String,
    footerTemplate: KnockstrapModalDefaultsFooterTemplate,
    headerTemplate: KnockstrapDefaultsTemplateBase
  ): KnockstrapModalDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("bodyTemplate")(bodyTemplate)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("footerTemplate")(footerTemplate)
    __obj.updateDynamic("headerTemplate")(headerTemplate)
    __obj.asInstanceOf[KnockstrapModalDefaults]
  }
}

