package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.SimpleTimeline")
@js.native
class SimpleTimeline () extends Animation {
  /**
           * SimpleTimeline is the base class for TimelineLite and TimelineMax, providing the most basic timeline () => voidality and it is used for the root timelines in TweenLite but is only
           * intended for internal use in the GreenSock tweening platform. It is meant to be very fast and lightweight.
           */
  def this(vars: js.Any) = this()
  /** If true, child tweens/timelines will be removed as soon as they complete. */
  var autoRemoveChildren: scala.Boolean = js.native
  /** Controls whether or not child tweens/timelines are repositioned automatically (changing their startTime) in order to maintain smooth playback when properties are changed on-the-fly. */
  var smoothChildTiming: scala.Boolean = js.native
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any): SimpleTimeline = js.native
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any, position: js.Any): SimpleTimeline = js.native
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any, position: js.Any, align: java.lang.String): SimpleTimeline = js.native
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any, position: js.Any, align: java.lang.String, stagger: scala.Double): SimpleTimeline = js.native
  /** renders */
  def render(time: scala.Double): SimpleTimeline = js.native
  /** renders */
  def render(time: scala.Double, suppressEvents: scala.Boolean): SimpleTimeline = js.native
  /** renders */
  def render(time: scala.Double, suppressEvents: scala.Boolean, force: scala.Boolean): SimpleTimeline = js.native
}

