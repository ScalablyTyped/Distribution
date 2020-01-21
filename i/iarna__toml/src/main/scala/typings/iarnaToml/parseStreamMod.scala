package typings.iarnaToml

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml/parse-stream", JSImport.Namespace)
@js.native
object parseStreamMod extends js.Object {
  /** Returns a transform stream in object mode. When it completes, emit the resulting object. Only one object will ever be emitted. */
  def apply(): Transform = js.native
  /** Given a readable stream, parse it as it feeds us data. Return a promise of the resulting object. */
  def apply(readable: Readable): js.Promise[Record[String, _]] = js.native
}

