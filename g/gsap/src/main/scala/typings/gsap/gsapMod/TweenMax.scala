package typings.gsap.gsapMod

import typings.gsap.gsapNs.Tween
import typings.gsap.gsapNs.TweenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "TweenMax")
@js.native
class TweenMax protected ()
  extends typings.gsap.gsapNs.TweenMax {
  def this(target: js.Object, duration: Double, vars: js.Object) = this()
}

/* static members */
@JSImport("gsap", "TweenMax")
@js.native
object TweenMax extends js.Object {
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.gsap.gsapNs.TweenMax = js.native
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): typings.gsap.gsapNs.TweenMax = js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Object
  ): typings.gsap.gsapNs.TweenMax = js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Object,
    useFrames: Boolean
  ): typings.gsap.gsapNs.TweenMax = js.native
  /**
    * Static method for creating a TweenMax instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for
    * doing things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  def from(target: js.Object, duration: Double, vars: js.Object): typings.gsap.gsapNs.TweenMax = js.native
  /**
    * Static method for creating a TweenMax instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object): typings.gsap.gsapNs.TweenMax = js.native
  /** Returns an array containing all tweens (and optionally timelines too, excluding the root timelines). */
  def getAllTweens(): js.Array[Tween] = js.native
  def getAllTweens(includeTimelines: Boolean): js.Array[Tween] = js.native
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a
    * few seconds after the tween completes.
    */
  def getTweensOf(target: js.Object): js.Array[Tween] = js.native
  /** Gets or sets the global timeScale which is a multiplier that affects ALL animations equally. This is a great way to globally speed up or slow down all animations at once. */
  def globalTimeScale(): Double = js.native
  def globalTimeScale(value: Double): Double = js.native
  /** Reports whether or not a particular object is actively tweening. */
  def isTweening(target: js.Object): Boolean = js.native
  /** Kills all tweens and/or delayedCalls/callbacks, and/or timelines, optionally forcing them to completion first. */
  def killAll(): Unit = js.native
  def killAll(complete: Boolean): Unit = js.native
  def killAll(complete: Boolean, tweens: Boolean): Unit = js.native
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  /** Kills all tweens of the children of a particular DOM element, optionally forcing them to completion first. */
  def killChildTweensOf(parent: js.Any): Unit = js.native
  def killChildTweensOf(parent: js.Any, complete: Boolean): Unit = js.native
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  def killDelayedCallsTo(func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /** Kills all the tweens (or specific tweening properties) of a particular object or the delayedCalls to a particular () => void. */
  def killTweensOf(target: js.Object): Unit = js.native
  def killTweensOf(target: js.Object, vars: js.Object): Unit = js.native
  /** Pauses all tweens and/or delayedCalls/callbacks and/or timelines. */
  def pauseAll(): Unit = js.native
  def pauseAll(tweens: Boolean): Unit = js.native
  def pauseAll(tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  def pauseAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  /** Resumes all paused tweens and/or delayedCalls/callbacks and/or timelines. */
  def resumeAll(): Unit = js.native
  def resumeAll(tweens: Boolean): Unit = js.native
  def resumeAll(tweens: Boolean, delayedCalls: Boolean): Unit = js.native
  def resumeAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = js.native
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  def set(target: js.Object, vars: js.Object): typings.gsap.gsapNs.TweenMax = js.native
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time, creating
    * an evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /**
    * Tweens an array of targets from a common set of destination values to a common set of destination values, but staggers their start times by a specified amount of time, creating an
    * evenly-spaced sequence with a surprisingly small amount of code.
    */
  def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object, stagger: Double): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_]
  ): js.Array[_] = js.native
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[_],
    onCompleteAllScope: js.Any
  ): js.Array[_] = js.native
  /** Static method for creating a TweenMax instance that animates to the specified destination values (from the current values). */
  def to(target: js.Object, duration: Double, vars: TweenConfig): typings.gsap.gsapNs.TweenMax = js.native
}

