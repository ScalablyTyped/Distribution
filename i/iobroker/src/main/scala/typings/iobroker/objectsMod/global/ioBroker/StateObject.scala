package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.state
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateObject
  extends BaseObject
     with AnyObject {
  
  @JSName("acl")
  var acl_StateObject: js.UndefOr[StateACL] = js.native
  
  @JSName("common")
  var common_StateObject: StateCommon = js.native
  
  @JSName("type")
  var type_StateObject: state = js.native
}
object StateObject {
  
  @scala.inline
  def apply(_id: String, common: StateCommon, native: Record[String, _], `type`: state): StateObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateObject]
  }
  
  @scala.inline
  implicit class StateObjectMutableBuilder[Self <: StateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: StateACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setCommon(value: StateCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: state): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
