package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAt extends js.Object {
  def apply(indexes: lodashLib.lodashMod.Many[scala.Double]): LodashPullAt1x1 = js.native
  def apply[T](indexes: lodashLib.lodashMod.Many[scala.Double], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](indexes: lodashLib.lodashMod.Many[scala.Double], array: lodashLib.lodashMod.List[T]): lodashLib.lodashMod.List[T] = js.native
  def apply[T](indexes: lodashLib.lodashMod.__, array: js.Array[T]): LodashPullAt1x2[T] = js.native
  def apply[T](indexes: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T]): LodashPullAt2x2[T] = js.native
}

