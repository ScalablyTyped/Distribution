package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveMode extends StObject {
  
  def isActive(): Unit
}
object ResponsiveMode {
  
  inline def apply(isActive: () => Unit): ResponsiveMode = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction0(isActive))
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsiveMode] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: () => Unit): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
  }
}
