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
    attrGet: js.Function1[java.lang.String, java.lang.String | scala.Null],
    attrIndex: js.Function1[java.lang.String, scala.Double],
    attrJoin: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    attrPush: js.Function1[js.Array[java.lang.String], scala.Unit],
    attrSet: js.Function2[java.lang.String, java.lang.String, scala.Unit],
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
    val __obj = js.Dynamic.literal(attrGet = attrGet, attrIndex = attrIndex, attrJoin = attrJoin, attrPush = attrPush, attrSet = attrSet, attrs = attrs, block = block, children = children, content = content, hidden = hidden, info = info, level = level, map = map, markup = markup, meta = meta, nesting = nesting, tag = tag)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Token]
  }
}

