package typings.lodash.fpMod

import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashWrap extends LodashConvertible {
  def apply[T](wrapper: __, value: T): LodashWrap1x2[T] = js.native
  def apply[T, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ js.Any, TResult]): LodashWrap2x1[T, TResult] = js.native
  def apply[T, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ js.Any, TResult], value: T): js.Function1[/* repeated */ js.Any, TResult] = js.native
}

