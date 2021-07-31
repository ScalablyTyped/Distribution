package typings.jqueryCycle2

import typings.jqueryCycle2.jqueryCycle2Strings.add
import typings.jqueryCycle2.jqueryCycle2Strings.destroy
import typings.jqueryCycle2.jqueryCycle2Strings.goto
import typings.jqueryCycle2.jqueryCycle2Strings.next
import typings.jqueryCycle2.jqueryCycle2Strings.pause
import typings.jqueryCycle2.jqueryCycle2Strings.prev
import typings.jqueryCycle2.jqueryCycle2Strings.reinit
import typings.jqueryCycle2.jqueryCycle2Strings.remove
import typings.jqueryCycle2.jqueryCycle2Strings.resume
import typings.jqueryCycle2.jqueryCycle2Strings.stop
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryCycle2 {
  
  @js.native
  trait API extends StObject {
    
    def add(slides: js.Any): Unit = js.native
    def add(slides: js.Any, prepend: Boolean): Unit = js.native
    
    // string or array or JQuery
    def addInitialSlides(): Unit = js.native
    
    def advanceSlide(numberOfOpositions: Double): Boolean = js.native
    
    // always false
    def buildPagerLink(slideOptionHash: Options, slide: js.Any): Unit = js.native
    
    def buildSlideOpts(slide: js.Any): Options = js.native
    
    def calcFirstSlide(): Unit = js.native
    
    def calcNextSlide(): Unit = js.native
    
    def calcTx(slideOptions: Options, manual: Boolean): Transition = js.native
    
    def destroy(): Unit = js.native
    
    def doTransition(slideOptions: Options, currEl: Element, nextEl: Element, fwdFlag: Boolean, callback: js.Function): Unit = js.native
    
    def getComponent(nameOfComponent: String): JQuery = js.native
    
    def getSlideIndex(slideElement: Element): Double = js.native
    
    def getSlideOpts(slideIndex: Double): Options = js.native
    
    def goto(index: Double): Unit = js.native
    
    def initSlide(slideOptions: Options, slide: js.Any, suggestedZindex: Double): Unit = js.native
    
    def initSlideshow(): Unit = js.native
    
    def log(args: js.Any*): Unit = js.native
    
    def next(): Unit = js.native
    
    def page(pagerEl: Element, targetEl: Element): Unit = js.native
    
    def pause(): Unit = js.native
    
    def postInitSlideshow(): Unit = js.native
    
    def preInitSlideshow(): Unit = js.native
    
    def prepareTx(manualFlag: Boolean, fwdFlag: Boolean): Unit = js.native
    
    def prev(): Unit = js.native
    
    def queueTransition(slideOptions: Options): Unit = js.native
    
    def reinit(): Unit = js.native
    
    def remove(slideIndexToRemove: Double): Unit = js.native
    
    def resume(): Unit = js.native
    
    def stackSlides(currEl: Element, nextEl: Element, fwdFlag: Boolean): Unit = js.native
    
    def stop(): Unit = js.native
    
    def stopTransition(): Unit = js.native
    
    def tmpl(templateString: String, optionHash: Options, slideEl: Element): Unit = js.native
    
    def trigger(eventName: String, args: js.Any*): Unit = js.native
    
    def updateView(): Unit = js.native
  }
  
  @js.native
  trait Cycle2 extends StObject {
    
    def apply(): JQuery = js.native
    def apply(methodNameDontCallMe: String, arg1DontCallMe: js.Any, arg2DontCallMe: js.Any): JQuery = js.native
    def apply(methodName: add, newSlide: js.Any): JQuery = js.native
    // string or JQuery
    def apply(methodName: destroy): JQuery = js.native
    def apply(methodName: goto, index: Double): JQuery = js.native
    def apply(methodName: next): JQuery = js.native
    def apply(methodName: pause): JQuery = js.native
    def apply(methodName: prev): JQuery = js.native
    def apply(methodName: reinit): JQuery = js.native
    def apply(methodName: remove, index: Double): JQuery = js.native
    def apply(methodName: resume): JQuery = js.native
    def apply(methodName: stop): JQuery = js.native
    def apply(options: Options): JQuery = js.native
  }
  
  trait Options extends StObject {
    
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
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowWrap(value: Boolean): Self = StObject.set(x, "allowWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowWrapUndefined: Self = StObject.set(x, "allowWrap", js.undefined)
      
      @scala.inline
      def setAutoHeight(value: js.Any): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoSelector(value: String): Self = StObject.set(x, "autoSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectorUndefined: Self = StObject.set(x, "autoSelector", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTemplate(value: String): Self = StObject.set(x, "captionTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionTemplateUndefined: Self = StObject.set(x, "captionTemplate", js.undefined)
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setContinueAuto(value: Boolean): Self = StObject.set(x, "continueAuto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinueAutoUndefined: Self = StObject.set(x, "continueAuto", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisabledClass(value: String): Self = StObject.set(x, "disabledClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledClassUndefined: Self = StObject.set(x, "disabledClass", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setHideNonActive(value: Boolean): Self = StObject.set(x, "hideNonActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideNonActiveUndefined: Self = StObject.set(x, "hideNonActive", js.undefined)
      
      @scala.inline
      def setLoader(value: js.Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setManualSpeed(value: Double): Self = StObject.set(x, "manualSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualSpeedUndefined: Self = StObject.set(x, "manualSpeed", js.undefined)
      
      @scala.inline
      def setManualTrump(value: Boolean): Self = StObject.set(x, "manualTrump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualTrumpUndefined: Self = StObject.set(x, "manualTrump", js.undefined)
      
      @scala.inline
      def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextEvent(value: String): Self = StObject.set(x, "nextEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextEventUndefined: Self = StObject.set(x, "nextEvent", js.undefined)
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayTemplate(value: String): Self = StObject.set(x, "overlayTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayTemplateUndefined: Self = StObject.set(x, "overlayTemplate", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPager(value: String): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerActivateClass(value: String): Self = StObject.set(x, "pagerActivateClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerActivateClassUndefined: Self = StObject.set(x, "pagerActivateClass", js.undefined)
      
      @scala.inline
      def setPagerEvent(value: String): Self = StObject.set(x, "pagerEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerEventUndefined: Self = StObject.set(x, "pagerEvent", js.undefined)
      
      @scala.inline
      def setPagerTemplate(value: String): Self = StObject.set(x, "pagerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerTemplateUndefined: Self = StObject.set(x, "pagerTemplate", js.undefined)
      
      @scala.inline
      def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: js.Any): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      @scala.inline
      def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevEvent(value: String): Self = StObject.set(x, "prevEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevEventUndefined: Self = StObject.set(x, "prevEvent", js.undefined)
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
      
      @scala.inline
      def setProgressive(value: String): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
      
      @scala.inline
      def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setSlideActiveClass(value: String): Self = StObject.set(x, "slideActiveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideActiveClassUndefined: Self = StObject.set(x, "slideActiveClass", js.undefined)
      
      @scala.inline
      def setSlideClass(value: String): Self = StObject.set(x, "slideClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideClassUndefined: Self = StObject.set(x, "slideClass", js.undefined)
      
      @scala.inline
      def setSlideCss(value: js.Any): Self = StObject.set(x, "slideCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCssUndefined: Self = StObject.set(x, "slideCss", js.undefined)
      
      @scala.inline
      def setSlides(value: String): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStartingSlide(value: Double): Self = StObject.set(x, "startingSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingSlideUndefined: Self = StObject.set(x, "startingSlide", js.undefined)
      
      @scala.inline
      def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTmplRegex(value: String): Self = StObject.set(x, "tmplRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmplRegexUndefined: Self = StObject.set(x, "tmplRegex", js.undefined)
      
      @scala.inline
      def setUpdateView(value: Double): Self = StObject.set(x, "updateView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateViewUndefined: Self = StObject.set(x, "updateView", js.undefined)
    }
  }
  
  trait OptionsWithState
    extends StObject
       with Options {
    
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
      slideNum: Double
    ): OptionsWithState = {
      val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], currSlide = currSlide.asInstanceOf[js.Any], nextSlide = nextSlide.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slideNum = slideNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithState]
    }
    
    @scala.inline
    implicit class OptionsWithStateMutableBuilder[Self <: OptionsWithState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrSlide(value: Double): Self = StObject.set(x, "currSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextSlide(value: Double): Self = StObject.set(x, "nextSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideNum(value: Double): Self = StObject.set(x, "slideNum", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transition extends StObject {
    
    def before(opts: Options, curr: Element, next: Element, fwd: Boolean): Unit
  }
  object Transition {
    
    @scala.inline
    def apply(before: (Options, Element, Element, Boolean) => Unit): Transition = {
      val __obj = js.Dynamic.literal(before = js.Any.fromFunction4(before))
      __obj.asInstanceOf[Transition]
    }
    
    @scala.inline
    implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: (Options, Element, Element, Boolean) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction4(value))
    }
  }
}
