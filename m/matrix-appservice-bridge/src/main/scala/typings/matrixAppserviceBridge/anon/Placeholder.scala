package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder extends StObject {
  
  var placeholder: String
  
  var regexp: String
}
object Placeholder {
  
  inline def apply(placeholder: String, regexp: String): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  extension [Self <: Placeholder](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
