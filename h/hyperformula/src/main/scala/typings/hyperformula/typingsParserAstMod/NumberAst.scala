package typings.hyperformula.typingsParserAstMod

import typings.hyperformula.typingsParserAstMod.AstNodeType.NUMBER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var `type`: NUMBER
  
  var value: Double
}
object NumberAst {
  
  inline def apply(`type`: NUMBER, value: Double): NumberAst = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberAst] (val x: Self) extends AnyVal {
    
    inline def setType(value: NUMBER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
