package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashChunk extends js.Object {
  def apply(size: scala.Double): LodashChunk1x1 = js.native
  def apply[T](size: lodashLib.lodashMod.__): LodashChunk1x2[T] = js.native
  def apply[T](size: lodashLib.lodashMod.__, array: lodashLib.lodashMod.List[T]): LodashChunk1x2[T] = js.native
  def apply[T](size: scala.Double, array: lodashLib.lodashMod.List[T]): js.Array[js.Array[T]] = js.native
}

