package typings
package mapDashObjLib.mapDashObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetOptions[TargetObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */] extends Options {
  @JSName("target")
  var target_TargetOptions: TargetObjectType
}

object TargetOptions {
  @scala.inline
  def apply[TargetObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](target: TargetObjectType, deep: js.UndefOr[scala.Boolean] = js.undefined): TargetOptions[TargetObjectType] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep)
    __obj.asInstanceOf[TargetOptions[TargetObjectType]]
  }
}

