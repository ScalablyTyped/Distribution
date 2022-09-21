package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductWeight extends StObject {
  
  /**
    * Required. The weight unit. Acceptable values are: - "`g`" - "`kg`" - "`oz`" - "`lb`"
    */
  var unit: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The weight represented as a number. The weight can have a maximum precision of four decimal places.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProductWeight {
  
  inline def apply(): SchemaProductWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductWeight]
  }
  
  extension [Self <: SchemaProductWeight](x: Self) {
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitNull: Self = StObject.set(x, "unit", null)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
