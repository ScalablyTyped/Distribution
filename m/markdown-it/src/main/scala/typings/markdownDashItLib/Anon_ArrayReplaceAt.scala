package typings
package markdownDashItLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayReplaceAt extends js.Object {
  def arrayReplaceAt(src: js.Array[_], pos: scala.Double, newElements: js.Array[_]): js.Array[_]
  def assign(obj: js.Any): js.Any
  def escapeHtml(str: java.lang.String): java.lang.String
  def escapeRE(str: java.lang.String): java.lang.String
  def fromCodePoint(str: java.lang.String): java.lang.String
  def has(`object`: js.Any, key: java.lang.String): scala.Boolean
  def isMdAsciiPunct(str: js.Any): scala.Boolean
  def isPunctChar(str: js.Any): scala.Boolean
  def isSpace(str: js.Any): scala.Boolean
  def isString(obj: js.Any): scala.Boolean
  def isValidEntityCode(str: js.Any): scala.Boolean
  def isWhiteSpace(str: js.Any): scala.Boolean
  def normalizeReference(str: java.lang.String): java.lang.String
  def unescapeAll(str: java.lang.String): java.lang.String
  def unescapeMd(str: java.lang.String): java.lang.String
}

object Anon_ArrayReplaceAt {
  @scala.inline
  def apply(
    arrayReplaceAt: (js.Array[_], scala.Double, js.Array[_]) => js.Array[_],
    assign: js.Any => js.Any,
    escapeHtml: java.lang.String => java.lang.String,
    escapeRE: java.lang.String => java.lang.String,
    fromCodePoint: java.lang.String => java.lang.String,
    has: (js.Any, java.lang.String) => scala.Boolean,
    isMdAsciiPunct: js.Any => scala.Boolean,
    isPunctChar: js.Any => scala.Boolean,
    isSpace: js.Any => scala.Boolean,
    isString: js.Any => scala.Boolean,
    isValidEntityCode: js.Any => scala.Boolean,
    isWhiteSpace: js.Any => scala.Boolean,
    normalizeReference: java.lang.String => java.lang.String,
    unescapeAll: java.lang.String => java.lang.String,
    unescapeMd: java.lang.String => java.lang.String
  ): Anon_ArrayReplaceAt = {
    val __obj = js.Dynamic.literal(arrayReplaceAt = js.Any.fromFunction3(arrayReplaceAt), assign = js.Any.fromFunction1(assign), escapeHtml = js.Any.fromFunction1(escapeHtml), escapeRE = js.Any.fromFunction1(escapeRE), fromCodePoint = js.Any.fromFunction1(fromCodePoint), has = js.Any.fromFunction2(has), isMdAsciiPunct = js.Any.fromFunction1(isMdAsciiPunct), isPunctChar = js.Any.fromFunction1(isPunctChar), isSpace = js.Any.fromFunction1(isSpace), isString = js.Any.fromFunction1(isString), isValidEntityCode = js.Any.fromFunction1(isValidEntityCode), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace), normalizeReference = js.Any.fromFunction1(normalizeReference), unescapeAll = js.Any.fromFunction1(unescapeAll), unescapeMd = js.Any.fromFunction1(unescapeMd))
  
    __obj.asInstanceOf[Anon_ArrayReplaceAt]
  }
}

