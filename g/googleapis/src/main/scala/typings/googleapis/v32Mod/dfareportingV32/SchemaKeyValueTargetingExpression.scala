package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key Value Targeting Expression.
  */
trait SchemaKeyValueTargetingExpression extends StObject {
  
  /**
    * Keyword expression being targeted by the ad.
    */
  var expression: js.UndefOr[String] = js.undefined
}
object SchemaKeyValueTargetingExpression {
  
  inline def apply(): SchemaKeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyValueTargetingExpression]
  }
  
  extension [Self <: SchemaKeyValueTargetingExpression](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
