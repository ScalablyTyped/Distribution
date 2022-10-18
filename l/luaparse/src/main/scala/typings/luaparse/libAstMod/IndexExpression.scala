package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.IndexExpression]
     with Expression {
  
  var base: Expression
  
  var index: Expression
}
object IndexExpression {
  
  inline def apply(base: Expression, index: Expression): IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexExpression")
    __obj.asInstanceOf[IndexExpression]
  }
  
  extension [Self <: IndexExpression](x: Self) {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Expression): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
