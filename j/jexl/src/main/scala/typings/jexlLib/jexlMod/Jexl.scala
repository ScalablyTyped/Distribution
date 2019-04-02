package typings
package jexlLib.jexlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Jexl is the Javascript Expression Language, capable of parsing and
  * evaluating basic to complex expression strings, combined with advanced
  * xpath-like drilldown into native Javascript objects.
  */
@js.native
trait Jexl extends js.Object {
  /**
    * Adds a binary operator to Jexl at the specified precedence. The higher the
    * precedence, the earlier the operator is applied in the order of operations.
    * For example, * has a higher precedence than +, because multiplication comes
    * before division.
    *
    * Please see grammar.js for a listing of all default operators and their
    * precedence values in order to choose the appropriate precedence for the
    * new operator.
    * @param operator The operator string to be added
    * @param precedence The operator's precedence
    * @param fn A function to run to calculate the result. The function
    *      will be called with two arguments: left and right, denoting the values
    *      on either side of the operator. It should return either the resulting
    *      value, or a Promise that resolves with the resulting value.
    */
  def addBinaryOp(operator: java.lang.String, precedence: scala.Double, fn: jexlLib.BinaryOpFunction): scala.Unit = js.native
  /**
    * Adds or replaces a transform function in this Jexl instance.
    * @param name The name of the transform function, as it will be used
    *      within Jexl expressions
    * @param fn The function to be executed when this transform is
    *      invoked. It will be provided with at least one argument:
    *          - {*} value: The value to be transformed
    *          - {...*} args: The arguments for this transform
    */
  def addTransform(name: java.lang.String, fn: jexlLib.TransformFunction): scala.Unit = js.native
  /**
    * Syntactic sugar for calling {@link #addTransform} repeatedly.  This function
    * accepts a map of one or more transform names to their transform function.
    * @param map A map of transform names to transform functions
    */
  def addTransforms(map: org.scalablytyped.runtime.StringDictionary[jexlLib.TransformFunction]): scala.Unit = js.native
  /**
    * Adds a unary operator to Jexl. Unary operators are currently only supported
    * on the left side of the value on which it will operate.
    * @param operator The operator string to be added
    * @param fn A function to run to calculate the result. The function
    *      will be called with one argument: the literal value to the right of the
    *      operator. It should return either the resulting value, or a Promise
    *      that resolves with the resulting value.
    */
  def addUnaryOp(operator: java.lang.String, fn: jexlLib.UnaryOpFunction): scala.Unit = js.native
  /**
    * Asynchronously evaluates a Jexl string within an optional context.
    * @param expression The Jexl expression to be evaluated
    * @param [context] A mapping of variables to values, which will be
    *      made accessible to the Jexl expression when evaluating it
    * @returns resolves with the result of the evaluation.
    */
  def eval(expression: java.lang.String): js.Promise[_] = js.native
  def eval(expression: java.lang.String, context: js.Object): js.Promise[_] = js.native
  /**
    * Synchronously evaluates a Jexl string within an optional context.
    * @param expression The Jexl expression to be evaluated
    * @param [context] A mapping of variables to values, which will be
    *      made accessible to the Jexl expression when evaluating it
    * @returns the result of the evaluation.
    * @throws on error
    */
  def evalSync(expression: java.lang.String): js.Any = js.native
  def evalSync(expression: java.lang.String, context: js.Object): js.Any = js.native
  /**
    * Retrieves a previously set transform function.
    * @param name The name of the transform function
    * @returns The transform function
    */
  def getTransform(name: java.lang.String): jexlLib.TransformFunction = js.native
}

