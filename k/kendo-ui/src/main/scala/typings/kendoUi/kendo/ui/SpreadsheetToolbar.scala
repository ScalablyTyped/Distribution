package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadsheetToolbar extends StObject {
  
  var data: js.UndefOr[Boolean | Any] = js.undefined
  
  var home: js.UndefOr[Boolean | Any] = js.undefined
  
  var insert: js.UndefOr[Boolean | Any] = js.undefined
}
object SpreadsheetToolbar {
  
  inline def apply(): SpreadsheetToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetToolbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadsheetToolbar] (val x: Self) extends AnyVal {
    
    inline def setData(value: Boolean | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHome(value: Boolean | Any): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
    
    inline def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
    
    inline def setInsert(value: Boolean | Any): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
  }
}
