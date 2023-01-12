package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarCoordinates extends StObject {
  
  var phi: Double
  
  var r: Double
}
object PolarCoordinates {
  
  inline def apply(phi: Double, r: Double): PolarCoordinates = {
    val __obj = js.Dynamic.literal(phi = phi.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolarCoordinates] (val x: Self) extends AnyVal {
    
    inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
