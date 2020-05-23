package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Back")
@js.native
class Back ()
  extends typings.gsap.gsap.Back {
  /* CompleteClass */
  override def config(overshoot: Double): typings.gsap.gsap.Elastic = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Back")
@js.native
object Back extends js.Object {
  var easeIn: typings.gsap.gsap.Back = js.native
  var easeInOut: typings.gsap.gsap.Back = js.native
  var easeOut: typings.gsap.gsap.Back = js.native
}

