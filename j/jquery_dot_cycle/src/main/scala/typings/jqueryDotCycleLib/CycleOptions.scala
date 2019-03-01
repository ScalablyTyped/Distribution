package typings
package jqueryDotCycleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CycleOptions extends js.Object {
  var activePagerClass: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                  // class name used for the active pager link
  var after: js.UndefOr[
    js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
                           // transition callback (scope set to element that was shown):  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var allowPagerClickBubble: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                               // allows or prevents click event on pager anchors from bubbling
  var animIn: js.UndefOr[js.Any] = js.undefined
                                                                                                                               // properties that define how the slide animates in
  var animOut: js.UndefOr[js.Any] = js.undefined
                                                                                                                              // properties that define how the slide animates out
  var aspect: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                              // preserve aspect ratio during fit resizing, cropping if necessary (must be used with fit option)
  var autostop: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                            // true to end slideshow after X transitions (where X == slide count)
  var autostopCount: js.UndefOr[scala.Double] = js.undefined
                                                                                                                     // number of transitions (optionally used with autostop to define X)
  var backwards: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                           // true to start slideshow at last slide and move backwards through the stack
  var before: js.UndefOr[
    js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
                           // transition callback (scope set to element to be shown):     function(currSlideElement, nextSlideElement, options, forwardFlag)
  var center: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                              // set to true to have cycle add top/left margin to each slide (use with width and height options)
  var cleartype: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                           // true if clearType corrections should be applied (for IE)
  var cleartypeNoBg: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                       // set to true to disable extra cleartype fixing (leave false to force background color setting on slides)
  var containerResize: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                     // resize container to fit largest slide
  var containerResizeHeight: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                               // resize containers height to fit the largest slide but leave the width dynamic
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                          // true to start next transition immediately after current one completes
  var cssAfter: js.UndefOr[js.Any] = js.undefined
                                                                                                                             // properties that defined the state of the slide after transitioning out
  var cssBefore: js.UndefOr[js.Any] = js.undefined
                                                                                                                            // properties that define the initial state of the slide before transitioning in
  var delay: js.UndefOr[scala.Double] = js.undefined
                                                                                                                             // additional delay (in ms) for first transition (hint: can be negative)
  var easeIn: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                            // easing for "in" transition
  var easeOut: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                           // easing for "out" transition
  var easing: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                            // easing method for both in and out transitions
  var end: js.UndefOr[js.Function1[/* options */ CycleOptions, scala.Unit]] = js.undefined
                                                                                                      // callback invoked when the slideshow terminates (use with autostop or nowrap options): function(options)
  var fastOnEvent: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                         // force fast transitions when triggered manually (via pager or prev/next); value == time in ms
  var fit: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                                 // force slides to fit container
  var fx: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                                // name of transition effect (or comma separated names, ex: 'fade,scrollUp,shuffle')
  var fxFn: js.UndefOr[
    js.Function5[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* afterCalback */ js.Function, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
    // function used to control the transition: function(currSlideElement, nextSlideElement, options, afterCalback, forwardFlag)
  var height: js.UndefOr[js.Any] = js.undefined
                                                                                                                               // container height (if the 'fit' option is true, the slides will be set to this height as well)
  var manualTrump: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                         // causes manual transition to stop an active transition instead of being ignored
  var metaAttr: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                          // data- attribute that holds the option data for the slideshow
  var next: js.UndefOr[js.Any] = js.undefined
                                                                                                                                 // element, jQuery object, or jQuery selector string for the element to use as event trigger for next slide
  var nowrap: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                              // true to prevent slideshow from wrapping
  var onPagerEvent: js.UndefOr[
    js.Function2[
      /* zeroBasedSlideIndex */ scala.Double, 
      /* slideElement */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
                                                                // callback fn for pager events: function(zeroBasedSlideIndex, slideElement)
  var onPrevNextEvent: js.UndefOr[
    js.Function3[
      /* isNext */ scala.Boolean, 
      /* zeroBasedSlideIndex */ scala.Double, 
      /* slideElement */ stdLib.Element, 
      scala.Unit
    ]
  ] = js.undefined
                                               // callback fn for prev/next events: function(isNext, zeroBasedSlideIndex, slideElement)
  var pager: js.UndefOr[js.Any] = js.undefined
                                                                                                                                // element, jQuery object, or jQuery selector string for the element to use as pager container
  var pagerAnchorBuilder: js.UndefOr[
    js.Function2[/* index */ scala.Double, /* DOMelement */ stdLib.Element, java.lang.String]
  ] = js.undefined
                                                                        // callback fn for building anchor links:  function(index, DOMelement)
  var pagerEvent: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                        // name of event which drives the pager navigation
  var pause: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                               // true to enable "pause on hover"
  var pauseOnPagerHover: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                   // true to pause when hovering over pager link
  var prev: js.UndefOr[js.Any] = js.undefined
                                                                                                                                 // element, jQuery object, or jQuery selector string for the element to use as event trigger for previous slide
  var prevNextEvent: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                     // event which drives the manual transition to the previous or next slide
  var random: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                              // true for random, false for sequence (not applicable to shuffle fx)
  var randomizeEffects: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                    // valid when multiple effects are used; true to make the effect sequence random
  var requeueOnImageNotLoaded: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                             // requeue the slideshow if any image slides are not yet loaded
  var requeueTimeout: js.UndefOr[scala.Double] = js.undefined
                                                                                                                    // ms delay for requeue
  var rev: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                                 // causes animations to transition in reverse (for effects that support it such as scrollHorz/scrollVert/shuffle)
  var shuffle: js.UndefOr[js.Any] = js.undefined
                                                                                                                              // coords for shuffle animation, ex: { top:15, left: 200 }
  var skipInitializationCallbacks: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                         // set to true to disable the first before/after callback that occurs prior to any transition
  var slideExpr: js.UndefOr[java.lang.String] = js.undefined
                                                                                                                         // expression for selecting slides (if something other than all children is required)
  var slideResize: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                         // force slide width/height to fixed size before every transition
  var speed: js.UndefOr[js.Any] = js.undefined
                                                                                                                                // speed of the transition (any valid fx speed value)
  var speedIn: js.UndefOr[js.Any] = js.undefined
                                                                                                                              // speed of the 'in' transition
  var speedOut: js.UndefOr[js.Any] = js.undefined
                                                                                                                             // speed of the 'out' transition
  var startingSlide: js.UndefOr[scala.Double] = js.undefined
                                                                                                                     // zero-based index of the first slide to be displayed
  var sync: js.UndefOr[scala.Boolean] = js.undefined
                                                                                                                                // true if in/out transitions should occur simultaneously
  var timeout: js.UndefOr[scala.Double] = js.undefined
                                                                                                                           // milliseconds between slide transitions (0 to disable auto advance)
  var timeoutFn: js.UndefOr[
    js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
                       // callback for determining per-slide timeout value:  function(currSlideElement, nextSlideElement, options, forwardFlag)
  var updateActivePagerLink: js.UndefOr[
    js.Function3[
      /* pager */ js.Any, 
      /* currSlide */ scala.Double, 
      /* clsName */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
                                                           // callback fn invoked to update the active pager link (adds/removes activePagerClass style)
  var width: js.UndefOr[js.Any] = js.undefined
}

object CycleOptions {
  @scala.inline
  def apply(
    activePagerClass: java.lang.String = null,
    after: js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ] = null,
    allowPagerClickBubble: js.UndefOr[scala.Boolean] = js.undefined,
    animIn: js.Any = null,
    animOut: js.Any = null,
    aspect: js.UndefOr[scala.Boolean] = js.undefined,
    autostop: js.UndefOr[scala.Boolean] = js.undefined,
    autostopCount: scala.Int | scala.Double = null,
    backwards: js.UndefOr[scala.Boolean] = js.undefined,
    before: js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ] = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    cleartype: js.UndefOr[scala.Boolean] = js.undefined,
    cleartypeNoBg: js.UndefOr[scala.Boolean] = js.undefined,
    containerResize: js.UndefOr[scala.Boolean] = js.undefined,
    containerResizeHeight: js.UndefOr[scala.Boolean] = js.undefined,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    cssAfter: js.Any = null,
    cssBefore: js.Any = null,
    delay: scala.Int | scala.Double = null,
    easeIn: java.lang.String = null,
    easeOut: java.lang.String = null,
    easing: java.lang.String = null,
    end: js.Function1[/* options */ CycleOptions, scala.Unit] = null,
    fastOnEvent: js.UndefOr[scala.Boolean] = js.undefined,
    fit: js.UndefOr[scala.Boolean] = js.undefined,
    fx: java.lang.String = null,
    fxFn: js.Function5[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* afterCalback */ js.Function, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ] = null,
    height: js.Any = null,
    manualTrump: js.UndefOr[scala.Boolean] = js.undefined,
    metaAttr: java.lang.String = null,
    next: js.Any = null,
    nowrap: js.UndefOr[scala.Boolean] = js.undefined,
    onPagerEvent: js.Function2[
      /* zeroBasedSlideIndex */ scala.Double, 
      /* slideElement */ stdLib.Element, 
      scala.Unit
    ] = null,
    onPrevNextEvent: js.Function3[
      /* isNext */ scala.Boolean, 
      /* zeroBasedSlideIndex */ scala.Double, 
      /* slideElement */ stdLib.Element, 
      scala.Unit
    ] = null,
    pager: js.Any = null,
    pagerAnchorBuilder: js.Function2[/* index */ scala.Double, /* DOMelement */ stdLib.Element, java.lang.String] = null,
    pagerEvent: java.lang.String = null,
    pause: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnPagerHover: js.UndefOr[scala.Boolean] = js.undefined,
    prev: js.Any = null,
    prevNextEvent: java.lang.String = null,
    random: js.UndefOr[scala.Boolean] = js.undefined,
    randomizeEffects: js.UndefOr[scala.Boolean] = js.undefined,
    requeueOnImageNotLoaded: js.UndefOr[scala.Boolean] = js.undefined,
    requeueTimeout: scala.Int | scala.Double = null,
    rev: js.UndefOr[scala.Boolean] = js.undefined,
    shuffle: js.Any = null,
    skipInitializationCallbacks: js.UndefOr[scala.Boolean] = js.undefined,
    slideExpr: java.lang.String = null,
    slideResize: js.UndefOr[scala.Boolean] = js.undefined,
    speed: js.Any = null,
    speedIn: js.Any = null,
    speedOut: js.Any = null,
    startingSlide: scala.Int | scala.Double = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timeoutFn: js.Function4[
      /* currSlideElement */ stdLib.Element, 
      /* nextSlideElement */ stdLib.Element, 
      /* options */ CycleOptions, 
      /* forwardFlag */ scala.Boolean, 
      scala.Unit
    ] = null,
    updateActivePagerLink: js.Function3[
      /* pager */ js.Any, 
      /* currSlide */ scala.Double, 
      /* clsName */ java.lang.String, 
      scala.Unit
    ] = null,
    width: js.Any = null
  ): CycleOptions = {
    val __obj = js.Dynamic.literal()
    if (activePagerClass != null) __obj.updateDynamic("activePagerClass")(activePagerClass)
    if (after != null) __obj.updateDynamic("after")(after)
    if (!js.isUndefined(allowPagerClickBubble)) __obj.updateDynamic("allowPagerClickBubble")(allowPagerClickBubble)
    if (animIn != null) __obj.updateDynamic("animIn")(animIn)
    if (animOut != null) __obj.updateDynamic("animOut")(animOut)
    if (!js.isUndefined(aspect)) __obj.updateDynamic("aspect")(aspect)
    if (!js.isUndefined(autostop)) __obj.updateDynamic("autostop")(autostop)
    if (autostopCount != null) __obj.updateDynamic("autostopCount")(autostopCount.asInstanceOf[js.Any])
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards)
    if (before != null) __obj.updateDynamic("before")(before)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (!js.isUndefined(cleartype)) __obj.updateDynamic("cleartype")(cleartype)
    if (!js.isUndefined(cleartypeNoBg)) __obj.updateDynamic("cleartypeNoBg")(cleartypeNoBg)
    if (!js.isUndefined(containerResize)) __obj.updateDynamic("containerResize")(containerResize)
    if (!js.isUndefined(containerResizeHeight)) __obj.updateDynamic("containerResizeHeight")(containerResizeHeight)
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (cssAfter != null) __obj.updateDynamic("cssAfter")(cssAfter)
    if (cssBefore != null) __obj.updateDynamic("cssBefore")(cssBefore)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (easeIn != null) __obj.updateDynamic("easeIn")(easeIn)
    if (easeOut != null) __obj.updateDynamic("easeOut")(easeOut)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (end != null) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(fastOnEvent)) __obj.updateDynamic("fastOnEvent")(fastOnEvent)
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit)
    if (fx != null) __obj.updateDynamic("fx")(fx)
    if (fxFn != null) __obj.updateDynamic("fxFn")(fxFn)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(manualTrump)) __obj.updateDynamic("manualTrump")(manualTrump)
    if (metaAttr != null) __obj.updateDynamic("metaAttr")(metaAttr)
    if (next != null) __obj.updateDynamic("next")(next)
    if (!js.isUndefined(nowrap)) __obj.updateDynamic("nowrap")(nowrap)
    if (onPagerEvent != null) __obj.updateDynamic("onPagerEvent")(onPagerEvent)
    if (onPrevNextEvent != null) __obj.updateDynamic("onPrevNextEvent")(onPrevNextEvent)
    if (pager != null) __obj.updateDynamic("pager")(pager)
    if (pagerAnchorBuilder != null) __obj.updateDynamic("pagerAnchorBuilder")(pagerAnchorBuilder)
    if (pagerEvent != null) __obj.updateDynamic("pagerEvent")(pagerEvent)
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause)
    if (!js.isUndefined(pauseOnPagerHover)) __obj.updateDynamic("pauseOnPagerHover")(pauseOnPagerHover)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (prevNextEvent != null) __obj.updateDynamic("prevNextEvent")(prevNextEvent)
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random)
    if (!js.isUndefined(randomizeEffects)) __obj.updateDynamic("randomizeEffects")(randomizeEffects)
    if (!js.isUndefined(requeueOnImageNotLoaded)) __obj.updateDynamic("requeueOnImageNotLoaded")(requeueOnImageNotLoaded)
    if (requeueTimeout != null) __obj.updateDynamic("requeueTimeout")(requeueTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rev)) __obj.updateDynamic("rev")(rev)
    if (shuffle != null) __obj.updateDynamic("shuffle")(shuffle)
    if (!js.isUndefined(skipInitializationCallbacks)) __obj.updateDynamic("skipInitializationCallbacks")(skipInitializationCallbacks)
    if (slideExpr != null) __obj.updateDynamic("slideExpr")(slideExpr)
    if (!js.isUndefined(slideResize)) __obj.updateDynamic("slideResize")(slideResize)
    if (speed != null) __obj.updateDynamic("speed")(speed)
    if (speedIn != null) __obj.updateDynamic("speedIn")(speedIn)
    if (speedOut != null) __obj.updateDynamic("speedOut")(speedOut)
    if (startingSlide != null) __obj.updateDynamic("startingSlide")(startingSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutFn != null) __obj.updateDynamic("timeoutFn")(timeoutFn)
    if (updateActivePagerLink != null) __obj.updateDynamic("updateActivePagerLink")(updateActivePagerLink)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[CycleOptions]
  }
}

