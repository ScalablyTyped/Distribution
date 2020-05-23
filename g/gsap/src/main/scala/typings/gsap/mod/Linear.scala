package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Linear")
@js.native
class Linear ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Linear")
@js.native
object Linear extends js.Object {
  var ease: typings.gsap.gsap.Linear = js.native
  var easeIn: typings.gsap.gsap.Linear = js.native
  var easeInOut: typings.gsap.gsap.Linear = js.native
  var easeNone: typings.gsap.gsap.Linear = js.native
  var easeOut: typings.gsap.gsap.Linear = js.native
}

