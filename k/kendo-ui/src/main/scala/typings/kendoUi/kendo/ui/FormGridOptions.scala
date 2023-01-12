package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormGridOptions extends StObject {
  
  var cols: js.UndefOr[String | Double] = js.undefined
  
  var gutter: js.UndefOr[String | Double] = js.undefined
}
object FormGridOptions {
  
  inline def apply(): FormGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormGridOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormGridOptions] (val x: Self) extends AnyVal {
    
    inline def setCols(value: String | Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setGutter(value: String | Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
  }
}
