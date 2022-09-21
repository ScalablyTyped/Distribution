package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFloatUnit extends StObject {
  
  /**
    * amount.
    */
  var amount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * unit.
    */
  var unit: js.UndefOr[String | Null] = js.undefined
}
object SchemaFloatUnit {
  
  inline def apply(): SchemaFloatUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloatUnit]
  }
  
  extension [Self <: SchemaFloatUnit](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountNull: Self = StObject.set(x, "amount", null)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
