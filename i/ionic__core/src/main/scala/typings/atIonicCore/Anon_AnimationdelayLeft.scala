package typings.atIonicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationdelayLeft extends js.Object {
  var `animation-delay`: String
  var left: String
  var top: String
}

object Anon_AnimationdelayLeft {
  @scala.inline
  def apply(`animation-delay`: String, left: String, top: String): Anon_AnimationdelayLeft = {
    val __obj = js.Dynamic.literal(left = left, top = top)
    __obj.updateDynamic("animation-delay")(`animation-delay`)
    __obj.asInstanceOf[Anon_AnimationdelayLeft]
  }
}

