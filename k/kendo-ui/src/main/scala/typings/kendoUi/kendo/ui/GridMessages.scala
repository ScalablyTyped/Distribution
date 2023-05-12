package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridMessages extends StObject {
  
  var commands: js.UndefOr[GridMessagesCommands] = js.undefined
  
  var expandCollapseColumnHeader: js.UndefOr[String] = js.undefined
  
  var filterCellTitle: js.UndefOr[String] = js.undefined
  
  var groupingHeaderLabel: js.UndefOr[String] = js.undefined
  
  var noRecords: js.UndefOr[String] = js.undefined
  
  var toolbarLabel: js.UndefOr[String] = js.undefined
}
object GridMessages {
  
  inline def apply(): GridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridMessages] (val x: Self) extends AnyVal {
    
    inline def setCommands(value: GridMessagesCommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setExpandCollapseColumnHeader(value: String): Self = StObject.set(x, "expandCollapseColumnHeader", value.asInstanceOf[js.Any])
    
    inline def setExpandCollapseColumnHeaderUndefined: Self = StObject.set(x, "expandCollapseColumnHeader", js.undefined)
    
    inline def setFilterCellTitle(value: String): Self = StObject.set(x, "filterCellTitle", value.asInstanceOf[js.Any])
    
    inline def setFilterCellTitleUndefined: Self = StObject.set(x, "filterCellTitle", js.undefined)
    
    inline def setGroupingHeaderLabel(value: String): Self = StObject.set(x, "groupingHeaderLabel", value.asInstanceOf[js.Any])
    
    inline def setGroupingHeaderLabelUndefined: Self = StObject.set(x, "groupingHeaderLabel", js.undefined)
    
    inline def setNoRecords(value: String): Self = StObject.set(x, "noRecords", value.asInstanceOf[js.Any])
    
    inline def setNoRecordsUndefined: Self = StObject.set(x, "noRecords", js.undefined)
    
    inline def setToolbarLabel(value: String): Self = StObject.set(x, "toolbarLabel", value.asInstanceOf[js.Any])
    
    inline def setToolbarLabelUndefined: Self = StObject.set(x, "toolbarLabel", js.undefined)
  }
}
