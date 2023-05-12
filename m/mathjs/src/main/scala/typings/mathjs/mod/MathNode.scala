package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MathNode extends StObject {
  
  /**
    * Create a deep clone of the node. Both the node as well as all its
    * childs are cloned recursively.
    */
  def cloneDeep(): this.type = js.native
  
  var comment: String = js.native
  
  /**
    * Compile an expression into optimized JavaScript code. compile returns
    * an object with a function evaluate([scope]) to evaluate. Example:
    */
  def compile(): EvalFunction = js.native
  
  /**
    * Test whether this node equals an other node. Does a deep comparison
    * of the values of both nodes.
    */
  def equals(other: MathNode): Boolean = js.native
  
  /**
    * Compile and eval an expression, this is the equivalent of doing
    * node.compile().evaluate(scope). Example:
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  def evaluate(): Any = js.native
  def evaluate(expr: Any): Any = js.native
  
  /**
    *
    * Filter nodes in an expression tree. The callback function is called
    * as callback(node: MathNode, path: string, parent: MathNode) : boolean
    * for every node in the tree, and must return a boolean. The function
    * filter returns an array with nodes for which the test returned true.
    * Parameter path is a string containing a relative JSON Path.
    *
    * Example:
    *
    * ```
    * var node = math.parse('x^2 + x/4 + 3*y');
    * var filtered = node.filter(function (node) {
    * return node.isSymbolMathNode && node.name == 'x';
    * });
    * // returns an array with two entries: two SymbolMathNodes 'x'
    * ```
    *
    * The callback function is called as callback(node: MathNode, path:
    * string, parent: MathNode) : boolean for every node in the tree, and
    * must return a boolean. The function filter returns an array with
    * nodes for which the test returned true. Parameter path is a string
    * containing a relative JSON Path.
    * @return Returns an array with nodes for which test returned true
    */
  def filter(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* node */ this.type, /* path */ String, /* parent */ this.type, Any]
  ): js.Array[MathNode] = js.native
  
  /**
    * [forEach description]
    */
  def forEach(
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
  callback: js.Function3[/* node */ this.type, /* path */ String, /* parent */ this.type, scala.Unit]
  ): scala.Unit = js.native
  
  var isNode: `true` = js.native
  
  var isUpdateNode: js.UndefOr[Boolean] = js.native
  
  /**
    * Transform a node. Creates a new MathNode having it’s child's be the
    * results of calling the provided callback function for each of the
    * child's of the original node. The callback function is called as
    * `callback(child: MathNode, path: string, parent: MathNode)` and must
    * return a MathNode. Parameter path is a string containing a relative
    * JSON Path.
    *
    *
    * See also transform, which is a recursive version of map.
    */
  def map(callback: js.Function3[/* node */ this.type, /* path */ String, /* parent */ this.type, this.type]): MathNode = js.native
  
  /**
    * Get a HTML representation of the parsed expression.
    */
  def toHTML(): String = js.native
  def toHTML(options: js.Object): String = js.native
  
  def toString(options: js.Object): String = js.native
  
  /**
    * Get a LaTeX representation of the expression.
    */
  def toTex(): String = js.native
  def toTex(options: js.Object): String = js.native
  
  /**
    * Recursively transform an expression tree via a transform function.
    * Similar to Array.map, but recursively executed on all nodes in the
    * expression tree. The callback function is a mapping function
    * accepting a node, and returning a replacement for the node or the
    * original node. Function callback is called as callback(node:
    * MathNode, path: string, parent: MathNode) for every node in the tree,
    * and must return a MathNode. Parameter path is a string containing a
    * relative JSON Path.
    *
    * For example, to replace all nodes of type SymbolMathNode having name
    * ‘x’ with a ConstantMathNode with value 3:
    * ```js
    * var node = math.parse('x^2 + 5*x');
    * var transformed = node.transform(function (node, path, parent) {
    *   if (node.SymbolMathNode && node.name == 'x') {
    *     return new math.expression.node.ConstantMathNode(3);
    *   }
    *   else {
    *     return node;
    *   }
    * });
    * transformed.toString(); // returns '(3 ^ 2) + (5 * 3)'
    * ```
    */
  def transform[TResult](callback: js.Function3[/* node */ this.type, /* path */ String, /* parent */ this.type, TResult]): TResult = js.native
  
  /**
    * `traverse(callback)`
    *
    * Recursively traverse all nodes in a node tree. Executes given
    * callback for this node and each of its child nodes. Similar to
    * Array.forEach, except recursive. The callback function is a mapping
    * function accepting a node, and returning a replacement for the node
    * or the original node. Function callback is called as callback(node:
    * MathNode, path: string, parent: MathNode) for every node in the tree.
    * Parameter path is a string containing a relative JSON Path. Example:
    *
    * ```
    * var node = math.parse('3 * x + 2');
    * node.traverse(function (node, path, parent) {
    * switch (node.type) {
    * case 'OperatorMathNode': console.log(node.type, node.op);    break;
    * case 'ConstantMathNode': console.log(node.type, node.value); break;
    * case 'SymbolMathNode':   console.log(node.type, node.name);  break;
    * default:             console.log(node.type);
    * }
    * });
    * // outputs:
    * //   OperatorMathNode +
    * //   OperatorMathNode *
    * //   ConstantMathNode 3
    * //   SymbolMathNode x
    * //   ConstantMathNode 2
    * ```
    */
  def traverse(
    callback: js.Function3[/* node */ this.type, /* path */ String, /* parent */ this.type, scala.Unit]
  ): scala.Unit = js.native
  
  var `type`: String = js.native
}
