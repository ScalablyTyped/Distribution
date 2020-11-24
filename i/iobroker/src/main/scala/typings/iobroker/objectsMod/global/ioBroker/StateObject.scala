package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.state
import typings.std.Record
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
  implicit class StateObjectOps[Self <: StateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommon(value: StateCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: state): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcl(value: StateACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
  }
}
