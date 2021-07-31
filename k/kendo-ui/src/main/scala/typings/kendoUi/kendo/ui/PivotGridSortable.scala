package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
}
object PivotGridSortable {
  
  @scala.inline
  def apply(): PivotGridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridSortable]
  }
  
  @scala.inline
  implicit class PivotGridSortableMutableBuilder[Self <: PivotGridSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
  }
}
