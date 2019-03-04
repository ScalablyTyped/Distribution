package typings
package mathjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Coefficients extends js.Object {
  var coefficients: js.Array[mathjsLib.mathjsMod.mathNs.MathType]
  var expression: mathjsLib.mathjsMod.mathNs.MathNode | java.lang.String
  var variables: js.Array[java.lang.String]
}

object Anon_Coefficients {
  @scala.inline
  def apply(
    coefficients: js.Array[mathjsLib.mathjsMod.mathNs.MathType],
    expression: mathjsLib.mathjsMod.mathNs.MathNode | java.lang.String,
    variables: js.Array[java.lang.String]
  ): Anon_Coefficients = {
    val __obj = js.Dynamic.literal(coefficients = coefficients, expression = expression.asInstanceOf[js.Any], variables = variables)
  
    __obj.asInstanceOf[Anon_Coefficients]
  }
}

