package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockstrapModalDefaults extends js.Object {
  var attributes: KnockstrapModalDefaultsAttributes
  var bodyTemplate: KnockstrapDefaultsTemplateBase
  var css: String
  var footerTemplate: KnockstrapModalDefaultsFooterTemplate
  var headerTemplate: KnockstrapDefaultsTemplateBase
}

object KnockstrapModalDefaults {
  @scala.inline
  def apply(
    attributes: KnockstrapModalDefaultsAttributes,
    bodyTemplate: KnockstrapDefaultsTemplateBase,
    css: String,
    footerTemplate: KnockstrapModalDefaultsFooterTemplate,
    headerTemplate: KnockstrapDefaultsTemplateBase
  ): KnockstrapModalDefaults = {
    val __obj = js.Dynamic.literal(attributes = attributes, bodyTemplate = bodyTemplate, css = css, footerTemplate = footerTemplate, headerTemplate = headerTemplate)
  
    __obj.asInstanceOf[KnockstrapModalDefaults]
  }
}

