package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortKeyRange extends StObject {
  
  var sortKey: Double
  
  var symbolInstanceEnd: Double
  
  var symbolInstanceStart: Double
}
object SortKeyRange {
  
  inline def apply(sortKey: Double, symbolInstanceEnd: Double, symbolInstanceStart: Double): SortKeyRange = {
    val __obj = js.Dynamic.literal(sortKey = sortKey.asInstanceOf[js.Any], symbolInstanceEnd = symbolInstanceEnd.asInstanceOf[js.Any], symbolInstanceStart = symbolInstanceStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortKeyRange]
  }
  
  extension [Self <: SortKeyRange](x: Self) {
    
    inline def setSortKey(value: Double): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSymbolInstanceEnd(value: Double): Self = StObject.set(x, "symbolInstanceEnd", value.asInstanceOf[js.Any])
    
    inline def setSymbolInstanceStart(value: Double): Self = StObject.set(x, "symbolInstanceStart", value.asInstanceOf[js.Any])
  }
}
