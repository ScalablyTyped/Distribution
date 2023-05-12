package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data0 extends StObject {
  
  var data0: Any
  
  var data1: Any
  
  var status: Any
  
  var tickAbsolute: Any
}
object Data0 {
  
  inline def apply(data0: Any, data1: Any, status: Any, tickAbsolute: Any): Data0 = {
    val __obj = js.Dynamic.literal(data0 = data0.asInstanceOf[js.Any], data1 = data1.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tickAbsolute = tickAbsolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data0] (val x: Self) extends AnyVal {
    
    inline def setData0(value: Any): Self = StObject.set(x, "data0", value.asInstanceOf[js.Any])
    
    inline def setData1(value: Any): Self = StObject.set(x, "data1", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTickAbsolute(value: Any): Self = StObject.set(x, "tickAbsolute", value.asInstanceOf[js.Any])
  }
}
