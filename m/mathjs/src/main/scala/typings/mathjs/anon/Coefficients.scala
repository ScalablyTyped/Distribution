package typings.mathjs.anon

import typings.mathjs.mod.MathNode
import typings.mathjs.mod.MathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coefficients extends js.Object {
  var coefficients: js.Array[MathType]
  var expression: MathNode | String
  var variables: js.Array[String]
}

object Coefficients {
  @scala.inline
  def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Coefficients = {
    val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coefficients]
  }
}

