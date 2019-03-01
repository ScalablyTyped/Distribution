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
    arrayReplaceAt: js.Function3[js.Array[_], scala.Double, js.Array[_], js.Array[_]],
    assign: js.Function1[js.Any, js.Any],
    escapeHtml: js.Function1[java.lang.String, java.lang.String],
    escapeRE: js.Function1[java.lang.String, java.lang.String],
    fromCodePoint: js.Function1[java.lang.String, java.lang.String],
    has: js.Function2[js.Any, java.lang.String, scala.Boolean],
    isMdAsciiPunct: js.Function1[js.Any, scala.Boolean],
    isPunctChar: js.Function1[js.Any, scala.Boolean],
    isSpace: js.Function1[js.Any, scala.Boolean],
    isString: js.Function1[js.Any, scala.Boolean],
    isValidEntityCode: js.Function1[js.Any, scala.Boolean],
    isWhiteSpace: js.Function1[js.Any, scala.Boolean],
    normalizeReference: js.Function1[java.lang.String, java.lang.String],
    unescapeAll: js.Function1[java.lang.String, java.lang.String],
    unescapeMd: js.Function1[java.lang.String, java.lang.String]
  ): Anon_ArrayReplaceAt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrayReplaceAt")(arrayReplaceAt)
    __obj.updateDynamic("assign")(assign)
    __obj.updateDynamic("escapeHtml")(escapeHtml)
    __obj.updateDynamic("escapeRE")(escapeRE)
    __obj.updateDynamic("fromCodePoint")(fromCodePoint)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("isMdAsciiPunct")(isMdAsciiPunct)
    __obj.updateDynamic("isPunctChar")(isPunctChar)
    __obj.updateDynamic("isSpace")(isSpace)
    __obj.updateDynamic("isString")(isString)
    __obj.updateDynamic("isValidEntityCode")(isValidEntityCode)
    __obj.updateDynamic("isWhiteSpace")(isWhiteSpace)
    __obj.updateDynamic("normalizeReference")(normalizeReference)
    __obj.updateDynamic("unescapeAll")(unescapeAll)
    __obj.updateDynamic("unescapeMd")(unescapeMd)
    __obj.asInstanceOf[Anon_ArrayReplaceAt]
  }
}

