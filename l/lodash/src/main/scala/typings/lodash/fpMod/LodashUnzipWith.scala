package typings.lodash.fpMod

import typings.lodash.mod.List
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnzipWith extends LodashConvertible {
  def apply[T](iteratee: __): LodashUnzipWith1x2[T] = js.native
  def apply[T](iteratee: __, array: List[List[T]]): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): LodashUnzipWith1x1[T, TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult], array: List[List[T]]): js.Array[TResult] = js.native
}

