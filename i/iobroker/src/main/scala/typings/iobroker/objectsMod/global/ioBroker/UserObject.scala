package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_UserObject: UserCommon
  
  @JSName("type")
  var type_UserObject: user
}
object UserObject {
  
  @scala.inline
  def apply(_id: String, common: UserCommon, native: Record[String, js.Any]): UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[UserObject]
  }
  
  @scala.inline
  implicit class UserObjectMutableBuilder[Self <: UserObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: UserCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: user): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
