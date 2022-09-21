package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSessionEvent extends StObject {
  
  /**
    * The initiator of the latest event of the streaming session. It will be set for all user events (`type` is 100-199) and unset for all server events(`type` is 200-299).
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of event.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSessionEvent {
  
  inline def apply(): SchemaSessionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSessionEvent]
  }
  
  extension [Self <: SchemaSessionEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
