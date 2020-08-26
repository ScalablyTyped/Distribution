package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleTimeline
  extends Animation
     with Timeline {
  /** If true, child tweens/timelines will be removed as soon as they complete. */
  var autoRemoveChildren: Boolean = js.native
  /** Controls whether or not child tweens/timelines are repositioned automatically (changing their startTime) in order to maintain smooth playback when properties are changed on-the-fly. */
  var smoothChildTiming: Boolean = js.native
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any): SimpleTimeline = js.native
  def add(
    child: js.Any,
    position: js.UndefOr[scala.Nothing],
    align: js.UndefOr[scala.Nothing],
    stagger: Double
  ): SimpleTimeline = js.native
  def add(child: js.Any, position: js.UndefOr[scala.Nothing], align: String): SimpleTimeline = js.native
  def add(child: js.Any, position: js.UndefOr[scala.Nothing], align: String, stagger: Double): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: js.UndefOr[scala.Nothing], stagger: Double): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: String): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: String, stagger: Double): SimpleTimeline = js.native
  /** renders */
  def render(time: Double): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: js.UndefOr[scala.Nothing], force: Boolean): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: Boolean): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: Boolean, force: Boolean): SimpleTimeline = js.native
}

