package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxElevation extends StObject {
  
  var maxElevation: Double | Null
  
  var minElevation: Double | Null
}
object MaxElevation {
  
  inline def apply(): MaxElevation = {
    val __obj = js.Dynamic.literal(maxElevation = null, minElevation = null)
    __obj.asInstanceOf[MaxElevation]
  }
  
  extension [Self <: MaxElevation](x: Self) {
    
    inline def setMaxElevation(value: Double): Self = StObject.set(x, "maxElevation", value.asInstanceOf[js.Any])
    
    inline def setMaxElevationNull: Self = StObject.set(x, "maxElevation", null)
    
    inline def setMinElevation(value: Double): Self = StObject.set(x, "minElevation", value.asInstanceOf[js.Any])
    
    inline def setMinElevationNull: Self = StObject.set(x, "minElevation", null)
  }
}
