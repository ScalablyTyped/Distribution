package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Quad")
@js.native
class Quad ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.Quad")
@js.native
object Quad extends js.Object {
  var easeIn: typings.gsap.gsap.Quad = js.native
  var easeInOut: typings.gsap.gsap.Quad = js.native
  var easeOut: typings.gsap.gsap.Quad = js.native
}

