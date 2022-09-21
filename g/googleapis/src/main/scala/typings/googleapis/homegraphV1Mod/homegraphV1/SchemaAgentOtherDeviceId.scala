package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAgentOtherDeviceId extends StObject {
  
  /**
    * Project ID for your smart home Action.
    */
  var agentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique third-party device ID.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAgentOtherDeviceId {
  
  inline def apply(): SchemaAgentOtherDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAgentOtherDeviceId]
  }
  
  extension [Self <: SchemaAgentOtherDeviceId](x: Self) {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdNull: Self = StObject.set(x, "agentId", null)
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
  }
}
