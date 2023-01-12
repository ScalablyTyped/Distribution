package typings.kahootJsUpdated.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L extends StObject {
  
  var l: Double
  
  var o: Double
  
  val tc: Double
}
object L {
  
  inline def apply(l: Double, o: Double, tc: Double): L = {
    val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], tc = tc.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: L] (val x: Self) extends AnyVal {
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setO(value: Double): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setTc(value: Double): Self = StObject.set(x, "tc", value.asInstanceOf[js.Any])
  }
}
