package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferOptions
  extends StObject
     with ExtraHeaders {
  
  var eventHandlers: js.UndefOr[Any] = js.undefined
  
  var replaces: js.UndefOr[RTCSession] = js.undefined
}
object ReferOptions {
  
  inline def apply(): ReferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferOptions] (val x: Self) extends AnyVal {
    
    inline def setEventHandlers(value: Any): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setReplaces(value: RTCSession): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
  }
}
