package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_DeviceObject: DeviceCommon = js.native
  
  @JSName("type")
  var type_DeviceObject: device = js.native
}
object DeviceObject {
  
  @scala.inline
  def apply(_id: String, common: DeviceCommon, native: Record[String, _], `type`: device): DeviceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceObject]
  }
  
  @scala.inline
  implicit class DeviceObjectMutableBuilder[Self <: DeviceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: DeviceCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: device): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
