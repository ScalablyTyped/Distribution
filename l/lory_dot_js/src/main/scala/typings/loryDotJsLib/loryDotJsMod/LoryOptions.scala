package typings
package loryDotJsLib.loryDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoryOptions extends js.Object {
  /**
    * executed after initialisation (end of setup function)
    */
  var afterInit: js.UndefOr[js.Function0[_]] = js.undefined
  //////////////////////////////////////////////////
  //  Callbacks
  //////////////////////////////////////////////////
  /**
    * executed before initialisation (first in setup function)
    */
  var beforeInit: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of next controls (next function)
    */
  var beforeNext: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on click of prev controls (prev function)
    */
  var beforePrev: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on every resize event
    */
  var beforeResize: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * executed on touch attempt (touchstart)
    */
  var beforeTouch: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * class name for slider frame
    * default: 'js_frame'
    */
  var classNameFrame: js.UndefOr[java.lang.String] = js.undefined
  /**
    * class name for slider next control
    * default: 'js_next'
    */
  var classNameNextCtrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * class name for slider previous control
    * default: 'js_prev'
    */
  var classNamePrevCtrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * class name for slides container
    * default: 'js_slides'
    */
  var classNameSlideContainer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
    */
  var ease: js.UndefOr[java.lang.String] = js.undefined
  /**
    * enabled mouse events
    * default: false
    */
  var enableMouseEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * like carousel, works with multiple slides (default: false). (do not combine with rewind)
    */
  var infinite: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * the slide index to show when the slider is initialized (	default: 0 )
    */
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
    */
  var rewind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * time in milliseconds for the animation of the rewind after the last slide (default: 600).
    */
  var rewindSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * time in milliseconds for the animation of a valid slide attempt (default: 300).
    */
  var slideSpeed: js.UndefOr[scala.Double] = js.undefined
  //////////////////////////////////////////////////
  //  Options
  //////////////////////////////////////////////////
  /**
    * slides scrolled at once (default: 1).
    */
  var slidesToScroll: js.UndefOr[scala.Double] = js.undefined
  /**
    * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
    */
  var snapBackSpeed: js.UndefOr[scala.Double] = js.undefined
}

object LoryOptions {
  @scala.inline
  def apply(
    afterInit: js.Function0[_] = null,
    beforeInit: js.Function0[_] = null,
    beforeNext: js.Function0[_] = null,
    beforePrev: js.Function0[_] = null,
    beforeResize: js.Function0[_] = null,
    beforeTouch: js.Function0[_] = null,
    classNameFrame: java.lang.String = null,
    classNameNextCtrl: java.lang.String = null,
    classNamePrevCtrl: java.lang.String = null,
    classNameSlideContainer: java.lang.String = null,
    ease: java.lang.String = null,
    enableMouseEvents: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: scala.Boolean | scala.Double = null,
    initialIndex: scala.Int | scala.Double = null,
    rewind: js.UndefOr[scala.Boolean] = js.undefined,
    rewindSpeed: scala.Int | scala.Double = null,
    slideSpeed: scala.Int | scala.Double = null,
    slidesToScroll: scala.Int | scala.Double = null,
    snapBackSpeed: scala.Int | scala.Double = null
  ): LoryOptions = {
    val __obj = js.Dynamic.literal()
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(beforeInit)
    if (beforeNext != null) __obj.updateDynamic("beforeNext")(beforeNext)
    if (beforePrev != null) __obj.updateDynamic("beforePrev")(beforePrev)
    if (beforeResize != null) __obj.updateDynamic("beforeResize")(beforeResize)
    if (beforeTouch != null) __obj.updateDynamic("beforeTouch")(beforeTouch)
    if (classNameFrame != null) __obj.updateDynamic("classNameFrame")(classNameFrame)
    if (classNameNextCtrl != null) __obj.updateDynamic("classNameNextCtrl")(classNameNextCtrl)
    if (classNamePrevCtrl != null) __obj.updateDynamic("classNamePrevCtrl")(classNamePrevCtrl)
    if (classNameSlideContainer != null) __obj.updateDynamic("classNameSlideContainer")(classNameSlideContainer)
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents)
    if (infinite != null) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind)
    if (rewindSpeed != null) __obj.updateDynamic("rewindSpeed")(rewindSpeed.asInstanceOf[js.Any])
    if (slideSpeed != null) __obj.updateDynamic("slideSpeed")(slideSpeed.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (snapBackSpeed != null) __obj.updateDynamic("snapBackSpeed")(snapBackSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoryOptions]
  }
}

