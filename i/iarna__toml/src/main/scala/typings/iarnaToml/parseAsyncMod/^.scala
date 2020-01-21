package typings.iarnaToml.parseAsyncMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@iarna/toml/parse-async", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(str: String): js.Promise[Record[String, _]] = js.native
  def apply(str: String, opts: Options): js.Promise[Record[String, _]] = js.native
}

