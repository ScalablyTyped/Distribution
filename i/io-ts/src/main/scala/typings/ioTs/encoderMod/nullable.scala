package typings.ioTs.encoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Encoder", "nullable")
@js.native
object nullable extends js.Object {
  def apply[A](or: Encoder_[A]): Encoder_[Null | A] = js.native
}

