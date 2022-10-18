package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.CallStatement]
     with _Statement {
  
  var expression: CallExpression | StringCallExpression | TableCallExpression
}
object CallStatement {
  
  inline def apply(expression: CallExpression | StringCallExpression | TableCallExpression): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallStatement")
    __obj.asInstanceOf[CallStatement]
  }
  
  extension [Self <: CallStatement](x: Self) {
    
    inline def setExpression(value: CallExpression | StringCallExpression | TableCallExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
  }
}
