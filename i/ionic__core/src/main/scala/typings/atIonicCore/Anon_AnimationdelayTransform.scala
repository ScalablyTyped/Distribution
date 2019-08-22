package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationdelayTransform extends js.Object {
  var `animation-delay`: String
  var transform: String
}

object Anon_AnimationdelayTransform {
  @scala.inline
  def apply(`animation-delay`: String, transform: String): Anon_AnimationdelayTransform = {
    val __obj = js.Dynamic.literal(transform = transform)
    __obj.updateDynamic("animation-delay")(`animation-delay`)
    __obj.asInstanceOf[Anon_AnimationdelayTransform]
  }
}

