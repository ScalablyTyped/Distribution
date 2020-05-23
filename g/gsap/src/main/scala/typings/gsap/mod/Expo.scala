package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Expo")
@js.native
class Expo ()
  extends typings.gsap.gsap.Ease {
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSImport("gsap", "Expo")
@js.native
object Expo extends js.Object {
  var easeIn: typings.gsap.gsap.Expo = js.native
  var easeInOut: typings.gsap.gsap.Expo = js.native
  var easeOut: typings.gsap.gsap.Expo = js.native
}

