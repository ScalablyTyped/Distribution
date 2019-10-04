package typings.libnpmsearch.libnpmsearchMod

import typings.libnpmsearch.Anon_Detailed
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libnpmsearch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(query: String | js.Array[String]): js.Promise[js.Array[Result]] = js.native
  def apply(query: js.Array[String] | String, opts: (Options with Anon_Detailed) | Options): js.Promise[js.Array[Result]] = js.native
  def stream(query: String): ReadWriteStream = js.native
  def stream(query: String, opts: Options): ReadWriteStream = js.native
  def stream(query: js.Array[String]): ReadWriteStream = js.native
  def stream(query: js.Array[String], opts: Options): ReadWriteStream = js.native
}

