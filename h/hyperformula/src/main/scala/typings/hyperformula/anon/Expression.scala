package typings.hyperformula.anon

import typings.hyperformula.namedExpressionsMod.InternalNamedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression extends StObject {
  
  var expression: InternalNamedExpression
  
  var scope: js.UndefOr[Double] = js.undefined
}
object Expression {
  
  inline def apply(expression: InternalNamedExpression): Expression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  extension [Self <: Expression](x: Self) {
    
    inline def setExpression(value: InternalNamedExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Double): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
