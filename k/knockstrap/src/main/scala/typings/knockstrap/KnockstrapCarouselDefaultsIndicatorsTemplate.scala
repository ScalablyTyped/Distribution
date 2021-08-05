package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapCarouselDefaultsIndicatorsTemplate
  extends StObject
     with KnockstrapDefaultsTemplateBase {
  
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted
}
object KnockstrapCarouselDefaultsIndicatorsTemplate {
  
  inline def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
  
  extension [Self <: KnockstrapCarouselDefaultsIndicatorsTemplate](x: Self) {
    
    inline def setDataConverter(value: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted): Self = StObject.set(x, "dataConverter", js.Any.fromFunction1(value))
  }
}
