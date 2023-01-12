package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayidString extends StObject {
  
  var display_id: String
}
object DisplayidString {
  
  inline def apply(display_id: String): DisplayidString = {
    val __obj = js.Dynamic.literal(display_id = display_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayidString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayidString] (val x: Self) extends AnyVal {
    
    inline def setDisplay_id(value: String): Self = StObject.set(x, "display_id", value.asInstanceOf[js.Any])
  }
}
