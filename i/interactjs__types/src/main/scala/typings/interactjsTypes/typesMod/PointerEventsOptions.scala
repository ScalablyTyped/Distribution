package typings.interactjsTypes.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerEventsOptions extends StObject {
  
  var allowFrom: js.UndefOr[String] = js.undefined
  
  var holdDuration: js.UndefOr[Double] = js.undefined
  
  var ignoreFrom: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[Rect | Point | String | Element | OriginFunction] = js.undefined
}
object PointerEventsOptions {
  
  inline def apply(): PointerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointerEventsOptions]
  }
  
  extension [Self <: PointerEventsOptions](x: Self) {
    
    inline def setAllowFrom(value: String): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
    
    inline def setHoldDuration(value: Double): Self = StObject.set(x, "holdDuration", value.asInstanceOf[js.Any])
    
    inline def setHoldDurationUndefined: Self = StObject.set(x, "holdDuration", js.undefined)
    
    inline def setIgnoreFrom(value: String): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
    
    inline def setOrigin(value: Rect | Point | String | Element | OriginFunction): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginFunction1(value: /* target */ Element => Rect): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
