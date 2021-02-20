package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_UserObject: UserCommon = js.native
  
  @JSName("type")
  var type_UserObject: user = js.native
}
object UserObject {
  
  @scala.inline
  def apply(_id: String, common: UserCommon, native: Record[String, _], `type`: user): UserObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
