package typings.hashFile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hash-file", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(src: String): js.Promise[String] = js.native
  def sync(src: String): String = js.native
}

