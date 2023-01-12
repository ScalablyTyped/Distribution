package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockstrapCarouselDefaultsIndicatorsTemplate
  extends StObject
     with KnockstrapDefaultsTemplateBase {
  
  def dataConverter(value: Any): KnockstrapCarouselDefaultsIdItemsDataConverted
}
object KnockstrapCarouselDefaultsIndicatorsTemplate {
  
  inline def apply(
    dataConverter: Any => KnockstrapCarouselDefaultsIdItemsDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockstrapCarouselDefaultsIndicatorsTemplate] (val x: Self) extends AnyVal {
    
    inline def setDataConverter(value: Any => KnockstrapCarouselDefaultsIdItemsDataConverted): Self = StObject.set(x, "dataConverter", js.Any.fromFunction1(value))
  }
}
