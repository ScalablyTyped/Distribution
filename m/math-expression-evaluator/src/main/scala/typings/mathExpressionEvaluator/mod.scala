package typings.mathExpressionEvaluator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("math-expression-evaluator", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Mexp
  @JSImport("math-expression-evaluator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def addToken(tokens: js.Array[Token]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addToken")(tokens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def eval(exp: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def eval(exp: String, mexp: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], mexp.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def eval(exp: String, tokens: js.Array[Token]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def eval(exp: String, tokens: js.Array[Token], pair: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], pair.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def eval(exp: String, tokens: Unit, pair: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(exp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], pair.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def lex(inp: String): Mexp = ^.asInstanceOf[js.Dynamic].applyDynamic("lex")(inp.asInstanceOf[js.Any]).asInstanceOf[Mexp]
  @scala.inline
  def lex(inp: String, tokens: js.Array[Token]): Mexp = (^.asInstanceOf[js.Dynamic].applyDynamic("lex")(inp.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Mexp]
  
  @js.native
  trait Mexp extends StObject {
    
    def formulaEval(): Mexp = js.native
    
    def postfixEval(): Double | String = js.native
    def postfixEval(pair: js.Object): Double | String = js.native
    
    def toPostfix(): Mexp = js.native
  }
  
  trait Token extends StObject {
    
    var preced: js.UndefOr[Double] = js.undefined
    
    var show: String
    
    var token: String
    
    var `type`: Double
    
    var value: js.UndefOr[String | (js.Function2[/* a */ Double, /* b */ js.UndefOr[Double], Double])] = js.undefined
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
