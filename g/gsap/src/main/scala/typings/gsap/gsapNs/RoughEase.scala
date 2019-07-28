package typings.gsap.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.RoughEase")
@js.native
class RoughEase protected () extends Ease {
  def this(vars: RoughEaseConfig) = this()
  def config(): RoughEase = js.native
  def config(steps: Double): RoughEase = js.native
}

/* static members */
@JSGlobal("gsap.RoughEase")
@js.native
object RoughEase extends js.Object {
  var ease: RoughEase = js.native
}

