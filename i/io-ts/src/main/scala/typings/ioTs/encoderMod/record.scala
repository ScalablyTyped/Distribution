package typings.ioTs.encoderMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Encoder", "record")
@js.native
object record extends js.Object {
  def apply[A](codomain: Encoder_[A]): Encoder_[Record[String, A]] = js.native
}

