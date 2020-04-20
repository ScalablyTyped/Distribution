package typings.ioTs.encoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Encoder", "intersection")
@js.native
object intersection extends js.Object {
  def apply[A, B](left: Encoder_[A], right: Encoder_[B]): Encoder_[A with B] = js.native
}

