package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A filter with a single operand.
  */
trait SchemaUnaryFilter extends StObject {
  
  /**
    * The field to which to apply the operator.
    */
  var field: js.UndefOr[SchemaFieldReference] = js.undefined
  
  /**
    * The unary operator to apply.
    */
  var op: js.UndefOr[String] = js.undefined
}
object SchemaUnaryFilter {
  
  inline def apply(): SchemaUnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnaryFilter]
  }
  
  extension [Self <: SchemaUnaryFilter](x: Self) {
    
    inline def setField(value: SchemaFieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
