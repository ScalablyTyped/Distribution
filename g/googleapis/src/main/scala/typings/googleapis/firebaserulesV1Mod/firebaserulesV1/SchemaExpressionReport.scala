package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExpressionReport extends StObject {
  
  /**
    * Subexpressions
    */
  var children: js.UndefOr[js.Array[SchemaExpressionReport]] = js.undefined
  
  /**
    * Position of expression in original rules source.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.undefined
  
  /**
    * Values that this expression evaluated to when encountered.
    */
  var values: js.UndefOr[js.Array[SchemaValueCount]] = js.undefined
}
object SchemaExpressionReport {
  
  inline def apply(): SchemaExpressionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpressionReport]
  }
  
  extension [Self <: SchemaExpressionReport](x: Self) {
    
    inline def setChildren(value: js.Array[SchemaExpressionReport]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: SchemaExpressionReport*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setSourcePosition(value: SchemaSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    
    inline def setValues(value: js.Array[SchemaValueCount]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaValueCount*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
