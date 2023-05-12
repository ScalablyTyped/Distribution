package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  color :string,   thickness :number}> */
trait Partialcolorstringthickne extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
}
object Partialcolorstringthickne {
  
  inline def apply(): Partialcolorstringthickne = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcolorstringthickne]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialcolorstringthickne] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
