package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceObject
  extends StObject
     with BaseObject
     with AdapterScopedObject
     with AnyObject {
  
  @JSName("common")
  var common_DeviceObject: DeviceCommon
  
  @JSName("type")
  var type_DeviceObject: device
}
object DeviceObject {
  
  inline def apply(_id: String, common: DeviceCommon, native: Record[String, Any]): DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("device")
    __obj.asInstanceOf[DeviceObject]
  }
  
  extension [Self <: DeviceObject](x: Self) {
    
    inline def setCommon(value: DeviceCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: device): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
