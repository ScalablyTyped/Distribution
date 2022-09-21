package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteHeaderMatchIntegerRange extends StObject {
  
  /**
    * End of the range (exclusive)
    */
  var end: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Start of the range (inclusive)
    */
  var start: js.UndefOr[Double | Null] = js.undefined
}
object SchemaHttpRouteHeaderMatchIntegerRange {
  
  inline def apply(): SchemaHttpRouteHeaderMatchIntegerRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteHeaderMatchIntegerRange]
  }
  
  extension [Self <: SchemaHttpRouteHeaderMatchIntegerRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
