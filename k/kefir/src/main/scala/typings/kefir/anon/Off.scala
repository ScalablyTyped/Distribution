package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Off extends StObject {
  
  var off: js.Function
  
  var on: js.Function
}
object Off {
  
  inline def apply(off: js.Function, on: js.Function): Off = {
    val __obj = js.Dynamic.literal(off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[Off]
  }
  
  extension [Self <: Off](x: Self) {
    
    inline def setOff(value: js.Function): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setOn(value: js.Function): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
