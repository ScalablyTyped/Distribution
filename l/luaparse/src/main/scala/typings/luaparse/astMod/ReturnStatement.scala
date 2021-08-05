package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.ReturnStatement]
     with _Statement {
  
  var arguments: js.Array[Expression]
}
object ReturnStatement {
  
  inline def apply(arguments: js.Array[Expression]): ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  extension [Self <: ReturnStatement](x: Self) {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value :_*))
  }
}
