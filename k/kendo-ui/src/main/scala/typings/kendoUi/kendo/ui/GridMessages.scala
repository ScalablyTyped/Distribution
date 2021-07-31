package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridMessages extends StObject {
  
  var commands: js.UndefOr[GridMessagesCommands] = js.undefined
  
  var expandCollapseColumnHeader: js.UndefOr[String] = js.undefined
  
  var noRecords: js.UndefOr[String] = js.undefined
}
object GridMessages {
  
  @scala.inline
  def apply(): GridMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMessages]
  }
  
  @scala.inline
  implicit class GridMessagesMutableBuilder[Self <: GridMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommands(value: GridMessagesCommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setExpandCollapseColumnHeader(value: String): Self = StObject.set(x, "expandCollapseColumnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandCollapseColumnHeaderUndefined: Self = StObject.set(x, "expandCollapseColumnHeader", js.undefined)
    
    @scala.inline
    def setNoRecords(value: String): Self = StObject.set(x, "noRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRecordsUndefined: Self = StObject.set(x, "noRecords", js.undefined)
  }
}
