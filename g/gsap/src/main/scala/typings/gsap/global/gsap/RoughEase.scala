package typings.gsap.global.gsap

import typings.gsap.gsap.RoughEaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.RoughEase")
@js.native
class RoughEase protected ()
  extends typings.gsap.gsap.RoughEase {
  def this(vars: RoughEaseConfig) = this()
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.RoughEase")
@js.native
object RoughEase extends js.Object {
  var ease: typings.gsap.gsap.RoughEase = js.native
}

