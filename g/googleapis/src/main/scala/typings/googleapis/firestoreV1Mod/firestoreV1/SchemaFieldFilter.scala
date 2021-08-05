package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter on a specific field.
  */
trait SchemaFieldFilter extends StObject {
  
  /**
    * The field to filter by.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.undefined
  
  /**
    * The operator to filter by.
    */
  var op: js.UndefOr[String] = js.undefined
  
  /**
    * The value to compare to.
    */
  var value: js.UndefOr[SchemaValue] = js.undefined
}
object SchemaFieldFilter {
  
  inline def apply(): SchemaFieldFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldFilter]
  }
  
  extension [Self <: SchemaFieldFilter](x: Self) {
    
    inline def setField(value: SchemaFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setValue(value: SchemaValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
