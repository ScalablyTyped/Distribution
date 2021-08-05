package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerViewEditable extends StObject {
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var destroy: js.UndefOr[Boolean] = js.undefined
  
  var update: js.UndefOr[Boolean] = js.undefined
}
object SchedulerViewEditable {
  
  inline def apply(): SchedulerViewEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerViewEditable]
  }
  
  extension [Self <: SchedulerViewEditable](x: Self) {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
