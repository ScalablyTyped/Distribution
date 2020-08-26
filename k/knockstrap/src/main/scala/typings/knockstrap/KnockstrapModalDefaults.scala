package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapModalDefaults extends js.Object {
  var attributes: KnockstrapModalDefaultsAttributes = js.native
  var bodyTemplate: KnockstrapDefaultsTemplateBase = js.native
  var css: String = js.native
  var footerTemplate: KnockstrapModalDefaultsFooterTemplate = js.native
  var headerTemplate: KnockstrapDefaultsTemplateBase = js.native
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
  @scala.inline
  implicit class KnockstrapModalDefaultsOps[Self <: KnockstrapModalDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: KnockstrapModalDefaultsAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyTemplate(value: KnockstrapDefaultsTemplateBase): Self = this.set("bodyTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooterTemplate(value: KnockstrapModalDefaultsFooterTemplate): Self = this.set("footerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderTemplate(value: KnockstrapDefaultsTemplateBase): Self = this.set("headerTemplate", value.asInstanceOf[js.Any])
  }
  
}

