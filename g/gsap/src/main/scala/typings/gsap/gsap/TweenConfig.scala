package typings.gsap.gsap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TweenConfig
  extends /** Any tweenable property */
/* p */ StringDictionary[js.Any] {
  /** If true atuomatically populates the css property for tween on DOM elements */
  var autoCSS: js.UndefOr[Boolean] = js.native
  /** The scope to be used for all of the callbacks (onStart, onUpdate, onComplete, etc.). The scope is what "this" refers to inside any of the callbacks. */
  var callbackScope: js.UndefOr[js.Object] = js.native
  /**
    * Amount of delay in seconds (or frames for frames-based tweens) before the animation should begin.
    */
  var delay: js.UndefOr[Double] = js.native
  /** Ease (or () => void or String) - You can choose from various eases to control the rate of change during the animation, giving it a specific "feel". */
  var ease: js.UndefOr[Ease] = js.native
  /**
    * Normally when you create a tween, it begins rendering on the very next frame (update cycle) unless you specify a delay. However, if you prefer to force the tween to render
    * immediately when it is created, setimmediateRender to true. Or to prevent a from() from rendering immediately, set immediateRender to false. By default, from() tweens set
    * immediateRender to true.
    */
  var immediateRender: js.UndefOr[Boolean] = js.native
  /**
    * When a tween renders for the very first time and reads its starting values, GSAP will automatically "lazy render" that particular tick by default, meaning it will try to delay the
    * rendering (writing of values) until the very end of the "tick" cycle which can improve performance because it avoids the read/write/read/write layout thrashing that some browsers do.
    *
    * If you would like to disable lazy rendering for a particular tween, you can set lazy:false. Or, since zero-duration tweens do not lazy-render by default, you can specifically give it
    * permission to lazy-render by setting lazy:true like TweenLite.set(element, {opacity:0, lazy:true});. In most cases, you won't need to set lazy.
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**  A () => void that should be called when the animation has completed. */
  var onComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onComplete () => void */
  var onCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onComplete () => void (what "this" refers to inside that () => void). */
  var onCompleteScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween gets overwritten by another tween. */
  var onOverwrite: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onRepeat: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onRepeatScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween has reached its beginning again from the reverse direction. */
  var onReverseComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onReverseComplete () => void. */
  var onReverseCompleteParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onReverseComplete () => void (what "this" refers to inside that () => void). */
  var onReverseCompleteScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called when the tween begins (when its time changes from 0 to some other value which can happen more than once if the tween is restarted multiple times). */
  var onStart: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onStart () => void. */
  var onStartParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onStart () => void (what "this" refers to inside that () => void). */
  var onStartScope: js.UndefOr[js.Object] = js.native
  /** A () => void that should be called every time the animation updates (on every frame while the animation is active). */
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /** An Array of parameters to pass the onUpdate () => void. */
  var onUpdateParams: js.UndefOr[js.Array[_]] = js.native
  /** Defines the scope of the onUpdate () => void (what "this" refers to inside that () => void). */
  var onUpdateScope: js.UndefOr[js.Object] = js.native
  /**
    * Controls how (and if) other tweens of the same target are overwritten. There are several modes to choose from, but "auto" is the default (although you can change the default mode using
    * theTweenLite.defaultOverwrite property)
    */
  var overwrite: js.UndefOr[String | Double] = js.native
  /** If true, the tween will pause itself immediately upon creation. */
  var paused: js.UndefOr[Boolean] = js.native
  var repeat: js.UndefOr[Double] = js.native
  var repeatDelay: js.UndefOr[Double] = js.native
  var startAt: js.UndefOr[js.Object] = js.native
  /**
    * If useFrames is true, the tweens's timing will be based on frames instead of seconds because it is intially added to the root frames-based timeline. This causes both its duration and
    * delay to be based on frames. An animations's timing mode is always determined by its parent timeline.
    */
  var useFrames: js.UndefOr[Boolean] = js.native
  var yoyo: js.UndefOr[Boolean] = js.native
}

object TweenConfig {
  @scala.inline
  def apply(): TweenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenConfig]
  }
  @scala.inline
  implicit class TweenConfigOps[Self <: TweenConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoCSS(value: Boolean): Self = this.set("autoCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCSS: Self = this.set("autoCSS", js.undefined)
    @scala.inline
    def setCallbackScope(value: js.Object): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEase(value: Ease): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setImmediateRender(value: Boolean): Self = this.set("immediateRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediateRender: Self = this.set("immediateRender", js.undefined)
    @scala.inline
    def setLazy(value: Boolean): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setOnComplete(value: /* repeated */ js.Any => Unit): Self = this.set("onComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setOnCompleteParamsVarargs(value: js.Any*): Self = this.set("onCompleteParams", js.Array(value :_*))
    @scala.inline
    def setOnCompleteParams(value: js.Array[_]): Self = this.set("onCompleteParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompleteParams: Self = this.set("onCompleteParams", js.undefined)
    @scala.inline
    def setOnCompleteScope(value: js.Object): Self = this.set("onCompleteScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCompleteScope: Self = this.set("onCompleteScope", js.undefined)
    @scala.inline
    def setOnOverwrite(value: /* repeated */ js.Any => Unit): Self = this.set("onOverwrite", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOverwrite: Self = this.set("onOverwrite", js.undefined)
    @scala.inline
    def setOnRepeat(value: /* repeated */ js.Any => Unit): Self = this.set("onRepeat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRepeat: Self = this.set("onRepeat", js.undefined)
    @scala.inline
    def setOnRepeatScope(value: js.Object): Self = this.set("onRepeatScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRepeatScope: Self = this.set("onRepeatScope", js.undefined)
    @scala.inline
    def setOnReverseComplete(value: /* repeated */ js.Any => Unit): Self = this.set("onReverseComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReverseComplete: Self = this.set("onReverseComplete", js.undefined)
    @scala.inline
    def setOnReverseCompleteParamsVarargs(value: js.Any*): Self = this.set("onReverseCompleteParams", js.Array(value :_*))
    @scala.inline
    def setOnReverseCompleteParams(value: js.Array[_]): Self = this.set("onReverseCompleteParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReverseCompleteParams: Self = this.set("onReverseCompleteParams", js.undefined)
    @scala.inline
    def setOnReverseCompleteScope(value: js.Object): Self = this.set("onReverseCompleteScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnReverseCompleteScope: Self = this.set("onReverseCompleteScope", js.undefined)
    @scala.inline
    def setOnStart(value: /* repeated */ js.Any => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStartParamsVarargs(value: js.Any*): Self = this.set("onStartParams", js.Array(value :_*))
    @scala.inline
    def setOnStartParams(value: js.Array[_]): Self = this.set("onStartParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartParams: Self = this.set("onStartParams", js.undefined)
    @scala.inline
    def setOnStartScope(value: js.Object): Self = this.set("onStartScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartScope: Self = this.set("onStartScope", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* repeated */ js.Any => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setOnUpdateParamsVarargs(value: js.Any*): Self = this.set("onUpdateParams", js.Array(value :_*))
    @scala.inline
    def setOnUpdateParams(value: js.Array[_]): Self = this.set("onUpdateParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdateParams: Self = this.set("onUpdateParams", js.undefined)
    @scala.inline
    def setOnUpdateScope(value: js.Object): Self = this.set("onUpdateScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdateScope: Self = this.set("onUpdateScope", js.undefined)
    @scala.inline
    def setOverwrite(value: String | Double): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    @scala.inline
    def setStartAt(value: js.Object): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setUseFrames(value: Boolean): Self = this.set("useFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFrames: Self = this.set("useFrames", js.undefined)
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
  
}

