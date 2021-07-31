package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerGroup extends StObject {
  
  var date: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Any] = js.undefined
}
object SchedulerGroup {
  
  @scala.inline
  def apply(): SchedulerGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerGroup]
  }
  
  @scala.inline
  implicit class SchedulerGroupMutableBuilder[Self <: SchedulerGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setResources(value: js.Any): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
  }
}
