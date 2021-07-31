package typings.gsap.mod

import typings.gsap.gsap.Tween
import typings.gsap.gsap.TweenConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gsap", "TweenMax")
@js.native
class TweenMax protected ()
  extends StObject
     with typings.gsap.gsap.TweenMax {
  def this(target: js.Object, duration: Double, vars: js.Object) = this()
}
object TweenMax {
  
  @JSImport("gsap", "TweenMax")
  @js.native
  val ^ : js.Any = js.native
  
  /** Provides a simple way to call a () => void after a set amount of time (or frames). */
  /* static member */
  @scala.inline
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Object
  ): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: js.Object,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: js.Array[js.Any],
    scope: Unit,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(delay: Double, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Object): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: Unit,
    scope: js.Object,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  @scala.inline
  def delayedCall(
    delay: Double,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    params: Unit,
    scope: Unit,
    useFrames: Boolean
  ): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("delayedCall")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], useFrames.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  
  /**
    * Static method for creating a TweenMax instance that tweens backwards - you define the BEGINNING values and the current values are used as the destination values which is great for
    * doing things like animating objects onto the screen because you can set them up initially the way you want them to look at the end of the tween and then animate in from elsewhere.
    */
  /* static member */
  @scala.inline
  def from(target: js.Object, duration: Double, vars: js.Object): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  
  /**
    * Static method for creating a TweenMax instance that allows you to define both the starting and ending values (as opposed to to() and from() tweens which are based on the target's
    * current values at one end or the other).
    */
  /* static member */
  @scala.inline
  def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTo")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  
  /** Returns an array containing all tweens (and optionally timelines too, excluding the root timelines). */
  /* static member */
  @scala.inline
  def getAllTweens(): js.Array[Tween] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTweens")().asInstanceOf[js.Array[Tween]]
  @scala.inline
  def getAllTweens(includeTimelines: Boolean): js.Array[Tween] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllTweens")(includeTimelines.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tween]]
  
  /**
    * Returns an array containing all the tweens of a particular target (or group of targets) that have not been released for garbage collection yet which typically happens within a
    * few seconds after the tween completes.
    */
  /* static member */
  @scala.inline
  def getTweensOf(target: js.Object): js.Array[Tween] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTweensOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tween]]
  
  /** Gets or sets the global timeScale which is a multiplier that affects ALL animations equally. This is a great way to globally speed up or slow down all animations at once. */
  /* static member */
  @scala.inline
  def globalTimeScale(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("globalTimeScale")().asInstanceOf[Double]
  @scala.inline
  def globalTimeScale(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("globalTimeScale")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** Reports whether or not a particular object is actively tweening. */
  /* static member */
  @scala.inline
  def isTweening(target: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTweening")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Kills all tweens and/or delayedCalls/callbacks, and/or timelines, optionally forcing them to completion first. */
  /* static member */
  @scala.inline
  def killAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killAll")().asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Boolean, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Unit, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Unit, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Boolean, tweens: Unit, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Boolean, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Boolean, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Unit, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Unit, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def killAll(complete: Unit, tweens: Unit, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killAll")(complete.asInstanceOf[js.Any], tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Kills all tweens of the children of a particular DOM element, optionally forcing them to completion first. */
  /* static member */
  @scala.inline
  def killChildTweensOf(parent: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killChildTweensOf")(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def killChildTweensOf(parent: js.Any, complete: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killChildTweensOf")(parent.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Immediately kills all of the delayedCalls to a particular () => void. */
  /* static member */
  @scala.inline
  def killDelayedCallsTo(func: js.Function1[/* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killDelayedCallsTo")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Kills all the tweens (or specific tweening properties) of a particular object or the delayedCalls to a particular () => void. */
  /* static member */
  @scala.inline
  def killTweensOf(target: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def killTweensOf(target: js.Object, vars: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("killTweensOf")(target.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Pauses all tweens and/or delayedCalls/callbacks and/or timelines. */
  /* static member */
  @scala.inline
  def pauseAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")().asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Boolean, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Boolean, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Unit, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Unit, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def pauseAll(tweens: Unit, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pauseAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Resumes all paused tweens and/or delayedCalls/callbacks and/or timelines. */
  /* static member */
  @scala.inline
  def resumeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")().asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Boolean, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Boolean, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Boolean, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Unit, delayedCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Unit, delayedCalls: Boolean, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resumeAll(tweens: Unit, delayedCalls: Unit, timelines: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resumeAll")(tweens.asInstanceOf[js.Any], delayedCalls.asInstanceOf[js.Any], timelines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Immediately sets properties of the target accordingly - essentially a zero-duration to() tween with a more intuitive name. */
  /* static member */
  @scala.inline
  def set(target: js.Object, vars: js.Object): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
  
  /**
    * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time, creating
    * an evenly-spaced sequence with a surprisingly small amount of code.
    */
  /* static member */
  @scala.inline
  def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFrom(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFrom")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Tweens an array of targets from a common set of destination values to a common set of destination values, but staggers their start times by a specified amount of time, creating an
    * evenly-spaced sequence with a surprisingly small amount of code.
    */
  /* static member */
  @scala.inline
  def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object, stagger: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerFromTo(
    targets: js.Any,
    duration: Double,
    fromVars: js.Object,
    toVars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerFromTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], fromVars.asInstanceOf[js.Any], toVars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
    * small amount of code.
    */
  /* static member */
  @scala.inline
  def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: js.Array[js.Any],
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def staggerTo(
    targets: js.Any,
    duration: Double,
    vars: js.Object,
    stagger: Double,
    onCompleteAll: Unit,
    onCompleteAllParams: Unit,
    onCompleteAllScope: js.Any
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("staggerTo")(targets.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any], stagger.asInstanceOf[js.Any], onCompleteAll.asInstanceOf[js.Any], onCompleteAllParams.asInstanceOf[js.Any], onCompleteAllScope.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /** Static method for creating a TweenMax instance that animates to the specified destination values (from the current values). */
  /* static member */
  @scala.inline
  def to(target: js.Object, duration: Double, vars: TweenConfig): typings.gsap.gsap.TweenMax = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(target.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[typings.gsap.gsap.TweenMax]
}
