package typings.jqueryCycle2.JQueryCycle2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowWrap: js.UndefOr[Boolean] = js.undefined
  var autoHeight: js.UndefOr[js.Any] = js.undefined
   // number or string
  var autoSelector: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var captionTemplate: js.UndefOr[String] = js.undefined
  var continueAuto: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var disabledClass: js.UndefOr[String] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var fx: js.UndefOr[String] = js.undefined
  var hideNonActive: js.UndefOr[Boolean] = js.undefined
  var loader: js.UndefOr[js.Any] = js.undefined
   // boolean or 'wait'
  var log: js.UndefOr[Boolean] = js.undefined
  var loop: js.UndefOr[Double] = js.undefined
  var manualSpeed: js.UndefOr[Double] = js.undefined
  var manualTrump: js.UndefOr[Boolean] = js.undefined
  var next: js.UndefOr[String] = js.undefined
  var nextEvent: js.UndefOr[String] = js.undefined
  var overlay: js.UndefOr[String] = js.undefined
  var overlayTemplate: js.UndefOr[String] = js.undefined
  var pager: js.UndefOr[String] = js.undefined
  var pagerActivateClass: js.UndefOr[String] = js.undefined
  var pagerEvent: js.UndefOr[String] = js.undefined
  var pagerTemplate: js.UndefOr[String] = js.undefined
  var pauseOnHover: js.UndefOr[js.Any] = js.undefined
   // boolean or string
  var paused: js.UndefOr[Boolean] = js.undefined
  var prev: js.UndefOr[String] = js.undefined
  var prevEvent: js.UndefOr[String] = js.undefined
  var progressive: js.UndefOr[String] = js.undefined
  var random: js.UndefOr[Boolean] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var slideActiveClass: js.UndefOr[String] = js.undefined
  var slideClass: js.UndefOr[String] = js.undefined
  var slideCss: js.UndefOr[js.Any] = js.undefined
  var slides: js.UndefOr[String] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var startingSlide: js.UndefOr[Double] = js.undefined
  var swipe: js.UndefOr[Boolean] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tmplRegex: js.UndefOr[String] = js.undefined
  var updateView: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
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
    paused: js.UndefOr[Boolean] = js.undefined,
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
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWrap)) __obj.updateDynamic("allowWrap")(allowWrap.asInstanceOf[js.Any])
    if (autoHeight != null) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (autoSelector != null) __obj.updateDynamic("autoSelector")(autoSelector.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (captionTemplate != null) __obj.updateDynamic("captionTemplate")(captionTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(continueAuto)) __obj.updateDynamic("continueAuto")(continueAuto.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabledClass != null) __obj.updateDynamic("disabledClass")(disabledClass.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (!js.isUndefined(hideNonActive)) __obj.updateDynamic("hideNonActive")(hideNonActive.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (manualSpeed != null) __obj.updateDynamic("manualSpeed")(manualSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(manualTrump)) __obj.updateDynamic("manualTrump")(manualTrump.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (nextEvent != null) __obj.updateDynamic("nextEvent")(nextEvent.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayTemplate != null) __obj.updateDynamic("overlayTemplate")(overlayTemplate.asInstanceOf[js.Any])
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (pagerActivateClass != null) __obj.updateDynamic("pagerActivateClass")(pagerActivateClass.asInstanceOf[js.Any])
    if (pagerEvent != null) __obj.updateDynamic("pagerEvent")(pagerEvent.asInstanceOf[js.Any])
    if (pagerTemplate != null) __obj.updateDynamic("pagerTemplate")(pagerTemplate.asInstanceOf[js.Any])
    if (pauseOnHover != null) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevEvent != null) __obj.updateDynamic("prevEvent")(prevEvent.asInstanceOf[js.Any])
    if (progressive != null) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (slideActiveClass != null) __obj.updateDynamic("slideActiveClass")(slideActiveClass.asInstanceOf[js.Any])
    if (slideClass != null) __obj.updateDynamic("slideClass")(slideClass.asInstanceOf[js.Any])
    if (slideCss != null) __obj.updateDynamic("slideCss")(slideCss.asInstanceOf[js.Any])
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startingSlide != null) __obj.updateDynamic("startingSlide")(startingSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tmplRegex != null) __obj.updateDynamic("tmplRegex")(tmplRegex.asInstanceOf[js.Any])
    if (updateView != null) __obj.updateDynamic("updateView")(updateView.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

