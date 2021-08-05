package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerViewGroup extends StObject {
  
  var date: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
}
object SchedulerViewGroup {
  
  inline def apply(): SchedulerViewGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerViewGroup]
  }
  
  extension [Self <: SchedulerViewGroup](x: Self) {
    
    inline def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
  }
}
