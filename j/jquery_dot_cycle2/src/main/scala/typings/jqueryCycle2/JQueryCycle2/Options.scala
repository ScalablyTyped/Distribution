package typings.jqueryCycle2.JQueryCycle2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowWrap: js.UndefOr[Boolean] = js.native
  var autoHeight: js.UndefOr[js.Any] = js.native
   // number or string
  var autoSelector: js.UndefOr[String] = js.native
  var caption: js.UndefOr[String] = js.native
  var captionTemplate: js.UndefOr[String] = js.native
  var continueAuto: js.UndefOr[Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disabledClass: js.UndefOr[String] = js.native
  var easing: js.UndefOr[String] = js.native
  var fx: js.UndefOr[String] = js.native
  var hideNonActive: js.UndefOr[Boolean] = js.native
  var loader: js.UndefOr[js.Any] = js.native
   // boolean or 'wait'
  var log: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Double] = js.native
  var manualSpeed: js.UndefOr[Double] = js.native
  var manualTrump: js.UndefOr[Boolean] = js.native
  var next: js.UndefOr[String] = js.native
  var nextEvent: js.UndefOr[String] = js.native
  var overlay: js.UndefOr[String] = js.native
  var overlayTemplate: js.UndefOr[String] = js.native
  var pager: js.UndefOr[String] = js.native
  var pagerActivateClass: js.UndefOr[String] = js.native
  var pagerEvent: js.UndefOr[String] = js.native
  var pagerTemplate: js.UndefOr[String] = js.native
  var pauseOnHover: js.UndefOr[js.Any] = js.native
   // boolean or string
  var paused: js.UndefOr[Boolean] = js.native
  var prev: js.UndefOr[String] = js.native
  var prevEvent: js.UndefOr[String] = js.native
  var progressive: js.UndefOr[String] = js.native
  var random: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var slideActiveClass: js.UndefOr[String] = js.native
  var slideClass: js.UndefOr[String] = js.native
  var slideCss: js.UndefOr[js.Any] = js.native
  var slides: js.UndefOr[String] = js.native
  var speed: js.UndefOr[Double] = js.native
  var startingSlide: js.UndefOr[Double] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var sync: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tmplRegex: js.UndefOr[String] = js.native
  var updateView: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowWrap(value: Boolean): Self = this.set("allowWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowWrap: Self = this.set("allowWrap", js.undefined)
    @scala.inline
    def setAutoHeight(value: js.Any): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setAutoSelector(value: String): Self = this.set("autoSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSelector: Self = this.set("autoSelector", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCaptionTemplate(value: String): Self = this.set("captionTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptionTemplate: Self = this.set("captionTemplate", js.undefined)
    @scala.inline
    def setContinueAuto(value: Boolean): Self = this.set("continueAuto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueAuto: Self = this.set("continueAuto", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisabledClass(value: String): Self = this.set("disabledClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledClass: Self = this.set("disabledClass", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFx(value: String): Self = this.set("fx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    @scala.inline
    def setHideNonActive(value: Boolean): Self = this.set("hideNonActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideNonActive: Self = this.set("hideNonActive", js.undefined)
    @scala.inline
    def setLoader(value: js.Any): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setManualSpeed(value: Double): Self = this.set("manualSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSpeed: Self = this.set("manualSpeed", js.undefined)
    @scala.inline
    def setManualTrump(value: Boolean): Self = this.set("manualTrump", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualTrump: Self = this.set("manualTrump", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNextEvent(value: String): Self = this.set("nextEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextEvent: Self = this.set("nextEvent", js.undefined)
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setOverlayTemplate(value: String): Self = this.set("overlayTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayTemplate: Self = this.set("overlayTemplate", js.undefined)
    @scala.inline
    def setPager(value: String): Self = this.set("pager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    @scala.inline
    def setPagerActivateClass(value: String): Self = this.set("pagerActivateClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagerActivateClass: Self = this.set("pagerActivateClass", js.undefined)
    @scala.inline
    def setPagerEvent(value: String): Self = this.set("pagerEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagerEvent: Self = this.set("pagerEvent", js.undefined)
    @scala.inline
    def setPagerTemplate(value: String): Self = this.set("pagerTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagerTemplate: Self = this.set("pagerTemplate", js.undefined)
    @scala.inline
    def setPauseOnHover(value: js.Any): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setPrevEvent(value: String): Self = this.set("prevEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevEvent: Self = this.set("prevEvent", js.undefined)
    @scala.inline
    def setProgressive(value: String): Self = this.set("progressive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setSlideActiveClass(value: String): Self = this.set("slideActiveClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideActiveClass: Self = this.set("slideActiveClass", js.undefined)
    @scala.inline
    def setSlideClass(value: String): Self = this.set("slideClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideClass: Self = this.set("slideClass", js.undefined)
    @scala.inline
    def setSlideCss(value: js.Any): Self = this.set("slideCss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideCss: Self = this.set("slideCss", js.undefined)
    @scala.inline
    def setSlides(value: String): Self = this.set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStartingSlide(value: Double): Self = this.set("startingSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartingSlide: Self = this.set("startingSlide", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTmplRegex(value: String): Self = this.set("tmplRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmplRegex: Self = this.set("tmplRegex", js.undefined)
    @scala.inline
    def setUpdateView(value: Double): Self = this.set("updateView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateView: Self = this.set("updateView", js.undefined)
  }
  
}

