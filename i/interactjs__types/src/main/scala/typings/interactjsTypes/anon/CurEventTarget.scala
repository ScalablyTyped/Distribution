package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurEventTarget extends StObject {
  
  var curEventTarget: typings.std.EventTarget
  
  var `type`: cancel
}
object CurEventTarget {
  
  inline def apply(curEventTarget: typings.std.EventTarget): CurEventTarget = {
    val __obj = js.Dynamic.literal(curEventTarget = curEventTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cancel")
    __obj.asInstanceOf[CurEventTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurEventTarget] (val x: Self) extends AnyVal {
    
    inline def setCurEventTarget(value: typings.std.EventTarget): Self = StObject.set(x, "curEventTarget", value.asInstanceOf[js.Any])
    
    inline def setType(value: cancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
