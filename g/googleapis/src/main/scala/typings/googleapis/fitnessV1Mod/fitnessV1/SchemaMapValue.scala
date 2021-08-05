package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holder object for the value of an entry in a map field of a data point.  A
  * map value supports a subset of the formats that the regular Value supports.
  */
trait SchemaMapValue extends StObject {
  
  /**
    * Floating point value.
    */
  var fpVal: js.UndefOr[Double] = js.undefined
}
object SchemaMapValue {
  
  inline def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  
  extension [Self <: SchemaMapValue](x: Self) {
    
    inline def setFpVal(value: Double): Self = StObject.set(x, "fpVal", value.asInstanceOf[js.Any])
    
    inline def setFpValUndefined: Self = StObject.set(x, "fpVal", js.undefined)
  }
}
