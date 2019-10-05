package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Elastic")
@js.native
class Elastic () extends Ease {
  def config(amplitude: Double, period: Double): Elastic = js.native
}

/* static members */
@JSGlobal("gsap.Elastic")
@js.native
object Elastic extends js.Object {
  var easeIn: Elastic = js.native
  var easeInOut: Elastic = js.native
  var easeOut: Elastic = js.native
}

