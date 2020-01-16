package typings.atHapiFormula.atHapiFormulaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/formula", "Parser")
@js.native
class Parser[T /* <: String | Double */] protected () extends js.Object {
  /**
    * Create a new formula parser.
    * 
    * @param formula - the formula string to parse.
    * @param options - optional settings.
    */
  def this(formula: String) = this()
  def this(formula: String, options: Options) = this()
  /**
    * Evaluate the formula.
    * 
    * @param context - optional object with runtime formula context used to resolve variables.
    * 
    * @returns the string or number outcome of the resolved formula.
    */
  def evaluate(): T = js.native
  def evaluate(context: js.Any): T = js.native
}

