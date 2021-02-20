package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.script
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_ScriptObject: ScriptCommon = js.native
  
  @JSName("type")
  var type_ScriptObject: script = js.native
}
object ScriptObject {
  
  @scala.inline
  def apply(_id: String, common: ScriptCommon, native: Record[String, _], `type`: script): ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptObject]
  }
  
  @scala.inline
  implicit class ScriptObjectMutableBuilder[Self <: ScriptObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: ScriptCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
