package typings.gsap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "TweenLite")
@js.native
class TweenLite protected ()
  extends StObject
     with typings.gsap.gsap.TweenLite {
  def this(target: js.Any, duration: Double, vars: js.Any) = this()
}
object TweenLite {
  
  @JSImport("gsap", "TweenLite")
  @js.native
  val ^ : js.Any = js.native
  
  /** Provides An easy way to change the default easing equation. */
  /* static member */
  @JSImport("gsap", "TweenLite.defaultEase")
  @js.native
  def defaultEase: typings.gsap.gsap.Ease = js.native
  inline def defaultEase_=(x: typings.gsap.gsap.Ease): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultEase")(x.asInstanceOf[js.Any])
  
  /** Provides An easy way to change the default overwrite mode. */
  /* static member */
  @JSImport("gsap", "TweenLite.defaultOverwrite")
  @js.native
  def defaultOverwrite: String = js.native
  inline def defaultOverwrite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOverwrite")(x.asInstanceOf[js.Any])
  
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  /* static member */
  inline def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Any
  ): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Any,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: Unit,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: Unit,
    scope: js.Any,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  inline def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: Unit,
    scope: Unit,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  
  /**
    * Static method for creating a TweenLite instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for doing
    * things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  /* static member */
  inline def from(target: js.Any, duration: Double, vars: js.Any): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  
  /**
    * Static method for creating a TweenLite instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  /* static member */
  inline def fromTo(target: js.Any, duration: Double, fromVars: js.Any, toVars: js.Any): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTo")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a few
    * seconds after the tween completes.
    */
  /* static member */
  inline def getTweensOf(target: js.Any): js.Array[typings.gsap.gsap.TweenLite] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTweensOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.gsap.gsap.TweenLite]]
  inline def getTweensOf(target: js.Any, onlyActive: Boolean): js.Array[typings.gsap.gsap.TweenLite] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTweensOf")(target.asInstanceOf[js.Any], onlyActive.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.gsap.gsap.TweenLite]]
  
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  /* static member */
  inline def killDelayedCallsTo(func: js.Function1[/* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killDelayedCallsTo")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Kills all the tweens (or specific tweening properties) of a particular object or delayedCalls to a particular () => void. */
  /* static member */
  inline def killTweensOf(target: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def killTweensOf(target: js.Any, onlyActive: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any], onlyActive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def killTweensOf(target: js.Any, onlyActive: Boolean, vars: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any], onlyActive.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def killTweensOf(target: js.Any, onlyActive: Unit, vars: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any], onlyActive.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Permits you to control what happens when too much time elapses between two ticks (updates) of the engine, adjusting the core timing mechanism to compensate and avoid "jumps". */
  /* static member */
  inline def lagSmoothing(threshold: Double, adjustedLag: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lagSmoothing")(threshold.asInstanceOf[js.Any], adjustedLag.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Forces a render of all active tweens which can be useful if, for example, you set up a bunch of from() tweens and then you need to force an immediate render (even of "lazy" tweens) to
    * avoid a brief delay before things render on the very next tick.
    */
  /* static member */
  inline def render(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")().asInstanceOf[Unit]
  
  /** The selector engine (like jQuery) that should be used when a tween receives a string as its target, like TweenLite.to("#myID", 1, {x:"100px"}). */
  /* static member */
  @JSImport("gsap", "TweenLite.selector")
  @js.native
  def selector: js.Function1[/* query */ String, js.Any] = js.native
  inline def selector_=(x: js.Function1[/* query */ String, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
  
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  /* static member */
  inline def set(target: js.Any, vars: js.Any): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
  
  /**
    * The object that dispatches a "tick" event each time the engine updates, making it easy for you to add your own listener(s) to run custom logic after each update
    * (great for game developers).
    */
  /* static member */
  @JSImport("gsap", "TweenLite.ticker")
  @js.native
  def ticker: js.Any = js.native
  inline def ticker_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticker")(x.asInstanceOf[js.Any])
  
  /** Static method for creating a TweenLite instance that animates to the specified destination values (from the current values). */
  /* static member */
  inline def to(target: js.Any, duration: Double, vars: js.Any): typings.gsap.gsap.TweenLite = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenLite]
}
