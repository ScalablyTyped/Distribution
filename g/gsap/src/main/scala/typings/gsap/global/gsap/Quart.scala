package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Quart")
@js.native
class Quart ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Quart")
@js.native
object Quart extends js.Object {
  var easeIn: typings.gsap.gsap.Quart = js.native
  var easeInOut: typings.gsap.gsap.Quart = js.native
  var easeOut: typings.gsap.gsap.Quart = js.native
}

