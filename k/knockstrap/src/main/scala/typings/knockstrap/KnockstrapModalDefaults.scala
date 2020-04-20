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
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bodyTemplate = bodyTemplate.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], footerTemplate = footerTemplate.asInstanceOf[js.Any], headerTemplate = headerTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapModalDefaults]
  }
}

