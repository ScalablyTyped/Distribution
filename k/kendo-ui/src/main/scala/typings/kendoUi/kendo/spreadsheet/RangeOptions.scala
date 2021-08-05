package typings.kendoUi.kendo.spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object RangeOptions {
  
  inline def apply(): RangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOptions]
  }
  
  extension [Self <: RangeOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
