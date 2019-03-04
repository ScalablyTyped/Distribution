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
    val __obj = js.Dynamic.literal(attributes = attributes, bodyTemplate = bodyTemplate, css = css, footerTemplate = footerTemplate, headerTemplate = headerTemplate)
  
    __obj.asInstanceOf[KnockstrapModalDefaults]
  }
}

