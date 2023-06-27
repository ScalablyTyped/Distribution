package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerOngoing extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var updateInterval: js.UndefOr[Double] = js.undefined
  
  var useLocalTimezone: js.UndefOr[Boolean] = js.undefined
}
object SchedulerOngoing {
  
  inline def apply(): SchedulerOngoing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerOngoing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerOngoing] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setUpdateIntervalUndefined: Self = StObject.set(x, "updateInterval", js.undefined)
    
    inline def setUseLocalTimezone(value: Boolean): Self = StObject.set(x, "useLocalTimezone", value.asInstanceOf[js.Any])
    
    inline def setUseLocalTimezoneUndefined: Self = StObject.set(x, "useLocalTimezone", js.undefined)
  }
}
