package typings.googleapis.trafficdirectorV2Mod.trafficdirectorV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDoubleRange extends StObject {
  
  /**
    * end of the range (exclusive)
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * start of the range (inclusive)
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDoubleRange {
  
  inline def apply(): SchemaDoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleRange]
  }
  
  extension [Self <: SchemaDoubleRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
