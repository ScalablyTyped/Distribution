package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfragisticsMode extends StObject {
  
  def isActive(): Unit
}
object InfragisticsMode {
  
  @scala.inline
  def apply(isActive: () => Unit): InfragisticsMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[InfragisticsMode]
  }
  
  @scala.inline
  implicit class InfragisticsModeMutableBuilder[Self <: InfragisticsMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsActive(value: () => Unit): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
  }
}
