package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashPoint3D
  extends StObject
     with FlashPoint {
  
  var z: Double
}
object FlashPoint3D {
  
  inline def apply(x: Double, y: Double, z: Double): FlashPoint3D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashPoint3D]
  }
  
  extension [Self <: FlashPoint3D](x: Self) {
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
