package typings
package atIarnaTomlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml/parse-stream", JSImport.Namespace)
@js.native
object parseDashStreamMod extends js.Object {
  /** Returns a transform stream in object mode. When it completes, emit the resulting object. Only one object will ever be emitted. */
  def apply(): nodeLib.streamMod.Transform = js.native
  /** Given a readable stream, parse it as it feeds us data. Return a promise of the resulting object. */
  def apply(readable: nodeLib.streamMod.Readable): js.Promise[stdLib.Record[java.lang.String, _]] = js.native
}

