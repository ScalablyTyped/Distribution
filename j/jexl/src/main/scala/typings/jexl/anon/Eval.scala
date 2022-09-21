package typings.jexl.anon

import typings.jexl.grammarMod.Element
import typings.jexl.jexlStrings.binaryOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eval
  extends StObject
     with Element {
  
  var eval: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var evalOnDemand: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var precedence: Double
  
  var `type`: binaryOp
}
object Eval {
  
  inline def apply(precedence: Double): Eval = {
    val __obj = js.Dynamic.literal(precedence = precedence.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("binaryOp")
    __obj.asInstanceOf[Eval]
  }
  
  extension [Self <: Eval](x: Self) {
    
    inline def setEval(value: /* repeated */ Any => Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
    
    inline def setEvalOnDemand(value: /* repeated */ Any => Any): Self = StObject.set(x, "evalOnDemand", js.Any.fromFunction1(value))
    
    inline def setEvalOnDemandUndefined: Self = StObject.set(x, "evalOnDemand", js.undefined)
    
    inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
    
    inline def setPrecedence(value: Double): Self = StObject.set(x, "precedence", value.asInstanceOf[js.Any])
    
    inline def setType(value: binaryOp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
