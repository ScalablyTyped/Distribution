package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerToolbarItem extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object SchedulerToolbarItem {
  
  @scala.inline
  def apply(): SchedulerToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerToolbarItem]
  }
  
  @scala.inline
  implicit class SchedulerToolbarItemMutableBuilder[Self <: SchedulerToolbarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
