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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attrGet")(attrGet)
    __obj.updateDynamic("attrIndex")(attrIndex)
    __obj.updateDynamic("attrJoin")(attrJoin)
    __obj.updateDynamic("attrPush")(attrPush)
    __obj.updateDynamic("attrSet")(attrSet)
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("markup")(markup)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("nesting")(nesting)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Token]
  }
}

