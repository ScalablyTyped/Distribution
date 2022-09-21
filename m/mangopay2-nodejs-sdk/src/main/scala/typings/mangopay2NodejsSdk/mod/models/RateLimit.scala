package typings.mangopay2NodejsSdk.mod.models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateLimit extends StObject {
  
  var callsMade: Double
  
  var callsRemaining: Double
  
  var minutesInterval: Double
  
  var resetTimeMillis: Double
}
object RateLimit {
  
  inline def apply(callsMade: Double, callsRemaining: Double, minutesInterval: Double, resetTimeMillis: Double): RateLimit = {
    val __obj = js.Dynamic.literal(callsMade = callsMade.asInstanceOf[js.Any], callsRemaining = callsRemaining.asInstanceOf[js.Any], minutesInterval = minutesInterval.asInstanceOf[js.Any], resetTimeMillis = resetTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimit]
  }
  
  extension [Self <: RateLimit](x: Self) {
    
    inline def setCallsMade(value: Double): Self = StObject.set(x, "callsMade", value.asInstanceOf[js.Any])
    
    inline def setCallsRemaining(value: Double): Self = StObject.set(x, "callsRemaining", value.asInstanceOf[js.Any])
    
    inline def setMinutesInterval(value: Double): Self = StObject.set(x, "minutesInterval", value.asInstanceOf[js.Any])
    
    inline def setResetTimeMillis(value: Double): Self = StObject.set(x, "resetTimeMillis", value.asInstanceOf[js.Any])
  }
}
