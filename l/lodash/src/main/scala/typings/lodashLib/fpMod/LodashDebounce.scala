package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDebounce extends js.Object {
  def apply(wait: scala.Double): LodashDebounce1x1 = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: lodashLib.lodashMod.__, func: T): LodashDebounce1x2[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: scala.Double, func: T): T with lodashLib.lodashMod.Cancelable = js.native
}

