package typings.hmscoreReactNativeHmsPush

import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.default
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.high
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.low
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.max
import typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityMod {
  
  trait Priority extends StObject {
    
    var default: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.default
    
    var high: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.high
    
    var low: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.low
    
    var max: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.max
    
    var min: typings.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.min
  }
  object Priority {
    
    inline def apply(): Priority = {
      val __obj = js.Dynamic.literal(default = "default", high = "high", low = "low", max = "max", min = "min")
      __obj.asInstanceOf[Priority]
    }
    
    extension [Self <: Priority](x: Self) {
      
      inline def setDefault(value: default): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: high): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: low): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setMax(value: max): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: min): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
