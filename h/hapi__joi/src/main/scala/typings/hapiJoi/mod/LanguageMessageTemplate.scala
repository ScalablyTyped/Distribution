package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageMessageTemplate extends StObject {
  
  var rendered: String
  
  var source: String
}
object LanguageMessageTemplate {
  
  inline def apply(rendered: String, source: String): LanguageMessageTemplate = {
    val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageMessageTemplate]
  }
  
  extension [Self <: LanguageMessageTemplate](x: Self) {
    
    inline def setRendered(value: String): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
