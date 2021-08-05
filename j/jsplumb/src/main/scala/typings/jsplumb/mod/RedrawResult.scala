package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedrawResult extends StObject {
  
  var c: js.Array[Connection]
  
  var e: js.Array[Endpoint]
}
object RedrawResult {
  
  inline def apply(c: js.Array[Connection], e: js.Array[Endpoint]): RedrawResult = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedrawResult]
  }
  
  extension [Self <: RedrawResult](x: Self) {
    
    inline def setC(value: js.Array[Connection]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: Connection*): Self = StObject.set(x, "c", js.Array(value :_*))
    
    inline def setE(value: js.Array[Endpoint]): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEVarargs(value: Endpoint*): Self = StObject.set(x, "e", js.Array(value :_*))
  }
}
