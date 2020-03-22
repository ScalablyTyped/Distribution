package typings.mathExpressionEvaluator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mexp extends js.Object {
  def formulaEval(): Mexp = js.native
  def postfixEval(): Double | String = js.native
  def postfixEval(pair: js.Object): Double | String = js.native
  def toPostfix(): Mexp = js.native
}

