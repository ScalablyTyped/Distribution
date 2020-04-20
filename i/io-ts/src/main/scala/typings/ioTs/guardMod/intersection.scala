package typings.ioTs.guardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Guard", "intersection")
@js.native
object intersection extends js.Object {
  def apply[A, B](left: Guard_[A], right: Guard_[B]): Guard_[A with B] = js.native
}

