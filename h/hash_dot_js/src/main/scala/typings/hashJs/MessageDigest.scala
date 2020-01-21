package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageDigest[T] extends js.Object {
  var blockSize: Double = js.native
  var outSize: Double = js.native
  def digest(): js.Array[Double] = js.native
  @JSName("digest")
  def digest_hex(enc: hex): String = js.native
  def update(msg: js.Any): T = js.native
  @JSName("update")
  def update_hex(msg: js.Any, enc: hex): T = js.native
}

