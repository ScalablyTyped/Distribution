package typings.jqueryCycle2.JQueryCycle2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithState extends Options {
  var busy: Boolean
  var currSlide: Double
  var nextSlide: Double
  @JSName("paused")
  var paused_OptionsWithState: Boolean
  var slideCount: Double
  var slideNum: Double
}

object OptionsWithState {
  @scala.inline
  def apply(
    busy: Boolean,
    currSlide: Double,
    nextSlide: Double,
    paused: Boolean,
    slideCount: Double,
    slideNum: Double,
    allowWrap: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.Any = null,
    autoSelector: String = null,
    caption: String = null,
    captionTemplate: String = null,
    continueAuto: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    disabledClass: String = null,
    easing: String = null,
    fx: String = null,
    hideNonActive: js.UndefOr[Boolean] = js.undefined,
    loader: js.Any = null,
    log: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Double] = js.undefined,
    manualSpeed: js.UndefOr[Double] = js.undefined,
    manualTrump: js.UndefOr[Boolean] = js.undefined,
    next: String = null,
    nextEvent: String = null,
    overlay: String = null,
    overlayTemplate: String = null,
    pager: String = null,
    pagerActivateClass: String = null,
    pagerEvent: String = null,
    pagerTemplate: String = null,
    pauseOnHover: js.Any = null,
    prev: String = null,
    prevEvent: String = null,
    progressive: String = null,
    random: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    slideActiveClass: String = null,
    slideClass: String = null,
    slideCss: js.Any = null,
    slides: String = null,
    speed: js.UndefOr[Double] = js.undefined,
    startingSlide: js.UndefOr[Double] = js.undefined,
    swipe: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    tmplRegex: String = null,
    updateView: js.UndefOr[Double] = js.undefined
  ): OptionsWithState = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], currSlide = currSlide.asInstanceOf[js.Any], nextSlide = nextSlide.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideNum = slideNum.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWrap)) __obj.updateDynamic("allowWrap")(allowWrap.get.asInstanceOf[js.Any])
    if (autoHeight != null) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoSelector != null) __obj.updateDynamic("autoSelector")(autoSelector.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (captionTemplate != null) __obj.updateDynamic("captionTemplate")(captionTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(continueAuto)) __obj.updateDynamic("continueAuto")(continueAuto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNonActive)) __obj.updateDynamic("hideNonActive")(hideNonActive.get.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manualSpeed)) __obj.updateDynamic("manualSpeed")(manualSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manualTrump)) __obj.updateDynamic("manualTrump")(manualTrump.get.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextEvent != null) __obj.updateDynamic("nextEvent")(nextEvent.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayTemplate != null) __obj.updateDynamic("overlayTemplate")(overlayTemplate.asInstanceOf[js.Any])
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (pagerActivateClass != null) __obj.updateDynamic("pagerActivateClass")(pagerActivateClass.asInstanceOf[js.Any])
    if (pagerEvent != null) __obj.updateDynamic("pagerEvent")(pagerEvent.asInstanceOf[js.Any])
    if (pagerTemplate != null) __obj.updateDynamic("pagerTemplate")(pagerTemplate.asInstanceOf[js.Any])
    if (pauseOnHover != null) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevEvent != null) __obj.updateDynamic("prevEvent")(prevEvent.asInstanceOf[js.Any])
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (slideCss != null) __obj.updateDynamic("slideCss")(slideCss.asInstanceOf[js.Any])
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startingSlide)) __obj.updateDynamic("startingSlide")(startingSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (tmplRegex != null) __obj.updateDynamic("tmplRegex")(tmplRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(updateView)) __obj.updateDynamic("updateView")(updateView.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithState]
  }
}

