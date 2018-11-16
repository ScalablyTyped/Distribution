package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.RoughEase")
@js.native
class RoughEase protected () extends Ease {
  def this(vars: RoughEaseConfig) = this()
  def config(): RoughEase = js.native
  def config(steps: scala.Double): RoughEase = js.native
}

@JSGlobal("gsap.RoughEase")
@js.native
object RoughEase extends js.Object {
  var ease: gsapLib.gsapNs.RoughEase = js.native
}

