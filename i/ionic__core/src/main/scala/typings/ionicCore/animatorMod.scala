package typings.ionicCore

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.ionicCoreNumbers.`32`
import typings.ionicCore.ionicCoreNumbers.`400`
import typings.ionicCore.oldAnimationAnimationInterfaceMod.PlayOptions
import typings.std.HTMLElement
import typings.std.Node
import typings.std.NodeList
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/animation/old-animation/animator", JSImport.Namespace)
@js.native
object animatorMod extends js.Object {
  @js.native
  class Animator () extends js.Object {
    /**
      * NO DOM
      */
    var _addEl: js.Any = js.native
    var _addProp: js.Any = js.native
    var _afterAddClasses: js.UndefOr[js.Any] = js.native
    var _afterRemoveClasses: js.UndefOr[js.Any] = js.native
    var _afterStyles: js.UndefOr[js.Any] = js.native
    var _beforeAddClasses: js.UndefOr[js.Any] = js.native
    var _beforeRemoveClasses: js.UndefOr[js.Any] = js.native
    var _beforeStyles: js.UndefOr[js.Any] = js.native
    var _childAnimations: js.UndefOr[js.Any] = js.native
    var _destroyed: js.Any = js.native
    var _duration: js.UndefOr[js.Any] = js.native
    var _easingName: js.UndefOr[js.Any] = js.native
    var _elements: js.UndefOr[js.Any] = js.native
    var _fxProperties: js.UndefOr[js.Any] = js.native
    /**
      * NO DOM
      */
    var _getProp: js.Any = js.native
    var _hasDur: js.Any = js.native
    var _hasTweenEffect: js.Any = js.native
    var _isAsync: js.Any = js.native
    var _isReverse: js.Any = js.native
    var _onFinishCallbacks: js.UndefOr[js.Any] = js.native
    var _onFinishOneTimeCallbacks: js.UndefOr[js.Any] = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    var _playInit: js.Any = js.native
    var _readCallbacks: js.UndefOr[js.Any] = js.native
    var _reversedEasingName: js.UndefOr[js.Any] = js.native
    var _timerId: js.UndefOr[js.Any] = js.native
    var _unregisterTrnsEnd: js.UndefOr[js.Any] = js.native
    var _writeCallbacks: js.UndefOr[js.Any] = js.native
    var hasChildren: Boolean = js.native
    var hasCompleted: Boolean = js.native
    var isPlaying: Boolean = js.native
    var parent: js.UndefOr[Animator] = js.native
    /**
      * DOM WRITE
      * NO RECURSION
      * ROOT ANIMATION
      */
    def _asyncEnd(dur: Double, shouldComplete: Boolean): Unit = js.native
    /**
      * DOM READ
      * DOM WRITE
      * RECURSION
      */
    def _beforeAnimation(): Unit = js.native
    /**
      * NO DOM
      * NO RECURSION
      */
    def _clearAsync(): Unit = js.native
    /**
      * NO RECURSION
      */
    def _didFinish(hasCompleted: Boolean): Unit = js.native
    /**
      * NO DOM
      * RECURSION
      */
    def _didFinishAll(hasCompleted: Boolean, finishAsyncAnimations: Boolean, finishNoDurationAnimations: Boolean): Unit = js.native
    /**
      * DOM READ
      * RECURSION
      */
    def _fireBeforeReadFunc(): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _fireBeforeWriteFunc(): Unit = js.native
    /**
      * NO DOM
      * RECURSION
      */
    def _hasDomReads(): Boolean = js.native
    def _hasDuration(): Boolean = js.native
    /**
      * NO DOM
      * RECURSION
      */
    def _hasDuration(opts: PlayOptions): Boolean = js.native
    def _playDomInspect(): Unit = js.native
    /**
      * DOM WRITE
      * NO RECURSION
      * ROOT ANIMATION
      */
    def _playDomInspect(opts: PlayOptions): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _playEnd(): Unit = js.native
    def _playEnd(stepValue: Double): Unit = js.native
    def _playProgress(): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _playProgress(opts: PlayOptions): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _playToStep(stepValue: Double): Unit = js.native
    /**
      * DOM WRITE
      * NO RECURSION
      */
    def _progress(stepValue: Double): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _progressEnd(shouldComplete: Boolean, stepValue: Double, dur: Double, isAsync: Boolean): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _progressStart(): Unit = js.native
    /**
      * DOM WRITE
      */
    def _setAfterStyles(): Unit = js.native
    /**
      * DOM WRITE
      * RECURSION
      */
    def _setBeforeStyles(): Unit = js.native
    /**
      * DOM WRITE
      * NO RECURSION
      */
    def _setTrans(dur: Double, forcedLinearEasing: Boolean): Unit = js.native
    /**
      * NO DOM
      */
    def _transEl(): HTMLElement | Null = js.native
    /**
      * DOM WRITE
      * NO RECURSION
      */
    def _willChange(addWillChange: Boolean): Unit = js.native
    /**
      * Add a child animation to this animation.
      */
    def add(childAnimation: Animator): Animator = js.native
    def addElement(): Animator = js.native
    def addElement(el: js.Array[Node]): Animator = js.native
    def addElement(el: Node): Animator = js.native
    def addElement(el: NodeList): Animator = js.native
    /**
      * Add CSS class to this animation's elements
      * after the animation finishes.
      */
    def afterAddClass(className: String): Animator = js.native
    /**
      * Clear CSS inline styles from this animation's elements
      * after the animation finishes.
      */
    def afterClearStyles(propertyNames: js.Array[String]): Animator = js.native
    /**
      * Remove CSS class from this animation's elements
      * after the animation finishes.
      */
    def afterRemoveClass(className: String): Animator = js.native
    /**
      * Set CSS inline styles to this animation's elements
      * after the animation finishes.
      */
    def afterStyles(styles: StringDictionary[js.Any]): Animator = js.native
    /**
      * Add CSS class to this animation's elements
      * before the animation begins.
      */
    def beforeAddClass(className: String): Animator = js.native
    /**
      * Add a function which contains DOM reads, which will run
      * before the animation begins.
      */
    def beforeAddRead(domReadFn: js.Function0[Unit]): Animator = js.native
    /**
      * Add a function which contains DOM writes, which will run
      * before the animation begins.
      */
    def beforeAddWrite(domWriteFn: js.Function0[Unit]): Animator = js.native
    /**
      * Clear CSS inline styles from this animation's elements
      * before the animation begins.
      */
    def beforeClearStyles(propertyNames: js.Array[String]): Animator = js.native
    /**
      * Remove CSS class from this animation's elements
      * before the animation begins.
      */
    def beforeRemoveClass(className: String): Animator = js.native
    /**
      * Set CSS inline styles to this animation's elements
      * before the animation begins.
      */
    def beforeStyles(styles: StringDictionary[js.Any]): Animator = js.native
    /**
      * Recursively destroy this animation and all child animations.
      */
    def destroy(): Unit = js.native
    /**
      * Set the duration for this animation.
      */
    def duration(milliseconds: Double): Animator = js.native
    /**
      * Set the easing for this animation.
      */
    def easing(name: String): Animator = js.native
    /**
      * Set the easing for this reversed animation.
      */
    def easingReverse(name: String): Animator = js.native
    /**
      * Add the "from" value for a specific property.
      */
    def from(prop: String, `val`: js.Any): Animator = js.native
    /**
      * Shortcut to add both the "from" and "to" for the same property.
      */
    def fromTo(prop: String, fromVal: js.Any, toVal: js.Any): Animator = js.native
    def fromTo(prop: String, fromVal: js.Any, toVal: js.Any, clearProperyAfterTransition: Boolean): Animator = js.native
    /**
      * Get the duration of this animation. If this animation does
      * not have a duration, then it'll get the duration from its parent.
      */
    def getDuration(): Double = js.native
    def getDuration(opts: PlayOptions): Double = js.native
    /**
      * Get the easing of this animation. If this animation does
      * not have an easing, then it'll get the easing from its parent.
      */
    def getEasing(): String | Null = js.native
    /**
      * Returns if the animation is a root one.
      */
    def isRoot(): Boolean = js.native
    /**
      * Add a callback to fire when the animation has finished.
      */
    def onFinish(callback: js.Function1[/* animation */ js.UndefOr[js.Any], Unit]): Animator = js.native
    def onFinish(callback: js.Function1[/* animation */ js.UndefOr[js.Any], Unit], opts: AnonClearExistingCallbacks): Animator = js.native
    /**
      * Play the animation.
      */
    def play(): Unit = js.native
    def play(opts: PlayOptions): Unit = js.native
    def playAsync(): js.Promise[Animator] = js.native
    def playAsync(opts: PlayOptions): js.Promise[Animator] = js.native
    def playSync(): Unit = js.native
    /**
      * End the progress animation.
      */
    def progressEnd(shouldComplete: Boolean, currentStepValue: Double): Unit = js.native
    def progressEnd(shouldComplete: Boolean, currentStepValue: Double, dur: Double): Unit = js.native
    /**
      * Start the animation with a user controlled progress.
      */
    def progressStart(): Unit = js.native
    /**
      * Set the progress step for this animation.
      * progressStep() is not debounced, so it should not be called faster than 60FPS.
      */
    def progressStep(stepValue: Double): Unit = js.native
    /**
      * Reverse the animation.
      */
    def reverse(): Animator = js.native
    def reverse(shouldReverse: Boolean): Animator = js.native
    /**
      * Immediately stop at the end of the animation.
      */
    def stop(): Unit = js.native
    def stop(stepValue: Double): Unit = js.native
    /**
      * Add the "to" value for a specific property.
      */
    def to(prop: String, `val`: js.Any): Animator = js.native
    def to(prop: String, `val`: js.Any, clearProperyAfterTransition: Boolean): Animator = js.native
  }
  
  val CSS_VALUE_REGEX: RegExp = js.native
  val DURATION_MIN: `32` = js.native
  val TRANSITION_END_FALLBACK_PADDING_MS: `400` = js.native
  @js.native
  object TRANSFORM_PROPS extends /* key */ StringDictionary[Double]
  
}

