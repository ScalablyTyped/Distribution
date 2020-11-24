package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_HostObject: HostCommon = js.native
  
  @JSName("native")
  var native_HostObject: HostNative = js.native
  
  @JSName("type")
  var type_HostObject: host = js.native
}
object HostObject {
  
  @scala.inline
  def apply(_id: String, common: HostCommon, native: HostNative, `type`: host): HostObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostObject]
  }
  
  @scala.inline
  implicit class HostObjectOps[Self <: HostObject] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: HostCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: HostNative): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: host): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
