package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFixedOrPercent extends StObject {
  
  /**
    * Specifies a fixed value.
    */
  var fixed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
    */
  var percent: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFixedOrPercent {
  
  inline def apply(): SchemaFixedOrPercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFixedOrPercent]
  }
  
  extension [Self <: SchemaFixedOrPercent](x: Self) {
    
    inline def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedNull: Self = StObject.set(x, "fixed", null)
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentNull: Self = StObject.set(x, "percent", null)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
