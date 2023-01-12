package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapCarouselDefaults extends StObject {
  
  var controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate
  
  var css: String
  
  var indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate
  
  var itemTemplate: KnockstrapCarouselDefaultsItemTemplate
}
object KnockstrapCarouselDefaults {
  
  inline def apply(
    controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate,
    css: String,
    indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate,
    itemTemplate: KnockstrapCarouselDefaultsItemTemplate
  ): KnockstrapCarouselDefaults = {
    val __obj = js.Dynamic.literal(controlsTemplate = controlsTemplate.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], indicatorsTemplate = indicatorsTemplate.asInstanceOf[js.Any], itemTemplate = itemTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockstrapCarouselDefaults] (val x: Self) extends AnyVal {
    
    inline def setControlsTemplate(value: KnockstrapCarouselDefaultsControlsTemplate): Self = StObject.set(x, "controlsTemplate", value.asInstanceOf[js.Any])
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setIndicatorsTemplate(value: KnockstrapCarouselDefaultsIndicatorsTemplate): Self = StObject.set(x, "indicatorsTemplate", value.asInstanceOf[js.Any])
    
    inline def setItemTemplate(value: KnockstrapCarouselDefaultsItemTemplate): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
  }
}
