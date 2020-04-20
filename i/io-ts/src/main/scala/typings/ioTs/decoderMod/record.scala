package typings.ioTs.decoderMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Decoder", "record")
@js.native
object record extends js.Object {
  def apply[A](codomain: Decoder_[A]): Decoder_[Record[String, A]] = js.native
}

