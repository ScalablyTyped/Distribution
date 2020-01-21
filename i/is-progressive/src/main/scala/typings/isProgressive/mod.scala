package typings.isProgressive

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-progressive", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def buffer(buffer: Buffer): Boolean = js.native
  def file(filepath: String): js.Promise[Boolean] = js.native
  def fileSync(filepath: String): Boolean = js.native
  def stream(stream: Readable): js.Promise[Boolean] = js.native
}

