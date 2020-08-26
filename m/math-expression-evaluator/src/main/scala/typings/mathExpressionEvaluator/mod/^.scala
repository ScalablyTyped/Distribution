package typings.mathExpressionEvaluator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("math-expression-evaluator", JSImport.Namespace)
@js.native
class ^ () extends Mexp

@JSImport("math-expression-evaluator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addToken(tokens: js.Array[Token]): Unit = js.native
  def eval(exp: String): String = js.native
  def eval(exp: String, mexp: js.Object): String = js.native
  def eval(exp: String, tokens: js.UndefOr[scala.Nothing], pair: js.Object): String = js.native
  def eval(exp: String, tokens: js.Array[Token]): String = js.native
  def eval(exp: String, tokens: js.Array[Token], pair: js.Object): String = js.native
  def lex(inp: String): Mexp = js.native
  def lex(inp: String, tokens: js.Array[Token]): Mexp = js.native
}

