package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapCarouselDefaultsIndicatorsTemplate extends KnockstrapDefaultsTemplateBase {
  
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted = js.native
}
object KnockstrapCarouselDefaultsIndicatorsTemplate {
  
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
  
  @scala.inline
  implicit class KnockstrapCarouselDefaultsIndicatorsTemplateMutableBuilder[Self <: KnockstrapCarouselDefaultsIndicatorsTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataConverter(value: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted): Self = StObject.set(x, "dataConverter", js.Any.fromFunction1(value))
  }
}
