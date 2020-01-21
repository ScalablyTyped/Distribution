package typings.jqueryCycle

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CycleOptions extends js.Object {
  var activePagerClass: js.UndefOr[String] = js.undefined
                                                                                                                  // class name used for the active pager link
  var after: js.UndefOr[
    js.Function4[
      /* currSlideElement */ Element, 
      /* nextSlideElement */ Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
                           // transition callback (scope set to element that was shown):  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var allowPagerClickBubble: js.UndefOr[Boolean] = js.undefined
                                                                                                               // allows or prevents click event on pager anchors from bubbling
  var animIn: js.UndefOr[js.Any] = js.undefined
                                                                                                                               // properties that define how the slide animates in
  var animOut: js.UndefOr[js.Any] = js.undefined
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
      /* options */ CycleOptions, 
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
  var cssAfter: js.UndefOr[js.Any] = js.undefined
                                                                                                                             // properties that defined the state of the slide after transitioning out
  var cssBefore: js.UndefOr[js.Any] = js.undefined
                                                                                                                            // properties that define the initial state of the slide before transitioning in
  var delay: js.UndefOr[Double] = js.undefined
                                                                                                                             // additional delay (in ms) for first transition (hint: can be negative)
  var easeIn: js.UndefOr[String] = js.undefined
                                                                                                                            // easing for "in" transition
  var easeOut: js.UndefOr[String] = js.undefined
                                                                                                                           // easing for "out" transition
  var easing: js.UndefOr[String] = js.undefined
                                                                                                                            // easing method for both in and out transitions
  var end: js.UndefOr[js.Function1[/* options */ CycleOptions, Unit]] = js.undefined
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
      /* options */ CycleOptions, 
      /* afterCalback */ js.Function, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
    // function used to control the transition: function(currSlideElement, nextSlideElement, options, afterCalback, forwardFlag)
  var height: js.UndefOr[js.Any] = js.undefined
                                                                                                                               // container height (if the 'fit' option is true, the slides will be set to this height as well)
  var manualTrump: js.UndefOr[Boolean] = js.undefined
                                                                                                                         // causes manual transition to stop an active transition instead of being ignored
  var metaAttr: js.UndefOr[String] = js.undefined
                                                                                                                          // data- attribute that holds the option data for the slideshow
  var next: js.UndefOr[js.Any] = js.undefined
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
  var pager: js.UndefOr[js.Any] = js.undefined
                                                                                                                                // element, jQuery object, or jQuery selector string for the element to use as pager container
  var pagerAnchorBuilder: js.UndefOr[js.Function2[/* index */ Double, /* DOMelement */ Element, String]] = js.undefined
                                                                        // callback fn for building anchor links:  function(index, DOMelement)
  var pagerEvent: js.UndefOr[String] = js.undefined
                                                                                                                        // name of event which drives the pager navigation
  var pause: js.UndefOr[Boolean] = js.undefined
                                                                                                                               // true to enable "pause on hover"
  var pauseOnPagerHover: js.UndefOr[Boolean] = js.undefined
                                                                                                                   // true to pause when hovering over pager link
  var prev: js.UndefOr[js.Any] = js.undefined
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
  var shuffle: js.UndefOr[js.Any] = js.undefined
                                                                                                                              // coords for shuffle animation, ex: { top:15, left: 200 }
  var skipInitializationCallbacks: js.UndefOr[Boolean] = js.undefined
                                                                                                         // set to true to disable the first before/after callback that occurs prior to any transition
  var slideExpr: js.UndefOr[String] = js.undefined
                                                                                                                         // expression for selecting slides (if something other than all children is required)
  var slideResize: js.UndefOr[Boolean] = js.undefined
                                                                                                                         // force slide width/height to fixed size before every transition
  var speed: js.UndefOr[js.Any] = js.undefined
                                                                                                                                // speed of the transition (any valid fx speed value)
  var speedIn: js.UndefOr[js.Any] = js.undefined
                                                                                                                              // speed of the 'in' transition
  var speedOut: js.UndefOr[js.Any] = js.undefined
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
      /* options */ CycleOptions, 
      /* forwardFlag */ Boolean, 
      Unit
    ]
  ] = js.undefined
                       // callback for determining per-slide timeout value:  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var updateActivePagerLink: js.UndefOr[
    js.Function3[/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String, Unit]
  ] = js.undefined
                                                           // callback fn invoked to update the active pager link (adds/removes activePagerClass style)
  var width: js.UndefOr[js.Any] = js.undefined
}

object CycleOptions {
  @scala.inline
  def apply(
    activePagerClass: String = null,
    after: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit = null,
    allowPagerClickBubble: js.UndefOr[Boolean] = js.undefined,
    animIn: js.Any = null,
    animOut: js.Any = null,
    aspect: js.UndefOr[Boolean] = js.undefined,
    autostop: js.UndefOr[Boolean] = js.undefined,
    autostopCount: Int | Double = null,
    backwards: js.UndefOr[Boolean] = js.undefined,
    before: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit = null,
    center: js.UndefOr[Boolean] = js.undefined,
    cleartype: js.UndefOr[Boolean] = js.undefined,
    cleartypeNoBg: js.UndefOr[Boolean] = js.undefined,
    containerResize: js.UndefOr[Boolean] = js.undefined,
    containerResizeHeight: js.UndefOr[Boolean] = js.undefined,
    continuous: js.UndefOr[Boolean] = js.undefined,
    cssAfter: js.Any = null,
    cssBefore: js.Any = null,
    delay: Int | Double = null,
    easeIn: String = null,
    easeOut: String = null,
    easing: String = null,
    end: /* options */ CycleOptions => Unit = null,
    fastOnEvent: js.UndefOr[Boolean] = js.undefined,
    fit: js.UndefOr[Boolean] = js.undefined,
    fx: String = null,
    fxFn: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* afterCalback */ js.Function, /* forwardFlag */ Boolean) => Unit = null,
    height: js.Any = null,
    manualTrump: js.UndefOr[Boolean] = js.undefined,
    metaAttr: String = null,
    next: js.Any = null,
    nowrap: js.UndefOr[Boolean] = js.undefined,
    onPagerEvent: (/* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit = null,
    onPrevNextEvent: (/* isNext */ Boolean, /* zeroBasedSlideIndex */ Double, /* slideElement */ Element) => Unit = null,
    pager: js.Any = null,
    pagerAnchorBuilder: (/* index */ Double, /* DOMelement */ Element) => String = null,
    pagerEvent: String = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    pauseOnPagerHover: js.UndefOr[Boolean] = js.undefined,
    prev: js.Any = null,
    prevNextEvent: String = null,
    random: js.UndefOr[Boolean] = js.undefined,
    randomizeEffects: js.UndefOr[Boolean] = js.undefined,
    requeueOnImageNotLoaded: js.UndefOr[Boolean] = js.undefined,
    requeueTimeout: Int | Double = null,
    rev: js.UndefOr[Boolean] = js.undefined,
    shuffle: js.Any = null,
    skipInitializationCallbacks: js.UndefOr[Boolean] = js.undefined,
    slideExpr: String = null,
    slideResize: js.UndefOr[Boolean] = js.undefined,
    speed: js.Any = null,
    speedIn: js.Any = null,
    speedOut: js.Any = null,
    startingSlide: Int | Double = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timeoutFn: (/* currSlideElement */ Element, /* nextSlideElement */ Element, /* options */ CycleOptions, /* forwardFlag */ Boolean) => Unit = null,
    updateActivePagerLink: (/* pager */ js.Any, /* currSlide */ Double, /* clsName */ String) => Unit = null,
    width: js.Any = null
  ): CycleOptions = {
    val __obj = js.Dynamic.literal()
    if (activePagerClass != null) __obj.updateDynamic("activePagerClass")(activePagerClass.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction4(after))
    if (!js.isUndefined(allowPagerClickBubble)) __obj.updateDynamic("allowPagerClickBubble")(allowPagerClickBubble.asInstanceOf[js.Any])
    if (animIn != null) __obj.updateDynamic("animIn")(animIn.asInstanceOf[js.Any])
    if (animOut != null) __obj.updateDynamic("animOut")(animOut.asInstanceOf[js.Any])
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect.asInstanceOf[js.Any])
    if (!js.isUndefined(autostop)) __obj.updateDynamic("autostop")(autostop.asInstanceOf[js.Any])
    if (autostopCount != null) __obj.updateDynamic("autostopCount")(autostopCount.asInstanceOf[js.Any])
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction4(before))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(cleartype)) __obj.updateDynamic("cleartype")(cleartype.asInstanceOf[js.Any])
    if (!js.isUndefined(cleartypeNoBg)) __obj.updateDynamic("cleartypeNoBg")(cleartypeNoBg.asInstanceOf[js.Any])
    if (!js.isUndefined(containerResize)) __obj.updateDynamic("containerResize")(containerResize.asInstanceOf[js.Any])
    if (!js.isUndefined(containerResizeHeight)) __obj.updateDynamic("containerResizeHeight")(containerResizeHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (cssAfter != null) __obj.updateDynamic("cssAfter")(cssAfter.asInstanceOf[js.Any])
    if (cssBefore != null) __obj.updateDynamic("cssBefore")(cssBefore.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easeIn != null) __obj.updateDynamic("easeIn")(easeIn.asInstanceOf[js.Any])
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1(end))
    if (!js.isUndefined(fastOnEvent)) __obj.updateDynamic("fastOnEvent")(fastOnEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (fx != null) __obj.updateDynamic("fx")(fx.asInstanceOf[js.Any])
    if (fxFn != null) __obj.updateDynamic("fxFn")(js.Any.fromFunction5(fxFn))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(manualTrump)) __obj.updateDynamic("manualTrump")(manualTrump.asInstanceOf[js.Any])
    if (metaAttr != null) __obj.updateDynamic("metaAttr")(metaAttr.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (!js.isUndefined(nowrap)) __obj.updateDynamic("nowrap")(nowrap.asInstanceOf[js.Any])
    if (onPagerEvent != null) __obj.updateDynamic("onPagerEvent")(js.Any.fromFunction2(onPagerEvent))
    if (onPrevNextEvent != null) __obj.updateDynamic("onPrevNextEvent")(js.Any.fromFunction3(onPrevNextEvent))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (pagerAnchorBuilder != null) __obj.updateDynamic("pagerAnchorBuilder")(js.Any.fromFunction2(pagerAnchorBuilder))
    if (pagerEvent != null) __obj.updateDynamic("pagerEvent")(pagerEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnPagerHover)) __obj.updateDynamic("pauseOnPagerHover")(pauseOnPagerHover.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    if (prevNextEvent != null) __obj.updateDynamic("prevNextEvent")(prevNextEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (!js.isUndefined(randomizeEffects)) __obj.updateDynamic("randomizeEffects")(randomizeEffects.asInstanceOf[js.Any])
    if (!js.isUndefined(requeueOnImageNotLoaded)) __obj.updateDynamic("requeueOnImageNotLoaded")(requeueOnImageNotLoaded.asInstanceOf[js.Any])
    if (requeueTimeout != null) __obj.updateDynamic("requeueTimeout")(requeueTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rev)) __obj.updateDynamic("rev")(rev.asInstanceOf[js.Any])
    if (shuffle != null) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    if (!js.isUndefined(skipInitializationCallbacks)) __obj.updateDynamic("skipInitializationCallbacks")(skipInitializationCallbacks.asInstanceOf[js.Any])
    if (slideExpr != null) __obj.updateDynamic("slideExpr")(slideExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(slideResize)) __obj.updateDynamic("slideResize")(slideResize.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (speedIn != null) __obj.updateDynamic("speedIn")(speedIn.asInstanceOf[js.Any])
    if (speedOut != null) __obj.updateDynamic("speedOut")(speedOut.asInstanceOf[js.Any])
    if (startingSlide != null) __obj.updateDynamic("startingSlide")(startingSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutFn != null) __obj.updateDynamic("timeoutFn")(js.Any.fromFunction4(timeoutFn))
    if (updateActivePagerLink != null) __obj.updateDynamic("updateActivePagerLink")(js.Any.fromFunction3(updateActivePagerLink))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycleOptions]
  }
}

