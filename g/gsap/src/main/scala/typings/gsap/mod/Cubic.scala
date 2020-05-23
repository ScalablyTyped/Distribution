package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Cubic")
@js.native
class Cubic ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Cubic")
@js.native
object Cubic extends js.Object {
  var easeIn: typings.gsap.gsap.Cubic = js.native
  var easeInOut: typings.gsap.gsap.Cubic = js.native
  var easeOut: typings.gsap.gsap.Cubic = js.native
}

