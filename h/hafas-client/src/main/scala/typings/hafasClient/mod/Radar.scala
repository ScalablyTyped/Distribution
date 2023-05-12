package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radar
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var movements: js.UndefOr[js.Array[Movement]] = js.undefined
}
object Radar {
  
  inline def apply(): Radar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Radar] (val x: Self) extends AnyVal {
    
    inline def setMovements(value: js.Array[Movement]): Self = StObject.set(x, "movements", value.asInstanceOf[js.Any])
    
    inline def setMovementsUndefined: Self = StObject.set(x, "movements", js.undefined)
    
    inline def setMovementsVarargs(value: Movement*): Self = StObject.set(x, "movements", js.Array(value*))
  }
}
