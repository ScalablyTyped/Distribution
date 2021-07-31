package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R extends StObject {
  
  var r: Double
  
  var style: Animationdelay
}
object R {
  
  @scala.inline
  def apply(r: Double, style: Animationdelay): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Animationdelay): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
