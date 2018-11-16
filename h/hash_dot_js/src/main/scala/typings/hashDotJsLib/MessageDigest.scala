package typings
package hashDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageDigest[T] extends js.Object {
  var blockSize: scala.Double = js.native
  var outSize: scala.Double = js.native
  def digest(): js.Array[scala.Double] = js.native
  @JSName("digest")
  def digest_hex(enc: hashDotJsLib.hashDotJsLibStrings.hex): java.lang.String = js.native
  def update(msg: js.Any): T = js.native
  @JSName("update")
  def update_hex(msg: js.Any, enc: hashDotJsLib.hashDotJsLibStrings.hex): T = js.native
}

