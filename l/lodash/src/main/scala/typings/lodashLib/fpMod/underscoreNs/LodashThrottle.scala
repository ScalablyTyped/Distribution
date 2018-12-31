package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashThrottle extends js.Object {
  def apply(wait: scala.Double): LodashThrottle1x1 = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: lodashLib.lodashMod.underscoreNs.`__`, func: T): LodashThrottle1x2[T] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: scala.Double, func: T): T with lodashLib.lodashMod.underscoreNs.Cancelable = js.native
}

