package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
}
object PivotConfiguratorSortable {
  
  @scala.inline
  def apply(): PivotConfiguratorSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorSortable]
  }
  
  @scala.inline
  implicit class PivotConfiguratorSortableMutableBuilder[Self <: PivotConfiguratorSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
  }
}
