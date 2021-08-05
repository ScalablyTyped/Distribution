package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  def drawFunc(): js.Any
}
object CustomConfig {
  
  inline def apply(drawFunc: () => js.Any): CustomConfig = {
    val __obj = js.Dynamic.literal(drawFunc = js.Any.fromFunction0(drawFunc))
    __obj.asInstanceOf[CustomConfig]
  }
  
  extension [Self <: CustomConfig](x: Self) {
    
    inline def setDrawFunc(value: () => js.Any): Self = StObject.set(x, "drawFunc", js.Any.fromFunction0(value))
  }
}
