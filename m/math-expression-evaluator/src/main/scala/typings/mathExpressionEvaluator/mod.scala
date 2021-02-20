package typings.mathExpressionEvaluator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("math-expression-evaluator", JSImport.Namespace)
  @js.native
  class ^ () extends Mexp
  
  /* static member */
  @JSImport("math-expression-evaluator", "addToken")
  @js.native
  def addToken(tokens: js.Array[Token]): Unit = js.native
  
  /* static member */
  @JSImport("math-expression-evaluator", "eval")
  @js.native
  def eval(exp: String): String = js.native
  @JSImport("math-expression-evaluator", "eval")
  @js.native
  def eval(exp: String, mexp: js.Object): String = js.native
  @JSImport("math-expression-evaluator", "eval")
  @js.native
  def eval(exp: String, tokens: js.UndefOr[scala.Nothing], pair: js.Object): String = js.native
  @JSImport("math-expression-evaluator", "eval")
  @js.native
  def eval(exp: String, tokens: js.Array[Token]): String = js.native
  @JSImport("math-expression-evaluator", "eval")
  @js.native
  def eval(exp: String, tokens: js.Array[Token], pair: js.Object): String = js.native
  
  /* static member */
  @JSImport("math-expression-evaluator", "lex")
  @js.native
  def lex(inp: String): Mexp = js.native
  @JSImport("math-expression-evaluator", "lex")
  @js.native
  def lex(inp: String, tokens: js.Array[Token]): Mexp = js.native
  
  @js.native
  trait Mexp extends StObject {
    
    def formulaEval(): Mexp = js.native
    
    def postfixEval(): Double | String = js.native
    def postfixEval(pair: js.Object): Double | String = js.native
    
    def toPostfix(): Mexp = js.native
  }
  
  @js.native
  trait Token extends StObject {
    
    var preced: js.UndefOr[Double] = js.native
    
    var show: String = js.native
    
    var token: String = js.native
    
    var `type`: Double = js.native
    
    var value: js.UndefOr[String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])] = js.native
  }
  object Token {
    
    @scala.inline
    def apply(show: String, token: String, `type`: Double): Token = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreced(value: Double): Self = StObject.set(x, "preced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecedUndefined: Self = StObject.set(x, "preced", js.undefined)
      
      @scala.inline
      def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFunction2(value: (/* a */ Double, /* b */ js.UndefOr[Double]) => Double): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
