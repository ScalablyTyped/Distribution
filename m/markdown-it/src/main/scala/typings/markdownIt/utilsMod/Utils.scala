package typings.markdownIt.utilsMod

import typings.markdownIt.AnonMdurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// import ucmicro from 'uc.micro';
trait Utils extends js.Object {
  var lib: AnonMdurl
  /**
    * Remove element from array and put another array at those position.
    * Useful for some operations with tokens.
    * Return a new array.
    */
  def arrayReplaceAt[T](src: js.Array[T], pos: Double, newElements: js.Array[T]): js.Array[T]
  /**
    * Merge objects
    */
  def assign(target: js.Any, sources: js.Any*): js.Any
  def escapeHtml(str: String): String
  def escapeRE(str: String): String
  def fromCodePoint(code: Double): String
  /**
    * has own property
    */
  def has(obj: js.Any, key: /* keyof any */ String): Boolean
  /**
    * Markdown ASCII punctuation characters.
    *
    * !, ", #, $, %, &, ', (, ), *, +, ,, -, ., /, :, ;, <, =, >, ?, @, [, \, ], ^, _, `, {, |, }, or ~
    * http://spec.commonmark.org/0.15/#ascii-punctuation-character
    *
    * Don't confuse with unicode punctuation !!! It lacks some chars in ascii range.
    */
  def isMdAsciiPunct(code: Double): Boolean
  /**
    * Currently without astral characters support.
    */
  def isPunctChar(ch: String): Boolean
  def isSpace(code: Double): Boolean
  /**
    * Check if the type is string or not
    */
  def isString(obj: js.Any): /* is string */ Boolean
  def isValidEntityCode(code: Double): Boolean
  /**
    * Zs (unicode class) || [\t\f\v\r\n]
    */
  def isWhiteSpace(code: Double): Boolean
  /**
    * Hepler to unify [reference labels].
    */
  def normalizeReference(str: String): String
  def unescapeAll(str: String): String
  def unescapeMd(str: String): String
}

object Utils {
  @scala.inline
  def apply(
    arrayReplaceAt: (js.Array[js.Any], Double, js.Array[js.Any]) => js.Array[js.Any],
    assign: (js.Any, /* repeated */ js.Any) => js.Any,
    escapeHtml: String => String,
    escapeRE: String => String,
    fromCodePoint: Double => String,
    has: (js.Any, /* keyof any */ String) => Boolean,
    isMdAsciiPunct: Double => Boolean,
    isPunctChar: String => Boolean,
    isSpace: Double => Boolean,
    isString: js.Any => /* is string */ Boolean,
    isValidEntityCode: Double => Boolean,
    isWhiteSpace: Double => Boolean,
    lib: AnonMdurl,
    normalizeReference: String => String,
    unescapeAll: String => String,
    unescapeMd: String => String
  ): Utils = {
    val __obj = js.Dynamic.literal(arrayReplaceAt = js.Any.fromFunction3(arrayReplaceAt), assign = js.Any.fromFunction2(assign), escapeHtml = js.Any.fromFunction1(escapeHtml), escapeRE = js.Any.fromFunction1(escapeRE), fromCodePoint = js.Any.fromFunction1(fromCodePoint), has = js.Any.fromFunction2(has), isMdAsciiPunct = js.Any.fromFunction1(isMdAsciiPunct), isPunctChar = js.Any.fromFunction1(isPunctChar), isSpace = js.Any.fromFunction1(isSpace), isString = js.Any.fromFunction1(isString), isValidEntityCode = js.Any.fromFunction1(isValidEntityCode), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace), lib = lib.asInstanceOf[js.Any], normalizeReference = js.Any.fromFunction1(normalizeReference), unescapeAll = js.Any.fromFunction1(unescapeAll), unescapeMd = js.Any.fromFunction1(unescapeMd))
    __obj.asInstanceOf[Utils]
  }
}

