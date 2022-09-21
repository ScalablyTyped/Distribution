package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.iobroker.objectsMod.global.ioBroker._ObjectIdToObjectType because Already inherited */ trait HostObject
  extends StObject
     with BaseObject
     with AnyObject
     with _InferGetObjectViewItemType[Any, Any] {
  
  @JSName("common")
  var common_HostObject: HostCommon
  
  @JSName("native")
  var native_HostObject: HostNative
  
  @JSName("type")
  var type_HostObject: host
}
object HostObject {
  
  inline def apply(_id: String, common: HostCommon, native: HostNative): HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("host")
    __obj.asInstanceOf[HostObject]
  }
  
  extension [Self <: HostObject](x: Self) {
    
    inline def setCommon(value: HostCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setNative(value: HostNative): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setType(value: host): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
