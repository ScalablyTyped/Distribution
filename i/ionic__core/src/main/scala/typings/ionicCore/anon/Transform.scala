package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var `animation-delay`: String
  
  var transform: String
}
object Transform {
  
  inline def apply(`animation-delay`: String, transform: String): Transform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def `setAnimation-delay`(value: String): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
