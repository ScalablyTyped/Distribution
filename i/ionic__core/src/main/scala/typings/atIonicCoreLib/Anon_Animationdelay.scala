package typings
package atIonicCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Animationdelay extends js.Object {
  var `animation-delay`: java.lang.String
  var transform: java.lang.String
}

object Anon_Animationdelay {
  @scala.inline
  def apply(`animation-delay`: java.lang.String, transform: java.lang.String): Anon_Animationdelay = {
    val __obj = js.Dynamic.literal(transform = transform)
    __obj.updateDynamic("animation-delay")(`animation-delay`)
    __obj.asInstanceOf[Anon_Animationdelay]
  }
}

