package typings.jsonstream.jsonstreamMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonstream", "stringify")
@js.native
object stringify extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(newlineOnly: NewlineOnlyIndicator): ReadWriteStream = js.native
  def apply(open: String, sep: String, close: String): ReadWriteStream = js.native
}

