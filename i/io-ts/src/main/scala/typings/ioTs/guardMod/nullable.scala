package typings.ioTs.guardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/Guard", "nullable")
@js.native
object nullable extends js.Object {
  def apply[A](or: Guard_[A]): Guard_[Null | A] = js.native
}

