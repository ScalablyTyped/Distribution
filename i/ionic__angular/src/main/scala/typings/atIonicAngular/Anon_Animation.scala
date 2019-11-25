package typings.atIonicAngular

import typings.atIonicAngular.atIonicAngularStrings.back
import typings.atIonicAngular.atIonicAngularStrings.forward
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[forward | back] = js.undefined
  var direction: RouterDirection
}

object Anon_Animation {
  @scala.inline
  def apply(direction: RouterDirection, animation: forward | back = null): Anon_Animation = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animation]
  }
}

