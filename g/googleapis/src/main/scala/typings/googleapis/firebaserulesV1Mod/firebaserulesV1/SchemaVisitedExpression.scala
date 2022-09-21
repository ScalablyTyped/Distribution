package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVisitedExpression extends StObject {
  
  /**
    * Position in the `Source` or `Ruleset` where an expression was visited.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.undefined
  
  /**
    * The evaluated value for the visited expression, e.g. true/false
    */
  var value: js.UndefOr[Any | Null] = js.undefined
}
object SchemaVisitedExpression {
  
  inline def apply(): SchemaVisitedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVisitedExpression]
  }
  
  extension [Self <: SchemaVisitedExpression](x: Self) {
    
    inline def setSourcePosition(value: SchemaSourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
