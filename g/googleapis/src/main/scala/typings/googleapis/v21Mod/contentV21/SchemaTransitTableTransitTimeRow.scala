package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransitTableTransitTimeRow extends StObject {
  
  var values: js.UndefOr[js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue]] = js.undefined
}
object SchemaTransitTableTransitTimeRow {
  
  inline def apply(): SchemaTransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRow]
  }
  
  extension [Self <: SchemaTransitTableTransitTimeRow](x: Self) {
    
    inline def setValues(value: js.Array[SchemaTransitTableTransitTimeRowTransitTimeValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaTransitTableTransitTimeRowTransitTimeValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
