package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.instance
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_InstanceObject: InstanceCommon = js.native
  
  @JSName("type")
  var type_InstanceObject: instance = js.native
}
object InstanceObject {
  
  @scala.inline
  def apply(_id: String, common: InstanceCommon, native: Record[String, _], `type`: instance): InstanceObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceObject]
  }
  
  @scala.inline
  implicit class InstanceObjectMutableBuilder[Self <: InstanceObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: InstanceCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: instance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
