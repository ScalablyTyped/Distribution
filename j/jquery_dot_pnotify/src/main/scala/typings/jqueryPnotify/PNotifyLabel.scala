package typings.jqueryPnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PNotifyLabel extends StObject {
  
  var all: js.UndefOr[String] = js.undefined
  
  var close: js.UndefOr[String] = js.undefined
  
  var last: js.UndefOr[String] = js.undefined
  
  var redisplay: js.UndefOr[String] = js.undefined
  
  var stick: js.UndefOr[String] = js.undefined
}
object PNotifyLabel {
  
  inline def apply(): PNotifyLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PNotifyLabel] (val x: Self) extends AnyVal {
    
    inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setRedisplay(value: String): Self = StObject.set(x, "redisplay", value.asInstanceOf[js.Any])
    
    inline def setRedisplayUndefined: Self = StObject.set(x, "redisplay", js.undefined)
    
    inline def setStick(value: String): Self = StObject.set(x, "stick", value.asInstanceOf[js.Any])
    
    inline def setStickUndefined: Self = StObject.set(x, "stick", js.undefined)
  }
}
