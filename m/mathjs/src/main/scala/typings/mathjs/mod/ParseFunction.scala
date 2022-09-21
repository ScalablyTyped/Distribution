package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parse an expression. Returns a node tree, which can be evaluated by
  * invoking node.evaluate().
  *
  * Note the evaluating arbitrary expressions may involve security risks,
  * see [https://mathjs.org/docs/expressions/security.html](https://mathjs.org/docs/expressions/security.html) for more information.
  *
  * Syntax:
  *
  *     math.parse(expr)
  *     math.parse(expr, options)
  *     math.parse([expr1, expr2, expr3, ...])
  *     math.parse([expr1, expr2, expr3, ...], options)
  *
  * Example:
  *
  *     const node1 = math.parse('sqrt(3^2 + 4^2)')
  *     node1.compile().evaluate() // 5
  *
  *     let scope = {a:3, b:4}
  *     const node2 = math.parse('a * b') // 12
  *     const code2 = node2.compile()
  *     code2.evaluate(scope) // 12
  *     scope.a = 5
  *     code2.evaluate(scope) // 20
  *
  *     const nodes = math.parse(['a = 3', 'b = 4', 'a * b'])
  *     nodes[2].compile().evaluate() // 12
  *
  * See also:
  *
  *     evaluate, compile
  */
@js.native
trait ParseFunction extends StObject {
  
  /**
    * Parse an expression. Returns a node tree, which can be evaluated by
    * invoking node.evaluate();
    *
    * @param exprs Expressions to be parsed
    * @param options Available options
    * @returns An array of nodes
    */
  def apply(exprs: js.Array[MathExpression]): js.Array[MathNode] = js.native
  def apply(exprs: js.Array[MathExpression], options: ParseOptions): js.Array[MathNode] = js.native
  /**
    * Parse an expression. Returns a node tree, which can be evaluated by
    * invoking node.evaluate();
    *
    * @param expr Expression to be parsed
    * @param options Available options
    * @returns A node
    */
  def apply(expr: MathExpression): MathNode = js.native
  def apply(expr: MathExpression, options: ParseOptions): MathNode = js.native
  
  /**
    * Checks whether the current character `c` is a valid alpha character:
    *
    * - A latin letter (upper or lower case) Ascii: a-z, A-Z
    * - An underscore                        Ascii: _
    * - A dollar sign                        Ascii: $
    * - A latin letter with accents          Unicode: \\u00C0 - \\u02AF
    * - A greek letter                       Unicode: \\u0370 - \\u03FF
    * - A mathematical alphanumeric symbol   Unicode: \\u{1D400} - \\u{1D7FF} excluding invalid code points
    *
    * The previous and next characters are needed to determine whether
    * this character is part of a unicode surrogate pair.
    *
    * @param c      Current character in the expression
    * @param cPrev  Previous character
    * @param cNext  Next character
    */
  def isAlpha(c: String, cPrev: String, cNext: String): Boolean = js.native
  
  /**
    * Test whether the character c is a decimal mark (dot).
    * This is the case when it's not the start of a delimiter '.*', './', or '.^'
    *
    * @param  c
    * @param  cNext
    */
  def isDecimalMark(c: String, cNext: String): Boolean = js.native
  
  /**
    * checks if the given char c is a digit
    *
    * @param  c   a string with one character
    */
  def isDigit(c: String): Boolean = js.native
  
  /**
    * checks if the given char c is a digit or dot
    *
    * @param  c   a string with one character
    */
  def isDigitDot(c: String): Boolean = js.native
  
  /**
    * checks if the given char c is a hex digit
    *
    * @param c   a string with one character
    */
  def isHexDigit(c: String): Boolean = js.native
  
  /**
    * Test whether a character is a valid latin, greek, or letter-like character
    *
    * @param c
    */
  def isValidLatinOrGreek(c: String): Boolean = js.native
  
  /**
    * Test whether two given 16 bit characters form a surrogate pair of a
    * unicode math symbol.
    *
    * https://unicode-table.com/en/
    * https://www.wikiwand.com/en/Mathematical_operators_and_symbols_in_Unicode
    *
    * Note: In ES6 will be unicode aware:
    * https://stackoverflow.com/questions/280712/javascript-unicode-regexes
    * https://mathiasbynens.be/notes/es6-unicode-regex
    *
    * @param high
    * @param low
    */
  def isValidMathSymbol(high: String, low: String): Boolean = js.native
  
  /**
    * Check whether given character c is a white space character: space, tab, or enter
    *
    * @param c
    * @param nestingLevel
    */
  def isWhitespace(c: String, nestingLevel: Double): Boolean = js.native
}
