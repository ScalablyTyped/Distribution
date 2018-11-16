package typings
package jsonstreamLib.jsonstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonstream", JSImport.Namespace)
@js.native
object jsonstreamModMembers extends js.Object {
  def parse(pattern: js.Any): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def parse(patterns: js.Array[_]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringify(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringify(newlineOnly: jsonstreamLib.NewlineOnlyIndicator): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringify(open: java.lang.String, sep: java.lang.String, close: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringifyObject(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def stringifyObject(open: java.lang.String, sep: java.lang.String, close: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

