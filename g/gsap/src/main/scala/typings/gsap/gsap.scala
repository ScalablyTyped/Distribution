package typings.gsap

import org.scalablytyped.runtime.StringDictionary
import typings.gsap.anon.Name
import typings.gsap.gsapStrings.both
import typings.gsap.gsapStrings.in
import typings.gsap.gsapStrings.none
import typings.gsap.gsapStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gsap {
  
  @js.native
  trait Animation extends StObject {
    
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
    def eventCallback(`type`: String, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): Animation = js.native
    def eventCallback(
      `type`: String,
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.Array[js.Any],
      scope: js.Any
    ): Animation = js.native
    def eventCallback(`type`: String, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): Animation = js.native
    
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
    def kill(vars: js.Object): Animation = js.native
    def kill(vars: js.Object, target: js.Object): Animation = js.native
    def kill(vars: Unit, target: js.Object): Animation = js.native
    
    /** Pauses the instance, optionally jumping to a specific time. */
    def pause(): Animation = js.native
    def pause(atTime: js.Any): Animation = js.native
    def pause(atTime: js.Any, suppressEvents: Boolean): Animation = js.native
    def pause(atTime: Unit, suppressEvents: Boolean): Animation = js.native
    
    /** Gets or sets the animation's paused state which indicates whether or not the animation is currently paused. */
    def paused(): Boolean = js.native
    def paused(value: Boolean): Animation = js.native
    
    /** Begins playing forward, optionally from a specific time (by default playback begins from wherever the playhead currently is). */
    def play(): Animation = js.native
    def play(from: js.Any): Animation = js.native
    def play(from: js.Any, suppressEvents: Boolean): Animation = js.native
    def play(from: Unit, suppressEvents: Boolean): Animation = js.native
    
    /**
      * Gets or sets the animations's progress which is a value between 0 and 1 indicating the position of the virtual playhead (excluding repeats) where 0 is at the beginning, 0.5 is at the
      * halfway point, and 1 is at the end (complete).
      */
    def progress(): Double = js.native
    def progress(value: Double): Animation = js.native
    def progress(value: Double, suppressEvents: Boolean): Animation = js.native
    
    /** Restarts and begins playing forward from the beginning. */
    def restart(): Animation = js.native
    def restart(includeDelay: Boolean): Animation = js.native
    def restart(includeDelay: Boolean, suppressEvents: Boolean): Animation = js.native
    def restart(includeDelay: Unit, suppressEvents: Boolean): Animation = js.native
    
    /** Resumes playing without altering direction (forward or reversed), optionally jumping to a specific time first. */
    def resume(): Animation = js.native
    def resume(from: js.Any): Animation = js.native
    def resume(from: js.Any, suppressEvents: Boolean): Animation = js.native
    def resume(from: Unit, suppressEvents: Boolean): Animation = js.native
    
    /** Reverses playback so that all aspects of the animation are oriented backwards including, for example, a tween's ease. */
    def reverse(): Animation = js.native
    def reverse(from: js.Any): Animation = js.native
    def reverse(from: js.Any, suppressEvents: Boolean): Animation = js.native
    def reverse(from: Unit, suppressEvents: Boolean): Animation = js.native
    
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
  
  trait Back
    extends StObject
       with Ease {
    
    def config(overshoot: Double): Elastic
  }
  object Back {
    
    inline def apply(config: Double => Elastic, getRatio: Double => Double): Back = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
      __obj.asInstanceOf[Back]
    }
    
    extension [Self <: Back](x: Self) {
      
      inline def setConfig(value: Double => Elastic): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BezierPlugin
    extends StObject
       with TweenPlugin {
    
    def bezierThrough(values: js.Array[js.Any]): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Double): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Double, quadratic: Boolean): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Double, quadratic: Boolean, correlate: String): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: String,
      prepend: js.Object
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: String,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: String,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: Unit,
      prepend: js.Object
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: Unit,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Boolean,
      correlate: Unit,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Double, quadratic: Unit, correlate: String): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Unit,
      correlate: String,
      prepend: js.Object
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Unit,
      correlate: String,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Unit,
      correlate: String,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Double, quadratic: Unit, correlate: Unit, prepend: js.Object): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Unit,
      correlate: Unit,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Double,
      quadratic: Unit,
      correlate: Unit,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Boolean): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Boolean, correlate: String): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Boolean,
      correlate: String,
      prepend: js.Object
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Boolean,
      correlate: String,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Boolean,
      correlate: String,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Boolean, correlate: Unit, prepend: js.Object): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Boolean,
      correlate: Unit,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Boolean,
      correlate: Unit,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Unit, correlate: String): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Unit, correlate: String, prepend: js.Object): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Unit,
      correlate: String,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Unit,
      correlate: String,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(values: js.Array[js.Any], curviness: Unit, quadratic: Unit, correlate: Unit, prepend: js.Object): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Unit,
      correlate: Unit,
      prepend: js.Object,
      calcDifs: Boolean
    ): js.Object = js.native
    def bezierThrough(
      values: js.Array[js.Any],
      curviness: Unit,
      quadratic: Unit,
      correlate: Unit,
      prepend: Unit,
      calcDifs: Boolean
    ): js.Object = js.native
    
    def cubicToQuadratic(a: Double, b: Double, c: Double, d: Double): js.Array[js.Any] = js.native
    
    def quadraticToCubic(a: Double, b: Double, c: Double): js.Object = js.native
  }
  
  type Bounce = Ease
  
  trait CSSRulePlugin
    extends StObject
       with TweenPlugin {
    
    def getRule(selector: String): js.Object
  }
  object CSSRulePlugin {
    
    inline def apply(activate: js.Array[js.Any] => Boolean, getRule: String => js.Object): CSSRulePlugin = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), getRule = js.Any.fromFunction1(getRule))
      __obj.asInstanceOf[CSSRulePlugin]
    }
    
    extension [Self <: CSSRulePlugin](x: Self) {
      
      inline def setGetRule(value: String => js.Object): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
    }
  }
  
  type Circ = Ease
  
  type Cubic = Ease
  
  trait Ease extends StObject {
    
    /** Translates the tween's progress ratio into the corresponding ease ratio. */
    def getRatio(p: Double): Double
  }
  object Ease {
    
    inline def apply(getRatio: Double => Double): Ease = {
      val __obj = js.Dynamic.literal(getRatio = js.Any.fromFunction1(getRatio))
      __obj.asInstanceOf[Ease]
    }
    
    extension [Self <: Ease](x: Self) {
      
      inline def setGetRatio(value: Double => Double): Self = StObject.set(x, "getRatio", js.Any.fromFunction1(value))
    }
  }
  
  trait EaseLookup extends StObject {
    
    def find(name: String): Ease
  }
  object EaseLookup {
    
    inline def apply(find: String => Ease): EaseLookup = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
      __obj.asInstanceOf[EaseLookup]
    }
    
    extension [Self <: EaseLookup](x: Self) {
      
      inline def setFind(value: String => Ease): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    }
  }
  
  trait Elastic
    extends StObject
       with Ease {
    
    def config(amplitude: Double, period: Double): Elastic
  }
  object Elastic {
    
    inline def apply(config: (Double, Double) => Elastic, getRatio: Double => Double): Elastic = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction2(config), getRatio = js.Any.fromFunction1(getRatio))
      __obj.asInstanceOf[Elastic]
    }
    
    extension [Self <: Elastic](x: Self) {
      
      inline def setConfig(value: (Double, Double) => Elastic): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
    }
  }
  
  type Expo = Ease
  
  type Linear = Ease
  
  /* was `typeof Linear` */
  type Power0 = Linear
  
  /* was `typeof Quad` */
  type Power1 = Quad
  
  /* was `typeof Cubic` */
  type Power2 = Cubic
  
  /* was `typeof Quart` */
  type Power3 = Quart
  
  /* was `typeof Quint` */
  type Power4 = Quint
  
  type Quad = Ease
  
  type Quart = Ease
  
  type Quint = Ease
  
  @js.native
  trait RoughEase
    extends StObject
       with Ease {
    
    def config(): RoughEase = js.native
    def config(steps: Double): RoughEase = js.native
  }
  
  trait RoughEaseConfig extends StObject {
    
    var clamp: js.UndefOr[Boolean] = js.undefined
    
    var points: js.UndefOr[Double] = js.undefined
    
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    var strength: js.UndefOr[Double] = js.undefined
    
    var taper: js.UndefOr[in | out | both | none] = js.undefined
    
    var template: js.UndefOr[Ease] = js.undefined
  }
  object RoughEaseConfig {
    
    inline def apply(): RoughEaseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoughEaseConfig]
    }
    
    extension [Self <: RoughEaseConfig](x: Self) {
      
      inline def setClamp(value: Boolean): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
      
      inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
      
      inline def setTaper(value: in | out | both | none): Self = StObject.set(x, "taper", value.asInstanceOf[js.Any])
      
      inline def setTaperUndefined: Self = StObject.set(x, "taper", js.undefined)
      
      inline def setTemplate(value: Ease): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
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
  
  type Sine = Ease
  
  trait SlowMo
    extends StObject
       with Ease {
    
    def config(linearRatio: Double, power: Double, yoyoMode: Boolean): SlowMo
  }
  object SlowMo {
    
    inline def apply(config: (Double, Double, Boolean) => SlowMo, getRatio: Double => Double): SlowMo = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction3(config), getRatio = js.Any.fromFunction1(getRatio))
      __obj.asInstanceOf[SlowMo]
    }
    
    extension [Self <: SlowMo](x: Self) {
      
      inline def setConfig(value: (Double, Double, Boolean) => SlowMo): Self = StObject.set(x, "config", js.Any.fromFunction3(value))
    }
  }
  
  trait SteppedEase
    extends StObject
       with Ease {
    
    def config(steps: Double): SteppedEase
  }
  object SteppedEase {
    
    inline def apply(config: Double => SteppedEase, getRatio: Double => Double): SteppedEase = {
      val __obj = js.Dynamic.literal(config = js.Any.fromFunction1(config), getRatio = js.Any.fromFunction1(getRatio))
      __obj.asInstanceOf[SteppedEase]
    }
    
    extension [Self <: SteppedEase](x: Self) {
      
      inline def setConfig(value: Double => SteppedEase): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    }
  }
  
  /* was `typeof Quint` */
  type Strong = Quint
  
  /* Rewritten from type alias, can be one of: 
    - typings.gsap.gsap.SimpleTimeline
    - typings.gsap.gsap.TimelineLite
    - typings.gsap.gsap.TimelineMax
  */
  trait Timeline extends StObject
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.gsap.gsap.Timeline because Already inherited */ @js.native
  trait TimelineLite
    extends StObject
       with SimpleTimeline {
    
    /** Adds a label to the timeline, making it easy to mark important positions/times. */
    def addLabel(label: String, position: js.Any): TimelineLite = js.native
    
    /** Inserts a special callback that pauses playback of the timeline at a particular time or label. */
    def addPause(): TimelineLite = js.native
    def addPause(position: js.Any): TimelineLite = js.native
    def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
    def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
    def addPause(
      position: js.Any,
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.Array[js.Any],
      scope: js.Any
    ): TimelineLite = js.native
    def addPause(position: js.Any, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
    def addPause(position: js.Any, callback: Unit, params: js.Array[js.Any]): TimelineLite = js.native
    def addPause(position: js.Any, callback: Unit, params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
    def addPause(position: js.Any, callback: Unit, params: Unit, scope: js.Any): TimelineLite = js.native
    def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
    def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
    def addPause(
      position: Unit,
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.Array[js.Any],
      scope: js.Any
    ): TimelineLite = js.native
    def addPause(position: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
    def addPause(position: Unit, callback: Unit, params: js.Array[js.Any]): TimelineLite = js.native
    def addPause(position: Unit, callback: Unit, params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
    def addPause(position: Unit, callback: Unit, params: Unit, scope: js.Any): TimelineLite = js.native
    
    /**
      * Adds a callback to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
      * add( TweenLite.delayedCall(...) ) but with less code.
      */
    def call(callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineLite = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any]): TimelineLite = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: js.Array[js.Any], scope: js.Any): TimelineLite = js.native
    def call(
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.Array[js.Any],
      scope: js.Any,
      position: js.Any
    ): TimelineLite = js.native
    def call(
      callback: js.Function1[/* repeated */ js.Any, Unit],
      params: js.Array[js.Any],
      scope: Unit,
      position: js.Any
    ): TimelineLite = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any): TimelineLite = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: js.Any, position: js.Any): TimelineLite = js.native
    def call(callback: js.Function1[/* repeated */ js.Any, Unit], params: Unit, scope: Unit, position: js.Any): TimelineLite = js.native
    
    /** Empties the timeline of all tweens, timelines, and callbacks (and optionally labels too). */
    def clear(): TimelineLite = js.native
    def clear(labels: Boolean): TimelineLite = js.native
    
    /** Returns the time at which the animation will finish according to the parent timeline's local time. */
    def endTime(): Double = js.native
    def endTime(includeRepeats: Boolean): Double = js.native
    
    /**
      * Adds a TweenLite.from() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
      * add( TweenLite.from(...) ) but with less code.
      */
    def from(target: js.Object, duration: Double, vars: js.Object): TimelineLite = js.native
    def from(target: js.Object, duration: Double, vars: js.Object, position: js.Any): TimelineLite = js.native
    
    /** Adds a TweenLite.fromTo() tween to the end of the timeline - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.fromTo(...) ) but with less code. */
    def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
    def fromTo(target: js.Object, duration: Double, fromVars: js.Object, toVars: js.Object, position: js.Any): TimelineLite = js.native
    
    /** Returns an array containing all the tweens and/or timelines nested in this timeline. */
    def getChildren(): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Boolean, timelines: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Boolean, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Boolean, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Unit, timelines: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Unit, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Boolean, tweens: Unit, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Boolean, timelines: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Boolean, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Boolean, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Unit, timelines: Boolean): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Unit, timelines: Boolean, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    def getChildren(nested: Unit, tweens: Unit, timelines: Unit, ignoreBeforeTime: Double): js.Array[Tween | Timeline] = js.native
    
    /** Returns the time associated with a particular label. */
    def getLabelTime(label: String): Double = js.native
    
    /** Returns the tweens of a particular object that are inside this timeline. */
    def getTweensOf(target: js.Object): js.Array[Tween] = js.native
    def getTweensOf(target: js.Object, nested: Boolean): js.Array[Tween] = js.native
    
    /** Returns the most recently added child tween/timeline/callback regardless of its position in the timeline. */
    def recent(): Animation = js.native
    
    /** Removes a tween, timeline, callback, or label (or array of them) from the timeline. */
    def remove(value: js.Any): TimelineLite = js.native
    
    /** Removes a label from the timeline and returns the time of that label. */
    def removeLabel(label: String): js.Any = js.native
    
    /** Jumps to a specific time (or label) without affecting whether or not the instance is paused or reversed. */
    def seek(position: String): TimelineLite = js.native
    def seek(position: String, supressEvents: Boolean): TimelineLite = js.native
    def seek(position: Double): TimelineLite = js.native
    def seek(position: Double, supressEvents: Boolean): TimelineLite = js.native
    
    /**
      * Adds a zero-duration tween to the end of the timeline (or elsewhere using the "position" parameter) that sets values immediately (when the virtual playhead reaches that
      * position on the timeline) - this is a convenience method that accomplishes exactly the same thing as add( TweenLite.to(target, 0, {...}) ) but with less code.
      */
    def set(target: js.Object, vars: js.Object): TimelineLite = js.native
    def set(target: js.Object, vars: js.Object, position: js.Any): TimelineLite = js.native
    
    /** Shifts the startTime of the timeline's children by a certain amount and optionally adjusts labels too. */
    def shiftChildren(amount: Double): TimelineLite = js.native
    def shiftChildren(amount: Double, adjustLabels: Boolean): TimelineLite = js.native
    def shiftChildren(amount: Double, adjustLabels: Boolean, ignoreBeforeTime: Double): TimelineLite = js.native
    def shiftChildren(amount: Double, adjustLabels: Unit, ignoreBeforeTime: Double): TimelineLite = js.native
    
    /**
      * Tweens an array of targets from a common set of destination values (using the current values as the destination), but staggers their start times by a specified amount of time,
      * creating an evenly-spaced sequence with a surprisingly small amount of code.
      */
    def staggerFrom(targets: js.Any, duration: Double, vars: js.Object): TimelineLite = js.native
    def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): TimelineLite = js.native
    def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Double, position: js.Any): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(targets: js.Any, duration: Double, vars: js.Object, stagger: Unit, position: js.Any): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    def staggerFrom(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteScope: js.Any
    ): TimelineLite = js.native
    
    /**
      * Tweens an array of targets from and to a common set of values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
      * small amount of code.
      */
    def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object): TimelineLite = js.native
    def staggerFromTo(targets: js.Any, duration: Double, fromVars: js.Object, toVars: js.Object, stagger: Double): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerFromTo(
      targets: js.Any,
      duration: Double,
      fromVars: js.Object,
      toVars: js.Object,
      stagger: Unit,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    
    /**
      * Tweens an array of targets to a common set of destination values, but staggers their start times by a specified amount of time, creating an evenly-spaced sequence with a surprisingly
      * small amount of code.
      */
    def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double): TimelineLite = js.native
    def staggerTo(targets: js.Any, duration: Double, vars: js.Object, stagger: Double, position: js.Any): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: js.Any,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: js.Function1[/* repeated */ js.Any, Unit],
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any]
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: js.Array[js.Any],
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    def staggerTo(
      targets: js.Any,
      duration: Double,
      vars: js.Object,
      stagger: Double,
      position: Unit,
      onCompleteAll: Unit,
      onCompleteAllParams: Unit,
      onCompleteAllScope: js.Any
    ): TimelineLite = js.native
    
    /**
      * Adds a TweenLite.to() tween to the end of the timeline (or elsewhere using the "position" parameter) - this is a convenience method that accomplishes exactly the same thing as
      * add( TweenLite.to(...) ) but with less code.
      */
    def to(target: js.Object, duration: Double, vars: js.Object): TimelineLite = js.native
    def to(target: js.Object, duration: Double, vars: js.Object, position: js.Any): TimelineLite = js.native
    
    /** If true, the timeline's timing mode is frames-based instead of seconds. */
    def useFrames(): Boolean = js.native
    
    def usesFrames(): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.gsap.gsap.Timeline because Already inherited */ @js.native
  trait TimelineMax
    extends StObject
       with TimelineLite {
    
    def addCallback(callback: js.Function1[/* repeated */ js.Any, Unit], position: js.Any): TimelineMax = js.native
    def addCallback(callback: js.Function1[/* repeated */ js.Any, Unit], position: js.Any, params: js.Array[js.Any]): TimelineMax = js.native
    def addCallback(
      callback: js.Function1[/* repeated */ js.Any, Unit],
      position: js.Any,
      params: js.Array[js.Any],
      scope: js.Any
    ): TimelineMax = js.native
    def addCallback(callback: js.Function1[/* repeated */ js.Any, Unit], position: js.Any, params: Unit, scope: js.Any): TimelineMax = js.native
    
    def currentLabel(): String = js.native
    def currentLabel(value: String): TimelineMax = js.native
    
    def getActive(): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Boolean, tweens: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Boolean, tweens: Boolean, timelines: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Boolean, tweens: Unit, timelines: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Unit, tweens: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Unit, tweens: Boolean, timelines: Boolean): Tween | js.Array[Timeline] = js.native
    def getActive(nested: Unit, tweens: Unit, timelines: Boolean): Tween | js.Array[Timeline] = js.native
    
    def getLabelAfter(time: Double): String = js.native
    
    def getLabelBefore(time: Double): String = js.native
    
    def getLabelsArray(): js.Array[Name] = js.native
    
    def removeCallback(callback: js.Function1[/* repeated */ js.Any, Unit]): TimelineMax = js.native
    def removeCallback(callback: js.Function1[/* repeated */ js.Any, Unit], timeOrLabel: js.Any): TimelineMax = js.native
    
    def removePause(position: js.Any): TimelineMax = js.native
    
    def repeat(): Double = js.native
    def repeat(value: Double): TimelineMax = js.native
    
    def repeatDelay(): Double = js.native
    def repeatDelay(value: Double): TimelineMax = js.native
    
    def tweenFromTo(fromPosition: js.Any, toPosition: js.Any): TweenLite = js.native
    def tweenFromTo(fromPosition: js.Any, toPosition: js.Any, vars: js.Object): TweenLite = js.native
    
    def tweenTo(position: js.Any): TweenLite = js.native
    def tweenTo(position: js.Any, vars: js.Object): TweenLite = js.native
    
    def yoyo(): Boolean = js.native
    def yoyo(value: Boolean): TimelineMax = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gsap.gsap.TweenLite
    - typings.gsap.gsap.TweenMax
  */
  trait Tween extends StObject
  
  trait TweenConfig
    extends StObject
       with /** Any tweenable property */
  /* p */ StringDictionary[js.Any] {
    
    /** If true atuomatically populates the css property for tween on DOM elements */
    var autoCSS: js.UndefOr[Boolean] = js.undefined
    
    /** The scope to be used for all of the callbacks (onStart, onUpdate, onComplete, etc.). The scope is what "this" refers to inside any of the callbacks. */
    var callbackScope: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Amount of delay in seconds (or frames for frames-based tweens) before the animation should begin.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** Ease (or () => void or String) - You can choose from various eases to control the rate of change during the animation, giving it a specific "feel". */
    var ease: js.UndefOr[Ease] = js.undefined
    
    /**
      * Normally when you create a tween, it begins rendering on the very next frame (update cycle) unless you specify a delay. However, if you prefer to force the tween to render
      * immediately when it is created, setimmediateRender to true. Or to prevent a from() from rendering immediately, set immediateRender to false. By default, from() tweens set
      * immediateRender to true.
      */
    var immediateRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a tween renders for the very first time and reads its starting values, GSAP will automatically "lazy render" that particular tick by default, meaning it will try to delay the
      * rendering (writing of values) until the very end of the "tick" cycle which can improve performance because it avoids the read/write/read/write layout thrashing that some browsers do.
      *
      * If you would like to disable lazy rendering for a particular tween, you can set lazy:false. Or, since zero-duration tweens do not lazy-render by default, you can specifically give it
      * permission to lazy-render by setting lazy:true like TweenLite.set(element, {opacity:0, lazy:true});. In most cases, you won't need to set lazy.
      */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /**  A () => void that should be called when the animation has completed. */
    var onComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /** An Array of parameters to pass the onComplete () => void */
    var onCompleteParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Defines the scope of the onComplete () => void (what "this" refers to inside that () => void). */
    var onCompleteScope: js.UndefOr[js.Object] = js.undefined
    
    /** A () => void that should be called when the tween gets overwritten by another tween. */
    var onOverwrite: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onRepeat: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var onRepeatScope: js.UndefOr[js.Object] = js.undefined
    
    /** A () => void that should be called when the tween has reached its beginning again from the reverse direction. */
    var onReverseComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /** An Array of parameters to pass the onReverseComplete () => void. */
    var onReverseCompleteParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Defines the scope of the onReverseComplete () => void (what "this" refers to inside that () => void). */
    var onReverseCompleteScope: js.UndefOr[js.Object] = js.undefined
    
    /** A () => void that should be called when the tween begins (when its time changes from 0 to some other value which can happen more than once if the tween is restarted multiple times). */
    var onStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /** An Array of parameters to pass the onStart () => void. */
    var onStartParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Defines the scope of the onStart () => void (what "this" refers to inside that () => void). */
    var onStartScope: js.UndefOr[js.Object] = js.undefined
    
    /** A () => void that should be called every time the animation updates (on every frame while the animation is active). */
    var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    /** An Array of parameters to pass the onUpdate () => void. */
    var onUpdateParams: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Defines the scope of the onUpdate () => void (what "this" refers to inside that () => void). */
    var onUpdateScope: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Controls how (and if) other tweens of the same target are overwritten. There are several modes to choose from, but "auto" is the default (although you can change the default mode using
      * theTweenLite.defaultOverwrite property)
      */
    var overwrite: js.UndefOr[String | Double] = js.undefined
    
    /** If true, the tween will pause itself immediately upon creation. */
    var paused: js.UndefOr[Boolean] = js.undefined
    
    var repeat: js.UndefOr[Double] = js.undefined
    
    var repeatDelay: js.UndefOr[Double] = js.undefined
    
    var startAt: js.UndefOr[js.Object] = js.undefined
    
    /**
      * If useFrames is true, the tweens's timing will be based on frames instead of seconds because it is intially added to the root frames-based timeline. This causes both its duration and
      * delay to be based on frames. An animations's timing mode is always determined by its parent timeline.
      */
    var useFrames: js.UndefOr[Boolean] = js.undefined
    
    var yoyo: js.UndefOr[Boolean] = js.undefined
  }
  object TweenConfig {
    
    inline def apply(): TweenConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TweenConfig]
    }
    
    extension [Self <: TweenConfig](x: Self) {
      
      inline def setAutoCSS(value: Boolean): Self = StObject.set(x, "autoCSS", value.asInstanceOf[js.Any])
      
      inline def setAutoCSSUndefined: Self = StObject.set(x, "autoCSS", js.undefined)
      
      inline def setCallbackScope(value: js.Object): Self = StObject.set(x, "callbackScope", value.asInstanceOf[js.Any])
      
      inline def setCallbackScopeUndefined: Self = StObject.set(x, "callbackScope", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEase(value: Ease): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setImmediateRender(value: Boolean): Self = StObject.set(x, "immediateRender", value.asInstanceOf[js.Any])
      
      inline def setImmediateRenderUndefined: Self = StObject.set(x, "immediateRender", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setOnComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnCompleteParams(value: js.Array[js.Any]): Self = StObject.set(x, "onCompleteParams", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteParamsUndefined: Self = StObject.set(x, "onCompleteParams", js.undefined)
      
      inline def setOnCompleteParamsVarargs(value: js.Any*): Self = StObject.set(x, "onCompleteParams", js.Array(value :_*))
      
      inline def setOnCompleteScope(value: js.Object): Self = StObject.set(x, "onCompleteScope", value.asInstanceOf[js.Any])
      
      inline def setOnCompleteScopeUndefined: Self = StObject.set(x, "onCompleteScope", js.undefined)
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnOverwrite(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onOverwrite", js.Any.fromFunction1(value))
      
      inline def setOnOverwriteUndefined: Self = StObject.set(x, "onOverwrite", js.undefined)
      
      inline def setOnRepeat(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction1(value))
      
      inline def setOnRepeatScope(value: js.Object): Self = StObject.set(x, "onRepeatScope", value.asInstanceOf[js.Any])
      
      inline def setOnRepeatScopeUndefined: Self = StObject.set(x, "onRepeatScope", js.undefined)
      
      inline def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
      
      inline def setOnReverseComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onReverseComplete", js.Any.fromFunction1(value))
      
      inline def setOnReverseCompleteParams(value: js.Array[js.Any]): Self = StObject.set(x, "onReverseCompleteParams", value.asInstanceOf[js.Any])
      
      inline def setOnReverseCompleteParamsUndefined: Self = StObject.set(x, "onReverseCompleteParams", js.undefined)
      
      inline def setOnReverseCompleteParamsVarargs(value: js.Any*): Self = StObject.set(x, "onReverseCompleteParams", js.Array(value :_*))
      
      inline def setOnReverseCompleteScope(value: js.Object): Self = StObject.set(x, "onReverseCompleteScope", value.asInstanceOf[js.Any])
      
      inline def setOnReverseCompleteScopeUndefined: Self = StObject.set(x, "onReverseCompleteScope", js.undefined)
      
      inline def setOnReverseCompleteUndefined: Self = StObject.set(x, "onReverseComplete", js.undefined)
      
      inline def setOnStart(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartParams(value: js.Array[js.Any]): Self = StObject.set(x, "onStartParams", value.asInstanceOf[js.Any])
      
      inline def setOnStartParamsUndefined: Self = StObject.set(x, "onStartParams", js.undefined)
      
      inline def setOnStartParamsVarargs(value: js.Any*): Self = StObject.set(x, "onStartParams", js.Array(value :_*))
      
      inline def setOnStartScope(value: js.Object): Self = StObject.set(x, "onStartScope", value.asInstanceOf[js.Any])
      
      inline def setOnStartScopeUndefined: Self = StObject.set(x, "onStartScope", js.undefined)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnUpdate(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateParams(value: js.Array[js.Any]): Self = StObject.set(x, "onUpdateParams", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateParamsUndefined: Self = StObject.set(x, "onUpdateParams", js.undefined)
      
      inline def setOnUpdateParamsVarargs(value: js.Any*): Self = StObject.set(x, "onUpdateParams", js.Array(value :_*))
      
      inline def setOnUpdateScope(value: js.Object): Self = StObject.set(x, "onUpdateScope", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateScopeUndefined: Self = StObject.set(x, "onUpdateScope", js.undefined)
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOverwrite(value: String | Double): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatDelay(value: Double): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      inline def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setStartAt(value: js.Object): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setUseFrames(value: Boolean): Self = StObject.set(x, "useFrames", value.asInstanceOf[js.Any])
      
      inline def setUseFramesUndefined: Self = StObject.set(x, "useFrames", js.undefined)
      
      inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  @js.native
  trait TweenLite
    extends StObject
       with Animation
       with Tween {
    
    /** Target object (or array of objects) whose properties the tween affects. */
    val target: js.Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.gsap.gsap.Tween because Already inherited */ @js.native
  trait TweenMax
    extends StObject
       with TweenLite {
    
    /**
      * Gets or sets the tween's progress which is a value between 0 and 1 indicating the position of the virtual playhead (excluding repeats) where 0 is at the beginning, 0.5 is halfway
      * complete, and 1 is complete.
      */
    def repeat(): Double = js.native
    def repeat(value: Double): TweenMax = js.native
    
    /** Gets or sets the amount of time in seconds (or frames for frames-based tweens) between repeats. */
    def repeatDelay(): Double = js.native
    def repeatDelay(value: Double): TweenMax = js.native
    
    /** Updates tweening values on the fly so that they appear to seamlessly change course even if the tween is in-progress. */
    def updateTo(vars: js.Object): TweenMax = js.native
    def updateTo(vars: js.Object, resetDuration: Boolean): TweenMax = js.native
    
    /** Gets or sets the tween's yoyo state, where true causes the tween to go back and forth, alternating backward and forward on each repeat. */
    def yoyo(): Boolean = js.native
    def yoyo(value: Boolean): TweenMax = js.native
    @JSName("yoyo")
    def yoyo_TweenMax(): TweenMax = js.native
  }
  
  trait TweenPlugin extends StObject {
    
    def activate(plugins: js.Array[js.Any]): Boolean
  }
  object TweenPlugin {
    
    inline def apply(activate: js.Array[js.Any] => Boolean): TweenPlugin = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate))
      __obj.asInstanceOf[TweenPlugin]
    }
    
    extension [Self <: TweenPlugin](x: Self) {
      
      inline def setActivate(value: js.Array[js.Any] => Boolean): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    }
  }
}
