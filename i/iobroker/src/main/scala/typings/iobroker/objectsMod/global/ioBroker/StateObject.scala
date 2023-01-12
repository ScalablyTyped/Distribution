package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.state
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateObject
  extends StObject
     with BaseObject
     with AdapterScopedObject
     with AnyObject {
  
  @JSName("acl")
  var acl_StateObject: js.UndefOr[StateACL] = js.undefined
  
  @JSName("common")
  var common_StateObject: StateCommon
  
  @JSName("type")
  var type_StateObject: state
}
object StateObject {
  
  inline def apply(_id: String, common: StateCommon, native: Record[String, Any]): StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("state")
    __obj.asInstanceOf[StateObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateObject] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: StateACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCommon(value: StateCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: state): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
