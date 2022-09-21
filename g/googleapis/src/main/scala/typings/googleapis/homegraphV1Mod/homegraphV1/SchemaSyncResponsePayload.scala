package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSyncResponsePayload extends StObject {
  
  /**
    * Third-party user ID
    */
  var agentUserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Devices associated with the third-party user.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.undefined
}
object SchemaSyncResponsePayload {
  
  inline def apply(): SchemaSyncResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSyncResponsePayload]
  }
  
  extension [Self <: SchemaSyncResponsePayload](x: Self) {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdNull: Self = StObject.set(x, "agentUserId", null)
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setDevices(value: js.Array[SchemaDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaDevice*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
