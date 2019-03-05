package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.Animation")
@js.native
/**
  * Base class for all TweenLite, TweenMax, TimelineLite, and TimelineMax classes, providing core methods/properties/() => voidality, but there is no reason to create an instance of this
  * class directly.
  */
class Animation () extends js.Object {
  def this(duration: scala.Double) = this()
  def this(duration: scala.Double, vars: js.Any) = this()
  /**
    * A place to store any data you want (initially populated with vars.data if it exists).
    */
  var data: js.Any = js.native
  /** [Read-only] Parent timeline. */
  var timeline: SimpleTimeline = js.native
  /** Gets or sets the animation's initial delay which is the length of time in seconds (or frames for frames-based tweens) before the animation should begin. */
  def delay(): scala.Double = js.native
  def delay(value: scala.Double): Animation = js.native
  /** Gets or sets the animation's duration, not including any repeats or repeatDelays (which are only available in TweenMax and TimelineMax). */
  def duration(): scala.Double = js.native
  def duration(value: scala.Double): Animation = js.native
  /**
    * Gets or sets an event callback like "onComplete", "onUpdate", "onStart", "onReverseComplete" or "onRepeat" (onRepeat only applies to TweenMax or TimelineMax instances) along with any
    * parameters that should be passed to that callback.
    */
  def eventCallback(`type`: java.lang.String): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def eventCallback(`type`: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Animation = js.native
  def eventCallback(
    `type`: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    params: js.Array[_]
  ): Animation = js.native
  def eventCallback(
    `type`: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    params: js.Array[_],
    scope: js.Any
  ): Animation = js.native
  /**
    * Clears any initialization data (like starting/ending values in tweens) which can be useful if, for example, you want to restart a tween without reverting to any previously recorded
    * starting values.
    */
  def invalidate(): Animation = js.native
  /**
    * Indicates whether or not the animation is currently active (meaning the virtual playhead is actively moving across this instance's time span and it is not paused, nor are any of its
    * ancestor timelines).
    */
  def isActive(): scala.Boolean = js.native
  /** Kills the animation entirely or in part depending on the parameters. */
  def kill(): Animation = js.native
  def kill(vars: js.Object): Animation = js.native
  def kill(vars: js.Object, target: js.Object): Animation = js.native
  /** Pauses the instance, optionally jumping to a specific time. */
  def pause(): Animation = js.native
  def pause(atTime: js.Any): Animation = js.native
  def pause(atTime: js.Any, suppressEvents: scala.Boolean): Animation = js.native
  /** Gets or sets the animation's paused state which indicates whether or not the animation is currently paused. */
  def paused(): scala.Boolean = js.native
  def paused(value: scala.Boolean): Animation = js.native
  /** Begins playing forward, optionally from a specific time (by default playback begins from wherever the playhead currently is). */
  def play(): Animation = js.native
  def play(from: js.Any): Animation = js.native
  def play(from: js.Any, suppressEvents: scala.Boolean): Animation = js.native
  /**
    * Gets or sets the animations's progress which is a value between 0 and 1 indicating the position of the virtual playhead (excluding repeats) where 0 is at the beginning, 0.5 is at the
    * halfway point, and 1 is at the end (complete).
    */
  def progress(): scala.Double = js.native
  def progress(value: scala.Double): Animation = js.native
  def progress(value: scala.Double, suppressEvents: scala.Boolean): Animation = js.native
  /** Restarts and begins playing forward from the beginning. */
  def restart(): Animation = js.native
  def restart(includeDelay: scala.Boolean): Animation = js.native
  def restart(includeDelay: scala.Boolean, suppressEvents: scala.Boolean): Animation = js.native
  /** Resumes playing without altering direction (forward or reversed), optionally jumping to a specific time first. */
  def resume(): Animation = js.native
  def resume(from: js.Any): Animation = js.native
  def resume(from: js.Any, suppressEvents: scala.Boolean): Animation = js.native
  /** Reverses playback so that all aspects of the animation are oriented backwards including, for example, a tween's ease. */
  def reverse(): Animation = js.native
  def reverse(from: js.Any): Animation = js.native
  def reverse(from: js.Any, suppressEvents: scala.Boolean): Animation = js.native
  /** Gets or sets the animation's reversed state which indicates whether or not the animation should be played backwards. */
  def reversed(): scala.Boolean = js.native
  def reversed(value: scala.Boolean): Animation = js.native
  /** Jumps to a specific time without affecting whether or not the instance is paused or reversed. */
  def seek(time: js.Any): Animation = js.native
  def seek(time: js.Any, suppressEvents: scala.Boolean): Animation = js.native
  /** Gets or sets the time at which the animation begins on its parent timeline (after any delay that was defined). */
  def startTime(): scala.Double = js.native
  def startTime(value: scala.Double): Animation = js.native
  /**
    * Gets or sets the local position of the playhead (essentially the current time), described in seconds (or frames for frames-based animations) which will never be less than 0 or greater
    * than the animation's duration.
    */
  def time(): scala.Double = js.native
  def time(value: scala.Double): Animation = js.native
  def time(value: scala.Double, suppressEvents: scala.Boolean): Animation = js.native
  /** Factor that's used to scale time in the animation where 1 = normal speed (the default), 0.5 = half speed, 2 = double speed, etc. */
  def timeScale(): scala.Double = js.native
  def timeScale(value: scala.Double): Animation = js.native
  /** Gets or sets the animation's total duration including any repeats or repeatDelays (which are only available in TweenMax and TimelineMax). */
  def totalDuration(): scala.Double = js.native
  def totalDuration(value: scala.Double): Animation = js.native
  /**
    * Gets or sets the animation's total progress which is a value between 0 and 1 indicating the position of the virtual playhead (including repeats) where 0 is at the beginning, 0.5 is at
    * the halfway point, and 1 is at the end (complete).
    */
  def totalProgress(): scala.Double = js.native
  def totalProgress(value: scala.Double): Animation = js.native
  def totalProgress(value: scala.Double, suppressEvents: scala.Boolean): Animation = js.native
  /** Gets or sets the position of the playhead according to the totalDuration which includes any repeats and repeatDelays (only available in TweenMax and TimelineMax). */
  def totalTime(): scala.Double = js.native
  def totalTime(time: scala.Double): Animation = js.native
  def totalTime(time: scala.Double, suppressEvents: scala.Boolean): Animation = js.native
}

