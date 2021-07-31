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
  
  @scala.inline
  def apply(): BusyIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusyIndicatorOptions]
  }
  
  @scala.inline
  implicit class BusyIndicatorOptionsMutableBuilder[Self <: BusyIndicatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContentTextText(value: String): Self = StObject.set(x, "contentTextText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTextTextUndefined: Self = StObject.set(x, "contentTextText", js.undefined)
    
    @scala.inline
    def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setNotificationId(value: Double): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
    
    @scala.inline
    def setTickerText(value: String): Self = StObject.set(x, "tickerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickerTextUndefined: Self = StObject.set(x, "tickerText", js.undefined)
  }
}
