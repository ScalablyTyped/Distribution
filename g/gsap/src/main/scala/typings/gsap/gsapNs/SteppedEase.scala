package typings.gsap.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.SteppedEase")
@js.native
class SteppedEase protected () extends Ease {
  def this(staps: Double) = this()
  def config(steps: Double): SteppedEase = js.native
}

