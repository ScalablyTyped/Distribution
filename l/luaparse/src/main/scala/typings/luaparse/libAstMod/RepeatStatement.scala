package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.RepeatStatement]
     with _Statement {
  
  var body: js.Array[Statement]
  
  var condition: Expression
}
object RepeatStatement {
  
  inline def apply(body: js.Array[Statement], condition: Expression): RepeatStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RepeatStatement")
    __obj.asInstanceOf[RepeatStatement]
  }
  
  extension [Self <: RepeatStatement](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setCondition(value: Expression): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
