package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfragisticsMode extends StObject {
  
  def isActive(): Unit
}
object InfragisticsMode {
  
  inline def apply(isActive: () => Unit): InfragisticsMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[InfragisticsMode]
  }
  
  extension [Self <: InfragisticsMode](x: Self) {
    
    inline def setIsActive(value: () => Unit): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
  }
}
