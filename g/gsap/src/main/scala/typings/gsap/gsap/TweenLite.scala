package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gsap.TweenLite")
@js.native
class TweenLite protected ()
  extends Animation
     with Tween {
  def this(target: js.Any, duration: Double, vars: js.Any) = this()
  /** Target object (or array of objects) whose properties the tween affects. */
  val target: js.Any = js.native
}

/* static members */
@JSGlobal("gsap.TweenLite")
@js.native
object TweenLite extends js.Object {
  /** Provides An easy way to change the default easing equation. */
  var defaultEase: Ease = js.native
  /** Provides An easy way to change the default overwrite mode. */
  var defaultOverwrite: String = js.native
  /**
    * The object that dispatches a "tick" event each time the engine updates, making it easy for you to add your own listener(s) to run custom logic after each update
    * (great for game developers).
    */
  var ticker: js.Any = js.native
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): TweenLite = js.native
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[_]): TweenLite = js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Any
  ): TweenLite = js.native
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[_],
    scope: js.Any,
    useFrames: Boolean
  ): TweenLite = js.native
  /**
    * Static method for creating a TweenLite instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for doing
    * things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  def from(target: js.Any, duration: Double, vars: js.Any): TweenLite = js.native
  /**
    * Static method for creating a TweenLite instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  def fromTo(target: js.Any, duration: Double, fromVars: js.Any, toVars: js.Any): TweenLite = js.native
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a few
    * seconds after the tween completes.
    */
  def getTweensOf(target: js.Any): js.Array[TweenLite] = js.native
  def getTweensOf(target: js.Any, onlyActive: Boolean): js.Array[TweenLite] = js.native
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  def killDelayedCallsTo(func: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  /** Kills all the tweens (or specific tweening properties) of a particular object or delayedCalls to a particular () => void. */
  def killTweensOf(target: js.Any): Unit = js.native
  def killTweensOf(target: js.Any, onlyActive: Boolean): Unit = js.native
  def killTweensOf(target: js.Any, onlyActive: Boolean, vars: js.Any): Unit = js.native
  /** Permits you to control what happens when too much time elapses between two ticks (updates) of the engine, adjusting the core timing mechanism to compensate and avoid "jumps". */
  def lagSmoothing(threshold: Double, adjustedLag: Double): Unit = js.native
  /**
    * Forces a render of all active tweens which can be useful if, for example, you set up a bunch of from() tweens and then you need to force an immediate render (even of "lazy" tweens) to
    * avoid a brief delay before things render on the very next tick.
    */
  def render(): Unit = js.native
  /** The selector engine (like jQuery) that should be used when a tween receives a string as its target, like TweenLite.to("#myID", 1, {x:"100px"}). */
  def selector(query: String): js.Any = js.native
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  def set(target: js.Any, vars: js.Any): TweenLite = js.native
  /** Static method for creating a TweenLite instance that animates to the specified destination values (from the current values). */
  def to(target: js.Any, duration: Double, vars: js.Any): TweenLite = js.native
}

