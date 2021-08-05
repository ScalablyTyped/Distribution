package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeight extends StObject {
  
  /**
    * The weight unit.
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * The weight represented as a number.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaWeight {
  
  inline def apply(): SchemaWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeight]
  }
  
  extension [Self <: SchemaWeight](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
