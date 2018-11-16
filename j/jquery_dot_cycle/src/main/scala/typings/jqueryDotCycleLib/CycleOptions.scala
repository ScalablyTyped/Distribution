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

