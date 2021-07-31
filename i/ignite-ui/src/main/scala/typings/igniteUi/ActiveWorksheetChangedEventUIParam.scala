package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveWorksheetChangedEventUIParam extends StObject {
  
  /**
    * Gets the current active [worksheet](ig.excel.Worksheet).
    */
  var newActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the name of the new active worksheet or null if newActiveWorksheet is null.
    */
  var newActiveWorksheetName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the previous active [worksheet](ig.excel.Worksheet).
    */
  var oldActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the name of the previous active worksheet or null if oldActiveWorksheet is null.
    */
  var oldActiveWorksheetName: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object ActiveWorksheetChangedEventUIParam {
  
  @scala.inline
  def apply(): ActiveWorksheetChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveWorksheetChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ActiveWorksheetChangedEventUIParamMutableBuilder[Self <: ActiveWorksheetChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewActiveWorksheet(value: js.Any): Self = StObject.set(x, "newActiveWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewActiveWorksheetName(value: String): Self = StObject.set(x, "newActiveWorksheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewActiveWorksheetNameUndefined: Self = StObject.set(x, "newActiveWorksheetName", js.undefined)
    
    @scala.inline
    def setNewActiveWorksheetUndefined: Self = StObject.set(x, "newActiveWorksheet", js.undefined)
    
    @scala.inline
    def setOldActiveWorksheet(value: js.Any): Self = StObject.set(x, "oldActiveWorksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldActiveWorksheetName(value: String): Self = StObject.set(x, "oldActiveWorksheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldActiveWorksheetNameUndefined: Self = StObject.set(x, "oldActiveWorksheetName", js.undefined)
    
    @scala.inline
    def setOldActiveWorksheetUndefined: Self = StObject.set(x, "oldActiveWorksheet", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
