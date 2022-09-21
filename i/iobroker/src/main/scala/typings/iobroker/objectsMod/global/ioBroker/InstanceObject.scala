package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.instance
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.iobroker.objectsMod.global.ioBroker._ObjectIdToObjectType because Already inherited */ trait InstanceObject
  extends StObject
     with BaseObject
     with AnyObject
     with _InferGetObjectViewItemType[Any, Any] {
  
  @JSName("common")
  var common_InstanceObject: InstanceCommon
  
  @JSName("type")
  var type_InstanceObject: instance
}
object InstanceObject {
  
  inline def apply(_id: String, common: InstanceCommon, native: Record[String, Any]): InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("instance")
    __obj.asInstanceOf[InstanceObject]
  }
  
  extension [Self <: InstanceObject](x: Self) {
    
    inline def setCommon(value: InstanceCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: instance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
