package typings.maplibreMaplibreGlStyleSpec.mod

import typings.maplibreMaplibreGlStyleSpec.anon.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsingContext extends StObject {
  
  /**
  	 * Internal delegate to inConstant function to avoid circular dependency to CompoundExpression
  	 */
  /* private */ var _isConstant: Any = js.native
  
  def _parse(expr: Any, options: TypeAnnotation): Expression_ = js.native
  
  /**
  	 * Returns null if `t` is a subtype of `expected`; otherwise returns an
  	 * error message and also pushes it to `this.errors`.
  	 * @param expected The expected type
  	 * @param t The actual type
  	 * @returns null if `t` is a subtype of `expected`; otherwise returns an error message
  	 */
  def checkSubtype(expected: Type, t: Type): String = js.native
  
  /**
  	 * Returns a copy of this context suitable for parsing the subexpression at
  	 * index `index`, optionally appending to 'let' binding map.
  	 *
  	 * Note that `errors` property, intended for collecting errors while
  	 * parsing, is copied by reference rather than cloned.
  	 * @private
  	 */
  def concat(index: Double): ParsingContext = js.native
  def concat(index: Double, expectedType: Null, bindings: js.Array[js.Tuple2[String, Expression_]]): ParsingContext = js.native
  def concat(index: Double, expectedType: Unit, bindings: js.Array[js.Tuple2[String, Expression_]]): ParsingContext = js.native
  def concat(index: Double, expectedType: Type): ParsingContext = js.native
  def concat(index: Double, expectedType: Type, bindings: js.Array[js.Tuple2[String, Expression_]]): ParsingContext = js.native
  
  /**
  	 * Push a parsing (or type checking) error into the `this.errors`
  	 * @param error The message
  	 * @param keys Optionally specify the source of the error at a child
  	 * of the current expression at `this.key`.
  	 * @private
  	 */
  def error(error: String, keys: Double*): Unit = js.native
  
  var errors: js.Array[ExpressionParsingError] = js.native
  
  var expectedType: Type = js.native
  
  var key: String = js.native
  
  /**
  	 * @param expr the JSON expression to parse
  	 * @param index the optional argument index if this expression is an argument of a parent expression that's being parsed
  	 * @param options
  	 * @param options.omitTypeAnnotations set true to omit inferred type annotations.  Caller beware: with this option set, the parsed expression's type will NOT satisfy `expectedType` if it would normally be wrapped in an inferred annotation.
  	 * @private
  	 */
  def parse(expr: Any): Expression_ = js.native
  def parse(expr: Any, index: Double): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Null, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Double,
    expectedType: Null,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Null, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Unit, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Double,
    expectedType: Unit,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Unit, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Type): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Type, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Double,
    expectedType: Type,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Double, expectedType: Type, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Null, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Unit,
    expectedType: Null,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Null, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Unit, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Unit,
    expectedType: Unit,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Unit, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Type): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Type, bindings: js.Array[js.Tuple2[String, Expression_]]): Expression_ = js.native
  def parse(
    expr: Any,
    index: Unit,
    expectedType: Type,
    bindings: js.Array[js.Tuple2[String, Expression_]],
    options: TypeAnnotation
  ): Expression_ = js.native
  def parse(expr: Any, index: Unit, expectedType: Type, bindings: Unit, options: TypeAnnotation): Expression_ = js.native
  
  var path: js.Array[Double] = js.native
  
  var registry: ExpressionRegistry = js.native
  
  var scope: Scope = js.native
}
