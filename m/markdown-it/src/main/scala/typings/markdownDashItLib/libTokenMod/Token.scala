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

