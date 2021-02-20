package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.enum
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_EnumObject: EnumCommon = js.native
  
  @JSName("type")
  var type_EnumObject: enum = js.native
}
object EnumObject {
  
  @scala.inline
  def apply(_id: String, common: EnumCommon, native: Record[String, _], `type`: enum): EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumObject]
  }
  
  @scala.inline
  implicit class EnumObjectMutableBuilder[Self <: EnumObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: EnumCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: enum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
