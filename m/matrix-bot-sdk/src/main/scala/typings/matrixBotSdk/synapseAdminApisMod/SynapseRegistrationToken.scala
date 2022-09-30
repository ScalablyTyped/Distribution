package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseRegistrationToken extends StObject {
  
  var completed: Double
  
  var expiry_time: Null | Double
  
  var pending: Double
  
  var token: String
  
  var uses_allowed: Null | Double
}
object SynapseRegistrationToken {
  
  inline def apply(completed: Double, pending: Double, token: String): SynapseRegistrationToken = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], expiry_time = null, uses_allowed = null)
    __obj.asInstanceOf[SynapseRegistrationToken]
  }
  
  extension [Self <: SynapseRegistrationToken](x: Self) {
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setExpiry_time(value: Double): Self = StObject.set(x, "expiry_time", value.asInstanceOf[js.Any])
    
    inline def setExpiry_timeNull: Self = StObject.set(x, "expiry_time", null)
    
    inline def setPending(value: Double): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUses_allowed(value: Double): Self = StObject.set(x, "uses_allowed", value.asInstanceOf[js.Any])
    
    inline def setUses_allowedNull: Self = StObject.set(x, "uses_allowed", null)
  }
}
