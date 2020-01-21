package typings.libnpmsearch.mod

import typings.libnpmsearch.AnonDetailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libnpmsearch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(query: String): js.Promise[js.Array[Result]] = js.native
  def apply(query: String, opts: (Options with AnonDetailed) | Options): js.Promise[js.Array[DetailedResult]] = js.native
  def apply(query: js.Array[String]): js.Promise[js.Array[Result]] = js.native
  def apply(query: js.Array[String], opts: (Options with AnonDetailed) | Options): js.Promise[js.Array[DetailedResult]] = js.native
}

