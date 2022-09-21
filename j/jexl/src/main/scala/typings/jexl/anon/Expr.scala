package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.FilterExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expr
  extends StObject
     with Ast {
  
  var expr: Ast
  
  var relative: Boolean
  
  var subject: Ast
  
  var `type`: FilterExpression
}
object Expr {
  
  inline def apply(expr: Ast, relative: Boolean, subject: Ast): Expr = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FilterExpression")
    __obj.asInstanceOf[Expr]
  }
  
  extension [Self <: Expr](x: Self) {
    
    inline def setExpr(value: Ast): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Ast): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setType(value: FilterExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
