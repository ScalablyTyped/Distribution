package typings.ioTs.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "nullable")
@js.native
object nullable extends js.Object {
  def apply[A](or: Codec_[A]): Codec_[Null | A] = js.native
}

