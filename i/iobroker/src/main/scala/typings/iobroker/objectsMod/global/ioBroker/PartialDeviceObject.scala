package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.PartialDeviceCommon
import typings.iobroker.iobrokerStrings.device
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker/objects.<global>.ioBroker.DeviceObject, 'common'>> */
trait PartialDeviceObject
  extends StObject
     with PartialObject {
  
  var _id: js.UndefOr[String] = js.undefined
  
  var acl: js.UndefOr[ObjectACL] = js.undefined
  
  var common: js.UndefOr[PartialDeviceCommon] = js.undefined
  
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var native: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[device] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object PartialDeviceObject {
  
  @scala.inline
  def apply(): PartialDeviceObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDeviceObject]
  }
  
  @scala.inline
  implicit class PartialDeviceObjectMutableBuilder[Self <: PartialDeviceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setCommon(value: PartialDeviceCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setEnums(value: Record[String, String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setNative(value: Record[String, js.Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    @scala.inline
    def setType(value: device): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
