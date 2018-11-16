package typings
package linkifyDashItLib.linkifyDashItMod.LinkifyItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkifyIt extends js.Object {
  def add(schema: java.lang.String, rule: Rule): LinkifyIt = js.native
  def `match`(text: java.lang.String): js.Array[Match] | scala.Null = js.native
  def normalize(raw: java.lang.String): java.lang.String = js.native
  def pretest(text: java.lang.String): scala.Boolean = js.native
  def set(options: Options): LinkifyIt = js.native
  def test(text: java.lang.String): scala.Boolean = js.native
  def testSchemaAt(text: java.lang.String, schemaName: java.lang.String, pos: scala.Double): scala.Double = js.native
  def tlds(list: java.lang.String): LinkifyIt = js.native
  def tlds(list: java.lang.String, keepOld: scala.Boolean): LinkifyIt = js.native
  def tlds(list: js.Array[java.lang.String]): LinkifyIt = js.native
  def tlds(list: js.Array[java.lang.String], keepOld: scala.Boolean): LinkifyIt = js.native
}

