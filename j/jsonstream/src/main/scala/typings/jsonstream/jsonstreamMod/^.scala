package typings.jsonstream.jsonstreamMod

import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonstream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(pattern: js.Any): ReadWriteStream = js.native
  def parse(patterns: js.Array[_]): ReadWriteStream = js.native
  def stringify(): ReadWriteStream = js.native
  def stringify(newlineOnly: NewlineOnlyIndicator): ReadWriteStream = js.native
  def stringify(open: String, sep: String, close: String): ReadWriteStream = js.native
  def stringifyObject(): ReadWriteStream = js.native
  def stringifyObject(open: String, sep: String, close: String): ReadWriteStream = js.native
}

