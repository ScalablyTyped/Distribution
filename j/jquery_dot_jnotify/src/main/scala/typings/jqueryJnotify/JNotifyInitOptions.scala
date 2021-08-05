package typings.jqueryJnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JNotifyInitOptions extends StObject {
  
  var appendType: js.UndefOr[String] = js.undefined
  
  var oneAtTime: js.UndefOr[Boolean] = js.undefined
}
object JNotifyInitOptions {
  
  inline def apply(): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyInitOptions]
  }
  
  extension [Self <: JNotifyInitOptions](x: Self) {
    
    inline def setAppendType(value: String): Self = StObject.set(x, "appendType", value.asInstanceOf[js.Any])
    
    inline def setAppendTypeUndefined: Self = StObject.set(x, "appendType", js.undefined)
    
    inline def setOneAtTime(value: Boolean): Self = StObject.set(x, "oneAtTime", value.asInstanceOf[js.Any])
    
    inline def setOneAtTimeUndefined: Self = StObject.set(x, "oneAtTime", js.undefined)
  }
}
