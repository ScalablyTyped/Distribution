package typings.hyperformula.cellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleColumnAddress_ extends StObject {
  
  var col: Double
  
  var sheet: Double
}
object SimpleColumnAddress_ {
  
  inline def apply(col: Double, sheet: Double): SimpleColumnAddress_ = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleColumnAddress_]
  }
  
  extension [Self <: SimpleColumnAddress_](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
