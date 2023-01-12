package typings.jqueryJnotify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JNotifyOptions extends StObject {
  
  var disappearTime: js.UndefOr[Double] = js.undefined
  
  var permanent: js.UndefOr[Boolean] = js.undefined
  
  var showIcon: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object JNotifyOptions {
  
  inline def apply(): JNotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JNotifyOptions] (val x: Self) extends AnyVal {
    
    inline def setDisappearTime(value: Double): Self = StObject.set(x, "disappearTime", value.asInstanceOf[js.Any])
    
    inline def setDisappearTimeUndefined: Self = StObject.set(x, "disappearTime", js.undefined)
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
