package typings.ioTs.codecMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Codec", "record")
@js.native
object record extends js.Object {
  def apply[A](codomain: Codec_[A]): Codec_[Record[String, A]] = js.native
}

