package typings.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrayReplaceAt extends js.Object {
  def arrayReplaceAt(src: js.Array[_], pos: Double, newElements: js.Array[_]): js.Array[_]
  def assign(obj: js.Any): js.Any
  def escapeHtml(str: String): String
  def escapeRE(str: String): String
  def fromCodePoint(str: String): String
  def has(`object`: js.Any, key: String): Boolean
  def isMdAsciiPunct(str: js.Any): Boolean
  def isPunctChar(str: js.Any): Boolean
  def isSpace(str: js.Any): Boolean
  def isString(obj: js.Any): Boolean
  def isValidEntityCode(str: js.Any): Boolean
  def isWhiteSpace(str: js.Any): Boolean
  def normalizeReference(str: String): String
  def unescapeAll(str: String): String
  def unescapeMd(str: String): String
}

object AnonArrayReplaceAt {
  @scala.inline
  def apply(
    arrayReplaceAt: (js.Array[_], Double, js.Array[_]) => js.Array[_],
    assign: js.Any => js.Any,
    escapeHtml: String => String,
    escapeRE: String => String,
    fromCodePoint: String => String,
    has: (js.Any, String) => Boolean,
    isMdAsciiPunct: js.Any => Boolean,
    isPunctChar: js.Any => Boolean,
    isSpace: js.Any => Boolean,
    isString: js.Any => Boolean,
    isValidEntityCode: js.Any => Boolean,
    isWhiteSpace: js.Any => Boolean,
    normalizeReference: String => String,
    unescapeAll: String => String,
    unescapeMd: String => String
  ): AnonArrayReplaceAt = {
    val __obj = js.Dynamic.literal(arrayReplaceAt = js.Any.fromFunction3(arrayReplaceAt), assign = js.Any.fromFunction1(assign), escapeHtml = js.Any.fromFunction1(escapeHtml), escapeRE = js.Any.fromFunction1(escapeRE), fromCodePoint = js.Any.fromFunction1(fromCodePoint), has = js.Any.fromFunction2(has), isMdAsciiPunct = js.Any.fromFunction1(isMdAsciiPunct), isPunctChar = js.Any.fromFunction1(isPunctChar), isSpace = js.Any.fromFunction1(isSpace), isString = js.Any.fromFunction1(isString), isValidEntityCode = js.Any.fromFunction1(isValidEntityCode), isWhiteSpace = js.Any.fromFunction1(isWhiteSpace), normalizeReference = js.Any.fromFunction1(normalizeReference), unescapeAll = js.Any.fromFunction1(unescapeAll), unescapeMd = js.Any.fromFunction1(unescapeMd))
  
    __obj.asInstanceOf[AnonArrayReplaceAt]
  }
}

