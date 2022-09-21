package typings.googleapis.homegraphV1Mod.homegraphV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryResponsePayload extends StObject {
  
  /**
    * States of the devices. Map of third-party device ID to struct of device states.
    */
  var devices: js.UndefOr[StringDictionary[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaQueryResponsePayload {
  
  inline def apply(): SchemaQueryResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryResponsePayload]
  }
  
  extension [Self <: SchemaQueryResponsePayload](x: Self) {
    
    inline def setDevices(value: StringDictionary[StringDictionary[Any]]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesNull: Self = StObject.set(x, "devices", null)
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
  }
}
