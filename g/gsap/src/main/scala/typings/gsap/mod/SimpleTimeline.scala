package typings.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "SimpleTimeline")
@js.native
/**
  * SimpleTimeline is the base class for TimelineLite and TimelineMax, providing the most basic timeline () => voidality and it is used for the root timelines in TweenLite but is only
  * intended for internal use in the GreenSock tweening platform. It is meant to be very fast and lightweight.
  */
class SimpleTimeline ()
  extends typings.gsap.gsap.SimpleTimeline {
  def this(vars: js.Any) = this()
}
