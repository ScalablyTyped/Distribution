package typings.jqueryDotCycle2.JQueryCycle2Ns

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
    delay: Int | Double = null,
    disabledClass: String = null,
    easing: String = null,
    fx: String = null,
    hideNonActive: js.UndefOr[Boolean] = js.undefined,
    loader: js.Any = null,
    log: js.UndefOr[Boolean] = js.undefined,
    loop: Int | Double = null,
    manualSpeed: Int | Double = null,
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
    speed: Int | Double = null,
    startingSlide: Int | Double = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tmplRegex: String = null,
    updateView: Int | Double = null
  ): OptionsWithState = {
    val __obj = js.Dynamic.literal(busy = busy, currSlide = currSlide, nextSlide = nextSlide, paused = paused, slideCount = slideCount, slideNum = slideNum)
    if (!js.isUndefined(allowWrap)) __obj.updateDynamic("allowWrap")(allowWrap)
    if (autoHeight != null) __obj.updateDynamic("autoHeight")(autoHeight)
    if (autoSelector != null) __obj.updateDynamic("autoSelector")(autoSelector)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (captionTemplate != null) __obj.updateDynamic("captionTemplate")(captionTemplate)
    if (!js.isUndefined(continueAuto)) __obj.updateDynamic("continueAuto")(continueAuto)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fx != null) __obj.updateDynamic("fx")(fx)
    if (!js.isUndefined(hideNonActive)) __obj.updateDynamic("hideNonActive")(hideNonActive)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (manualSpeed != null) __obj.updateDynamic("manualSpeed")(manualSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(manualTrump)) __obj.updateDynamic("manualTrump")(manualTrump)
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextEvent != null) __obj.updateDynamic("nextEvent")(nextEvent)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (overlayTemplate != null) __obj.updateDynamic("overlayTemplate")(overlayTemplate)
    if (pager != null) __obj.updateDynamic("pager")(pager)
    if (pagerActivateClass != null) __obj.updateDynamic("pagerActivateClass")(pagerActivateClass)
    if (pagerEvent != null) __obj.updateDynamic("pagerEvent")(pagerEvent)
    if (pagerTemplate != null) __obj.updateDynamic("pagerTemplate")(pagerTemplate)
    if (pauseOnHover != null) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (prevEvent != null) __obj.updateDynamic("prevEvent")(prevEvent)
    if (progressive != null) __obj.updateDynamic("progressive")(progressive)
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass)
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass)
    if (slideCss != null) __obj.updateDynamic("slideCss")(slideCss)
    if (slides != null) __obj.updateDynamic("slides")(slides)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startingSlide != null) __obj.updateDynamic("startingSlide")(startingSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tmplRegex != null) __obj.updateDynamic("tmplRegex")(tmplRegex)
    if (updateView != null) __obj.updateDynamic("updateView")(updateView.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithState]
  }
}

