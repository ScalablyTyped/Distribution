package typings.lodash.fpMod

import typings.lodash.mod.Cancelable
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDebounce extends LodashConvertible {
  def apply(wait: Double): LodashDebounce1x1 = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: Double, func: T): T with Cancelable = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: __, func: T): LodashDebounce1x2[T] = js.native
}

