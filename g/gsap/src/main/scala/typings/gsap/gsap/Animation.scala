package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  /**
    * A place to store any data you want (initially populated with vars.data if it exists).
    */
  var data: js.Any = js.native
  
  /** Gets or sets the animation's initial delay which is the length of time in seconds (or frames for frames-based tweens) before the animation should begin. */
  def delay(): Double = js.native
  def delay(value: Double): Animation = js.native
  
  /** Gets or sets the animation's duration, not including any repeats or repeatDelays (which are only available in TweenMax and TimelineMax). */
  def duration(): Double = js.native
  def duration(value: Double): Animation = js.native
  
  /**
    * Gets or sets an event callback like "onComplete", "onUpdate", "onStart", "onReverseComplete" or "onRepeat" (onRepeat only applies to TweenMax or TimelineMax instances) along with any
    * parameters that should be passed to that callback.
    */
  def eventCallback(`type`: String): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def eventCallback(`type`: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Animation = js.native
  def eventCallback(
    `type`: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): Animation = js.native
  def eventCallback(`type`: String, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): Animation = js.native
  def eventCallback(
    `type`: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
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
  def isActive(): Boolean = js.native
  
  /** Kills the animation entirely or in part depending on the parameters. */
  def kill(): Animation = js.native
  def kill(vars: js.UndefOr[scala.Nothing], target: js.Object): Animation = js.native
  def kill(vars: js.Object): Animation = js.native
  def kill(vars: js.Object, target: js.Object): Animation = js.native
  
  /** Pauses the instance, optionally jumping to a specific time. */
  def pause(): Animation = js.native
  def pause(atTime: js.UndefOr[scala.Nothing], suppressEvents: Boolean): Animation = js.native
  def pause(atTime: js.Any): Animation = js.native
  def pause(atTime: js.Any, suppressEvents: Boolean): Animation = js.native
  
  /** Gets or sets the animation's paused state which indicates whether or not the animation is currently paused. */
  def paused(): Boolean = js.native
  def paused(value: Boolean): Animation = js.native
  
  /** Begins playing forward, optionally from a specific time (by default playback begins from wherever the playhead currently is). */
  def play(): Animation = js.native
  def play(from: js.UndefOr[scala.Nothing], suppressEvents: Boolean): Animation = js.native
  def play(from: js.Any): Animation = js.native
  def play(from: js.Any, suppressEvents: Boolean): Animation = js.native
  
  /**
    * Gets or sets the animations's progress which is a value between 0 and 1 indicating the position of the virtual playhead (excluding repeats) where 0 is at the beginning, 0.5 is at the
    * halfway point, and 1 is at the end (complete).
    */
  def progress(): Double = js.native
  def progress(value: Double): Animation = js.native
  def progress(value: Double, suppressEvents: Boolean): Animation = js.native
  
  /** Restarts and begins playing forward from the beginning. */
  def restart(): Animation = js.native
  def restart(includeDelay: js.UndefOr[scala.Nothing], suppressEvents: Boolean): Animation = js.native
  def restart(includeDelay: Boolean): Animation = js.native
  def restart(includeDelay: Boolean, suppressEvents: Boolean): Animation = js.native
  
  /** Resumes playing without altering direction (forward or reversed), optionally jumping to a specific time first. */
  def resume(): Animation = js.native
  def resume(from: js.UndefOr[scala.Nothing], suppressEvents: Boolean): Animation = js.native
  def resume(from: js.Any): Animation = js.native
  def resume(from: js.Any, suppressEvents: Boolean): Animation = js.native
  
  /** Reverses playback so that all aspects of the animation are oriented backwards including, for example, a tween's ease. */
  def reverse(): Animation = js.native
  def reverse(from: js.UndefOr[scala.Nothing], suppressEvents: Boolean): Animation = js.native
  def reverse(from: js.Any): Animation = js.native
  def reverse(from: js.Any, suppressEvents: Boolean): Animation = js.native
  
  /** Gets or sets the animation's reversed state which indicates whether or not the animation should be played backwards. */
  def reversed(): Boolean = js.native
  def reversed(value: Boolean): Animation = js.native
  
  /** Jumps to a specific time without affecting whether or not the instance is paused or reversed. */
  def seek(time: js.Any): Animation = js.native
  def seek(time: js.Any, suppressEvents: Boolean): Animation = js.native
  
  /** Gets or sets the time at which the animation begins on its parent timeline (after any delay that was defined). */
  def startTime(): Double = js.native
  def startTime(value: Double): Animation = js.native
  
  /**
    * Gets or sets the local position of the playhead (essentially the current time), described in seconds (or frames for frames-based animations) which will never be less than 0 or greater
    * than the animation's duration.
    */
  def time(): Double = js.native
  def time(value: Double): Animation = js.native
  def time(value: Double, suppressEvents: Boolean): Animation = js.native
  
  /** Factor that's used to scale time in the animation where 1 = normal speed (the default), 0.5 = half speed, 2 = double speed, etc. */
  def timeScale(): Double = js.native
  def timeScale(value: Double): Animation = js.native
  
  /** [Read-only] Parent timeline. */
  var timeline: SimpleTimeline = js.native
  
  /** Gets or sets the animation's total duration including any repeats or repeatDelays (which are only available in TweenMax and TimelineMax). */
  def totalDuration(): Double = js.native
  def totalDuration(value: Double): Animation = js.native
  
  /**
    * Gets or sets the animation's total progress which is a value between 0 and 1 indicating the position of the virtual playhead (including repeats) where 0 is at the beginning, 0.5 is at
    * the halfway point, and 1 is at the end (complete).
    */
  def totalProgress(): Double = js.native
  def totalProgress(value: Double): Animation = js.native
  def totalProgress(value: Double, suppressEvents: Boolean): Animation = js.native
  
  /** Gets or sets the position of the playhead according to the totalDuration which includes any repeats and repeatDelays (only available in TweenMax and TimelineMax). */
  def totalTime(): Double = js.native
  def totalTime(time: Double): Animation = js.native
  def totalTime(time: Double, suppressEvents: Boolean): Animation = js.native
}
