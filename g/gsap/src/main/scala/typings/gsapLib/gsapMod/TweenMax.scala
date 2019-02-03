package typings
package gsapLib.gsapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "TweenMax")
@js.native
class TweenMax protected ()
  extends gsapLib.gsapNs.TweenMax {
  def this(target: js.Object, duration: scala.Double, vars: js.Object) = this()
}

/* static members */
@JSImport("gsap", "TweenMax")
@js.native
object TweenMax extends js.Object {
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  def delayedCall(delay: scala.Double, callback: js.Function0[scala.Unit]): gsapLib.gsapNs.TweenMax = js.native
  def delayedCall(delay: scala.Double, callback: js.Function0[scala.Unit], params: js.Array[_]): gsapLib.gsapNs.TweenMax = js.native
  def delayedCall(delay: scala.Double, callback: js.Function0[scala.Unit], params: js.Array[_], scope: js.Object): gsapLib.gsapNs.TweenMax = js.native
  def delayedCall(
    delay: scala.Double,
    callback: js.Function0[scala.Unit],
    params: js.Array[_],
    scope: js.Object,
    useFrames: scala.Boolean
  ): gsapLib.gsapNs.TweenMax = js.native
  /**
    * Static method for creating a TweenMax instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for
    * doing things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  def from(target: js.Object, duration: scala.Double, vars: js.Object): gsapLib.gsapNs.TweenMax = js.native
  /**
    * Static method for creating a TweenMax instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  def fromTo(target: js.Object, duration: scala.Double, fromVars: js.Object, toVars: js.Object): gsapLib.gsapNs.TweenMax = js.native
  /** Returns an array containing all tweens (and optionally timelines too, excluding the root timelines). */
  def getAllTweens(): js.Array[gsapLib.gsapNs.Tween] = js.native
  def getAllTweens(includeTimelines: scala.Boolean): js.Array[gsapLib.gsapNs.Tween] = js.native
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a
    * few seconds after the tween completes.
    */
  def getTweensOf(target: js.Object): js.Array[gsapLib.gsapNs.Tween] = js.native
  /** Gets or sets the global timeScale which is a multiplier that affects ALL animations equally. This is a great way to globally speed up or slow down all animations at once. */
  def globalTimeScale(): scala.Double = js.native
  def globalTimeScale(value: scala.Double): scala.Double = js.native
  /** Reports whether or not a particular object is actively tweening. */
  def isTweening(target: js.Object): scala.Boolean = js.native
  /** Kills all tweens and/or delayedCalls/callbacks, and/or timelines, optionally forcing them to completion first. */
  def killAll(): scala.Unit = js.native
  def killAll(complete: scala.Boolean): scala.Unit = js.native
  def killAll(complete: scala.Boolean, tweens: scala.Boolean): scala.Unit = js.native
  def killAll(complete: scala.Boolean, tweens: scala.Boolean, delayedCalls: scala.Boolean): scala.Unit = js.native
  def killAll(
    complete: scala.Boolean,
    tweens: scala.Boolean,
    delayedCalls: scala.Boolean,
    timelines: scala.Boolean
  ): scala.Unit = js.native
  /** Kills all tweens of the children of a particular DOM element, optionally forcing them to completion first. */
  def killChildTweensOf(parent: js.Any): scala.Unit = js.native
  def killChildTweensOf(parent: js.Any, complete: scala.Boolean): scala.Unit = js.native
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  def killDelayedCallsTo(func: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Kills all the tweens (or specific tweening properties) of a particular object or the delayedCalls to a particular () => void. */
  def killTweensOf(target: js.Object): scala.Unit = js.native
  def killTweensOf(target: js.Object, vars: js.Object): scala.Unit = js.native
  /** Pauses all tweens and/or delayedCalls/callbacks and/or timelines. */
  def pauseAll(): scala.Unit = js.native
  def pauseAll(tweens: scala.Boolean): scala.Unit = js.native
  def pauseAll(tweens: scala.Boolean, delayedCalls: scala.Boolean): scala.Unit = js.native
  def pauseAll(tweens: scala.Boolean, delayedCalls: scala.Boolean, timelines: scala.Boolean): scala.Unit = js.native
  /** Resumes all paused tweens and/or delayedCalls/callbacks and/or timelines. */
  def resumeAll(): scala.Unit = js.native
  def resumeAll(tweens: scala.Boolean): scala.Unit = js.native
  def resumeAll(tweens: scala.Boolean, delayedCalls: scala.Boolean): scala.Unit = js.native
  def resumeAll(tweens: scala.Boolean, delayedCalls: scala.Boolean, timelines: scala.Boolean): scala.Unit = js.native
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  def set(target: js.Object, vars: js.Object): gsapLib.gsapNs.TweenMax = js.native
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time, creating
    * an evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFrom(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit]
  ): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /**
    * Tweens an array of targets from a common set of destination values to a common set of destination values, but staggers their start times by a specified amount of time, creating an
    * evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double
  ): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit]
  ): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: scala.Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerTo(targets: js.Any, duration: scala.Double, vars: js.Object, stagger: scala.Double): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit]
  ): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: scala.Double,
    vars: js.Object,
    stagger: scala.Double,
    onCompleteAll: js.Function0[scala.Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /** Static method for creating a TweenMax instance that animates to the specified destination values (from the current values). */
  def to(target: js.Object, duration: scala.Double, vars: gsapLib.gsapNs.TweenConfig): gsapLib.gsapNs.TweenMax = js.native
}

