package typings.hyperformula.typingsCellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRowAddress_ extends StObject {
  
  var row: Double
  
  var sheet: Double
}
object SimpleRowAddress_ {
  
  inline def apply(row: Double, sheet: Double): SimpleRowAddress_ = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRowAddress_]
  }
  
  extension [Self <: SimpleRowAddress_](x: Self) {
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: Double): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
