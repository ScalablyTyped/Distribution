package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConfig
  extends StObject
     with DrawOptionsConfig
     with ObjectOptionsConfig {
  
  def drawFunc(): Any
}
object CustomConfig {
  
  inline def apply(drawFunc: () => Any): CustomConfig = {
    val __obj = js.Dynamic.literal(drawFunc = js.Any.fromFunction0(drawFunc))
    __obj.asInstanceOf[CustomConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomConfig] (val x: Self) extends AnyVal {
    
    inline def setDrawFunc(value: () => Any): Self = StObject.set(x, "drawFunc", js.Any.fromFunction0(value))
  }
}
