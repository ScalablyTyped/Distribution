package typings.mathjs.anon

import typings.mathjs.mod.MathNode
import typings.mathjs.mod.MathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coefficients extends js.Object {
  
  var coefficients: js.Array[MathType] = js.native
  
  var expression: MathNode | String = js.native
  
  var variables: js.Array[String] = js.native
}
object Coefficients {
  
  @scala.inline
  def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Coefficients = {
    val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coefficients]
  }
  
  @scala.inline
  implicit class CoefficientsOps[Self <: Coefficients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoefficientsVarargs(value: MathType*): Self = this.set("coefficients", js.Array(value :_*))
    
    @scala.inline
    def setCoefficients(value: js.Array[MathType]): Self = this.set("coefficients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: MathNode | String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: String*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: js.Array[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
