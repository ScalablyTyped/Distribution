package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableCallExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.TableCallExpression]
     with Expression {
  
  var arguments: Expression
  
  var base: Expression
}
object TableCallExpression {
  
  inline def apply(arguments: Expression, base: Expression): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[TableCallExpression]
  }
  
  extension [Self <: TableCallExpression](x: Self) {
    
    inline def setArguments(value: Expression): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
  }
}
