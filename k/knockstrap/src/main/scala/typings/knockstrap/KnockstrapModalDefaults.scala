package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapModalDefaults extends StObject {
  
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
  
  @scala.inline
  implicit class KnockstrapModalDefaultsMutableBuilder[Self <: KnockstrapModalDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: KnockstrapModalDefaultsAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyTemplate(value: KnockstrapDefaultsTemplateBase): Self = StObject.set(x, "bodyTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterTemplate(value: KnockstrapModalDefaultsFooterTemplate): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderTemplate(value: KnockstrapDefaultsTemplateBase): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
  }
}
