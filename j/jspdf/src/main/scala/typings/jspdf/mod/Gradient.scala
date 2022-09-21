package typings.jspdf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gradient extends StObject {
  
  def addColorStop(position: Double, color: String): Unit
  
  def getColor(): String
}
object Gradient {
  
  inline def apply(addColorStop: (Double, String) => Unit, getColor: () => String): Gradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop), getColor = js.Any.fromFunction0(getColor))
    __obj.asInstanceOf[Gradient]
  }
  
  extension [Self <: Gradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    
    inline def setGetColor(value: () => String): Self = StObject.set(x, "getColor", js.Any.fromFunction0(value))
  }
}
