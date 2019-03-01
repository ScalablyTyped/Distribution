package typings
package mapDashObjLib.mapDashObjMod.mapObjNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetOptions[T /* <: js.Object */] extends Options {
  @JSName("target")
  var target_TargetOptions: T
}

object TargetOptions {
  @scala.inline
  def apply[T /* <: js.Object */](target: T, deep: js.UndefOr[scala.Boolean] = js.undefined): TargetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[TargetOptions[T]]
  }
}

