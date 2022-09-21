package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMapValue extends StObject {
  
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMapValue {
  
  inline def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  
  extension [Self <: SchemaMapValue](x: Self) {
    
    inline def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    inline def setFpValNull: Self = StObject.set(x, "fpVal", null)
    
    inline def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
  }
}
