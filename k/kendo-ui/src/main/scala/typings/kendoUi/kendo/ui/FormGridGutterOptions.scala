package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormGridGutterOptions extends StObject {
  
  var cols: js.UndefOr[String | Double] = js.undefined
  
  var rows: js.UndefOr[String | Double] = js.undefined
}
object FormGridGutterOptions {
  
  inline def apply(): FormGridGutterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormGridGutterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormGridGutterOptions] (val x: Self) extends AnyVal {
    
    inline def setCols(value: String | Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setRows(value: String | Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
