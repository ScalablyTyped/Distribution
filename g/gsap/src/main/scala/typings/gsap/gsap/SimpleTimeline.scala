package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleTimeline
  extends StObject
     with Animation
     with Timeline {
  
  /** Adds a TweenLite, TweenMax, TimelineLite, or TimelineMax instance to the timeline at a specific time. */
  def add(child: js.Any): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: String): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: String, stagger: Double): SimpleTimeline = js.native
  def add(child: js.Any, position: js.Any, align: Unit, stagger: Double): SimpleTimeline = js.native
  def add(child: js.Any, position: Unit, align: String): SimpleTimeline = js.native
  def add(child: js.Any, position: Unit, align: String, stagger: Double): SimpleTimeline = js.native
  def add(child: js.Any, position: Unit, align: Unit, stagger: Double): SimpleTimeline = js.native
  
  /** If true, child tweens/timelines will be removed as soon as they complete. */
  var autoRemoveChildren: Boolean = js.native
  
  /** renders */
  def render(time: Double): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: Boolean): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: Boolean, force: Boolean): SimpleTimeline = js.native
  def render(time: Double, suppressEvents: Unit, force: Boolean): SimpleTimeline = js.native
  
  /** Controls whether or not child tweens/timelines are repositioned automatically (changing their startTime) in order to maintain smooth playback when properties are changed on-the-fly. */
  var smoothChildTiming: Boolean = js.native
}
