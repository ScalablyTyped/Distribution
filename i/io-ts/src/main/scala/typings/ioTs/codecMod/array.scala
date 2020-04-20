package typings.ioTs.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "array")
@js.native
object array extends js.Object {
  def apply[A](items: Codec_[A]): Codec_[js.Array[A]] = js.native
}

