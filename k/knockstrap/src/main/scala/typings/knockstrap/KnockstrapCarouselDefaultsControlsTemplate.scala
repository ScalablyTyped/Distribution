package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapCarouselDefaultsControlsTemplate extends KnockstrapDefaultsTemplateBase {
  
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdDataConverted = js.native
}
object KnockstrapCarouselDefaultsControlsTemplate {
  
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
  
  @scala.inline
  implicit class KnockstrapCarouselDefaultsControlsTemplateMutableBuilder[Self <: KnockstrapCarouselDefaultsControlsTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataConverter(value: js.Any => KnockstrapCarouselDefaultsIdDataConverted): Self = StObject.set(x, "dataConverter", js.Any.fromFunction1(value))
  }
}
