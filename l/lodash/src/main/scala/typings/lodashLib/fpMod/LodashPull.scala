package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPull extends js.Object {
  def apply[T](values: T): LodashPull1x1[T] = js.native
  def apply[T](values: T, array: js.Array[T]): js.Array[T] = js.native
  def apply[T](values: T, array: lodashLib.lodashMod.List[T]): lodashLib.lodashMod.List[T] = js.native
  def apply[T](values: lodashLib.lodashMod.__, array: js.Array[T]): LodashPull1x2[T] = js.native
  def apply[T](values: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T]): LodashPull2x2[T] = js.native
}

