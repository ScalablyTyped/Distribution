package typings.hashStream

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hash-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(filename: String, algorithm: String): js.Promise[Buffer] = js.native
  def apply(
    filename: String,
    algorithm: String,
    callback: js.Function2[/* error */ Error | Null, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
  def apply(stream: Readable, algorithm: String): js.Promise[Buffer] = js.native
  def apply(
    stream: Readable,
    algorithm: String,
    callback: js.Function2[/* error */ js.Any, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = js.native
}

