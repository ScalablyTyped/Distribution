package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.EMPTY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyArgAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: EMPTY
}
object EmptyArgAst {
  
  inline def apply(`type`: EMPTY): EmptyArgAst = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyArgAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyArgAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: EMPTY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
