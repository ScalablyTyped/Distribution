package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetToolbar extends StObject {
  
  var data: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var home: js.UndefOr[Boolean | js.Any] = js.undefined
  
  var insert: js.UndefOr[Boolean | js.Any] = js.undefined
}
object SpreadsheetToolbar {
  
  @scala.inline
  def apply(): SpreadsheetToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetToolbar]
  }
  
  @scala.inline
  implicit class SpreadsheetToolbarMutableBuilder[Self <: SpreadsheetToolbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Boolean | js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHome(value: Boolean | js.Any): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
    
    @scala.inline
    def setInsert(value: Boolean | js.Any): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
  }
}
