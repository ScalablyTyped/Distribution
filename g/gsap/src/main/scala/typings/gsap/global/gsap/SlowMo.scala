package typings.gsap.global.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.SlowMo")
@js.native
class SlowMo ()
  extends typings.gsap.gsap.SlowMo {
  /* CompleteClass */
  override def config(linearRatio: Double, power: Double, yoyoMode: Boolean): typings.gsap.gsap.SlowMo = js.native
  /** Translates the tween's progress ratio into the corresponding ease ratio. */
  /* CompleteClass */
  override def getRatio(p: Double): Double = js.native
}

/* static members */
@JSGlobal("gsap.SlowMo")
@js.native
object SlowMo extends js.Object {
  var ease: typings.gsap.gsap.SlowMo = js.native
}

