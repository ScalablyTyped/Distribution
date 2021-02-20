package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageMessageTemplate extends StObject {
  
  var rendered: String = js.native
  
  var source: String = js.native
}
object LanguageMessageTemplate {
  
  @scala.inline
  def apply(rendered: String, source: String): LanguageMessageTemplate = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageMessageTemplate]
  }
  
  @scala.inline
  implicit class LanguageMessageTemplateMutableBuilder[Self <: LanguageMessageTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
