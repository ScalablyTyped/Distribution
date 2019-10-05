package typings.k6.k6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6", "check")
@js.native
object check extends js.Object {
  def apply[VT](`val`: VT, sets: Checkers[VT]): Boolean = js.native
  def apply[VT](`val`: VT, sets: Checkers[VT], tags: js.Object): Boolean = js.native
}

