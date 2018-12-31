package typings
package isDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-stream", JSImport.Namespace)
@js.native
object isDashStreamMod extends js.Object {
  def apply(maybeStream: js.Any): /* is node.stream.Stream */ scala.Boolean = js.native
  def duplex(maybeDuplex: js.Any): /* is node.stream.Duplex */ scala.Boolean = js.native
  def readable(maybeReadable: js.Any): /* is node.stream.Readable */ scala.Boolean = js.native
  def transform(maybeTransform: js.Any): /* is node.stream.Transform */ scala.Boolean = js.native
  def writable(maybeWritable: js.Any): /* is node.stream.Writable */ scala.Boolean = js.native
}

