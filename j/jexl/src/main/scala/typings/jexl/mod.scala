package typings.jexl

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.jexl.anon.Instantiable
import typings.jexl.expressionMod.Context
import typings.jexl.expressionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jexl", JSImport.Namespace)
  @js.native
  val ^ : BuildableJexl = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jexl", "Jexl")
  @js.native
  class JexlCls ()
    extends StObject
       with Jexl
  
  type BinaryOpFunction = js.Function2[/* left */ js.Any, /* right */ js.Any, js.Any]
  
  /**
    * Jexl is the Javascript Expression Language, capable of parsing and
    * evaluating basic to complex expression strings, combined with advanced
    * xpath-like drilldown into native Javascript objects.
    */
  @js.native
  trait BuildableJexl
    extends StObject
       with Jexl {
    
    var Jexl: Instantiable = js.native
  }
  
  /**
    * Jexl is the Javascript Expression Language, capable of parsing and
    * evaluating basic to complex expression strings, combined with advanced
    * xpath-like drilldown into native Javascript objects.
    */
  @js.native
  trait Jexl extends StObject {
    
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
    def addBinaryOp(operator: String, precedence: Double, fn: BinaryOpFunction): Unit = js.native
    
    /**
      * Adds or replaces a transform function in this Jexl instance.
      * @param name The name of the transform function, as it will be used
      *      within Jexl expressions
      * @param fn The function to be executed when this transform is
      *      invoked. It will be provided with at least one argument:
      *          - {*} value: The value to be transformed
      *          - {...*} args: The arguments for this transform
      */
    def addTransform(name: String, fn: TransformFunction): Unit = js.native
    
    /**
      * Syntactic sugar for calling {@link #addTransform} repeatedly.  This function
      * accepts a map of one or more transform names to their transform function.
      * @param map A map of transform names to transform functions
      */
    def addTransforms(map: StringDictionary[TransformFunction]): Unit = js.native
    
    /**
      * Adds a unary operator to Jexl. Unary operators are currently only supported
      * on the left side of the value on which it will operate.
      * @param operator The operator string to be added
      * @param fn A function to run to calculate the result. The function
      *      will be called with one argument: the literal value to the right of the
      *      operator. It should return either the resulting value, or a Promise
      *      that resolves with the resulting value.
      */
    def addUnaryOp(operator: String, fn: UnaryOpFunction): Unit = js.native
    
    /**
      * Creates an Expression object from the given Jexl expression string, and
      * immediately compiles it. The returned Expression object can then be
      * evaluated multiple times with new contexts, without generating any
      * additional string processing overhead.
      * @param expression The Jexl expression to be compiled
      * @returns The compiled Expression object
      */
    def compile(expression: String): default = js.native
    
    /**
      * Constructs an Expression object from a Jexl expression string.
      * @param expression The Jexl expression to be wrapped in an
      *    Expression object
      * @returns The Expression object representing the given string
      */
    def createExpression(expression: String): default = js.native
    
    /**
      * Asynchronously evaluates a Jexl string within an optional context.
      * @param expression The Jexl expression to be evaluated
      * @param context A mapping of variables to values, which will be
      *      made accessible to the Jexl expression when evaluating it
      * @returns resolves with the result of the evaluation.
      */
    def eval(expression: String): js.Promise[js.Any] = js.native
    def eval(expression: String, context: Context): js.Promise[js.Any] = js.native
    
    /**
      * Synchronously evaluates a Jexl string within an optional context.
      * @param expression The Jexl expression to be evaluated
      * @param context A mapping of variables to values, which will be
      *      made accessible to the Jexl expression when evaluating it
      * @returns the result of the evaluation.
      * @throws on error
      */
    def evalSync(expression: String): js.Any = js.native
    def evalSync(expression: String, context: Context): js.Any = js.native
    
    /**
      * Retrieves a previously set transform function.
      * @param name The name of the transform function
      * @returns The transform function
      */
    def getTransform(name: String): TransformFunction = js.native
    
    /**
      * Removes a binary or unary operator from the Jexl grammar.
      * @param operator The operator string to be removed
      */
    def removeOp(operator: String): Unit = js.native
  }
  
  @js.native
  trait TransformFunction extends StObject {
    
    def apply(value: js.Any, args: js.Any*): js.Any = js.native
  }
  
  type UnaryOpFunction = js.Function1[/* right */ js.Any, js.Any]
  
  type _To = BuildableJexl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: BuildableJexl = ^
}
