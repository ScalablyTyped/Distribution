package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_HostObject: HostCommon
  
  @JSName("native")
  var native_HostObject: HostNative
  
  @JSName("type")
  var type_HostObject: host
}
object HostObject {
  
  @scala.inline
  def apply(_id: String, common: HostCommon, native: HostNative): HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[HostObject]
  }
  
  @scala.inline
  implicit class HostObjectMutableBuilder[Self <: HostObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: HostCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: HostNative): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: host): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
