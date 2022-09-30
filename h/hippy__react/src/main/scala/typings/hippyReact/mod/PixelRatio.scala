package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelRatio extends StObject {
  
  def get(): Double
}
object PixelRatio {
  
  @JSImport("@hippy/react", "PixelRatio")
  @js.native
  val ^ : PixelRatio = js.native
  
  extension [Self <: PixelRatio](x: Self) {
    
    inline def setGet(value: () => Double): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
  }
}
