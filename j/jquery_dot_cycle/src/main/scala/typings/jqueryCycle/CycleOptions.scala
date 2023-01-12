package typings.jqueryCycle

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CycleOptions extends StObject {
  
  var activePagerClass: js.UndefOr[String] = js.undefined
  
  // class name used for the active pager link
  var after: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  // transition callback (scope set to element that was shown):  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var allowPagerClickBubble: js.UndefOr[Boolean] = js.undefined
  
  // allows or prevents click event on pager anchors from bubbling
  var animIn: js.UndefOr[Any] = js.undefined
  
  // properties that define how the slide animates in
  var animOut: js.UndefOr[Any] = js.undefined
  
  // properties that define how the slide animates out
  var aspect: js.UndefOr[Boolean] = js.undefined
  
  // preserve aspect ratio during fit resizing, cropping if necessary (must be used with fit option)
  var autostop: js.UndefOr[Boolean] = js.undefined
  
  // true to end slideshow after X transitions (where X == slide count)
  var autostopCount: js.UndefOr[Double] = js.undefined
  
  // number of transitions (optionally used with autostop to define X)
  var backwards: js.UndefOr[Boolean] = js.undefined
  
  // true to start slideshow at last slide and move backwards through the stack
  var before: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  // transition callback (scope set to element to be shown):     function(currSlideElement, nextSlideElement, options, forwardFlag)
  var center: js.UndefOr[Boolean] = js.undefined
  
  // set to true to have cycle add top/left margin to each slide (use with width and height options)
  var cleartype: js.UndefOr[Boolean] = js.undefined
  
  // true if clearType corrections should be applied (for IE)
  var cleartypeNoBg: js.UndefOr[Boolean] = js.undefined
  
  // set to true to disable extra cleartype fixing (leave false to force background color setting on slides)
  var containerResize: js.UndefOr[Boolean] = js.undefined
  
  // resize container to fit largest slide
  var containerResizeHeight: js.UndefOr[Boolean] = js.undefined
  
  // resize containers height to fit the largest slide but leave the width dynamic
  var continuous: js.UndefOr[Boolean] = js.undefined
  
  // true to start next transition immediately after current one completes
  var cssAfter: js.UndefOr[Any] = js.undefined
  
  // properties that defined the state of the slide after transitioning out
  var cssBefore: js.UndefOr[Any] = js.undefined
  
  // properties that define the initial state of the slide before transitioning in
  var delay: js.UndefOr[Double] = js.undefined
  
  // additional delay (in ms) for first transition (hint: can be negative)
  var easeIn: js.UndefOr[String] = js.undefined
  
  // easing for "in" transition
  var easeOut: js.UndefOr[String] = js.undefined
  
  // easing for "out" transition
  var easing: js.UndefOr[String] = js.undefined
  
  // easing method for both in and out transitions
  var end: js.UndefOr[js.Function1[/* options */ this.type, Unit]] = js.undefined
  
  // callback invoked when the slideshow terminates (use with autostop or nowrap options): function(options)
  var fastOnEvent: js.UndefOr[Boolean] = js.undefined
  
  // force fast transitions when triggered manually (via pager or prev/next); value == time in ms
  var fit: js.UndefOr[Boolean] = js.undefined
  
  // force slides to fit container
  var fx: js.UndefOr[String] = js.undefined
  
  // name of transition effect (or comma separated names, ex: 'fade,scrollUp,shuffle')
  var fxFn: js.UndefOr[
    js.Function5[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* afterCalback */ js.Function, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  // function used to control the transition: function(currSlideElement, nextSlideElement, options, afterCalback, forwardFlag)
  var height: js.UndefOr[Any] = js.undefined
  
  // container height (if the 'fit' option is true, the slides will be set to this height as well)
  var manualTrump: js.UndefOr[Boolean] = js.undefined
  
  // causes manual transition to stop an active transition instead of being ignored
  var metaAttr: js.UndefOr[String] = js.undefined
  
  // data- attribute that holds the option data for the slideshow
  var next: js.UndefOr[Any] = js.undefined
  
  // element, jQuery object, or jQuery selector string for the element to use as event trigger for next slide
  var nowrap: js.UndefOr[Boolean] = js.undefined
  
  // true to prevent slideshow from wrapping
  var onPagerEvent: js.UndefOr[js.Function2[/* zeroBasedSlideIndex */ Double, /* slideElement */ Element, Unit]] = js.undefined
  
  // callback fn for pager events: function(zeroBasedSlideIndex, slideElement)
  var onPrevNextEvent: js.UndefOr[
    js.Function3[
      /* isNext */ Boolean, 
      /* zeroBasedSlideIndex */ Double, 
      /* slideElement */ Element, 
      Unit
    ]
  ] = js.undefined
  
  // callback fn for prev/next events: function(isNext, zeroBasedSlideIndex, slideElement)
  var pager: js.UndefOr[Any] = js.undefined
  
  // element, jQuery object, or jQuery selector string for the element to use as pager container
  var pagerAnchorBuilder: js.UndefOr[js.Function2[/* index */ Double, /* DOMelement */ Element, String]] = js.undefined
  
  // callback fn for building anchor links:  function(index, DOMelement)
  var pagerEvent: js.UndefOr[String] = js.undefined
  
  // name of event which drives the pager navigation
  var pause: js.UndefOr[Boolean] = js.undefined
  
  // true to enable "pause on hover"
  var pauseOnPagerHover: js.UndefOr[Boolean] = js.undefined
  
  // true to pause when hovering over pager link
  var prev: js.UndefOr[Any] = js.undefined
  
  // element, jQuery object, or jQuery selector string for the element to use as event trigger for previous slide
  var prevNextEvent: js.UndefOr[String] = js.undefined
  
  // event which drives the manual transition to the previous or next slide
  var random: js.UndefOr[Boolean] = js.undefined
  
  // true for random, false for sequence (not applicable to shuffle fx)
  var randomizeEffects: js.UndefOr[Boolean] = js.undefined
  
  // valid when multiple effects are used; true to make the effect sequence random
  var requeueOnImageNotLoaded: js.UndefOr[Boolean] = js.undefined
  
  // requeue the slideshow if any image slides are not yet loaded
  var requeueTimeout: js.UndefOr[Double] = js.undefined
  
  // ms delay for requeue
  var rev: js.UndefOr[Boolean] = js.undefined
  
  // causes animations to transition in reverse (for effects that support it such as scrollHorz/scrollVert/shuffle)
  var shuffle: js.UndefOr[Any] = js.undefined
  
  // coords for shuffle animation, ex: { top:15, left: 200 }
  var skipInitializationCallbacks: js.UndefOr[Boolean] = js.undefined
  
  // set to true to disable the first before/after callback that occurs prior to any transition
  var slideExpr: js.UndefOr[String] = js.undefined
  
  // expression for selecting slides (if something other than all children is required)
  var slideResize: js.UndefOr[Boolean] = js.undefined
  
  // force slide width/height to fixed size before every transition
  var speed: js.UndefOr[Any] = js.undefined
  
  // speed of the transition (any valid fx speed value)
  var speedIn: js.UndefOr[Any] = js.undefined
  
  // speed of the 'in' transition
  var speedOut: js.UndefOr[Any] = js.undefined
  
  // speed of the 'out' transition
  var startingSlide: js.UndefOr[Double] = js.undefined
  
  // zero-based index of the first slide to be displayed
  var sync: js.UndefOr[Boolean] = js.undefined
  
  // true if in/out transitions should occur simultaneously
  var timeout: js.UndefOr[Double] = js.undefined
  
  // milliseconds between slide transitions (0 to disable auto advance)
  var timeoutFn: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  // callback for determining per-slide timeout value:  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var updateActivePagerLink: js.UndefOr[
    js.Function3[/* pager */ Any, /* currSlide */ Double, /* clsName */ String, Unit]
  ] = js.undefined
  
  // callback fn invoked to update the active pager link (adds/removes activePagerClass style)
  var width: js.UndefOr[Any] = js.undefined
}
object CycleOptions {
  
  inline def apply(): CycleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CycleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CycleOptions] (val x: Self) extends AnyVal {
    
    inline def setActivePagerClass(value: String): Self = StObject.set(x, "activePagerClass", value.asInstanceOf[js.Any])
    
    inline def setActivePagerClassUndefined: Self = StObject.set(x, "activePagerClass", js.undefined)
    
    inline def setAfter(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "after", js.Any.fromFunction4(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAllowPagerClickBubble(value: Boolean): Self = StObject.set(x, "allowPagerClickBubble", value.asInstanceOf[js.Any])
    
    inline def setAllowPagerClickBubbleUndefined: Self = StObject.set(x, "allowPagerClickBubble", js.undefined)
    
    inline def setAnimIn(value: Any): Self = StObject.set(x, "animIn", value.asInstanceOf[js.Any])
    
    inline def setAnimInUndefined: Self = StObject.set(x, "animIn", js.undefined)
    
    inline def setAnimOut(value: Any): Self = StObject.set(x, "animOut", value.asInstanceOf[js.Any])
    
    inline def setAnimOutUndefined: Self = StObject.set(x, "animOut", js.undefined)
    
    inline def setAspect(value: Boolean): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setAutostop(value: Boolean): Self = StObject.set(x, "autostop", value.asInstanceOf[js.Any])
    
    inline def setAutostopCount(value: Double): Self = StObject.set(x, "autostopCount", value.asInstanceOf[js.Any])
    
    inline def setAutostopCountUndefined: Self = StObject.set(x, "autostopCount", js.undefined)
    
    inline def setAutostopUndefined: Self = StObject.set(x, "autostop", js.undefined)
    
    inline def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    inline def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    
    inline def setBefore(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "before", js.Any.fromFunction4(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setCleartype(value: Boolean): Self = StObject.set(x, "cleartype", value.asInstanceOf[js.Any])
    
    inline def setCleartypeNoBg(value: Boolean): Self = StObject.set(x, "cleartypeNoBg", value.asInstanceOf[js.Any])
    
    inline def setCleartypeNoBgUndefined: Self = StObject.set(x, "cleartypeNoBg", js.undefined)
    
    inline def setCleartypeUndefined: Self = StObject.set(x, "cleartype", js.undefined)
    
    inline def setContainerResize(value: Boolean): Self = StObject.set(x, "containerResize", value.asInstanceOf[js.Any])
    
    inline def setContainerResizeHeight(value: Boolean): Self = StObject.set(x, "containerResizeHeight", value.asInstanceOf[js.Any])
    
    inline def setContainerResizeHeightUndefined: Self = StObject.set(x, "containerResizeHeight", js.undefined)
    
    inline def setContainerResizeUndefined: Self = StObject.set(x, "containerResize", js.undefined)
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setCssAfter(value: Any): Self = StObject.set(x, "cssAfter", value.asInstanceOf[js.Any])
    
    inline def setCssAfterUndefined: Self = StObject.set(x, "cssAfter", js.undefined)
    
    inline def setCssBefore(value: Any): Self = StObject.set(x, "cssBefore", value.asInstanceOf[js.Any])
    
    inline def setCssBeforeUndefined: Self = StObject.set(x, "cssBefore", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    inline def setEaseInUndefined: Self = StObject.set(x, "easeIn", js.undefined)
    
    inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    inline def setEaseOutUndefined: Self = StObject.set(x, "easeOut", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEnd(value: CycleOptions => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFastOnEvent(value: Boolean): Self = StObject.set(x, "fastOnEvent", value.asInstanceOf[js.Any])
    
    inline def setFastOnEventUndefined: Self = StObject.set(x, "fastOnEvent", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    inline def setFxFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* afterCalback */ js.Function, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "fxFn", js.Any.fromFunction5(value))
    
    inline def setFxFnUndefined: Self = StObject.set(x, "fxFn", js.undefined)
    
    inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setManualTrump(value: Boolean): Self = StObject.set(x, "manualTrump", value.asInstanceOf[js.Any])
    
    inline def setManualTrumpUndefined: Self = StObject.set(x, "manualTrump", js.undefined)
    
    inline def setMetaAttr(value: String): Self = StObject.set(x, "metaAttr", value.asInstanceOf[js.Any])
    
    inline def setMetaAttrUndefined: Self = StObject.set(x, "metaAttr", js.undefined)
    
    inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    inline def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
    
    inline def setOnPagerEvent(value: (/* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit): Self = StObject.set(x, "onPagerEvent", js.Any.fromFunction2(value))
    
    inline def setOnPagerEventUndefined: Self = StObject.set(x, "onPagerEvent", js.undefined)
    
    inline def setOnPrevNextEvent(
      value: (/* isNext */ Boolean, /* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit
    ): Self = StObject.set(x, "onPrevNextEvent", js.Any.fromFunction3(value))
    
    inline def setOnPrevNextEventUndefined: Self = StObject.set(x, "onPrevNextEvent", js.undefined)
    
    inline def setPager(value: Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerAnchorBuilder(value: (/* index */ Double, /* DOMelement */ Element) => String): Self = StObject.set(x, "pagerAnchorBuilder", js.Any.fromFunction2(value))
    
    inline def setPagerAnchorBuilderUndefined: Self = StObject.set(x, "pagerAnchorBuilder", js.undefined)
    
    inline def setPagerEvent(value: String): Self = StObject.set(x, "pagerEvent", value.asInstanceOf[js.Any])
    
    inline def setPagerEventUndefined: Self = StObject.set(x, "pagerEvent", js.undefined)
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setPauseOnPagerHover(value: Boolean): Self = StObject.set(x, "pauseOnPagerHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnPagerHoverUndefined: Self = StObject.set(x, "pauseOnPagerHover", js.undefined)
    
    inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    inline def setPrev(value: Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevNextEvent(value: String): Self = StObject.set(x, "prevNextEvent", value.asInstanceOf[js.Any])
    
    inline def setPrevNextEventUndefined: Self = StObject.set(x, "prevNextEvent", js.undefined)
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    inline def setRandomizeEffects(value: Boolean): Self = StObject.set(x, "randomizeEffects", value.asInstanceOf[js.Any])
    
    inline def setRandomizeEffectsUndefined: Self = StObject.set(x, "randomizeEffects", js.undefined)
    
    inline def setRequeueOnImageNotLoaded(value: Boolean): Self = StObject.set(x, "requeueOnImageNotLoaded", value.asInstanceOf[js.Any])
    
    inline def setRequeueOnImageNotLoadedUndefined: Self = StObject.set(x, "requeueOnImageNotLoaded", js.undefined)
    
    inline def setRequeueTimeout(value: Double): Self = StObject.set(x, "requeueTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequeueTimeoutUndefined: Self = StObject.set(x, "requeueTimeout", js.undefined)
    
    inline def setRev(value: Boolean): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
    
    inline def setShuffle(value: Any): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    inline def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    inline def setSkipInitializationCallbacks(value: Boolean): Self = StObject.set(x, "skipInitializationCallbacks", value.asInstanceOf[js.Any])
    
    inline def setSkipInitializationCallbacksUndefined: Self = StObject.set(x, "skipInitializationCallbacks", js.undefined)
    
    inline def setSlideExpr(value: String): Self = StObject.set(x, "slideExpr", value.asInstanceOf[js.Any])
    
    inline def setSlideExprUndefined: Self = StObject.set(x, "slideExpr", js.undefined)
    
    inline def setSlideResize(value: Boolean): Self = StObject.set(x, "slideResize", value.asInstanceOf[js.Any])
    
    inline def setSlideResizeUndefined: Self = StObject.set(x, "slideResize", js.undefined)
    
    inline def setSpeed(value: Any): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedIn(value: Any): Self = StObject.set(x, "speedIn", value.asInstanceOf[js.Any])
    
    inline def setSpeedInUndefined: Self = StObject.set(x, "speedIn", js.undefined)
    
    inline def setSpeedOut(value: Any): Self = StObject.set(x, "speedOut", value.asInstanceOf[js.Any])
    
    inline def setSpeedOutUndefined: Self = StObject.set(x, "speedOut", js.undefined)
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setStartingSlide(value: Double): Self = StObject.set(x, "startingSlide", value.asInstanceOf[js.Any])
    
    inline def setStartingSlideUndefined: Self = StObject.set(x, "startingSlide", js.undefined)
    
    inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "timeoutFn", js.Any.fromFunction4(value))
    
    inline def setTimeoutFnUndefined: Self = StObject.set(x, "timeoutFn", js.undefined)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdateActivePagerLink(value: (/* pager */ Any, /* currSlide */ Double, /* clsName */ String) => Unit): Self = StObject.set(x, "updateActivePagerLink", js.Any.fromFunction3(value))
    
    inline def setUpdateActivePagerLinkUndefined: Self = StObject.set(x, "updateActivePagerLink", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
