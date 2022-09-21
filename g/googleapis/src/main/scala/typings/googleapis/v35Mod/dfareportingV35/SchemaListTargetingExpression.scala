package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTargetingExpression extends StObject {
  
  /**
    * Expression describing which lists are being targeted by the ad.
    */
  var expression: js.UndefOr[String | Null] = js.undefined
}
object SchemaListTargetingExpression {
  
  inline def apply(): SchemaListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTargetingExpression]
  }
  
  extension [Self <: SchemaListTargetingExpression](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
