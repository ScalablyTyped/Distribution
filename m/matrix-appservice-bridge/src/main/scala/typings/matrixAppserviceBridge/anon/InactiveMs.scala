package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InactiveMs extends StObject {
  
  var inactiveMs: Double
  
  var online: Boolean
}
object InactiveMs {
  
  inline def apply(inactiveMs: Double, online: Boolean): InactiveMs = {
    val __obj = js.Dynamic.literal(inactiveMs = inactiveMs.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[InactiveMs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InactiveMs] (val x: Self) extends AnyVal {
    
    inline def setInactiveMs(value: Double): Self = StObject.set(x, "inactiveMs", value.asInstanceOf[js.Any])
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
  }
}
