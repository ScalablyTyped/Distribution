package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LCDGeneralOption extends StObject {
  
  var cols: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
}
object LCDGeneralOption {
  
  inline def apply(): LCDGeneralOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LCDGeneralOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LCDGeneralOption] (val x: Self) extends AnyVal {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
