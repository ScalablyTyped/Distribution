package typings
package gsapLib.gsapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "Animation")
@js.native
/**
  * Base class for all TweenLite, TweenMax, TimelineLite, and TimelineMax classes, providing core methods/properties/() => voidality, but there is no reason to create an instance of this
  * class directly.
  */
class Animation ()
  extends gsapLib.gsapNs.Animation {
  def this(duration: scala.Double) = this()
  def this(duration: scala.Double, vars: js.Any) = this()
}

