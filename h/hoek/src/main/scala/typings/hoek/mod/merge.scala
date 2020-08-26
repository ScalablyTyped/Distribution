package typings.hoek.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hoek", "merge")
@js.native
object merge extends js.Object {
  def apply[T1, T2](target: T1, source: T2): T1 with T2 = js.native
  def apply[T1, T2](target: T1, source: T2, isNullOverride: js.UndefOr[scala.Nothing], isMergeArrays: Boolean): T1 with T2 = js.native
  def apply[T1, T2](target: T1, source: T2, isNullOverride: Boolean): T1 with T2 = js.native
  def apply[T1, T2](target: T1, source: T2, isNullOverride: Boolean, isMergeArrays: Boolean): T1 with T2 = js.native
}

