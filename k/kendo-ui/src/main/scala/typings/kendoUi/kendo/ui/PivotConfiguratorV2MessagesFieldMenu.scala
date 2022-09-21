package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotConfiguratorV2MessagesFieldMenu extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.undefined
  
  var clear: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var filterFields: js.UndefOr[String] = js.undefined
  
  var include: js.UndefOr[String] = js.undefined
  
  var operators: js.UndefOr[PivotConfiguratorV2MessagesFieldMenuOperators] = js.undefined
  
  var reset: js.UndefOr[String] = js.undefined
  
  var sortAscending: js.UndefOr[String] = js.undefined
  
  var sortDescending: js.UndefOr[String] = js.undefined
}
object PivotConfiguratorV2MessagesFieldMenu {
  
  inline def apply(): PivotConfiguratorV2MessagesFieldMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotConfiguratorV2MessagesFieldMenu]
  }
  
  extension [Self <: PivotConfiguratorV2MessagesFieldMenu](x: Self) {
    
    inline def setApply(value: String): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterFields(value: String): Self = StObject.set(x, "filterFields", value.asInstanceOf[js.Any])
    
    inline def setFilterFieldsUndefined: Self = StObject.set(x, "filterFields", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setOperators(value: PivotConfiguratorV2MessagesFieldMenuOperators): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsUndefined: Self = StObject.set(x, "operators", js.undefined)
    
    inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSortAscending(value: String): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortAscendingUndefined: Self = StObject.set(x, "sortAscending", js.undefined)
    
    inline def setSortDescending(value: String): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
  }
}
