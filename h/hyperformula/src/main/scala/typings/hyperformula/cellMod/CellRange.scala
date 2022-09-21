package typings.hyperformula.cellMod

import typings.hyperformula.typingsParserMod.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellRange extends StObject {
  
  var end: CellAddress
  
  var start: CellAddress
}
object CellRange {
  
  inline def apply(end: CellAddress, start: CellAddress): CellRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRange]
  }
  
  extension [Self <: CellRange](x: Self) {
    
    inline def setEnd(value: CellAddress): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: CellAddress): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
