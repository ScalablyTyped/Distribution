package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusyIndicatorOptions extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentTextText: js.UndefOr[String] = js.undefined
  
  var contentTitle: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var notificationId: js.UndefOr[Double] = js.undefined
  
  var tickerText: js.UndefOr[String] = js.undefined
}
object BusyIndicatorOptions {
  
  inline def apply(): BusyIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusyIndicatorOptions]
  }
  
  extension [Self <: BusyIndicatorOptions](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentTextText(value: String): Self = StObject.set(x, "contentTextText", value.asInstanceOf[js.Any])
    
    inline def setContentTextTextUndefined: Self = StObject.set(x, "contentTextText", js.undefined)
    
    inline def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
    
    inline def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setNotificationId(value: Double): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    
    inline def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
    
    inline def setTickerText(value: String): Self = StObject.set(x, "tickerText", value.asInstanceOf[js.Any])
    
    inline def setTickerTextUndefined: Self = StObject.set(x, "tickerText", js.undefined)
  }
}
