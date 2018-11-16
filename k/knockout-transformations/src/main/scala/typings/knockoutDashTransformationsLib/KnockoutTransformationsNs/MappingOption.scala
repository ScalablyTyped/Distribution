package typings
package knockoutDashTransformationsLib.KnockoutTransformationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingOption[T, TResult] extends js.Object {
  var disposeItem: js.UndefOr[js.Function1[/* item */ TResult, scala.Unit]] = js.native
  @JSName("mapping")
  var mapping_Original: Mapping[T, TResult] = js.native
  def mapping(value: T): TResult = js.native
}

