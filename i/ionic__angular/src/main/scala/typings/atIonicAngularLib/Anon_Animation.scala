package typings
package atIonicAngularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[
    atIonicAngularLib.atIonicAngularLibStrings.forward | atIonicAngularLib.atIonicAngularLibStrings.back
  ]
  var direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
}

object Anon_Animation {
  @scala.inline
  def apply(
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection,
    animation: atIonicAngularLib.atIonicAngularLibStrings.forward | atIonicAngularLib.atIonicAngularLibStrings.back = null
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal(direction = direction)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animation]
  }
}

