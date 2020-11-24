package typings.jqueryCycle

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CycleOptions extends js.Object {
  
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
  implicit class CycleOptionsOps[Self <: CycleOptions] (val x: Self) extends AnyVal {
    
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
    def setActivePagerClass(value: String): Self = this.set("activePagerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivePagerClass: Self = this.set("activePagerClass", js.undefined)
    
    @scala.inline
    def setAfter(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = this.set("after", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAllowPagerClickBubble(value: Boolean): Self = this.set("allowPagerClickBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPagerClickBubble: Self = this.set("allowPagerClickBubble", js.undefined)
    
    @scala.inline
    def setAnimIn(value: js.Any): Self = this.set("animIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimIn: Self = this.set("animIn", js.undefined)
    
    @scala.inline
    def setAnimOut(value: js.Any): Self = this.set("animOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimOut: Self = this.set("animOut", js.undefined)
    
    @scala.inline
    def setAspect(value: Boolean): Self = this.set("aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspect: Self = this.set("aspect", js.undefined)
    
    @scala.inline
    def setAutostop(value: Boolean): Self = this.set("autostop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostop: Self = this.set("autostop", js.undefined)
    
    @scala.inline
    def setAutostopCount(value: Double): Self = this.set("autostopCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostopCount: Self = this.set("autostopCount", js.undefined)
    
    @scala.inline
    def setBackwards(value: Boolean): Self = this.set("backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackwards: Self = this.set("backwards", js.undefined)
    
    @scala.inline
    def setBefore(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = this.set("before", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCleartype(value: Boolean): Self = this.set("cleartype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleartype: Self = this.set("cleartype", js.undefined)
    
    @scala.inline
    def setCleartypeNoBg(value: Boolean): Self = this.set("cleartypeNoBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleartypeNoBg: Self = this.set("cleartypeNoBg", js.undefined)
    
    @scala.inline
    def setContainerResize(value: Boolean): Self = this.set("containerResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerResize: Self = this.set("containerResize", js.undefined)
    
    @scala.inline
    def setContainerResizeHeight(value: Boolean): Self = this.set("containerResizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerResizeHeight: Self = this.set("containerResizeHeight", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setCssAfter(value: js.Any): Self = this.set("cssAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssAfter: Self = this.set("cssAfter", js.undefined)
    
    @scala.inline
    def setCssBefore(value: js.Any): Self = this.set("cssBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssBefore: Self = this.set("cssBefore", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setEaseIn(value: String): Self = this.set("easeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseIn: Self = this.set("easeIn", js.undefined)
    
    @scala.inline
    def setEaseOut(value: String): Self = this.set("easeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseOut: Self = this.set("easeOut", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEnd(value: CycleOptions => Unit): Self = this.set("end", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFastOnEvent(value: Boolean): Self = this.set("fastOnEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastOnEvent: Self = this.set("fastOnEvent", js.undefined)
    
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setFx(value: String): Self = this.set("fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    
    @scala.inline
    def setFxFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* afterCalback */ js.Function, /* forwardFlag */ Boolean) => Unit
    ): Self = this.set("fxFn", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteFxFn: Self = this.set("fxFn", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setManualTrump(value: Boolean): Self = this.set("manualTrump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualTrump: Self = this.set("manualTrump", js.undefined)
    
    @scala.inline
    def setMetaAttr(value: String): Self = this.set("metaAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetaAttr: Self = this.set("metaAttr", js.undefined)
    
    @scala.inline
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setNowrap(value: Boolean): Self = this.set("nowrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNowrap: Self = this.set("nowrap", js.undefined)
    
    @scala.inline
    def setOnPagerEvent(value: (/* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit): Self = this.set("onPagerEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnPagerEvent: Self = this.set("onPagerEvent", js.undefined)
    
    @scala.inline
    def setOnPrevNextEvent(
      value: (/* isNext */ Boolean, /* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit
    ): Self = this.set("onPrevNextEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnPrevNextEvent: Self = this.set("onPrevNextEvent", js.undefined)
    
    @scala.inline
    def setPager(value: js.Any): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setPagerAnchorBuilder(value: (/* index */ Double, /* DOMelement */ Element) => String): Self = this.set("pagerAnchorBuilder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePagerAnchorBuilder: Self = this.set("pagerAnchorBuilder", js.undefined)
    
    @scala.inline
    def setPagerEvent(value: String): Self = this.set("pagerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagerEvent: Self = this.set("pagerEvent", js.undefined)
    
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPauseOnPagerHover(value: Boolean): Self = this.set("pauseOnPagerHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnPagerHover: Self = this.set("pauseOnPagerHover", js.undefined)
    
    @scala.inline
    def setPrev(value: js.Any): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    
    @scala.inline
    def setPrevNextEvent(value: String): Self = this.set("prevNextEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevNextEvent: Self = this.set("prevNextEvent", js.undefined)
    
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setRandomizeEffects(value: Boolean): Self = this.set("randomizeEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomizeEffects: Self = this.set("randomizeEffects", js.undefined)
    
    @scala.inline
    def setRequeueOnImageNotLoaded(value: Boolean): Self = this.set("requeueOnImageNotLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequeueOnImageNotLoaded: Self = this.set("requeueOnImageNotLoaded", js.undefined)
    
    @scala.inline
    def setRequeueTimeout(value: Double): Self = this.set("requeueTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequeueTimeout: Self = this.set("requeueTimeout", js.undefined)
    
    @scala.inline
    def setRev(value: Boolean): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
    
    @scala.inline
    def setShuffle(value: js.Any): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShuffle: Self = this.set("shuffle", js.undefined)
    
    @scala.inline
    def setSkipInitializationCallbacks(value: Boolean): Self = this.set("skipInitializationCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipInitializationCallbacks: Self = this.set("skipInitializationCallbacks", js.undefined)
    
    @scala.inline
    def setSlideExpr(value: String): Self = this.set("slideExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideExpr: Self = this.set("slideExpr", js.undefined)
    
    @scala.inline
    def setSlideResize(value: Boolean): Self = this.set("slideResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideResize: Self = this.set("slideResize", js.undefined)
    
    @scala.inline
    def setSpeed(value: js.Any): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setSpeedIn(value: js.Any): Self = this.set("speedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedIn: Self = this.set("speedIn", js.undefined)
    
    @scala.inline
    def setSpeedOut(value: js.Any): Self = this.set("speedOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedOut: Self = this.set("speedOut", js.undefined)
    
    @scala.inline
    def setStartingSlide(value: Double): Self = this.set("startingSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingSlide: Self = this.set("startingSlide", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimeoutFn(
      value: (/* currSlideElement */ Element, /* nextSlideElement */ Element, CycleOptions, /* forwardFlag */ Boolean) => Unit
    ): Self = this.set("timeoutFn", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteTimeoutFn: Self = this.set("timeoutFn", js.undefined)
    
    @scala.inline
    def setUpdateActivePagerLink(value: (/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String) => Unit): Self = this.set("updateActivePagerLink", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUpdateActivePagerLink: Self = this.set("updateActivePagerLink", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
