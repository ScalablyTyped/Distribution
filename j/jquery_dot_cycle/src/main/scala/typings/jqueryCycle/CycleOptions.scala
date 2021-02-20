package typings.jqueryCycle

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CycleOptions extends StObject {
  
  var activePagerClass: js.UndefOr[String] = js.native
  
  // class name used for the active pager link
  var after: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
  
  // transition callback (scope set to element that was shown):  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var allowPagerClickBubble: js.UndefOr[Boolean] = js.native
  
  // allows or prevents click event on pager anchors from bubbling
  var animIn: js.UndefOr[js.Any] = js.native
  
  // properties that define how the slide animates in
  var animOut: js.UndefOr[js.Any] = js.native
  
  // properties that define how the slide animates out
  var aspect: js.UndefOr[Boolean] = js.native
  
  // preserve aspect ratio during fit resizing, cropping if necessary (must be used with fit option)
  var autostop: js.UndefOr[Boolean] = js.native
  
  // true to end slideshow after X transitions (where X == slide count)
  var autostopCount: js.UndefOr[Double] = js.native
  
  // number of transitions (optionally used with autostop to define X)
  var backwards: js.UndefOr[Boolean] = js.native
  
  // true to start slideshow at last slide and move backwards through the stack
  var before: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
  
  // transition callback (scope set to element to be shown):     function(currSlideElement, nextSlideElement, options, forwardFlag)
  var center: js.UndefOr[Boolean] = js.native
  
  // set to true to have cycle add top/left margin to each slide (use with width and height options)
  var cleartype: js.UndefOr[Boolean] = js.native
  
  // true if clearType corrections should be applied (for IE)
  var cleartypeNoBg: js.UndefOr[Boolean] = js.native
  
  // set to true to disable extra cleartype fixing (leave false to force background color setting on slides)
  var containerResize: js.UndefOr[Boolean] = js.native
  
  // resize container to fit largest slide
  var containerResizeHeight: js.UndefOr[Boolean] = js.native
  
  // resize containers height to fit the largest slide but leave the width dynamic
  var continuous: js.UndefOr[Boolean] = js.native
  
  // true to start next transition immediately after current one completes
  var cssAfter: js.UndefOr[js.Any] = js.native
  
  // properties that defined the state of the slide after transitioning out
  var cssBefore: js.UndefOr[js.Any] = js.native
  
  // properties that define the initial state of the slide before transitioning in
  var delay: js.UndefOr[Double] = js.native
  
  // additional delay (in ms) for first transition (hint: can be negative)
  var easeIn: js.UndefOr[String] = js.native
  
  // easing for "in" transition
  var easeOut: js.UndefOr[String] = js.native
  
  // easing for "out" transition
  var easing: js.UndefOr[String] = js.native
  
  // easing method for both in and out transitions
  var end: js.UndefOr[js.Function1[/* options */ this.type, Unit]] = js.native
  
  // callback invoked when the slideshow terminates (use with autostop or nowrap options): function(options)
  var fastOnEvent: js.UndefOr[Boolean] = js.native
  
  // force fast transitions when triggered manually (via pager or prev/next); value == time in ms
  var fit: js.UndefOr[Boolean] = js.native
  
  // force slides to fit container
  var fx: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
  // function used to control the transition: function(currSlideElement, nextSlideElement, options, afterCalback, forwardFlag)
  var height: js.UndefOr[js.Any] = js.native
  
  // container height (if the 'fit' option is true, the slides will be set to this height as well)
  var manualTrump: js.UndefOr[Boolean] = js.native
  
  // causes manual transition to stop an active transition instead of being ignored
  var metaAttr: js.UndefOr[String] = js.native
  
  // data- attribute that holds the option data for the slideshow
  var next: js.UndefOr[js.Any] = js.native
  
  // element, jQuery object, or jQuery selector string for the element to use as event trigger for next slide
  var nowrap: js.UndefOr[Boolean] = js.native
  
  // true to prevent slideshow from wrapping
  var onPagerEvent: js.UndefOr[js.Function2[/* zeroBasedSlideIndex */ Double, /* slideElement */ Element, Unit]] = js.native
  
  // callback fn for pager events: function(zeroBasedSlideIndex, slideElement)
  var onPrevNextEvent: js.UndefOr[
    js.Function3[
      /* isNext */ Boolean, 
      /* zeroBasedSlideIndex */ Double, 
      /* slideElement */ Element, 
      Unit
    ]
  ] = js.native
  
  // callback fn for prev/next events: function(isNext, zeroBasedSlideIndex, slideElement)
  var pager: js.UndefOr[js.Any] = js.native
  
  // element, jQuery object, or jQuery selector string for the element to use as pager container
  var pagerAnchorBuilder: js.UndefOr[js.Function2[/* index */ Double, /* DOMelement */ Element, String]] = js.native
  
  // callback fn for building anchor links:  function(index, DOMelement)
  var pagerEvent: js.UndefOr[String] = js.native
  
  // name of event which drives the pager navigation
  var pause: js.UndefOr[Boolean] = js.native
  
  // true to enable "pause on hover"
  var pauseOnPagerHover: js.UndefOr[Boolean] = js.native
  
  // true to pause when hovering over pager link
  var prev: js.UndefOr[js.Any] = js.native
  
  // element, jQuery object, or jQuery selector string for the element to use as event trigger for previous slide
  var prevNextEvent: js.UndefOr[String] = js.native
  
  // event which drives the manual transition to the previous or next slide
  var random: js.UndefOr[Boolean] = js.native
  
  // true for random, false for sequence (not applicable to shuffle fx)
  var randomizeEffects: js.UndefOr[Boolean] = js.native
  
  // valid when multiple effects are used; true to make the effect sequence random
  var requeueOnImageNotLoaded: js.UndefOr[Boolean] = js.native
  
  // requeue the slideshow if any image slides are not yet loaded
  var requeueTimeout: js.UndefOr[Double] = js.native
  
  // ms delay for requeue
  var rev: js.UndefOr[Boolean] = js.native
  
  // causes animations to transition in reverse (for effects that support it such as scrollHorz/scrollVert/shuffle)
  var shuffle: js.UndefOr[js.Any] = js.native
  
  // coords for shuffle animation, ex: { top:15, left: 200 }
  var skipInitializationCallbacks: js.UndefOr[Boolean] = js.native
  
  // set to true to disable the first before/after callback that occurs prior to any transition
  var slideExpr: js.UndefOr[String] = js.native
  
  // expression for selecting slides (if something other than all children is required)
  var slideResize: js.UndefOr[Boolean] = js.native
  
  // force slide width/height to fixed size before every transition
  var speed: js.UndefOr[js.Any] = js.native
  
  // speed of the transition (any valid fx speed value)
  var speedIn: js.UndefOr[js.Any] = js.native
  
  // speed of the 'in' transition
  var speedOut: js.UndefOr[js.Any] = js.native
  
  // speed of the 'out' transition
  var startingSlide: js.UndefOr[Double] = js.native
  
  // zero-based index of the first slide to be displayed
  var sync: js.UndefOr[Boolean] = js.native
  
  // true if in/out transitions should occur simultaneously
  var timeout: js.UndefOr[Double] = js.native
  
  // milliseconds between slide transitions (0 to disable auto advance)
  var timeoutFn: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ this.type, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.native
  
  // callback for determining per-slide timeout value:  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var updateActivePagerLink: js.UndefOr[
    js.Function3[/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String, Unit]
  ] = js.native
  
  // callback fn invoked to update the active pager link (adds/removes activePagerClass style)
  var width: js.UndefOr[js.Any] = js.native
}
object CycleOptions {
  
  @scala.inline
  def apply(): CycleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CycleOptions]
  }
  
  @scala.inline
  implicit class CycleOptionsMutableBuilder[Self <: CycleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivePagerClass(value: String): Self = StObject.set(x, "activePagerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivePagerClassUndefined: Self = StObject.set(x, "activePagerClass", js.undefined)
    
    @scala.inline
    def setAfter(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "after", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setAllowPagerClickBubble(value: Boolean): Self = StObject.set(x, "allowPagerClickBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPagerClickBubbleUndefined: Self = StObject.set(x, "allowPagerClickBubble", js.undefined)
    
    @scala.inline
    def setAnimIn(value: js.Any): Self = StObject.set(x, "animIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimInUndefined: Self = StObject.set(x, "animIn", js.undefined)
    
    @scala.inline
    def setAnimOut(value: js.Any): Self = StObject.set(x, "animOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimOutUndefined: Self = StObject.set(x, "animOut", js.undefined)
    
    @scala.inline
    def setAspect(value: Boolean): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    @scala.inline
    def setAutostop(value: Boolean): Self = StObject.set(x, "autostop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostopCount(value: Double): Self = StObject.set(x, "autostopCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostopCountUndefined: Self = StObject.set(x, "autostopCount", js.undefined)
    
    @scala.inline
    def setAutostopUndefined: Self = StObject.set(x, "autostop", js.undefined)
    
    @scala.inline
    def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
    
    @scala.inline
    def setBefore(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "before", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setCleartype(value: Boolean): Self = StObject.set(x, "cleartype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleartypeNoBg(value: Boolean): Self = StObject.set(x, "cleartypeNoBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleartypeNoBgUndefined: Self = StObject.set(x, "cleartypeNoBg", js.undefined)
    
    @scala.inline
    def setCleartypeUndefined: Self = StObject.set(x, "cleartype", js.undefined)
    
    @scala.inline
    def setContainerResize(value: Boolean): Self = StObject.set(x, "containerResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerResizeHeight(value: Boolean): Self = StObject.set(x, "containerResizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerResizeHeightUndefined: Self = StObject.set(x, "containerResizeHeight", js.undefined)
    
    @scala.inline
    def setContainerResizeUndefined: Self = StObject.set(x, "containerResize", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setCssAfter(value: js.Any): Self = StObject.set(x, "cssAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssAfterUndefined: Self = StObject.set(x, "cssAfter", js.undefined)
    
    @scala.inline
    def setCssBefore(value: js.Any): Self = StObject.set(x, "cssBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssBeforeUndefined: Self = StObject.set(x, "cssBefore", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseInUndefined: Self = StObject.set(x, "easeIn", js.undefined)
    
    @scala.inline
    def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEaseOutUndefined: Self = StObject.set(x, "easeOut", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEnd(value: CycleOptions => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFastOnEvent(value: Boolean): Self = StObject.set(x, "fastOnEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastOnEventUndefined: Self = StObject.set(x, "fastOnEvent", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* afterCalback */ js.Function, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "fxFn", js.Any.fromFunction5(value))
    
    @scala.inline
    def setFxFnUndefined: Self = StObject.set(x, "fxFn", js.undefined)
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setManualTrump(value: Boolean): Self = StObject.set(x, "manualTrump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualTrumpUndefined: Self = StObject.set(x, "manualTrump", js.undefined)
    
    @scala.inline
    def setMetaAttr(value: String): Self = StObject.set(x, "metaAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaAttrUndefined: Self = StObject.set(x, "metaAttr", js.undefined)
    
    @scala.inline
    def setNext(value: js.Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setNowrap(value: Boolean): Self = StObject.set(x, "nowrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowrapUndefined: Self = StObject.set(x, "nowrap", js.undefined)
    
    @scala.inline
    def setOnPagerEvent(value: (/* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit): Self = StObject.set(x, "onPagerEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnPagerEventUndefined: Self = StObject.set(x, "onPagerEvent", js.undefined)
    
    @scala.inline
    def setOnPrevNextEvent(
      value: (/* isNext */ Boolean, /* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit
    ): Self = StObject.set(x, "onPrevNextEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnPrevNextEventUndefined: Self = StObject.set(x, "onPrevNextEvent", js.undefined)
    
    @scala.inline
    def setPager(value: js.Any): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerAnchorBuilder(value: (/* index */ Double, /* DOMelement */ Element) => String): Self = StObject.set(x, "pagerAnchorBuilder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPagerAnchorBuilderUndefined: Self = StObject.set(x, "pagerAnchorBuilder", js.undefined)
    
    @scala.inline
    def setPagerEvent(value: String): Self = StObject.set(x, "pagerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagerEventUndefined: Self = StObject.set(x, "pagerEvent", js.undefined)
    
    @scala.inline
    def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    @scala.inline
    def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnPagerHover(value: Boolean): Self = StObject.set(x, "pauseOnPagerHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnPagerHoverUndefined: Self = StObject.set(x, "pauseOnPagerHover", js.undefined)
    
    @scala.inline
    def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
    
    @scala.inline
    def setPrev(value: js.Any): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevNextEvent(value: String): Self = StObject.set(x, "prevNextEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevNextEventUndefined: Self = StObject.set(x, "prevNextEvent", js.undefined)
    
    @scala.inline
    def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    @scala.inline
    def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomUndefined: Self = StObject.set(x, "random", js.undefined)
    
    @scala.inline
    def setRandomizeEffects(value: Boolean): Self = StObject.set(x, "randomizeEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomizeEffectsUndefined: Self = StObject.set(x, "randomizeEffects", js.undefined)
    
    @scala.inline
    def setRequeueOnImageNotLoaded(value: Boolean): Self = StObject.set(x, "requeueOnImageNotLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequeueOnImageNotLoadedUndefined: Self = StObject.set(x, "requeueOnImageNotLoaded", js.undefined)
    
    @scala.inline
    def setRequeueTimeout(value: Double): Self = StObject.set(x, "requeueTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequeueTimeoutUndefined: Self = StObject.set(x, "requeueTimeout", js.undefined)
    
    @scala.inline
    def setRev(value: Boolean): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
    
    @scala.inline
    def setShuffle(value: js.Any): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleUndefined: Self = StObject.set(x, "shuffle", js.undefined)
    
    @scala.inline
    def setSkipInitializationCallbacks(value: Boolean): Self = StObject.set(x, "skipInitializationCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipInitializationCallbacksUndefined: Self = StObject.set(x, "skipInitializationCallbacks", js.undefined)
    
    @scala.inline
    def setSlideExpr(value: String): Self = StObject.set(x, "slideExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideExprUndefined: Self = StObject.set(x, "slideExpr", js.undefined)
    
    @scala.inline
    def setSlideResize(value: Boolean): Self = StObject.set(x, "slideResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideResizeUndefined: Self = StObject.set(x, "slideResize", js.undefined)
    
    @scala.inline
    def setSpeed(value: js.Any): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedIn(value: js.Any): Self = StObject.set(x, "speedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedInUndefined: Self = StObject.set(x, "speedIn", js.undefined)
    
    @scala.inline
    def setSpeedOut(value: js.Any): Self = StObject.set(x, "speedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedOutUndefined: Self = StObject.set(x, "speedOut", js.undefined)
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setStartingSlide(value: Double): Self = StObject.set(x, "startingSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingSlideUndefined: Self = StObject.set(x, "startingSlide", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = StObject.set(x, "timeoutFn", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTimeoutFnUndefined: Self = StObject.set(x, "timeoutFn", js.undefined)
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUpdateActivePagerLink(value: (/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String) => Unit): Self = StObject.set(x, "updateActivePagerLink", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdateActivePagerLinkUndefined: Self = StObject.set(x, "updateActivePagerLink", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
