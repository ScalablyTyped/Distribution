package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.SteppedEase")
@js.native
class SteppedEase protected ()
  extends typings.gsap.gsap.SteppedEase {
  def this(staps: Double) = this()
  /* CompleteClass */
  override def config(steps: Double): typings.gsap.gsap.SteppedEase = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

