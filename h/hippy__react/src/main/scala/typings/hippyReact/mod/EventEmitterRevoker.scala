package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventEmitterRevoker extends StObject {
  
  var bindListener: js.UndefOr[HippyEventListener] = js.undefined
  
  var callback: js.UndefOr[Double] = js.undefined
}
object EventEmitterRevoker {
  
  inline def apply(): EventEmitterRevoker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventEmitterRevoker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventEmitterRevoker] (val x: Self) extends AnyVal {
    
    inline def setBindListener(value: HippyEventListener): Self = StObject.set(x, "bindListener", value.asInstanceOf[js.Any])
    
    inline def setBindListenerUndefined: Self = StObject.set(x, "bindListener", js.undefined)
    
    inline def setCallback(value: Double): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
