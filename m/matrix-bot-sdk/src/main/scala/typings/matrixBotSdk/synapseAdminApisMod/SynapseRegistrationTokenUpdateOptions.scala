package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseRegistrationTokenUpdateOptions extends StObject {
  
  /**
    * The latest time the token is valid. Given as the number of milliseconds since 1970-01-01 00:00:00 UTC (the start of the Unix epoch).
    * If null the token will not expire.
    * Default: token does not expire.
    */
  var expiry_time: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The integer number of times the token can be used to complete a registration before it becomes invalid.
    * If null the token will have an unlimited number of uses.
    * Default: unlimited uses.
    */
  var uses_allowed: js.UndefOr[Double | Null] = js.undefined
}
object SynapseRegistrationTokenUpdateOptions {
  
  inline def apply(): SynapseRegistrationTokenUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynapseRegistrationTokenUpdateOptions]
  }
  
  extension [Self <: SynapseRegistrationTokenUpdateOptions](x: Self) {
    
    inline def setExpiry_time(value: Double): Self = StObject.set(x, "expiry_time", value.asInstanceOf[js.Any])
    
    inline def setExpiry_timeNull: Self = StObject.set(x, "expiry_time", null)
    
    inline def setExpiry_timeUndefined: Self = StObject.set(x, "expiry_time", js.undefined)
    
    inline def setUses_allowed(value: Double): Self = StObject.set(x, "uses_allowed", value.asInstanceOf[js.Any])
    
    inline def setUses_allowedNull: Self = StObject.set(x, "uses_allowed", null)
    
    inline def setUses_allowedUndefined: Self = StObject.set(x, "uses_allowed", js.undefined)
  }
}
