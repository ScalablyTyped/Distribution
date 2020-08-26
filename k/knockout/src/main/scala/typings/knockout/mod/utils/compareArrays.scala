package typings.knockout.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knockout", "utils.compareArrays")
@js.native
object compareArrays extends js.Object {
  def apply[T](a: js.Array[T], b: js.Array[T]): ArrayChanges[T] = js.native
  def apply[T](a: js.Array[T], b: js.Array[T], dontLimitMoves: Boolean): ArrayChanges[T] = js.native
  def apply[T](a: js.Array[T], b: js.Array[T], options: CompareArraysOptions): ArrayChanges[T] = js.native
}

