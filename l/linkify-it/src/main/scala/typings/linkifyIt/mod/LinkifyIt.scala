package typings.linkifyIt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkifyIt extends js.Object {
  var re: StringDictionary[RegExp] = js.native
  def add(schema: String, rule: Rule): LinkifyIt = js.native
  def `match`(text: String): js.Array[Match] | Null = js.native
  def normalize(raw: String): String = js.native
  def pretest(text: String): Boolean = js.native
  def set(options: Options): LinkifyIt = js.native
  def test(text: String): Boolean = js.native
  def testSchemaAt(text: String, schemaName: String, pos: Double): Double = js.native
  def tlds(list: String): LinkifyIt = js.native
  def tlds(list: String, keepOld: Boolean): LinkifyIt = js.native
  def tlds(list: js.Array[String]): LinkifyIt = js.native
  def tlds(list: js.Array[String], keepOld: Boolean): LinkifyIt = js.native
}

