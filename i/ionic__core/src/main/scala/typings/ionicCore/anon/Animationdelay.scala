package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animationdelay extends StObject {
  
  var `animation-delay`: String
  
  var left: String
  
  var top: String
}
object Animationdelay {
  
  inline def apply(`animation-delay`: String, left: String, top: String): Animationdelay = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animationdelay]
  }
  
  extension [Self <: Animationdelay](x: Self) {
    
    inline def `setAnimation-delay`(value: String): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
