package typings.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animationdelay extends StObject {
  
  var `animation-delay`: String = js.native
  
  var left: String = js.native
  
  var top: String = js.native
}
object Animationdelay {
  
  @scala.inline
  def apply(`animation-delay`: String, left: String, top: String): Animationdelay = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animationdelay]
  }
  
  @scala.inline
  implicit class AnimationdelayMutableBuilder[Self <: Animationdelay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setAnimation-delay`(value: String): Self = StObject.set(x, "animation-delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
