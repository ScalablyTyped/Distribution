package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumCount extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var maximumCount: js.UndefOr[Double] = js.undefined
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
  
  var onEnd: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.Function2[/* totalCount */ Double, /* key */ String, Unit]] = js.undefined
  
  var online: js.UndefOr[Boolean] = js.undefined
}
object MaximumCount {
  
  inline def apply(): MaximumCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumCount]
  }
  
  extension [Self <: MaximumCount](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setMaximumCount(value: Double): Self = StObject.set(x, "maximumCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumCountUndefined: Self = StObject.set(x, "maximumCount", js.undefined)
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    inline def setOnEnd(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnStart(value: (/* totalCount */ Double, /* key */ String) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    inline def setOnlineUndefined: Self = StObject.set(x, "online", js.undefined)
  }
}
