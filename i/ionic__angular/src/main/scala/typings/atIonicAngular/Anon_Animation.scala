package typings.atIonicAngular

import typings.atIonicAngular.atIonicAngularStrings.back
import typings.atIonicAngular.atIonicAngularStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animation extends js.Object {
  var animation: js.UndefOr[forward | back] = js.undefined
  var direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
}

object Anon_Animation {
  @scala.inline
  def apply(
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    animation: forward | back = null
  ): Anon_Animation = {
    val __obj = js.Dynamic.literal(direction = direction)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Animation]
  }
}

