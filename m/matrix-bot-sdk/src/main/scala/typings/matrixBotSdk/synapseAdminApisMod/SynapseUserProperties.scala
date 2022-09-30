package typings.matrixBotSdk.synapseAdminApisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynapseUserProperties
  extends StObject
     with SynapseUser {
  
  /**
    * The password for the user. Leave undefined to leave unchanged.
    */
  var password: js.UndefOr[String] = js.undefined
}
object SynapseUserProperties {
  
  inline def apply(): SynapseUserProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynapseUserProperties]
  }
  
  extension [Self <: SynapseUserProperties](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
