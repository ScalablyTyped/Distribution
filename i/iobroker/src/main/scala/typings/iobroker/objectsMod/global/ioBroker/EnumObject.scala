package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.`enum`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_EnumObject: EnumCommon
  
  @JSName("type")
  var type_EnumObject: `enum`
}
object EnumObject {
  
  @scala.inline
  def apply(_id: String, common: EnumCommon, native: Record[String, js.Any]): EnumObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enum")
    __obj.asInstanceOf[EnumObject]
  }
  
  @scala.inline
  implicit class EnumObjectMutableBuilder[Self <: EnumObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: EnumCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `enum`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
