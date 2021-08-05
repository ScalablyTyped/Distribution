package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CA_ extends StObject {
  
  var cA: Boolean
  
  var pathLen: Double
}
object CA_ {
  
  inline def apply(cA: Boolean, pathLen: Double): CA_ = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any], pathLen = pathLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[CA_]
  }
  
  extension [Self <: CA_](x: Self) {
    
    inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setPathLen(value: Double): Self = StObject.set(x, "pathLen", value.asInstanceOf[js.Any])
  }
}
