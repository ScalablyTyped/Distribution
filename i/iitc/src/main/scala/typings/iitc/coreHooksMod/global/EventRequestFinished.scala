package typings.iitc.coreHooksMod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRequestFinished extends StObject {
  
  var success: Boolean
}
object EventRequestFinished {
  
  inline def apply(success: Boolean): EventRequestFinished = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRequestFinished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventRequestFinished] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
