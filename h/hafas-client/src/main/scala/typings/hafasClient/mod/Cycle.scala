package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cycle extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var nr: js.UndefOr[Double] = js.undefined
}
object Cycle {
  
  inline def apply(): Cycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cycle] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNr(value: Double): Self = StObject.set(x, "nr", value.asInstanceOf[js.Any])
    
    inline def setNrUndefined: Self = StObject.set(x, "nr", js.undefined)
  }
}
