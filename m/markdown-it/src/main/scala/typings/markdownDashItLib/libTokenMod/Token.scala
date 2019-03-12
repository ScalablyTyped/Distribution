package typings
package markdownDashItLib.libTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var attrs: js.Array[js.Array[java.lang.String]]
  var block: scala.Boolean
  var children: js.Array[Token]
  var content: java.lang.String
  var hidden: scala.Boolean
  var info: java.lang.String
  var level: scala.Double
  var map: js.Array[scala.Double]
  var markup: java.lang.String
  var meta: js.Any
  var nesting: scala.Double
  var tag: java.lang.String
  var `type`: java.lang.String
  def attrGet(name: java.lang.String): java.lang.String | scala.Null
  def attrIndex(name: java.lang.String): scala.Double
  def attrJoin(name: java.lang.String, value: java.lang.String): scala.Unit
  def attrPush(attrData: js.Array[java.lang.String]): scala.Unit
  def attrSet(name: java.lang.String, value: java.lang.String): scala.Unit
}

object Token {
  @scala.inline
  def apply(
    attrGet: java.lang.String => java.lang.String | scala.Null,
    attrIndex: java.lang.String => scala.Double,
    attrJoin: (java.lang.String, java.lang.String) => scala.Unit,
    attrPush: js.Array[java.lang.String] => scala.Unit,
    attrSet: (java.lang.String, java.lang.String) => scala.Unit,
    attrs: js.Array[js.Array[java.lang.String]],
    block: scala.Boolean,
    children: js.Array[Token],
    content: java.lang.String,
    hidden: scala.Boolean,
    info: java.lang.String,
    level: scala.Double,
    map: js.Array[scala.Double],
    markup: java.lang.String,
    meta: js.Any,
    nesting: scala.Double,
    tag: java.lang.String,
    `type`: java.lang.String
  ): Token = {
    val __obj = js.Dynamic.literal(attrGet = js.Any.fromFunction1(attrGet), attrIndex = js.Any.fromFunction1(attrIndex), attrJoin = js.Any.fromFunction2(attrJoin), attrPush = js.Any.fromFunction1(attrPush), attrSet = js.Any.fromFunction2(attrSet), attrs = attrs, block = block, children = children, content = content, hidden = hidden, info = info, level = level, map = map, markup = markup, meta = meta, nesting = nesting, tag = tag)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

