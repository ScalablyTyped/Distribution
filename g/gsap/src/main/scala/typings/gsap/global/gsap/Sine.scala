package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Sine")
@js.native
class Sine ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Sine")
@js.native
object Sine extends js.Object {
  var easeIn: typings.gsap.gsap.Sine = js.native
  var easeInOut: typings.gsap.gsap.Sine = js.native
  var easeOut: typings.gsap.gsap.Sine = js.native
}

