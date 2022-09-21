package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapCarouselDefaultsItemTemplate
  extends StObject
     with KnockstrapDefaultsTemplateBase {
  
  def converter(value: Any): Any
}
object KnockstrapCarouselDefaultsItemTemplate {
  
  inline def apply(converter: Any => Any, name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapCarouselDefaultsItemTemplate = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsItemTemplate]
  }
  
  extension [Self <: KnockstrapCarouselDefaultsItemTemplate](x: Self) {
    
    inline def setConverter(value: Any => Any): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
  }
}
