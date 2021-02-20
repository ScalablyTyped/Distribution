package typings.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapCarouselDefaultsItemTemplate extends KnockstrapDefaultsTemplateBase {
  
  def converter(value: js.Any): js.Any = js.native
}
object KnockstrapCarouselDefaultsItemTemplate {
  
  @scala.inline
  def apply(converter: js.Any => js.Any, name: String, templateEngine: KnockstrapStringTemplateEngine): KnockstrapCarouselDefaultsItemTemplate = {
    val __obj = js.Dynamic.literal(converter = js.Any.fromFunction1(converter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsItemTemplate]
  }
  
  @scala.inline
  implicit class KnockstrapCarouselDefaultsItemTemplateMutableBuilder[Self <: KnockstrapCarouselDefaultsItemTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConverter(value: js.Any => js.Any): Self = StObject.set(x, "converter", js.Any.fromFunction1(value))
  }
}
