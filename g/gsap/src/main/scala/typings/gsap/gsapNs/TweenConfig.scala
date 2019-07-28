package typings.gsap.gsapNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenConfig
  extends /** Any tweenable property */
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
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the scope of the onComplete () => void (what "this" refers to inside that () => void). */
  var onCompleteScope: js.UndefOr[js.Object] = js.undefined
  /** A () => void that should be called when the tween gets overwritten by another tween. */
  var onOverwrite: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onRepeat: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onRepeatScope: js.UndefOr[js.Object] = js.undefined
  /** A () => void that should be called when the tween has reached its beginning again from the reverse direction. */
  var onReverseComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** An Array of parameters to pass the onReverseComplete () => void. */
  var onReverseCompleteParams: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the scope of the onReverseComplete () => void (what "this" refers to inside that () => void). */
  var onReverseCompleteScope: js.UndefOr[js.Object] = js.undefined
  /** A () => void that should be called when the tween begins (when its time changes from 0 to some other value which can happen more than once if the tween is restarted multiple times). */
  var onStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** An Array of parameters to pass the onStart () => void. */
  var onStartParams: js.UndefOr[js.Array[_]] = js.undefined
  /** Defines the scope of the onStart () => void (what "this" refers to inside that () => void). */
  var onStartScope: js.UndefOr[js.Object] = js.undefined
  /** A () => void that should be called every time the animation updates (on every frame while the animation is active). */
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** An Array of parameters to pass the onUpdate () => void. */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.undefined
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
  @scala.inline
  def apply(
    StringDictionary: /** Any tweenable property */
  /* p */ StringDictionary[js.Any] = null,
    autoCSS: js.UndefOr[Boolean] = js.undefined,
    callbackScope: js.Object = null,
    delay: Int | Double = null,
    ease: Ease = null,
    immediateRender: js.UndefOr[Boolean] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    onComplete: /* repeated */ js.Any => Unit = null,
    onCompleteParams: js.Array[_] = null,
    onCompleteScope: js.Object = null,
    onOverwrite: /* repeated */ js.Any => Unit = null,
    onRepeat: /* repeated */ js.Any => Unit = null,
    onRepeatScope: js.Object = null,
    onReverseComplete: /* repeated */ js.Any => Unit = null,
    onReverseCompleteParams: js.Array[_] = null,
    onReverseCompleteScope: js.Object = null,
    onStart: /* repeated */ js.Any => Unit = null,
    onStartParams: js.Array[_] = null,
    onStartScope: js.Object = null,
    onUpdate: /* repeated */ js.Any => Unit = null,
    onUpdateParams: js.Array[_] = null,
    onUpdateScope: js.Object = null,
    overwrite: String | Double = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    repeat: Int | Double = null,
    repeatDelay: Int | Double = null,
    startAt: js.Object = null,
    useFrames: js.UndefOr[Boolean] = js.undefined,
    yoyo: js.UndefOr[Boolean] = js.undefined
  ): TweenConfig = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoCSS)) __obj.updateDynamic("autoCSS")(autoCSS)
    if (callbackScope != null) __obj.updateDynamic("callbackScope")(callbackScope)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (!js.isUndefined(immediateRender)) __obj.updateDynamic("immediateRender")(immediateRender)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (onCompleteParams != null) __obj.updateDynamic("onCompleteParams")(onCompleteParams)
    if (onCompleteScope != null) __obj.updateDynamic("onCompleteScope")(onCompleteScope)
    if (onOverwrite != null) __obj.updateDynamic("onOverwrite")(js.Any.fromFunction1(onOverwrite))
    if (onRepeat != null) __obj.updateDynamic("onRepeat")(js.Any.fromFunction1(onRepeat))
    if (onRepeatScope != null) __obj.updateDynamic("onRepeatScope")(onRepeatScope)
    if (onReverseComplete != null) __obj.updateDynamic("onReverseComplete")(js.Any.fromFunction1(onReverseComplete))
    if (onReverseCompleteParams != null) __obj.updateDynamic("onReverseCompleteParams")(onReverseCompleteParams)
    if (onReverseCompleteScope != null) __obj.updateDynamic("onReverseCompleteScope")(onReverseCompleteScope)
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    if (onStartParams != null) __obj.updateDynamic("onStartParams")(onStartParams)
    if (onStartScope != null) __obj.updateDynamic("onStartScope")(onStartScope)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (onUpdateParams != null) __obj.updateDynamic("onUpdateParams")(onUpdateParams)
    if (onUpdateScope != null) __obj.updateDynamic("onUpdateScope")(onUpdateScope)
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt)
    if (!js.isUndefined(useFrames)) __obj.updateDynamic("useFrames")(useFrames)
    if (!js.isUndefined(yoyo)) __obj.updateDynamic("yoyo")(yoyo)
    __obj.asInstanceOf[TweenConfig]
  }
}

