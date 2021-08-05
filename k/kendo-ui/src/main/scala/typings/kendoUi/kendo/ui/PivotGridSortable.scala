package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
}
object PivotGridSortable {
  
  inline def apply(): PivotGridSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridSortable]
  }
  
  extension [Self <: PivotGridSortable](x: Self) {
    
    inline def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
  }
}
