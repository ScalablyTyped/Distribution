package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.script
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_ScriptObject: ScriptCommon
  
  @JSName("type")
  var type_ScriptObject: script
}
object ScriptObject {
  
  inline def apply(_id: String, common: ScriptCommon, native: Record[String, Any]): ScriptObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[ScriptObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptObject] (val x: Self) extends AnyVal {
    
    inline def setCommon(value: ScriptCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
