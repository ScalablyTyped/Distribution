package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationToFormatOptions
  extends StObject
     with typings.std.Intl.DateTimeFormatOptions {
  
  var floor: js.UndefOr[Boolean] = js.undefined
  
  var round: js.UndefOr[Boolean] = js.undefined
}
object DurationToFormatOptions {
  
  inline def apply(): DurationToFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationToFormatOptions]
  }
  
  extension [Self <: DurationToFormatOptions](x: Self) {
    
    inline def setFloor(value: Boolean): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
