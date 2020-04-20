package typings.ioTs.codecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "intersection")
@js.native
object intersection extends js.Object {
  def apply[A, B](left: Codec_[A], right: Codec_[B]): Codec_[A with B] = js.native
}

