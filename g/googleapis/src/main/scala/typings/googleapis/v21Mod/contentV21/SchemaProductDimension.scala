package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductDimension extends StObject {
  
  /**
    * Required. The length units. Acceptable values are: - "`in`" - "`cm`"
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The length value represented as a number. The value can have a maximum precision of four decimal places.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProductDimension {
  
  inline def apply(): SchemaProductDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductDimension]
  }
  
  extension [Self <: SchemaProductDimension](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
