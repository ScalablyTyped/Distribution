package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProximityData extends StObject {
  
  var cm: Double
  
  var in: Double
}
object ProximityData {
  
  inline def apply(cm: Double, in: Double): ProximityData = {
    val __obj = js.Dynamic.literal(cm = cm.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityData]
  }
  
  extension [Self <: ProximityData](x: Self) {
    
    inline def setCm(value: Double): Self = StObject.set(x, "cm", value.asInstanceOf[js.Any])
    
    inline def setIn(value: Double): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
  }
}
