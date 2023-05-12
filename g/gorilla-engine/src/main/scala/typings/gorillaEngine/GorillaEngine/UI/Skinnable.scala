package typings.gorillaEngine.GorillaEngine.UI

import typings.gorillaEngine.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Skinnable extends StObject {
  
  var animation: LottieAnimation
  
  var filmstrip: Direction
}
object Skinnable {
  
  inline def apply(animation: LottieAnimation, filmstrip: Direction): Skinnable = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], filmstrip = filmstrip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Skinnable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Skinnable] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: LottieAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFilmstrip(value: Direction): Self = StObject.set(x, "filmstrip", value.asInstanceOf[js.Any])
  }
}
