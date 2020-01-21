package typings.gsap.mod

import typings.gsap.gsap.RoughEaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "RoughEase")
@js.native
class RoughEase protected ()
  extends typings.gsap.gsap.RoughEase {
  def this(vars: RoughEaseConfig) = this()
}

/* static members */
@JSImport("gsap", "RoughEase")
@js.native
object RoughEase extends js.Object {
  var ease: typings.gsap.gsap.RoughEase = js.native
}

