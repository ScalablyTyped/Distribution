package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorSortable extends StObject {
  
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
}
object PivotConfiguratorSortable {
  
  inline def apply(): PivotConfiguratorSortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorSortable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotConfiguratorSortable] (val x: Self) extends AnyVal {
    
    inline def setAllowUnsort(value: Boolean): Self = StObject.set(x, "allowUnsort", value.asInstanceOf[js.Any])
    
    inline def setAllowUnsortUndefined: Self = StObject.set(x, "allowUnsort", js.undefined)
  }
}
