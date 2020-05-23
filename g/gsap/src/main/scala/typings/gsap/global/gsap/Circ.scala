package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Circ")
@js.native
class Circ ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Circ")
@js.native
object Circ extends js.Object {
  var easeIn: typings.gsap.gsap.Circ = js.native
  var easeInOut: typings.gsap.gsap.Circ = js.native
  var easeOut: typings.gsap.gsap.Circ = js.native
}

