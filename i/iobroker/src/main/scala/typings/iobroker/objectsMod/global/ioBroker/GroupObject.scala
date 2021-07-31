package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.group
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_GroupObject: GroupCommon
  
  @JSName("type")
  var type_GroupObject: group
}
object GroupObject {
  
  @scala.inline
  def apply(_id: String, common: GroupCommon, native: Record[String, js.Any]): GroupObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[GroupObject]
  }
  
  @scala.inline
  implicit class GroupObjectMutableBuilder[Self <: GroupObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: GroupCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
