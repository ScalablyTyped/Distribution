package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerViewEditable extends StObject {
  
  var create: js.UndefOr[Boolean] = js.native
  
  var destroy: js.UndefOr[Boolean] = js.native
  
  var update: js.UndefOr[Boolean] = js.native
}
object SchedulerViewEditable {
  
  @scala.inline
  def apply(): SchedulerViewEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerViewEditable]
  }
  
  @scala.inline
  implicit class SchedulerViewEditableMutableBuilder[Self <: SchedulerViewEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
