package typings.markdownDashIt.libTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var attrs: js.Array[js.Array[String]]
  var block: Boolean
  var children: js.Array[Token]
  var content: String
  var hidden: Boolean
  var info: String
  var level: Double
  var map: js.Array[Double]
  var markup: String
  var meta: js.Any
  var nesting: Double
  var tag: String
  var `type`: String
  def attrGet(name: String): String | Null
  def attrIndex(name: String): Double
  def attrJoin(name: String, value: String): Unit
  def attrPush(attrData: js.Array[String]): Unit
  def attrSet(name: String, value: String): Unit
}

object Token {
  @scala.inline
  def apply(
    attrGet: String => String | Null,
    attrIndex: String => Double,
    attrJoin: (String, String) => Unit,
    attrPush: js.Array[String] => Unit,
    attrSet: (String, String) => Unit,
    attrs: js.Array[js.Array[String]],
    block: Boolean,
    children: js.Array[Token],
    content: String,
    hidden: Boolean,
    info: String,
    level: Double,
    map: js.Array[Double],
    markup: String,
    meta: js.Any,
    nesting: Double,
    tag: String,
    `type`: String
  ): Token = {
    val __obj = js.Dynamic.literal(attrGet = js.Any.fromFunction1(attrGet), attrIndex = js.Any.fromFunction1(attrIndex), attrJoin = js.Any.fromFunction2(attrJoin), attrPush = js.Any.fromFunction1(attrPush), attrSet = js.Any.fromFunction2(attrSet), attrs = attrs, block = block, children = children, content = content, hidden = hidden, info = info, level = level, map = map, markup = markup, meta = meta, nesting = nesting, tag = tag)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

