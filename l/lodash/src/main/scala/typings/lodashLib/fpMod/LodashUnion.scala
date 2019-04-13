package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnion extends js.Object {
  def apply[T](): LodashUnion1x1[T] = js.native
  def apply[T](arrays2: js.UndefOr[scala.Nothing], arrays: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
  def apply[T](arrays2: lodashLib.lodashMod.List[T]): LodashUnion1x1[T] = js.native
  def apply[T](arrays2: lodashLib.lodashMod.List[T], arrays: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
  def apply[T](arrays2: lodashLib.lodashMod.__): LodashUnion1x2[T] = js.native
  def apply[T](arrays2: lodashLib.lodashMod.__, arrays: lodashLib.lodashMod.List[T]): LodashUnion1x2[T] = js.native
  def apply[T](arrays2: scala.Null, arrays: lodashLib.lodashMod.List[T]): js.Array[T] = js.native
}

