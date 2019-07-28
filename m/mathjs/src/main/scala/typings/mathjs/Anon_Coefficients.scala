package typings.mathjs

import typings.mathjs.mathjsMod.MathNode
import typings.mathjs.mathjsMod.MathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coefficients extends js.Object {
  var coefficients: js.Array[MathType]
  var expression: MathNode | String
  var variables: js.Array[String]
}

object Anon_Coefficients {
  @scala.inline
  def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Anon_Coefficients = {
    val __obj = js.Dynamic.literal(coefficients = coefficients, expression = expression.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[Anon_Coefficients]
  }
}

