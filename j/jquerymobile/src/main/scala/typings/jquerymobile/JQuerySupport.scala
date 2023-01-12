package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySupport extends StObject {
  
  var touchOverflow: Any
}
object JQuerySupport {
  
  inline def apply(touchOverflow: Any): JQuerySupport = {
    val __obj = js.Dynamic.literal(touchOverflow = touchOverflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuerySupport] (val x: Self) extends AnyVal {
    
    inline def setTouchOverflow(value: Any): Self = StObject.set(x, "touchOverflow", value.asInstanceOf[js.Any])
  }
}
