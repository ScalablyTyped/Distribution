package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnion extends LodashConvertible {
  def apply[T](): js.Array[T] = js.native
  def apply[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: __): LodashUnion1x2[T] = js.native
  def apply[T](arrays2: __, arrays: List[T]): LodashUnion1x2[T] = js.native
}

