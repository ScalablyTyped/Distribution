package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The capacity of a product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#capacity.
  */
trait SchemaCapacity extends StObject {
  
  /**
    * The unit of the capacity, i.e., MB, GB, or TB.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The numeric value of the capacity.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaCapacity {
  
  inline def apply(): SchemaCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCapacity]
  }
  
  extension [Self <: SchemaCapacity](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
