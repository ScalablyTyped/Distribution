package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapCarouselDefaultsControlsTemplate
  extends StObject
     with KnockstrapDefaultsTemplateBase {
  
  def dataConverter(value: Any): KnockstrapCarouselDefaultsIdDataConverted
}
object KnockstrapCarouselDefaultsControlsTemplate {
  
  inline def apply(
    dataConverter: Any => KnockstrapCarouselDefaultsIdDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
  
  extension [Self <: KnockstrapCarouselDefaultsControlsTemplate](x: Self) {
    
    inline def setDataConverter(value: Any => KnockstrapCarouselDefaultsIdDataConverted): Self = StObject.set(x, "dataConverter", js.Any.fromFunction1(value))
  }
}
