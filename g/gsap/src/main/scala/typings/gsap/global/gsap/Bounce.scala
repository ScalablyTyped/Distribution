package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Bounce")
@js.native
class Bounce ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Bounce")
@js.native
object Bounce extends js.Object {
  var easeIn: typings.gsap.gsap.Bounce = js.native
  var easeInOut: typings.gsap.gsap.Bounce = js.native
  var easeOut: typings.gsap.gsap.Bounce = js.native
}

