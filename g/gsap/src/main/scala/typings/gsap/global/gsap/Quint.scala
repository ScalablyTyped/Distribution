package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Quint")
@js.native
class Quint ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Quint")
@js.native
object Quint extends js.Object {
  var easeIn: typings.gsap.gsap.Quint = js.native
  var easeInOut: typings.gsap.gsap.Quint = js.native
  var easeOut: typings.gsap.gsap.Quint = js.native
}

