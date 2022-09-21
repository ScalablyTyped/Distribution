package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleMatcher extends StObject {
  
  /**
    * If specified, the input double value must be equal to the value specified here.
    */
  var exact: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * If specified, the input double value must be in the range specified here. Note: The range is using half-open interval semantics [start, end).
    */
  var range: js.UndefOr[SchemaDoubleRange] = js.undefined
}
object SchemaDoubleMatcher {
  
  inline def apply(): SchemaDoubleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleMatcher]
  }
  
  extension [Self <: SchemaDoubleMatcher](x: Self) {
    
    inline def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactNull: Self = StObject.set(x, "exact", null)
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setRange(value: SchemaDoubleRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
