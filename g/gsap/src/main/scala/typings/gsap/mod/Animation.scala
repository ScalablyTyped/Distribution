package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "Animation")
@js.native
/**
  * Base class for all TweenLite, TweenMax, TimelineLite, and TimelineMax classes, providing core methods/properties/() => voidality, but there is no reason to create an instance of this
  * class directly.
  */
class Animation ()
  extends typings.gsap.gsap.Animation {
  def this(duration: Double) = this()
  def this(duration: js.UndefOr[scala.Nothing], vars: js.Any) = this()
  def this(duration: Double, vars: js.Any) = this()
}
