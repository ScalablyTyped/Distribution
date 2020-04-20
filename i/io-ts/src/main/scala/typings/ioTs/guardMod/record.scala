package typings.ioTs.guardMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Guard", "record")
@js.native
object record extends js.Object {
  def apply[A](codomain: Guard_[A]): Guard_[Record[String, A]] = js.native
}

