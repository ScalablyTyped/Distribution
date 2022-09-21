package typings.jexl.anon

import typings.jexl.astMod.Ast
import typings.jexl.jexlStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternate
  extends StObject
     with Ast {
  
  var alternate: Ast
  
  var consequent: Ast
  
  var test: Ast
  
  var `type`: ConditionalExpression
}
object Alternate {
  
  inline def apply(alternate: Ast, consequent: Ast, test: Ast): Alternate = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[Alternate]
  }
  
  extension [Self <: Alternate](x: Self) {
    
    inline def setAlternate(value: Ast): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: Ast): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Ast): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
