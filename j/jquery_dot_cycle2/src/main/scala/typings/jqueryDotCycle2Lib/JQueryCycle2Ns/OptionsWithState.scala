package typings
package jqueryDotCycle2Lib.JQueryCycle2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithState extends Options {
  var busy: scala.Boolean
  var currSlide: scala.Double
  var nextSlide: scala.Double
  @JSName("paused")
  var paused_OptionsWithState: scala.Boolean
  var slideCount: scala.Double
  var slideNum: scala.Double
}

object OptionsWithState {
  @scala.inline
  def apply(
    busy: scala.Boolean,
    currSlide: scala.Double,
    nextSlide: scala.Double,
    paused: scala.Boolean,
    slideCount: scala.Double,
    slideNum: scala.Double,
    allowWrap: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.Any = null,
    autoSelector: java.lang.String = null,
    caption: java.lang.String = null,
    captionTemplate: java.lang.String = null,
    continueAuto: js.UndefOr[scala.Boolean] = js.undefined,
    delay: scala.Int | scala.Double = null,
    disabledClass: java.lang.String = null,
    easing: java.lang.String = null,
    fx: java.lang.String = null,
    hideNonActive: js.UndefOr[scala.Boolean] = js.undefined,
    loader: js.Any = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    loop: scala.Int | scala.Double = null,
    manualSpeed: scala.Int | scala.Double = null,
    manualTrump: js.UndefOr[scala.Boolean] = js.undefined,
    next: java.lang.String = null,
    nextEvent: java.lang.String = null,
    overlay: java.lang.String = null,
    overlayTemplate: java.lang.String = null,
    pager: java.lang.String = null,
    pagerActivateClass: java.lang.String = null,
    pagerEvent: java.lang.String = null,
    pagerTemplate: java.lang.String = null,
    pauseOnHover: js.Any = null,
    prev: java.lang.String = null,
    prevEvent: java.lang.String = null,
    progressive: java.lang.String = null,
    random: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    slideActiveClass: java.lang.String = null,
    slideClass: java.lang.String = null,
    slideCss: js.Any = null,
    slides: java.lang.String = null,
    speed: scala.Int | scala.Double = null,
    startingSlide: scala.Int | scala.Double = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    tmplRegex: java.lang.String = null,
    updateView: scala.Int | scala.Double = null
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

