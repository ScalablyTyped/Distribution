package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGradientRule extends StObject {
  
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[SchemaInterpolationPoint] = js.undefined
  
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[SchemaInterpolationPoint] = js.undefined
  
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[SchemaInterpolationPoint] = js.undefined
}
object SchemaGradientRule {
  
  inline def apply(): SchemaGradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGradientRule]
  }
  
  extension [Self <: SchemaGradientRule](x: Self) {
    
    inline def setMaxpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "maxpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxpointUndefined: Self = StObject.set(x, "maxpoint", js.undefined)
    
    inline def setMidpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    inline def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    inline def setMinpoint(value: SchemaInterpolationPoint): Self = StObject.set(x, "minpoint", value.asInstanceOf[js.Any])
    
    inline def setMinpointUndefined: Self = StObject.set(x, "minpoint", js.undefined)
  }
}
