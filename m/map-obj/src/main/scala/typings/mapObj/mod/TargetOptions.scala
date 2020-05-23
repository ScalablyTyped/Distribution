package typings.mapObj.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetOptions[TargetObjectType /* <: StringDictionary[js.Any] */] extends Options {
  @JSName("target")
  var target_TargetOptions: TargetObjectType
}

object TargetOptions {
  @scala.inline
  def apply[TargetObjectType](target: TargetObjectType, deep: js.UndefOr[Boolean] = js.undefined): TargetOptions[TargetObjectType] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetOptions[TargetObjectType]]
  }
}

