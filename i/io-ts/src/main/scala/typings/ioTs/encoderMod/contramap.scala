package typings.ioTs.encoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Encoder", "contramap")
@js.native
object contramap extends js.Object {
  def apply[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Encoder_[A], Encoder_[B]] = js.native
}

